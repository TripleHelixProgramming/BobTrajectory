package com.team319.trajectory;

import java.io.File;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SrxTrajectoryExporter {
	
	public static boolean exportSrxTrajectory(SrxTrajectory combined, String pathName, BoTHPath...bobPaths){
		BoTHTrajectory trajectory = new BoTHTrajectory();
		trajectory.setPaths(Arrays.asList(bobPaths));
		trajectory.setTrajectory(combined);
		
		String combinedPath = "Paths/" + pathName + "_SrxTrajectory.json";
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(combinedPath), trajectory);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean exportSrxTrajectory(SrxTrajectory combined, BoTHPath path){
		return exportSrxTrajectory(combined, path.getName(), path);
	}
}
