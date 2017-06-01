package com.team319.trajectory;

import java.util.ArrayList;
import java.util.List;

import com.team254.lib.trajectory.Waypoint;

public class BoTHPath {
	
	private String name;
	private double targetVelocity = 48;
	private List<Waypoint> waypoints = new ArrayList<>();
	private boolean isReversed;
	
	public void setWaypoints(List<Waypoint> waypoints){
		this.waypoints = waypoints;
	}
	
	public List<Waypoint> getWaypoints(){
		return waypoints;
	}
	
	public void addWaypoint(Waypoint wp){
		this.waypoints.add(wp);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReversed() {
		return isReversed;
	}

	public void setReversed(boolean isReversed) {
		this.isReversed = isReversed;
	}

	public double getTargetVelocity() {
		return targetVelocity;
	}

	public void setTargetVelocity(double targetVelocity) {
		this.targetVelocity = targetVelocity;
	}
}
