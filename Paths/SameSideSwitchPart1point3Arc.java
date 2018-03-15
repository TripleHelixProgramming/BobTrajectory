package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart1point3Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	
    public SameSideSwitchPart1point3Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitchPart1point3Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.000,0.000,0.010,-0.000},
				{0.000,0.000,0.010,-0.452},
				{0.000,0.000,0.010,-0.905},
				{0.000,0.000,0.010,-1.357},
				{0.000,0.000,0.010,-1.809},
				{0.000,0.000,0.010,-2.261},
				{0.000,0.000,0.010,-2.714},
				{0.000,0.000,0.010,-3.166},
				{0.000,0.000,0.010,-3.618},
				{0.000,0.000,0.010,-4.070},
				{0.000,0.000,0.010,-4.523},
				{0.000,0.000,0.010,-4.975},
				{0.000,0.000,0.010,-5.427},
				{0.000,0.000,0.010,-5.879},
				{0.000,0.000,0.010,-6.332},
				{0.000,0.000,0.010,-6.784},
				{0.000,0.000,0.010,-7.236},
				{0.000,0.000,0.010,-7.688},
				{0.000,0.000,0.010,-8.141},
				{0.000,0.000,0.010,-8.593},
				{0.000,0.000,0.010,-9.045},
				{0.000,0.000,0.010,-9.497},
				{0.000,0.000,0.010,-9.950},
				{0.000,0.000,0.010,-10.402},
				{0.000,0.000,0.010,-10.854},
				{0.000,0.000,0.010,-11.307},
				{0.000,0.000,0.010,-11.759},
				{0.000,0.000,0.010,-12.211},
				{0.000,0.000,0.010,-12.663},
				{0.000,0.000,0.010,-13.116},
				{0.000,0.000,0.010,-13.568},
				{0.000,0.000,0.010,-14.020},
				{0.000,0.000,0.010,-14.472},
				{0.000,0.000,0.010,-14.925},
				{0.000,0.000,0.010,-15.377},
				{0.000,0.000,0.010,-15.829},
				{0.000,0.000,0.010,-16.281},
				{0.000,0.000,0.010,-16.734},
				{0.000,0.000,0.010,-17.186},
				{0.000,0.000,0.010,-17.638},
				{0.000,0.000,0.010,-18.090},
				{0.000,0.000,0.010,-18.543},
				{0.000,0.000,0.010,-18.995},
				{0.000,0.000,0.010,-19.447},
				{0.000,0.000,0.010,-19.899},
				{0.000,0.000,0.010,-20.352},
				{0.000,0.000,0.010,-20.804},
				{0.000,0.000,0.010,-21.256},
				{0.000,0.000,0.010,-21.709},
				{0.000,0.000,0.010,-22.161},
				{0.000,0.000,0.010,-22.613},
				{0.000,0.000,0.010,-23.065},
				{0.000,0.000,0.010,-23.518},
				{0.000,0.000,0.010,-23.970},
				{0.000,0.000,0.010,-24.422},
				{0.000,0.000,0.010,-24.874},
				{0.000,0.000,0.010,-25.327},
				{0.000,0.000,0.010,-25.779},
				{0.000,0.000,0.010,-26.231},
				{0.000,0.000,0.010,-26.683},
				{0.000,0.000,0.010,-27.136},
				{0.000,0.000,0.010,-27.588},
				{0.000,0.000,0.010,-28.040},
				{0.000,0.000,0.010,-28.492},
				{0.000,0.000,0.010,-28.945},
				{0.000,0.000,0.010,-29.397},
				{0.000,0.000,0.010,-29.849},
				{0.000,0.000,0.010,-30.302},
				{0.000,0.000,0.010,-30.754},
				{0.000,0.000,0.010,-31.206},
				{0.000,0.000,0.010,-31.658},
				{0.000,0.000,0.010,-32.111},
				{0.000,0.000,0.010,-32.563},
				{0.000,0.000,0.010,-33.015},
				{0.000,0.000,0.010,-33.467},
				{0.000,0.000,0.010,-33.920},
				{0.000,0.000,0.010,-34.372},
				{0.000,0.000,0.010,-34.824},
				{0.000,0.000,0.010,-35.276},
				{0.000,0.000,0.010,-35.729},
				{0.000,0.000,0.010,-36.181},
				{0.000,0.000,0.010,-36.633},
				{0.000,0.000,0.010,-37.085},
				{0.000,0.000,0.010,-37.538},
				{0.000,0.000,0.010,-37.990},
				{0.000,0.000,0.010,-38.442},
				{0.000,0.000,0.010,-38.894},
				{0.000,0.000,0.010,-39.347},
				{0.000,0.000,0.010,-39.799},
				{0.000,0.000,0.010,-40.251},
				{0.000,0.000,0.010,-40.704},
				{0.000,0.000,0.010,-41.156},
				{0.000,0.000,0.010,-41.608},
				{0.000,0.000,0.010,-42.060},
				{0.000,0.000,0.010,-42.513},
				{0.000,0.000,0.010,-42.965},
				{0.000,0.000,0.010,-43.417},
				{0.000,0.000,0.010,-43.869},
				{0.000,0.000,0.010,-44.322},
				{0.000,0.000,0.010,-44.774},
				{0.000,0.000,0.010,-45.226},
				{0.000,0.000,0.010,-45.678},
				{0.000,0.000,0.010,-46.131},
				{0.000,0.000,0.010,-46.583},
				{0.000,0.000,0.010,-47.035},
				{0.000,0.000,0.010,-47.487},
				{0.000,0.000,0.010,-47.940},
				{0.000,0.000,0.010,-48.392},
				{0.000,0.000,0.010,-48.844},
				{0.000,0.000,0.010,-49.296},
				{0.000,0.000,0.010,-49.749},
				{0.000,0.000,0.010,-50.201},
				{0.000,0.000,0.010,-50.653},
				{0.000,0.000,0.010,-51.106},
				{0.000,0.000,0.010,-51.558},
				{0.000,0.000,0.010,-52.010},
				{0.000,0.000,0.010,-52.462},
				{0.000,0.000,0.010,-52.915},
				{0.000,0.000,0.010,-53.367},
				{0.000,0.000,0.010,-53.819},
				{0.000,0.000,0.010,-54.271},
				{0.000,0.000,0.010,-54.724},
				{0.000,0.000,0.010,-55.176},
				{0.000,0.000,0.010,-55.628},
				{0.000,0.000,0.010,-56.080},
				{0.000,0.000,0.010,-56.533},
				{0.000,0.000,0.010,-56.985},
				{0.000,0.000,0.010,-57.437},
				{0.000,0.000,0.010,-57.889},
				{0.000,0.000,0.010,-58.342},
				{0.000,0.000,0.010,-58.794},
				{0.000,0.000,0.010,-59.246},
				{0.000,0.000,0.010,-59.698},
				{0.000,0.000,0.010,-60.151},
				{0.000,0.000,0.010,-60.603},
				{0.000,0.000,0.010,-61.055},
				{0.000,0.000,0.010,-61.508},
				{0.000,0.000,0.010,-61.960},
				{0.000,0.000,0.010,-62.412},
				{0.000,0.000,0.010,-62.864},
				{0.000,0.000,0.010,-63.317},
				{0.000,0.000,0.010,-63.769},
				{0.000,0.000,0.010,-64.221},
				{0.000,0.000,0.010,-64.673},
				{0.000,0.000,0.010,-65.126},
				{0.000,0.000,0.010,-65.578},
				{0.000,0.000,0.010,-66.030},
				{0.000,0.000,0.010,-66.482},
				{0.000,0.000,0.010,-66.935},
				{0.000,0.000,0.010,-67.387},
				{0.000,0.000,0.010,-67.839},
				{0.000,0.000,0.010,-68.291},
				{0.000,0.000,0.010,-68.744},
				{0.000,0.000,0.010,-69.196},
				{0.000,0.000,0.010,-69.648},
				{0.000,0.000,0.010,-70.101},
				{0.000,0.000,0.010,-70.553},
				{0.000,0.000,0.010,-71.005},
				{0.000,0.000,0.010,-71.457},
				{0.000,0.000,0.010,-71.910},
				{0.000,0.000,0.010,-72.362},
				{0.000,0.000,0.010,-72.814},
				{0.000,0.000,0.010,-73.266},
				{0.000,0.000,0.010,-73.719},
				{0.000,0.000,0.010,-74.171},
				{0.000,0.000,0.010,-74.623},
				{0.000,0.000,0.010,-75.075},
				{0.000,0.000,0.010,-75.528},
				{0.000,0.000,0.010,-75.980},
				{0.000,0.000,0.010,-76.432},
				{0.000,0.000,0.010,-76.884},
				{0.000,0.000,0.010,-77.337},
				{0.000,0.000,0.010,-77.789},
				{0.000,0.000,0.010,-78.241},
				{0.000,0.000,0.010,-78.693},
				{0.000,0.000,0.010,-79.146},
				{0.000,0.000,0.010,-79.598},
				{0.000,0.000,0.010,-80.050},
				{0.000,0.000,0.010,-80.503},
				{0.000,0.000,0.010,-80.955},
				{0.000,0.000,0.010,-81.407},
				{0.000,0.000,0.010,-81.859},
				{0.000,0.000,0.010,-82.312},
				{0.000,0.000,0.010,-82.764},
				{0.000,0.000,0.010,-83.216},
				{0.000,0.000,0.010,-83.668},
				{0.000,0.000,0.010,-84.121},
				{0.000,0.000,0.010,-84.573},
				{0.000,0.000,0.010,-85.025},
				{0.000,0.000,0.010,-85.477},
				{0.000,0.000,0.010,-85.930},
				{0.000,0.000,0.010,-86.382},
				{0.000,0.000,0.010,-86.834},
				{0.000,0.000,0.010,-87.286},
				{0.000,0.000,0.010,-87.739},
				{0.000,0.000,0.010,-88.191},
				{0.000,0.000,0.010,-88.643},
				{0.000,0.000,0.010,-89.095},
				{0.000,0.000,0.010,-89.548},
				{0.000,0.000,0.010,-90.000}		};

}