package com.team319.io;

import java.util.List;
import java.io.File;

import com.team319.trajectory.BobPath;

public class PathExporter {
    private static final String defaultPath = "src/main/java/frc/paths/paths/";
    
    /**
     * Exports a <code>List</code> of type <code>BobPath</code> 
     * to the default directory as CSV.
     * 
     * @param paths <code>List</code> of type <code>BobPath</code> to export
     */
    public static void exportPaths(List<BobPath> paths) {
        File file = new File(defaultPath);
        for (BobPath path : paths) {
            exportPath(path, file);
        }
    }

    /**
     * Exports a <code>BobPath</code> to the <code>File</code> specified as a CSV.
     * 
     * @param path type <code>BobPath</code>
     * @param file directory to save <code>path</code> in
     */
    public static void exportPath(BobPath path, File file) {
        FileUtil.write(file, path.getName() + ".csv", path.toString());
    }
}