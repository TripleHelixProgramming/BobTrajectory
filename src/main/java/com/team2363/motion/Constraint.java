package com.team2363.motion;

import com.team2363.path.Path;

public abstract class Constraint {
    public abstract double getMaxVelocity(Path path, double s);
    public abstract double getMaxAcceleration(Path path, double s);
}