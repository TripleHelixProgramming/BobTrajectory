package com.team319.trajectory;

import com.fasterxml.jackson.annotation.JsonCreator;

public class SrxTrajectoryPoint {
	
	private double position;
	private double ticksPer100Ms;
	private int dt;
	
	@JsonCreator
	SrxTrajectoryPoint() { }
	
	public SrxTrajectoryPoint(double position, double ticksPer100Ms,  int dt) {
		this.position = position;
		this.ticksPer100Ms = ticksPer100Ms;
		this.dt = dt;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getTicksPer100Ms() {
		return ticksPer100Ms;
	}

	public void setTicksPer100Ms(double ticksPer100Ms) {
		this.ticksPer100Ms = ticksPer100Ms;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}
}
