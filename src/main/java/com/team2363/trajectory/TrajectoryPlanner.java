package com.team2363.trajectory;

import java.util.ArrayList;
import java.util.List;

import com.team2363.motion.Constraint;
import com.team2363.motion.DrivetrainConstraint;
import com.team2363.motion.MotionProfile;
import com.team2363.motion.MotionSegment;
import com.team2363.path.Path;
import com.team2363.path.PathPlanner;
import com.team319.trajectory.RobotConfig;

public class TrajectoryPlanner {
    public static Trajectory generate(List<List<Double>> waypoints) {
        Trajectory traj = new Trajectory(RobotConfig.dt);
        if (waypoints.size() < 2) return traj;
        Path path = PathPlanner.generate(waypoints);
        List<Constraint> constraints = new ArrayList<Constraint>();
        constraints.add(new DrivetrainConstraint(RobotConfig.maxVelocity, RobotConfig.maxAcceleration));
        List<MotionSegment> segments = new ArrayList<MotionSegment>();
        for (int i = 0; i < path.getSegmentLengths().size(); i++) {
            double v0 = waypoints.get(i).get(3);
            double v1 = waypoints.get(i + 1).get(4);
            double v2 = waypoints.get(i + 1).get(3);
            segments.add(new MotionSegment(v0, v1, v2, path.getSegmentLengths().get(i)));
        }  
        MotionProfile.generate(traj, segments, constraints, path);
        assignPoses(traj, path);
        correctHeading(traj);
        return traj;
    }

    private static void assignPoses(Trajectory traj, Path path) {
        for (TrajectoryState state : traj.getStates()) {
            state.setPose(path.getPose(state.getCenterState().getDistance()));
            // System.out.println(state.getCenterState().getDistance());
        }
    }

    private static void correctHeading(Trajectory trajectory) {
		// Fix headings so they are continuously additive 
		double lastUncorrectedHeading = trajectory.getStates().get(0).getPose().getRotation().getRadians();
		double lastCorrectedHeading = lastUncorrectedHeading;
		for (TrajectoryState state : trajectory.getStates()) {
			double uncorrectedHeading = state.getPose().getRotation().getRadians();
			double headingDelta = 0;
			
			if (lastUncorrectedHeading < 0 && uncorrectedHeading > 0  && lastUncorrectedHeading < -Math.PI / 2) {
				headingDelta = -(2 * Math.PI - Math.abs(lastUncorrectedHeading) - Math.abs(uncorrectedHeading));
			} else if (lastUncorrectedHeading > 0 && uncorrectedHeading < 0 && lastUncorrectedHeading > Math.PI / 2) {
				headingDelta = 2 * Math.PI - Math.abs(lastUncorrectedHeading) - Math.abs(uncorrectedHeading);
			} else {
				headingDelta = lastUncorrectedHeading - uncorrectedHeading;
			}

			double correctedHeading = lastCorrectedHeading - headingDelta;
			state.getPose().getRotation().setRadians(correctedHeading);
			lastUncorrectedHeading = uncorrectedHeading;
			lastCorrectedHeading = correctedHeading;
		}
    }
    
    // public static void makeLeftAndRightTrajectories(Trajectory traj) {
	// 	for (int i = 0; i < traj.getStates().size(); ++i) {
	// 		TrajectoryState currentCenter = traj.getStates().get(i);
	// 		double cos_angle = Math.cos(currentCenter.getPose().getRotation().getRadians());
	// 		double sin_angle = Math.sin(currentCenter.getPose().getRotation().getRadians());

    //         x = currentCenter.getPose().getTranslation().x() - RobotConfig.wheelBase / 2 * sin_angle;
    //         y = currentCenter.getPose().getTranslation().x() + RobotConfig.wheelBase / 2 * cos_angle;
    //         Translation2d leftTranslation = new Translation2d(x, y);

    //         x = currentCenter.getPose().getTranslation().x() + RobotConfig.wheelBase / 2 * sin_angle;
    //         y = currentCenter.getPose().getTranslation().x() - RobotConfig.wheelBase / 2 * cos_angle;
    //         Translation2d rightTranslation = new Translation2d(x, y);
	// 		if (i > 0) {
				
	// 		} else {
    //             currentCenter.setLeftState(currentCenter.getCenterState());
    //             currentCenter.setRightState(currentCenter.getCenterState());
    //         }
	// 	}
	// }

	// private static void calculateSegmentData(TrajectoryState current, TrajectoryState previous) {
	// 	double distanceTravelled = Math.sqrt((current.x - previous.x)
	// 					* (current.x - previous.x)
	// 					+ (current.y - previous.y)
	// 					* (current.y - previous.y));
						
	// 	current.pos = previous.pos + distanceTravelled;
	// 	current.vel = distanceTravelled / current.dt;
	// 	current.acc = (current.vel - previous.vel) / current.dt;
	// 	current.jerk = (current.acc - previous.acc) / current.dt;
	// }
}