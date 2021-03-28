package com.team2363;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.team2363.trajectory.Trajectory;
import com.team2363.trajectory.TrajectoryPlanner;
import com.team2363.trajectory.TrajectoryState;
import com.team319.io.FileManager;
import com.team319.io.FileUtil;

public class Main {
    public static void main(String... args) {
        // List<List<Double>> waypoints = new ArrayList<>();
        // List<Double> w0 = new ArrayList<Double>();
        // w0.add(0.0);
        // w0.add(0.0);
        // w0.add(Math.toRadians(0.0));
        // w0.add(0.0);
        // w0.add(0.0);
        // waypoints.add(w0);
        // List<Double> w1 = new ArrayList<Double>();
        // w1.add(20.0);
        // w1.add(-20.0);
        // w1.add(Math.toRadians(-90.0));
        // w1.add(0.0);
        // w1.add(10.0);
        // waypoints.add(w1);

        // Trajectory traj = TrajectoryPlanner.generate(waypoints);

        // System.out.println(traj);

        double ti = System.nanoTime();
        FileManager.generate();
        double tf = System.nanoTime();
        System.out.println((tf - ti) / 1000000000);

        // FileUtil.parseDoubleCSV(new File("src/main/java/frc/deploy/paths/paths/test0.csv")).forEach(val -> System.out.println(val));
    }
}