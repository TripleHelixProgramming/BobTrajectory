/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.team2363.spline;

import com.team2363.geometry.Pose2d;
import com.team254.lib.trajectory.Trajectory;
import com.team319.ui.DraggableWaypoint;

public class ParametricQuinticSpline extends Spline {

    private double vectorMagnitude;
    private double x0,x1,dx0,dx1,ddx0,ddx1,y0,y1,dy0,dy1,ddy0,ddy1;
    private double ax,bx,cx,dx,ex,fx,ay,by,cy,dy,ey,fy;

    public ParametricQuinticSpline(DraggableWaypoint w0, DraggableWaypoint w1) {

        vectorMagnitude = 1.5 * w0.getDistance(w1);

        x0 = w0.getX();
        x1 = w1.getX();
        dx0 = Math.cos(w0.getHeading()) * vectorMagnitude;
        dx1 = Math.cos(w1.getHeading()) * vectorMagnitude;
        ddy0 = 0;
        ddy1 = 0;

        y0 = w0.getY();
        y1 = w1.getY();
        dy0 = Math.sin(w0.getHeading()) * vectorMagnitude;
        dy1 = Math.sin(w1.getHeading()) * vectorMagnitude;
        ddy0 = 0;
        ddy1 = 0;

        calculateCoefficients();
    }

    public void calculateCoefficients() {
        ax = 6 * (x1 - x0) - 3 * (dx0 + dx1) + 0.5 * (ddx1 - ddx0);
        bx = 15 * x0 + 8 * dx0 + 1.5 * ddx0 - ddx1 + 7 * dx1 - 15 * x1;
        cx = -10 * x0 - 6 * dx0 - 1.5 * ddx0 + 0.5 * ddx1 - 4 * dx1 + 10 * x1;
        dx = 0.5 * ddx0;
        ex = dx0;
        fx = x0;

        ay = 6 * (y1 - y0) - 3 * (dy0 + dy1) + 0.5 * (ddy1 - ddy0);;
        by = 15 * y0 + 8 * dy0 + 1.5 * ddy0 - ddy1 + 7 * dy1 - 15 * y1;
        cy = -10 * y0 - 6 * dy0 - 1.5 * ddy0 + 0.5 * ddy1 - 4 * dy1 + 10 * y1;
        dy = 0.5 * ddy0;
        ey = dy0;
        fy = y0;
    }

    public Pose2d getPoint(double t) {
        return new Pose2d(x(t), y(t), Math.atan2(dy(t), dx(t)));
    }

    public double arcLengthSegment(double t) {
        return Math.sqrt(dx(t) * dx(t) + dy(t) * dy(t));
    }

    private double x(double t) {
        return ax * t * t * t * t * t + bx * t * t * t * t + cx * t * t * t + dx * t * t + ex * t + fx;
    }

    private double y(double t) {
        return ay * t * t * t * t * t + by * t * t * t * t + cy * t * t * t + dy * t * t + ey * t + fy;
    }

    private double dx(double t) {
        return 5 * ax * t * t * t * t + 4 * bx * t * t * t + 3 * cx * t * t + 2 * dx * t + ex;
    }

    private double dy(double t) {
        return 5 * ay * t * t * t * t + 4 * by * t * t * t + 3 * cy * t * t + 2 * dy * t + ey;
    }

    public double calculateLength() {

        final int kNumSamples = 100000;
		double integral = 0;
        double integrand, last_integrand = Math.sqrt(dx(0) * dx(0) + dy(0) * dy(0)) / kNumSamples;
        
		for (double i = 1; i <= kNumSamples; ++i) {
            double t = i / kNumSamples;
			integrand = Math.sqrt(dx(t) * dx(t) + dy(t) * dy(t)) / kNumSamples;
			integral += (integrand + last_integrand) / 2;
			last_integrand = integrand;
        }
        
		return integral;
    }
}