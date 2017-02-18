package com.team319.trajectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.PathGenerator;
import com.team254.lib.trajectory.Trajectory;
import com.team254.lib.trajectory.Trajectory.Pair;
import com.team319.ui.PathViewer;

import com.team254.lib.trajectory.io.IPathSerializer;

public class BobPathGenerator extends PathGenerator {

	private static Path makePath(BobPath bobPath) {
		Path p = PathGenerator.makePath(bobPath.getWaypointSequence(), bobPath.getConfig(), bobPath.getConfig().wheelbase_width_feet,
				bobPath.getConfig().name);

		if (bobPath.getConfig().direction == -1) {
			p = reversePath(p);
		}
		
		return p;
	}

	private static Path reversePath(Path p) {
		Trajectory oldLeft = p.getLeftWheelTrajectory();
		Trajectory oldRight = p.getRightWheelTrajectory();

		oldLeft.scale(-1);
		oldRight.scale(-1);

		return new Path(p.getName(), new Pair(oldRight, oldLeft));
	}
	
	private static Path appendPaths(String pathName, BobPath[] bobPaths) {
		Path tmp = makePath(bobPaths[0]);
		Path appendedPaths = new Path(pathName, tmp.getPair());
		
		for (int i = 1; i < bobPaths.length; i++) {
			tmp = makePath(bobPaths[i]);
			appendedPaths.getLeftWheelTrajectory().append(tmp.getLeftWheelTrajectory());
			appendedPaths.getRightWheelTrajectory().append(tmp.getRightWheelTrajectory());
		}
		return appendedPaths;
	}
	
	
	/**
	 * Appends paths and exports them using the first BobPath's config. Direction for each BobPath is conserved.
	 * @param relativeDirectoryName
	 * @param newPathName the name of the new generated path
	 * @param bobPaths the BobPaths to append and export
	 */
	public static void appendAndExportPaths(String relativeDirectoryName, String newPathName, BobPath...bobPaths){
		SrxTrajectoryExporter exporter = new SrxTrajectoryExporter(relativeDirectoryName);
		
		Path exportPath = appendPaths(newPathName, bobPaths);
		
		SrxTranslator srxt = new SrxTranslator();
		SrxTrajectory combined = srxt.getSrxTrajectoryFromChezyPath(exportPath, bobPaths[0].getConfig());

		if (!exporter.exportSrxTrajectory(combined, newPathName, bobPaths)) {
			System.err.println("A path could not be written!!!!");
			System.exit(1);
		} else {
			/// SrxTrajectory t = importer.importSrxTrajectory(config.name);
			PathViewer.showPath(exportPath);
		}		
		
	}

	public static void exportPath(String relativeDirectoryName, BobPath bobPath) {
		SrxTrajectoryExporter exporter = new SrxTrajectoryExporter(relativeDirectoryName);

		Path chezyPath = makePath(bobPath);

		SrxTranslator srxt = new SrxTranslator();
		SrxTrajectory combined = srxt.getSrxTrajectoryFromChezyPath(chezyPath, bobPath.getConfig());

		if (!exporter.exportSrxTrajectory(combined, bobPath.getConfig(), bobPath.getWaypointSequence())) {
			System.err.println("A path could not be written!!!!");
			System.exit(1);
		} else {
			/// SrxTrajectory t = importer.importSrxTrajectory(config.name);
			PathViewer.showPath(chezyPath);
		}
	}
	
	private static void serializePath(IPathSerializer serializer, String relativeDirectoryName, Path path) {
		String pathName = relativeDirectoryName + "/" + path.getName();
		String data = serializer.serialize(path);
		try {
			Files.write(Paths.get(pathName), data.getBytes(), StandardOpenOption.WRITE, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);
			PathViewer.showPath(path);
		} catch (IOException e) {
			System.err.println("A path could not be written!!!!");
			System.exit(1);
		}
	}

	/**
	 * Export the path to a file using the provided serializer
	 * @param serializer the serializer to format the data
	 * @param relativeDirectoryName the location to save the path files
	 * @param bobPath the path to save
	 */
	public static void exportPathWithSerializer(IPathSerializer serializer, String relativeDirectoryName, BobPath bobPath) {
		Path path = makePath(bobPath);
		serializePath(serializer, relativeDirectoryName, path);
	}
	/**
	 * Append the paths together and export the paths to a file using the provided serializer
	 * @param serializer the serializer to format the data
	 * @param relativeDirectoryName the location to save the path files
	 * @param newPathName the name of the path file
	 * @param bobPaths the array of paths to be appended together
	 */
	public static void appendAndExportPathWithSerializer(IPathSerializer serializer, String relativeDirectoryName, String newPathName, BobPath... bobPaths) {
		Path path = appendPaths(newPathName, bobPaths);
		serializePath(serializer, relativeDirectoryName, path);
	}
}
