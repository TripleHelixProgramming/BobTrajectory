package com.team2363.motion;

import com.team2363.path.Path;
import com.team319.trajectory.RobotConfig;

public class DrivetrainConstraint extends Constraint {
    private double maxVelocity;
    private double maxAcceleration;

    public DrivetrainConstraint(double maxVelocity, double maxAcceleration) {
        this.maxVelocity = maxVelocity;
        this.maxAcceleration = maxAcceleration;
    }

    public double getMaxVelocity(Path path, double s) {
        return maxVelocity / (1 + Math.abs(path.getCurvature(s)) * RobotConfig.wheelBase / 2);
    }

    public double getMaxAcceleration(Path path, double s) {
        return maxAcceleration / (1 + Math.abs(path.getCurvature(s)) * RobotConfig.wheelBase / 2);
    }
}