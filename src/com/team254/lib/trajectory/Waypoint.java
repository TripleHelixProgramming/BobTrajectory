package com.team254.lib.trajectory;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Waypoint {
	
	private double x;
	private double y;
	private double theta;

	@JsonCreator
	public Waypoint() { }
	
	public Waypoint(double x, double y, double theta) {
		this.x = x;
		this.y = y;
		this.theta = theta;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("(").append(Math.floor(x * 100) / 100).append(", ")
				.append(Math.floor(y * 100) / 100).append(") " )
				.append(Math.floor(Math.toDegrees(theta) * 100) / 100).append("°")
				.toString();
	}
}
