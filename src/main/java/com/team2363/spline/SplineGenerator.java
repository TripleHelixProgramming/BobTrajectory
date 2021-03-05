package com.team2363.spline;

import java.util.List;

import com.team2363.geometry.Pose2d;
import com.team254.lib.trajectory.Segment;
import com.team254.lib.trajectory.Trajectory;
import com.team319.ui.DraggableWaypoint;

public class SplineGenerator {

    public static Spline[] getSplines(List<DraggableWaypoint> waypoints) {
        Spline[] splines = new Spline[waypoints.size() - 1];
		for (int i = 0; i < splines.length; ++i) {
            splines[i] = new ParametricQuinticSpline(waypoints.get(i), waypoints.get(i + 1));
        }
        return splines;
    }

    public static void parametrizeSplines(Trajectory traj, Spline[] splines) {
        double startPos = 0;
        double splineLength = splines[0].calculateLength();
        int currentSpline = 0;
        double t = 0;
        double dt = 0.00001;
        double integral = 0;
        double lastIntegral = 0;
        double result = 0;
        double integrand, lastIntegrand = splines[0].arcLengthSegment(0) * dt;
        for (Segment segment : traj.getSegments()) {
            if (segment.pos - startPos > splineLength && currentSpline < splines.length - 1) {
                startPos += splineLength;
                splineLength = splines[currentSpline + 1].calculateLength();
                currentSpline++;

                integral = 0;
                lastIntegral = 0;
                lastIntegrand = splines[currentSpline].arcLengthSegment(0) * dt;
                t = 0;
            }
            
            while (integral < segment.pos - startPos) {
                t += dt;
                integrand = splines[currentSpline].arcLengthSegment(t) * dt;
                integral += (integrand + lastIntegrand) / 2;
                if (integral > segment.pos - startPos) {
                    result = (integral != lastIntegral) ? t + ((segment.pos - startPos - lastIntegral) / (integral - lastIntegral) - 1) * dt : t;
                }
                lastIntegrand = integrand;
                lastIntegral = integral;
            }

            Pose2d pose = splines[currentSpline].getPoint(Math.min(result, 1));
            segment.x = pose.x();
            segment.y = pose.y();
            segment.heading = pose.getRotation();
        }
    }
}
