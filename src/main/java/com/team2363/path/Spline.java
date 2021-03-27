package com.team2363.path;

import java.util.List;

import com.team2363.geometry.Translation2d;

public class Spline {
    private double x0, x1, dx0, dx1, ddx0, ddx1, y0, y1, dy0, dy1, ddy0, ddy1;
    private double ax, bx, cx, dx, ex, fx, ay, by, cy, dy, ey, fy;
    private double vectorMagnitude;
    private static double kStepSize = 0.1;
    private static double kMaxIterations = 100.0;
    private static double kSamples = 100.0;
    private static double kMinDelta = 0.001;
    private static final double kEpsilon = 1e-5;

    public Spline(double x0, double y0, double theta0, double x1, double y1, double theta1) {
        vectorMagnitude = 1.2 * Math.hypot(x1 - x0, y1 - y0);

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

        computeCoefficients();  
    }

    private Spline(double x0, double x1, double dx0, double dx1, double ddx0, double ddx1,
    double y0, double y1, double dy0, double dy1, double ddy0, double ddy1) {
        this.x0 = x0;
        this.x1 = x1;
        this.dx0 = dx0;
        this.dx1 = dx1;
        this.ddx0 = ddx0;
        this.ddx1 = ddx1;

        this.y0 = y0;
        this.y1 = y1;
        this.dy0 = dy0;
        this.dy1 = dy1;
        this.ddy0 = ddy0;
        this.ddy1 = ddy1;

        computeCoefficients();
    }

