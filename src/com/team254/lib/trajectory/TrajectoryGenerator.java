package com.team254.lib.trajectory;

/**
 * Factory class for creating Trajectories.
 *
 * @author Jared341
 */
public class TrajectoryGenerator {

  ///// INNER CLASSES /////
  public static class Config {
	private double wheelBase;
	private double wheelDiameter;
	private int codesPerRev;
	private double dt = 0.01;
	private double maxVelocity;
	private double maxAcceleration;
	private double maxJerk;
	private double scaleFactor = 1;
	
	public double getWheelBase() {
		return wheelBase;
	}
	
	public void setWheelBase(double wheelBase) {
		this.wheelBase = wheelBase;
	}
	
	public double getWheelDiameter() {
		return wheelDiameter;
	}
	
	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	
	public int getCodesPerRev() {
		return codesPerRev;
	}

	public void setCodesPerRev(int codesPerRev) {
		this.codesPerRev = codesPerRev;
	}
	
	public double getDt() {
		return dt;
	}
	
	public void setDt(double dt) {
		this.dt = dt;
	}
	
	public double getMaxVelocity() {
		return maxVelocity;
	}
	
	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	
	public double getMaxAcceleration() {
		return maxAcceleration;
	}
	
	public void setMaxAcceleration(double maxAcceleration) {
		this.maxAcceleration = maxAcceleration;
	}
	
	public double getMaxJerk() {
		return maxJerk;
	}
	
	public void setMaxJerk(double maxJerk) {
		this.maxJerk = maxJerk;
	}

	public double getScaleFactor() {
		return scaleFactor;
	}

	public void setScaleFactor(double scaleFactor) {
		this.scaleFactor = scaleFactor;
	}
  }

  public enum Strategy {
	  AUTOMATIC, STEP, TRAPEZOIDAL, S_CURVE
  }

  private static class IntegrationMethod {

    // J2ME Enum pattern
    private final String value_;

    private IntegrationMethod(String value) {
      value_ = value;
    }

    public String toString() {
      return value_;
    }
  }

  private static final IntegrationMethod RectangularIntegration
          = new IntegrationMethod("RectangularIntegration");

  private static final IntegrationMethod TrapezoidalIntegration
          = new IntegrationMethod("TrapezoidalIntegration");

  ///// METHODS /////
  /**
   * Generate a trajectory from a start state to a goal state.
   *
   * Read the notes on each of the Strategies defined above, as certain
   * arguments are ignored for some strategies.
   *
   * @param config Definition of constraints and sampling rate (WARNING: Some
   * may be ignored)
   * @param strategy Which generator to use
   * @param startVelocity The starting velocity (WARNING: May be ignored)
   * @param startHeading The starting heading
   * @param goalPosition The goal position
   * @param goalVelocity The goal velocity (WARNING: May be ignored)
   * @param goalHeading The goal heading
   * @return A Trajectory that satisfies the relevant constraints and end
   * conditions.
   */
  public static Trajectory generate(
		  Config config,
          Strategy strategy,
          double startVelocity,
          double startHeading,
          double goalPosition,
          double goalVelocity,
          double goalHeading) {
    // Choose an automatic strategy.
    if (strategy == Strategy.AUTOMATIC) {
      strategy = chooseStrategy(startVelocity, goalVelocity, config.getMaxAcceleration());
    }

    Trajectory traj;
    if (strategy == Strategy.STEP) {
      double impulse = (goalPosition / config.getMaxAcceleration()) / config.dt;

      // Round down, meaning we may undershoot by less than max_vel*dt.
      // This is due to discretization and avoids a strange final
      // velocity.
      int time = (int) (Math.floor(impulse));
      traj = secondOrderFilter(1, 1, config.dt, config.getMaxVelocity(),
              config.getMaxVelocity(), impulse, time, TrapezoidalIntegration);

    } else if (strategy == Strategy.TRAPEZOIDAL) {
      // How fast can we go given maximum acceleration and deceleration?
      double start_discount = .5 * startVelocity * startVelocity / config.getMaxAcceleration();
      double end_discount = .5 * goalVelocity * goalVelocity / config.getMaxAcceleration();

      double adjusted_max_vel = Math.min(config.getMaxVelocity(),
              Math.sqrt(config.getMaxAcceleration() * goalPosition - start_discount
                      - end_discount));
      double t_rampup = (adjusted_max_vel - startVelocity) / config.getMaxAcceleration();
      double x_rampup = startVelocity * t_rampup + .5 * config.getMaxAcceleration()
              * t_rampup * t_rampup;
      double t_rampdown = (adjusted_max_vel - goalVelocity) / config.getMaxAcceleration();
      double x_rampdown = adjusted_max_vel * t_rampdown - .5
              * config.getMaxAcceleration() * t_rampdown * t_rampdown;
      double x_cruise = goalPosition - x_rampdown - x_rampup;

      // The +.5 is to round to nearest
      int time = (int) ((t_rampup + t_rampdown + x_cruise
              / adjusted_max_vel) / config.dt + .5);

      // Compute the length of the linear filters and impulse.
      int f1_length = (int) Math.ceil((adjusted_max_vel
              / config.getMaxAcceleration()) / config.dt);
      double impulse = (goalPosition / adjusted_max_vel) / config.dt
              - startVelocity / config.getMaxAcceleration() / config.dt
              + start_discount + end_discount;
      traj = secondOrderFilter(f1_length, 1, config.dt, startVelocity,
              adjusted_max_vel, impulse, time, TrapezoidalIntegration);

    } else if (strategy == Strategy.S_CURVE) {
      // How fast can we go given maximum acceleration and deceleration?
      double adjusted_max_vel = Math.min(goalVelocity,
              (-config.getMaxAcceleration() * config.getMaxAcceleration() + Math.sqrt(config.getMaxAcceleration()
                      * config.getMaxAcceleration() * config.getMaxAcceleration() * config.getMaxAcceleration()
                      + 4 * config.getMaxJerk() * config.getMaxJerk() * config.getMaxAcceleration()
                      * goalPosition)) / (2 * config.getMaxJerk()));

      // Compute the length of the linear filters and impulse.
      int f1_length = (int) Math.ceil((adjusted_max_vel
              / config.getMaxAcceleration()) / config.getDt());
      int f2_length = (int) Math.ceil((config.getMaxAcceleration()
              / config.getMaxJerk()) / config.getDt());
      double impulse = (goalPosition / adjusted_max_vel) / config.getDt();
      int time = (int) (Math.ceil(f1_length + f2_length + impulse));
      traj = secondOrderFilter(f1_length, f2_length, config.getDt(), 0,
              adjusted_max_vel, impulse, time, TrapezoidalIntegration);

    } else {
      return null;
    }

    // Now assign headings by interpolating along the path.
    // Don't do any wrapping because we don't know units.
    double total_heading_change = goalHeading - startHeading;
    for (int i = 0; i < traj.getNumSegments(); ++i) {
      traj.segments_[i].heading = startHeading + total_heading_change
              * (traj.segments_[i].pos)
              / traj.segments_[traj.getNumSegments() - 1].pos;
    }

    return traj;
  }

