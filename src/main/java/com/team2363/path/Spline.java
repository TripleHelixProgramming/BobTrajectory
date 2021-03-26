package com.team2363.path;

import com.team2363.geometry.Translation2d;

public class Spline {
    private double dx0, dx1, dy0, dy1;
    private double ax, bx, cx, dx, ex, fx, ay, by, cy, dy, ey, fy;
    private double vectorMagnitude;

    public Spline(double x0, double y0, double theta0, double x1, double y1, double theta1) {
        vectorMagnitude = 1.2 * Math.hypot(x1 - x0, y1 - y0);

        dx0 = Math.cos(theta0) * vectorMagnitude;
        dx1 = Math.cos(theta1) * vectorMagnitude;

        dy0 = Math.sin(theta0) * vectorMagnitude;
        dy1 = Math.sin(theta1) * vectorMagnitude;

        ax = 6 * (x1 - x0) - 3 * (dx0 + dx1);
        bx = 15 * x0 + 8 * dx0 + 7 * dx1 - 15 * x1;
        cx = -10 * x0 - 6 * dx0 - 4 * dx1 + 10 * x1;
        dx = 0;
        ex = dx0;
        fx = x0;

        ay = 6 * (y1 - y0) - 3 * (dy0 + dy1);
        by = 15 * y0 + 8 * dy0 + 7 * dy1 - 15 * y1;
        cy = -10 * y0 - 6 * dy0 - 4 * dy1 + 10 * y1;
        dy = 0;
        ey = dy0;
        fy = y0;
    }

    public Translation2d getTranslation(double t) {
        return new Translation2d(x(t), y(t));
    }

    private double x(double t) {
        return ax * t * t * t * t * t + bx * t * t * t * t + cx * t * t * t + dx * t * t + ex * t + fx;
    }

    private double y(double t) {
        return ay * t * t * t * t * t + by * t * t * t * t + cy * t * t * t + dy * t * t + ey * t + fy;
    }
}