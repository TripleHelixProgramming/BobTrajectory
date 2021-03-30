package com.team2363.path;

import java.util.ArrayList;
import java.util.List;

import com.team2363.geometry.Arc2d;
import com.team2363.geometry.Pose2d;

public class Path {
    List<Double> segmentLengths;
    List<Arc2d> arcs;
    double totalLength;
    double currentDistance;
    int arcIndex;

    public Path(List<List<Arc2d>> data) {
        arcIndex = 0;
        currentDistance = 0;
        totalLength = 0;
        segmentLengths = new ArrayList<Double>();
        arcs = new ArrayList<Arc2d>();
        for (List<Arc2d> segmentArcs : data) {
            double integral = 0;
            for (Arc2d arc : segmentArcs) {
                integral += arc.getLength();
            }
            totalLength += integral;
            segmentLengths.add(integral);
            arcs.addAll(segmentArcs);
        }
    }

    public List<Double> getSegmentLengths() {
        return segmentLengths;
    }

    public Pose2d getPose(double s) {
        double newS = update(s);
        return arcs.get(arcIndex).getPose(newS);
    }

    public double getCurvature(double s) {
        update(s);
        return arcs.get(arcIndex).getCurvature();
    }

    private double update(double s) {
        double correctedS = Math.max(0, Math.min(s, totalLength));
        if (correctedS < currentDistance + arcs.get(arcIndex).getLength()) {
            currentDistance = 0;
            arcIndex = 0;
        }
        while (currentDistance + arcs.get(arcIndex).getLength() < correctedS) {
            currentDistance += arcs.get(arcIndex).getLength();
            arcIndex = Math.min(arcIndex + 1, arcs.size() - 1);
        }
        return correctedS - currentDistance;
    }
}