  private static Trajectory secondOrderFilter(
          int f1_length,
          int f2_length,
          double dt,
          double start_vel,
          double max_vel,
          double total_impulse,
          int length,
          IntegrationMethod integration) {
    if (length <= 0) {
      return null;
    }
    Trajectory traj = new Trajectory(length);

    Trajectory.Segment last = new Trajectory.Segment();
    // First segment is easy
    last.pos = 0;
    last.vel = start_vel;
    last.acc = 0;
    last.jerk = 0;
    last.dt = dt;

    // f2 is the average of the last f2_length samples from f1, so while we
    // can recursively compute f2's sum, we need to keep a buffer for f1.
    double[] f1 = new double[length];
    f1[0] = (start_vel / max_vel) * f1_length;
    double f2;
    for (int i = 0; i < length; ++i) {
      // Apply input
      double input = Math.min(total_impulse, 1);
      if (input < 1) {
        // The impulse is over, so decelerate
        input -= 1;
        total_impulse = 0;
      } else {
        total_impulse -= input;
      }

      // Filter through F1
      double f1_last;
      if (i > 0) {
        f1_last = f1[i - 1];
      } else {
        f1_last = f1[0];
      }
      f1[i] = Math.max(0.0, Math.min(f1_length, f1_last + input));

      f2 = 0;
      // Filter through F2
      for (int j = 0; j < f2_length; ++j) {
        if (i - j < 0) {
          break;
        }

        f2 += f1[i - j];
      }
      f2 = f2 / f1_length;

      // Velocity is the normalized sum of f2 * the max velocity
      traj.segments_[i].vel = f2 / f2_length * max_vel;

      if (integration == RectangularIntegration) {
        traj.segments_[i].pos = traj.segments_[i].vel * dt + last.pos;
      } else if (integration == TrapezoidalIntegration) {
        traj.segments_[i].pos = (last.vel
                + traj.segments_[i].vel) / 2.0 * dt + last.pos;
      }
      traj.segments_[i].x = traj.segments_[i].pos;
      traj.segments_[i].y = 0;

      // Acceleration and jerk are the differences in velocity and
      // acceleration, respectively.
      traj.segments_[i].acc = (traj.segments_[i].vel - last.vel) / dt;
      traj.segments_[i].jerk = (traj.segments_[i].acc - last.acc) / dt;
      traj.segments_[i].dt = dt;

      last = traj.segments_[i];
    }

    return traj;
  }

  public static Strategy chooseStrategy(double start_vel, double goal_vel,
          double max_vel) {
    if (start_vel == goal_vel && start_vel == max_vel) {
      return Strategy.STEP;
    } else if (start_vel == goal_vel && start_vel == 0) {
      return Strategy.S_CURVE;
    } else {
      return Strategy.TRAPEZOIDAL;
    }
  }
}
