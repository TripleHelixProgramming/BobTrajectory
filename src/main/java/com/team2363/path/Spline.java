package com.team2363.path;

import java.util.List;

import com.team2363.geometry.Translation2d;

public class Spline {
    private double x0, x1, dx0, dx1, ddx0, ddx1, y0, y1, dy0, dy1, ddy0, ddy1;
    private double ax, bx, cx, dx, ex, fx, ay, by, cy, dy, ey, fy;
    private double vectorMagnitude;

    public Spline(double x0, double y0, double theta0, double x1, double y1, double theta1) {
        vectorMagnitude = 1.5 * Math.hypot(x1 - x0, y1 - y0);

        this.x0 = x0;
        this.x1 = x1;
        this.dx0 = Math.cos(theta0) * vectorMagnitude;
        this.dx1 = Math.cos(theta1) * vectorMagnitude;
        this.ddx0 = 0;
        this.ddx1 = 0;

        this.y0 = y0;
        this.y1 = y1;
        this.dy0 = Math.sin(theta0) * vectorMagnitude;
        this.dy1 = Math.sin(theta1) * vectorMagnitude;
        this.ddy0 = 0;
        this.ddy1 = 0;

        solveCoefficients();  
    }

    private void solveCoefficients() {
        ax = -6 * x0 - 3 * dx0 - 0.5 * ddx0 + 0.5 * ddx1 - 3 * dx1 + 6 * x1;
        bx = 15 * x0 + 8 * dx0 + 1.5 * ddx0 - ddx1 + 7 * dx1 - 15 * x1;
        cx = -10 * x0 - 6 * dx0 - 1.5 * ddx0 + 0.5 * ddx1 - 4 * dx1 + 10 * x1;
        dx = 0.5 * ddx0;
        ex = dx0;
        fx = x0;

        ay = -6 * y0 - 3 * dy0 - 0.5 * ddy0 + 0.5 * ddy1 - 3 * dy1 + 6 * y1;
        by = 15 * y0 + 8 * dy0 + 1.5 * ddy0 - ddy1 + 7 * dy1 - 15 * y1;
        cy = -10 * y0 - 6 * dy0 - 1.5 * ddy0 + 0.5 * ddy1 - 4 * dy1 + 10 * y1;
        dy = 0.5 * ddy0;
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