    private void computeCoefficients() {
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

    private double dx(double t) {
        return 5 * ax * t * t * t * t + 4 * bx * t * t * t + 3 * cx * t * t + 2 * dx * t + ex;
    }

    private double dy(double t) {
        return 5 * ay * t * t * t * t + 4 * by * t * t * t + 3 * cy * t * t + 2 * dy * t + ey;
    }

    private double ddx(double t) {
        return 20 * ax * t * t * t + 12 * bx * t * t + 6 * cx * t + 2 * dx;
    }

    private double ddy(double t) {
        return 20 * ay * t * t * t + 12 * by * t * t + 6 * cy * t + 2 * dy;
    }

    private double dddx(double t) {
        return 60 * ax * t * t + 24 * bx * t + 6 * cx;
    }

    private double dddy(double t) {
        return 60 * ay * t * t + 24 * by * t + 6 * cy;
    }

    public double getCurvature(double t) {
        return (dx(t) * ddy(t) - ddx(t) * dy(t)) / ((dx(t) * dx(t) + dy(t) * dy(t)) * Math.sqrt((dx(t) * dx(t) + dy
                (t) * dy(t))));
    }

    public double getDCurvature(double t) {
        double dx2dy2 = (dx(t) * dx(t) + dy(t) * dy(t));
        double num = (dx(t) * dddy(t) - dddx(t) * dy(t)) * dx2dy2 - 3 * (dx(t) * ddy(t) - ddx(t) * dy(t)) * (dx(t) * ddx(t) + dy(t) * ddy(t));
        return num / (dx2dy2 * dx2dy2 * Math.sqrt(dx2dy2));
    }

    private double dCurvature2(double t) {
        double dx2dy2 = (dx(t) * dx(t) + dy(t) * dy(t));
        double num = (dx(t) * dddy(t) - dddx(t) * dy(t)) * dx2dy2 - 3 * (dx(t) * ddy(t) - ddx(t) * dy(t)) * (dx(t) * ddx(t) + dy(t) * ddy(t));
        return num * num / (dx2dy2 * dx2dy2 * dx2dy2 * dx2dy2 * dx2dy2);
    }

    private double sumDCurvature2() {
        double dt = 1.0 / kSamples;
        double sum = 0;
        for (double t = 0; t < 1.0; t += dt) {
            sum += (dt * dCurvature2(t));
        }
        return sum;
    }

    public static double sumDCurvature2(Spline[] splines) {
        double sum = 0;
        for (Spline s : splines) {
            sum += s.sumDCurvature2();
        }
        return sum;
    }

    public static double optimizeSpline(Spline[] splines) {
        int count = 0;
        double prev = sumDCurvature2(splines);
        while (count < kMaxIterations) {
            runOptimizationIteration(splines);
            double current = sumDCurvature2(splines);
            if (prev - current < kMinDelta)
                return current;
            prev = current;
            count++;
        }
        return prev;
    }

    private static class ControlPoint {
        private double ddx, ddy;
    }

    /**
     * Runs a single optimization iteration
     */
    private static void runOptimizationIteration(Spline[] splines) {
        //can't optimize anything with less than 2 splines
        if (splines.length <= 1) {
            return;
        }

        ControlPoint[] controlPoints = new ControlPoint[splines.length - 1];
        double magnitude = 0;

        for (int i = 0; i < splines.length - 1; ++i) {
            double original = sumDCurvature2(splines);
            Spline temp, temp1;

            temp = splines[i];
            temp1 = splines[i + 1];
            controlPoints[i] = new ControlPoint(); //holds the gradient at a control point

            //calculate partial derivatives of sumDCurvature2
            splines[i] = new Spline(temp.x0, temp.x1, temp.dx0, temp.dx1, temp.ddx0, temp.ddx1 +
                    kEpsilon, temp.y0, temp.y1, temp.dy0, temp.dy1, temp.ddy0, temp.ddy1);
            splines[i + 1] = new Spline(temp1.x0, temp1.x1, temp1.dx0, temp1.dx1, temp1.ddx0 +
                    kEpsilon, temp1.ddx1, temp1.y0, temp1.y1, temp1.dy0, temp1.dy1, temp1.ddy0, temp1.ddy1);
            controlPoints[i].ddx = (sumDCurvature2(splines) - original) / kEpsilon;
            splines[i] = new Spline(temp.x0, temp.x1, temp.dx0, temp.dx1, temp.ddx0, temp.ddx1, temp
                    .y0, temp.y1, temp.dy0, temp.dy1, temp.ddy0, temp.ddy1 + kEpsilon);
            splines[i + 1] = new Spline(temp1.x0, temp1.x1, temp1.dx0, temp1.dx1, temp1.ddx0,
                    temp1.ddx1, temp1.y0, temp1.y1, temp1.dy0, temp1.dy1, temp1.ddy0 + kEpsilon, temp1.ddy1);
            controlPoints[i].ddy = (sumDCurvature2(splines) - original) / kEpsilon;

            splines[i] = temp;
            splines[i + 1] = temp1;
            magnitude += controlPoints[i].ddx * controlPoints[i].ddx + controlPoints[i].ddy * controlPoints[i].ddy;
        }

        magnitude = Math.sqrt(magnitude);

        //minimize along the direction of the gradient
        //first calculate 3 points along the direction of the gradient
        Translation2d p1, p2, p3;
        p2 = new Translation2d(0, sumDCurvature2(splines)); //middle point is at the current location

        for (int i = 0; i < splines.length - 1; ++i) { //first point is offset from the middle location by -stepSize

            //normalize to step size
            controlPoints[i].ddx *= kStepSize / magnitude;
            controlPoints[i].ddy *= kStepSize / magnitude;

            //move opposite the gradient by step size amount
            splines[i].ddx1 -= controlPoints[i].ddx;
            splines[i].ddy1 -= controlPoints[i].ddy;
            splines[i + 1].ddx0 -= controlPoints[i].ddx;
            splines[i + 1].ddy0 -= controlPoints[i].ddy;

            //recompute the spline's coefficients to account for new second derivatives
            splines[i].computeCoefficients();
            splines[i + 1].computeCoefficients();
        }
        p1 = new Translation2d(-kStepSize, sumDCurvature2(splines));

        for (int i = 0; i < splines.length - 1; ++i) { //last point is offset from the middle location by +stepSize
            //move along the gradient by 2 times the step size amount (to return to original location and move by 1
            // step)
            splines[i].ddx1 += 2 * controlPoints[i].ddx;
            splines[i].ddy1 += 2 * controlPoints[i].ddy;
            splines[i + 1].ddx0 += 2 * controlPoints[i].ddx;
            splines[i + 1].ddy0 += 2 * controlPoints[i].ddy;

            //recompute the spline's coefficients to account for new second derivatives
            splines[i].computeCoefficients();
            splines[i + 1].computeCoefficients();
        }

        p3 = new Translation2d(kStepSize, sumDCurvature2(splines));

        double stepSize = fitParabola(p1, p2, p3); //approximate step size to minimize sumDCurvature2 along the gradient

        for (int i = 0; i < splines.length - 1; ++i) {

            //move by the step size calculated by the parabola fit (+1 to offset for the final transformation to find
            // p3)
            controlPoints[i].ddx *= 1 + stepSize / kStepSize;
            controlPoints[i].ddy *= 1 + stepSize / kStepSize;

            splines[i].ddx1 += controlPoints[i].ddx;
            splines[i].ddy1 += controlPoints[i].ddy;
            splines[i + 1].ddx0 += controlPoints[i].ddx;
            splines[i + 1].ddy0 += controlPoints[i].ddy;

            //recompute the spline's coefficients to account for new second derivatives
            splines[i].computeCoefficients();
            splines[i + 1].computeCoefficients();
        }
    }

    private static double fitParabola(Translation2d p1, Translation2d p2, Translation2d p3) {
        double A = (p3.x() * (p2.y() - p1.y()) + p2.x() * (p1.y() - p3.y()) + p1.x() * (p3.y() - p2.y()));
        double B = (p3.x() * p3.x() * (p1.y() - p2.y()) + p2.x() * p2.x() * (p3.y() - p1.y()) + p1.x() * p1.x() *
                (p2.y() - p3.y()));
        return -B / (2 * A);
    }

    // public double cost() {
    //     double dt = 0.01;
    //     double integral = 0;
    //     for (int i = 0; i <= 1; i += dt) {
    //         double vel = Math.hypot(dx(i), dy(i));
    //         double numerator = (dx(i) * dddy(i) - dddx(i) * dy(i)) * vel - 3 * 
    //         ((dx(i) * ddy(i) - ddx(i) * dy(i)) * (dx(i) * ddx(i) + dy(i) * ddy(i)));
    //         integral += numerator * numerator / Math.pow(vel, 5) * dt;
    //     }
    //     return integral;
    // }

    // public static void smoothSplines(Spline[] splines) {
    //     for (int i = 0; i < splines.length - 1; i++) {
    //         smoothSplines(splines[i], splines[i + 1]);
    //     }
    // }

    // private static void smoothSplines(Spline spline0, Spline spline1) {
        
    // }
}