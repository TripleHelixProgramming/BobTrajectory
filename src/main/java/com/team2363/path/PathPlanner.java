package com.team2363.path;

import java.util.ArrayList;
import java.util.List;

import com.team2363.geometry.Arc2d;
import com.team2363.geometry.Translation2d;
import com.team319.ui.DraggableWaypoint;

public class PathPlanner {
    public static Path generate(List<List<Double>> waypoints) {
        List<Spline> splines = generateSplines(waypoints);
        List<List<Arc2d>> arcs = parameterizeSplines(splines);
        return new Path(arcs);
    }

    public static Spline[] generateGUISplines(List<DraggableWaypoint> waypoints) {
        Spline[] splines = new Spline[waypoints.size() - 1];
        for (int i = 0; i < waypoints.size() - 1; i++) {
            DraggableWaypoint w0 = waypoints.get(i);
            DraggableWaypoint w1 = waypoints.get(i + 1);
            splines[i] = new Spline(w0.getX(), w0.getY(), w0.getHeading(), w1.getX(), w1.getY(), w1.getHeading());
        }
        return splines;
    }

    private static List<Spline> generateSplines(List<List<Double>> waypoints) {
        List<Spline> splines = new ArrayList<Spline>();
        for (int i = 0; i < waypoints.size() - 1; i++) {
            double x0 = waypoints.get(i).get(0);
            double y0 = waypoints.get(i).get(1);
            double theta0 = waypoints.get(i).get(2);
            double x1 = waypoints.get(i + 1).get(0);
            double y1 = waypoints.get(i + 1).get(1);
            double theta1 = waypoints.get(i + 1).get(2);
            splines.add(new Spline(x0, y0, theta0, x1, y1, theta1));
        }
        return splines;
    }

    private static List<List<Arc2d>> parameterizeSplines(List<Spline> splines) {
        List<List<Arc2d>> arcs = new ArrayList<List<Arc2d>>();
        for (Spline spline : splines) {
            arcs.add(parameterizeSpline(spline));
        }
        return arcs;
    }

    private static List<Arc2d> parameterizeSpline(Spline spline) {
        List<Arc2d> arcs = new ArrayList<Arc2d>();
        parameterizeSpline(arcs, spline, 0, 1);
        return arcs;
    }
    
    private static void parameterizeSpline(List<Arc2d> arcs, Spline spline, double t0, double t1) {
        Translation2d p0 = spline.getTranslation(t0);
        Translation2d p1 = spline.getTranslation((t0 + t1) / 2);
        Translation2d p2 = spline.getTranslation(t1);
        Arc2d arc = new Arc2d(p0, p1, p2);
        if (arc.getLength() > 0.1 || Math.abs(arc.getDeltaRotation()) > 0.05) {
            parameterizeSpline(arcs, spline, t0, (t0 + t1) / 2);
            parameterizeSpline(arcs, spline, (t0 + t1) / 2, t1);
        } else {
            arcs.add(arc);
        }
    }
}