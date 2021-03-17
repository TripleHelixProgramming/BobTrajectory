package com.team319.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.team319.ui.DraggableWaypoint;
import com.team319.ui.Plotter;

public class PathImporter {
    public static List<Plotter> importPaths() {
    }

    public static List<Plotter> importPaths(File filePath) {
        
    }

    public static Plotter importPath(File file) {
        List<List<String>> list = FileUtil.parseCSV(file);
        if (list == null) {
            return null;
        }
        String pathName = file.getName();
        pathName = pathName.substring(0, pathName.length() - 3);
        Plotter plotter = new Plotter(pathName);
        try {
            for (List<String> waypoint : list) {
                double x = Double.parseDouble(waypoint.get(0).trim());
                double y = Double.parseDouble(waypoint.get(1).trim());
                double heading = Double.parseDouble(waypoint.get(2).trim());
                double currentVelocity = Double.parseDouble(waypoint.get(3).trim());
                double maxVelocity = Double.parseDouble(waypoint.get(4).trim());
                DraggableWaypoint dWaypoint = new DraggableWaypoint(x, y, heading, currentVelocity, maxVelocity, plotter);
                plotter.addWaypoint(dWaypoint);
            }
        } catch (Exception e) {
            if (e instanceof IndexOutOfBoundsException) {
                System.out.println("Not enough columns on path file CSV (STOP EDITING PATH FILES)");
            } else if (e instanceof NumberFormatException) {
                System.out.println("Number formatted incorrectly on path file CSV (STOP EDITING PATH FILES)");
            }
            System.out.println(e);
        }

    }
}
