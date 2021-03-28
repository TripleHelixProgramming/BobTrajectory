package com.team2363.trajectory;

import java.util.ArrayList;
import java.util.List;

public class Trajectory {
    List<TrajectoryState> states;
    double dt;

    public Trajectory(double dt) {
        states = new ArrayList<TrajectoryState>();
        this.dt = dt;
    }

    public double getDt() {
        return dt;
    }

    public List<TrajectoryState> getStates() {
        return states;
    }

    public void addState(TrajectoryState state) {
        states.add(state);
    }

    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append(dt).append("\n");
        states.forEach(state -> data.append(state).append("\n"));
        return data.toString();
    }
}