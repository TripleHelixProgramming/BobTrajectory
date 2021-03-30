package com.team2363.trajectory;

import java.text.DecimalFormat;

import com.team2363.geometry.Pose2d;
import com.team2363.motion.MotionState;

public class TrajectoryState {
    private Pose2d pose;
    private MotionState center;
    private double left, right;

    public TrajectoryState(MotionState state) {
        center = state;
    }

    public void setPose(Pose2d pose) {
        this.pose = pose;
    }

    public Pose2d getPose() {
        return pose;
    }

    public void setLeftVelocity(double left) {
        this.left = left;
    }

    public double getLeftState() {
        return left;
    }

    public void setCenterState(MotionState center) {
        this.center = center;
    }

    public MotionState getCenterState() {
        return center;
    }

    public void setRightVelocity(double right) {
        this.right = right;
    }

    public double getRightState() {
        return right;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0000");
        return df.format(pose.getRotation().getRadians()) + "," + df.format(center.getDistance()) + "," + df.format(left) + "," + df.format(right);
    }
}