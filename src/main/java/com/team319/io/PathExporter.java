package com.team319.io;

import java.util.List;

import com.team319.trajectory.BobPath;
import com.team319.ui.DraggableWaypoint;

import java.io.File;

public class PathExporter {

    private static final String defaultPath = "src/main/java/frc/paths/";
    public static void exportPaths(List<BobPath> paths) {
        
        StringBuilder data = new StringBuilder();
			
        for (BobPath path : paths) {
            data.append(path.toString());
        }
        FilePrinter.write(defaultPath, "Paths.txt", data.toString());
    }

    public static void exportPath(BobPath path, File file) {
        try {
            FilePrinter.write(file.getAbsolutePath(),"/" + path.getName() + ".txt", path.toString());
        } catch (Exception e) {
            System.out.println("Execption trying to save a path. " + e + " " + e.getMessage());
        }
    }
    
    public static void exportPathClass(BobPath path, File file) {
        StringBuilder classString = new StringBuilder();
        classString.append("package com.team2363.waypointpaths;\n\n");
        classString.append("public class " + path.getName() + " {\n");
        classString.append("    public static double[][] getWaypoints() {\n");
        classString.append("        return new double[][]{\n");
        for (DraggableWaypoint waypoint : path.getWaypoints()) {
            classString.append("        " + generateDoubleArrayInstantiation(waypoint) + ",\n");
        }
        classString.append("        };\n");
        classString.append("    public static String getName() {\n");
        classString.append("        return \"" + path.getName() + "\";\n");
        classString.append("    }\n");
        classString.append("}");
        
        FilePrinter.write(file.getAbsolutePath(),"/" + path.getName() + ".java", classString.toString());
    }

    public static String generateDoubleArrayInstantiation(DraggableWaypoint waypoint) {
        return new StringBuilder()
        .append("{")
        .append(waypoint.getX() + ", ")
        .append(waypoint.getY() + ", ")
        .append(waypoint.getHeading() + ", ")
        .append(waypoint.getMaxVelocity() + ", ")
        .append(waypoint.getCurrentVelocity() + "}")
        .toString();
    }
}
