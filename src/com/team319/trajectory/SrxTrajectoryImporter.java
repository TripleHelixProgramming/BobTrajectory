package com.team319.trajectory;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SrxTrajectoryImporter {
	
	public static BoTHTrajectory importSrxTrajectory (String fileName){
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(new File("Paths/"  + fileName), BoTHTrajectory.class);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
}
