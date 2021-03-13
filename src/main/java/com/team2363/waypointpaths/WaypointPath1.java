package com.team2363.waypointpaths;

public class WaypointPath1 {
    private static WaypointPath waypointPath;

    private static void createWaypointPath() {
        List<Waypoint> waypoints = new ArrayList<>();
        waypoints.add(new Waypoint(0.0, 0.0, 0.0, 5.0, 5.0));
        waypoints.add(new Waypoint(7.0, -7.0, 89.999, 5.0, 5.0));
        waypointPath = new WaypointPath("WaypointPath1", waypoints);
    }

    public static String getName() {
        return "WaypointPath1";
    }

    public static WaypointPath getWaypointPath() {
        if (waypointPath == null) {
            createWaypointPath();
        }
        return waypointPath;
    }
}