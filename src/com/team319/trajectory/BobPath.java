package com.team319.trajectory;

import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.trajectory.WaypointSequence.Waypoint;

public class BobPath {
	private SrxTranslatorConfig config;
	private WaypointSequence waypointSequence;
	private final double startVelocity;
	private final double endVelocity;

	public BobPath(SrxTranslatorConfig config) {
		this(new SrxTranslatorConfig(config), config.name, 1);
	}

	public BobPath(SrxTranslatorConfig config, String name, int direction) {
		this(config, name, direction, 0, 0);
	}
	
	public BobPath(SrxTranslatorConfig config, String name, int direction, double startVelocity, double endVelocity) {
		this.config.name = name;
		this.config.direction = direction;
		this.startVelocity = startVelocity;
		this.endVelocity = endVelocity;
	}


	public BobPath(BobPath toCopy) {
		config = toCopy.config;
		waypointSequence = toCopy.waypointSequence;
		startVelocity = toCopy.startVelocity;
		endVelocity = toCopy.endVelocity;
	}

	public boolean isExportEnabled() {
		return this.isExportEnabled();
	}

	public void setWaypointSequence(WaypointSequence wps) {
		waypointSequence = wps;
	}

	public WaypointSequence getWaypointSequence() {
		return waypointSequence;
	}

	public void addWaypoint(Waypoint wp) {
		this.waypointSequence.addWaypoint(wp);
	}

	public void addWaypointRadians(double x, double y, double theta_rad) {
		this.waypointSequence.addWaypoint(new Waypoint(x, y, theta_rad));
	}

	public void addWaypoint(double x, double y, double theta_deg) {
		this.waypointSequence.addWaypoint(new Waypoint(x, y, Math.toRadians(theta_deg)));
	}

	public void addWaypointRelative(double x, double y, double theta_deg) {
		Waypoint lastWaypoint = getLastWaypoint();
		Waypoint newWaypoint = new Waypoint(lastWaypoint.x + x, lastWaypoint.y + y,
				lastWaypoint.theta + Math.toRadians(theta_deg));
		this.waypointSequence.addWaypoint(newWaypoint);
	}

	public Waypoint getLastWaypoint() {
		Waypoint lastWaypoint = this.waypointSequence.getWaypoint(this.waypointSequence.getNumWaypoints() - 1);
		return lastWaypoint;
	}

	public void setConfig(SrxTranslatorConfig c) {
		this.config = c;
	}

	public SrxTranslatorConfig getConfig() {
		return this.config;
	}
	
	public double getStartVelocity() {
		return startVelocity;
	}

	public double getEndVelocity() {
		return endVelocity;
	}
}
