package com.team319.io;

import java.io.File;
import java.util.List;

import com.team319.trajectory.RobotConfig;

public class ConfigImporter {
    private static final String defaultPath = "src/main/java/frc/paths/config/";

    /**
     * Imports a config <code>File</code>
     * 
     * @param file - The directory where the config file is found
     */
    public static void importConfig(File file) {
        if (file == null){
            file = new File(defaultPath, "config.csv");
        } else {
            List<List<String>> data = FileUtil.parseCSV(file);
            RobotConfig.length = Double.parseDouble(data.get(0).get(0));
            RobotConfig.width = Double.parseDouble(data.get(1).get(0));
            RobotConfig.wheelBase = Double.parseDouble(data.get(2).get(0));
            RobotConfig.maxVelocity = Double.parseDouble(data.get(3).get(0));
            RobotConfig.maxAcceleration = Double.parseDouble(data.get(4).get(0));
            RobotConfig.dt = Double.parseDouble(data.get(5).get(0));
        }
    }
}
