package com.team2363.waypointpaths.waypoints;

import com.team319.ui.DraggableWaypoint;

public class Waypoint {

    private final double x;
    private final double y;
    private final double heading;
    
    private final double maxVelocity;
    private final double currentVelocity;

    /**
     * Instantiates a <code>Waypoint</code>
     * @param x
     * @param y
     * @param heading
     * @param maxVelocity
     * @param currentVelocity
     */
    public Waypoint(final double x, final double y, final double heading, final double maxVelocity, final double currentVelocity) {
        this.x = x;
        this.y = y;
        this.heading = heading;
        this.maxVelocity = maxVelocity;
        this.currentVelocity = currentVelocity;
    }

    public String generateInstantiation() {
        return "new Waypoint(" + x + ", " + y + ", " + heading + ", " + maxVelocity + ", " + currentVelocity + ")";
    }
    
    /**
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * @return heading
     */
    public double getHeading() {
        return heading;
    }

    /**
     * @return maxVelocity
     */
    public double getMaxVelocity() {
        return maxVelocity;
    }

    /**
     * @return currentVelocity
     */
    public double getCurrentVelocity() {
        return currentVelocity;
    }
}