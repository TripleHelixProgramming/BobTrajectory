package com.team319.io;

import java.io.File;
import com.team319.trajectory.RobotConfig;

public class ConfigExporter {
    /**
     * Exports the config to the default path.
     */
    public static void exportConfig() {
        exportConfig(new File(RobotConfig.pathsDirectory, "config"));
    }

    /**
     * Exports the config file to the <code>File</code> specified.
     * 
     * @param file the <code>File</code> where the config file is saved
     */
    public static void exportConfig(File file) {
        if (file == null) {
            exportConfig();
        } else {
            StringBuilder data = new StringBuilder();
            data.append(RobotConfig.length).append("\n");
            data.append(RobotConfig.width).append("\n");
            data.append(RobotConfig.wheelBase).append("\n");
            data.append(RobotConfig.maxVelocity).append("\n");
            data.append(RobotConfig.maxAcceleration).append("\n");
            data.append(RobotConfig.dt);
            FileUtil.write(file, "config.csv", data.toString());
        }
    }
}