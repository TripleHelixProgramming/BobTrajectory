package com.team319.trajectory;

import java.util.List;

public class BoTHTrajectory {
	
	private List<BoTHPath> paths;
	private SrxTrajectory trajectory;
	
	public List<BoTHPath> getPaths() {
		return paths;
	}
	
	public void setPaths(List<BoTHPath> paths) {
		this.paths = paths;
	}
	
	public SrxTrajectory getTrajectory() {
		return trajectory;
	}
	
	public void setTrajectory(SrxTrajectory trajectory) {
		this.trajectory = trajectory;
	}
}
