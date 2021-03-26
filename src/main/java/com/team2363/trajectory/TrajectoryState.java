package com.team2363.trajectory;

import com.team2363.geometry.Pose2d;
import com.team2363.motion.MotionState;

public class TrajectoryState {
    private Pose2d pose;
    private MotionState left, right, center;

    public TrajectoryState(MotionState state) {
        center = state;
    }

    public void setPose(Pose2d pose) {
        this.pose = pose;
    }

    public Pose2d getPose() {
        return pose;
    }

    public void setLeftState(MotionState left) {
        this.left = left;
    }

    public MotionState getLeftState() {
        return left;
    }

    public void setCenterState(MotionState center) {
        this.center = center;
    }

    public MotionState getCenterState() {
        return center;
    }

    public void setRightState(MotionState right) {
        this.right = right;
    }

    public MotionState getRightState() {
        return right;
    }

    public String toString() {
        return pose + "," + center;
    }
}