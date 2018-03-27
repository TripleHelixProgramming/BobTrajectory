package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart1point6Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (14.33,23.00,90.00)
	// (14.33,21.50,90.00)
	
    public SameSideSwitchPart1point6Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitchPart1point6Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.014,0.272,10.000,0.000},
				{0.068,0.817,10.000,270.000},
				{0.191,1.634,10.000,270.000},
				{0.409,2.724,10.000,270.000},
				{0.749,4.086,10.000,270.000},
				{1.239,5.721,10.000,270.000},
				{1.907,7.628,10.000,270.000},
				{2.779,9.807,10.000,270.000},
				{3.882,12.259,10.000,270.000},
				{5.244,14.983,10.000,270.000},
				{6.892,17.979,10.000,270.000},
				{8.853,21.248,10.000,270.000},
				{11.155,24.790,10.000,270.000},
				{13.825,28.604,10.000,270.000},
				{16.876,32.417,10.000,270.000},
				{20.309,36.231,10.000,270.000},
				{24.122,40.045,10.000,270.000},
				{28.318,43.859,10.000,270.000},
				{32.894,47.673,10.000,270.000},
				{37.852,51.486,10.000,270.000},
				{43.191,55.300,10.000,270.000},
				{48.912,59.114,10.000,270.000},
				{55.014,62.928,10.000,270.000},
				{61.498,66.742,10.000,270.000},
				{68.362,70.555,10.000,270.000},
				{75.609,74.369,10.000,270.000},
				{83.236,78.183,10.000,270.000},
				{91.245,81.997,10.000,270.000},
				{99.636,85.811,10.000,270.000},
				{108.407,89.624,10.000,270.000},
				{117.561,93.438,10.000,270.000},
				{127.095,97.252,10.000,270.000},
				{137.011,101.066,10.000,270.000},
				{147.308,104.880,10.000,270.000},
				{157.987,108.693,10.000,270.000},
				{169.047,112.507,10.000,270.000},
				{180.488,116.321,10.000,270.000},
				{192.311,120.135,10.000,270.000},
				{204.502,123.676,10.000,270.000},
				{217.033,126.945,10.000,270.000},
				{229.877,129.942,10.000,270.000},
				{243.008,132.666,10.000,270.000},
				{256.397,135.118,10.000,270.000},
				{270.017,137.297,10.000,270.000},
				{283.843,139.204,10.000,270.000},
				{297.845,140.838,10.000,270.000},
				{311.997,142.200,10.000,270.000},
				{326.271,143.290,10.000,270.000},
				{340.641,144.107,10.000,270.000},
				{355.079,144.652,10.000,270.000},
				{369.551,144.782,10.000,270.000},
				{384.008,144.368,10.000,270.000},
				{398.411,143.681,10.000,270.000},
				{412.731,142.721,10.000,270.000},
				{426.941,141.490,10.000,270.000},
				{441.015,139.985,10.000,270.000},
				{454.925,138.209,10.000,270.000},
				{468.643,136.160,10.000,270.000},
				{482.143,133.838,10.000,270.000},
				{495.397,131.244,10.000,270.000},
				{508.378,128.378,10.000,270.000},
				{521.059,125.239,10.000,270.000},
				{533.413,121.828,10.000,270.000},
				{545.411,118.145,10.000,270.000},
				{557.035,114.331,10.000,270.000},
				{568.277,110.517,10.000,270.000},
				{579.138,106.703,10.000,270.000},
				{589.618,102.889,10.000,270.000},
				{599.716,99.076,10.000,270.000},
				{609.433,95.262,10.000,270.000},
				{618.769,91.448,10.000,270.000},
				{627.723,87.634,10.000,270.000},
				{636.295,83.820,10.000,270.000},
				{644.487,80.007,10.000,270.000},
				{652.297,76.193,10.000,270.000},
				{659.725,72.379,10.000,270.000},
				{666.773,68.565,10.000,270.000},
				{673.438,64.751,10.000,270.000},
				{679.723,60.937,10.000,270.000},
				{685.626,57.124,10.000,270.000},
				{691.148,53.310,10.000,270.000},
				{696.288,49.496,10.000,270.000},
				{701.047,45.682,10.000,270.000},
				{705.424,41.868,10.000,270.000},
				{709.420,38.055,10.000,270.000},
				{713.035,34.241,10.000,270.000},
				{716.269,30.427,10.000,270.000},
				{719.121,26.613,10.000,270.000},
				{721.598,22.942,10.000,270.000},
				{723.723,19.542,10.000,270.000},
				{725.521,16.416,10.000,270.000},
				{727.019,13.561,10.000,270.000},
				{728.246,10.979,10.000,270.000},
				{729.229,8.670,10.000,270.000},
				{729.994,6.632,10.000,270.000},
				{730.569,4.868,10.000,270.000},
				{730.981,3.375,10.000,270.000},
				{731.258,2.155,10.000,270.000},
				{731.426,1.208,10.000,270.000},
				{731.513,0.533,10.000,270.000},
				{731.546,0.130,10.000,270.000},
				{731.553,0.000,10.000,270.000},
				{731.553,0.000,10.000,270.000}		};

}