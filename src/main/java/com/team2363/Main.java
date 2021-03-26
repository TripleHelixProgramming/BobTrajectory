package com.team2363;

import java.util.ArrayList;
import java.util.List;

import com.team2363.trajectory.Trajectory;
import com.team2363.trajectory.TrajectoryPlanner;
import com.team2363.trajectory.TrajectoryState;

public class Main {
    public static void main(String... args) {
        List<List<Double>> waypoints = new ArrayList<>();
        List<Double> w0 = new ArrayList<Double>();
        w0.add(0.0);
        w0.add(0.0);
        w0.add(Math.toRadians(0.0));
        w0.add(0.0);
        w0.add(0.0);
        waypoints.add(w0);
        List<Double> w1 = new ArrayList<Double>();
        w1.add(5.0);
        w1.add(2.5);
        w1.add(Math.toRadians(45.0));
        w1.add(0.0);
        w1.add(10.0);
        waypoints.add(w1);
        double ti = System.nanoTime();
        Trajectory traj = TrajectoryPlanner.generate(waypoints);
        double tf = System.nanoTime();
        for (TrajectoryState state : traj.getStates()) {
            System.out.println(state);
        }
        System.out.println((tf - ti) / 1000000000);
        // Translation2d p0 = new Translation2d(0, 0);
        // Translation2d p1 = new Translation2d(2.5, 1);
        // Translation2d p2 = new Translation2d(5, 0);
        // Arc2d arc = new Arc2d(p0, p1, p2);
        // System.out.println("Delta Rotation: " + arc.getDeltaRotation());
        // System.out.println("Length: " + arc.getLength());
        // System.out.println("Middle pose: " + arc.getPose(3));
    }
}