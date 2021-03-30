package com.team2363.geometry;

public class Arc2d {
    private Translation2d center, p0, p2;
    private double offsetRotation, deltaRotation, radius, length, x, y;
    private double m0, b0, m1, b1;
    private boolean colinear;

    public Arc2d(Translation2d p0, Translation2d p1, Translation2d p2) {
        this.p0 = p0;
        this.p2 = p2;
        colinear = Translation2d.isColinear(p0, p1, p2);
        if (colinear) {
            offsetRotation = Math.atan2(p2.y() - p0.y(), p2.x() - p0.x());
            deltaRotation = 0;
            length = p0.getDistance(p2);
        } else {
            if (p0.y() != p1.y()) {
                m0 = (p0.x() - p1.x()) / (p1.y() - p0.y());
                b0 = ((p0.y() + p1.y()) / 2 - m0 * (p0.x() + p1.x()) / 2);
            } else {
                m0 = (p0.x() - p2.x()) / (p2.y() - p0.y());
                b0 = ((p0.y() + p2.y()) / 2 - m0 * (p0.x() + p2.x()) / 2);
            }
            if (p1.y() != p2.y()) {
                m1 = (p1.x() - p2.x()) / (p2.y() - p1.y());
                b1 = ((p1.y() + p2.y()) / 2 - m1 * (p1.x() + p2.x()) / 2);
            } else {
                m1 = (p0.x() - p2.x()) / (p2.y() - p0.y());
                b1 = ((p0.y() + p2.y()) / 2 - m1 * (p0.x() + p2.x()) / 2);
            }
            center = new Translation2d((b1 - b0) / (m0 - m1), m0 * (b1 - b0) / (m0 - m1) + b0);
            if (center.getDistance(p1) > 1E4) {
                colinear = true;
                offsetRotation = Math.atan2(p2.y() - p0.y(), p2.x() - p0.x());
                deltaRotation = 0;
                length = p0.getDistance(p2);
            } else {
                radius = Math.min(1E3, center.getDistance(p1));
                offsetRotation = Math.atan2(p0.y() - center.y(), p0.x() - center.x());
                double finalRotation = Math.atan2(p2.y() - center.y(), p2.x() - center.x());
                double diff = (finalRotation - offsetRotation - Math.PI) % (2 * Math.PI) - Math.PI;
                deltaRotation = diff < -Math.PI ? diff + 2 * Math.PI : diff;
                length = radius * Math.abs(deltaRotation);
            }

        }
    }

    public double getLength() {
        return length;
    }

    public double getDeltaRotation() {
        return deltaRotation;
    }

    public double getRadius() {
        return radius;
    }

    public double getCurvature() {
        return colinear ? 0 : Math.signum(deltaRotation) / radius;
    }

    public Pose2d getPose(double s) {
        return new Pose2d(getTranslation(s), getRotation(s));
    }

    public Translation2d getTranslation(double s) {
        double correctedS = Math.max(0, Math.min(s, length));
        if (colinear) {
            x = (p2.x() - p0.x()) * s / length + p0.x();
            y = (p2.y() - p0.y()) * s / length + p0.y();
        } else {
            x = radius * Math.cos(offsetRotation + deltaRotation * correctedS / length) + center.x();
            y = radius * Math.sin(offsetRotation + deltaRotation * correctedS / length) + center.y();
        }
        return new Translation2d(x, y);
    }

    public Rotation2d getRotation(double s) {
        double correctedS = Math.max(0, Math.min(s, length));
        if (colinear) return new Rotation2d(offsetRotation);
        double yComponent = deltaRotation * radius * Math.cos(offsetRotation + deltaRotation * correctedS / length);
        double xComponent = -deltaRotation * radius * Math.sin(offsetRotation + deltaRotation * correctedS / length);
        return new Rotation2d(Math.atan2(yComponent, xComponent));
    }
}