package com.team2363.spline;

import com.team2363.geometry.Pose2d;
import com.team254.lib.trajectory.Trajectory;

public abstract class Spline {
    public abstract Pose2d getPoint(double input);

    public abstract double arcLengthSegment(double t);

    public abstract double calculateLength();
}