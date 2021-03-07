package com.team2363.waypointpaths.waypoints;

import com.team319.trajectory.BobPath;
import java.util.List;
import java.util.ArrayList;

public class WaypointPath {

    private String name;
    private List<Waypoint> waypoints;

    public WaypointPath(String name, List<Waypoint> waypoints) {
        this.name = name;
        this.waypoints = waypoints;
    }

    public String generateWaypointClass() {
        StringBuilder classString = new StringBuilder();
        classString.append("package com.team2363.waypointpaths;\n\n");
        classString.append("import java.util.List;\n");
        classString.append("import java.util.ArrayList;\n\n");
        classString.append("import com.team2363.waypointpaths.waypoints.Waypoint;\n");
        classString.append("import com.team2363.waypointpaths.waypoints.WaypointPath;\n\n");
        classString.append("public class " + name + " {\n");
        classString.append("    private static WaypointPath waypointPath;\n\n");
        classString.append("    private static void createWaypointPath() {\n");
        classString.append("        List<Waypoint> waypoints = new ArrayList<>();\n");
        for (Waypoint waypoint : waypoints) {
            classString.append("        waypoints.add(" + waypoint.generateInstantiation() + ");\n");
        }
        classString.append("        waypointPath = new WaypointPath(\"" + name + "\", waypoints);\n    }\n\n");
        classString.append("    public static String getName() {\n");
        classString.append("        return \"" + name + "\";\n    }\n\n");
        classString.append("    public static WaypointPath getWaypointPath() {\n");
        classString.append("        if (waypointPath == null) {\n");
        classString.append("            createWaypointPath();\n        }\n");
        classString.append("        return waypointPath;\n    }\n}");
        return classString.toString();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param waypoints the waypoints to set
     */
    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return the waypoints
     */
    public List<Waypoint> getWaypoints() {
        return waypoints;
    }
}