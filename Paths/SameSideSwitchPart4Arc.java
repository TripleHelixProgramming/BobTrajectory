package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart4Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (7.00,0.00,0.00)
	// (3.42,-1.33,45.00)
	
    public SameSideSwitchPart4Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitchPart4Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.014,0.276,10.000,0.000},
				{0.069,0.829,10.000,0.000},
				{0.194,1.659,10.000,0.000},
				{0.415,2.765,10.000,0.000},
				{0.760,4.147,10.000,0.000},
				{1.258,5.806,10.000,0.000},
				{1.935,7.741,10.000,0.000},
				{2.820,9.953,10.000,0.000},
				{3.940,12.441,10.000,0.000},
				{5.322,15.206,10.000,0.000},
				{6.995,18.247,10.000,0.001},
				{8.985,21.565,10.000,0.001},
				{11.322,25.159,10.000,0.002},
				{14.031,29.030,10.000,0.003},
				{17.128,32.901,10.000,0.005},
				{20.611,36.771,10.000,0.007},
				{24.482,40.642,10.000,0.009},
				{28.740,44.512,10.000,0.013},
				{33.384,48.383,10.000,0.017},
				{38.416,52.254,10.000,0.023},
				{43.835,56.124,10.000,0.030},
				{49.641,59.995,10.000,0.038},
				{55.834,63.866,10.000,0.049},
				{62.414,67.736,10.000,0.061},
				{69.381,71.607,10.000,0.076},
				{76.736,75.478,10.000,0.093},
				{84.477,79.348,10.000,0.113},
				{92.605,83.219,10.000,0.136},
				{101.121,87.090,10.000,0.163},
				{110.023,90.960,10.000,0.193},
				{119.313,94.831,10.000,0.228},
				{128.989,98.702,10.000,0.267},
				{139.053,102.572,10.000,0.312},
				{149.504,106.443,10.000,0.361},
				{160.342,110.313,10.000,0.417},
				{171.566,114.184,10.000,0.480},
				{183.178,118.055,10.000,0.549},
				{195.177,121.925,10.000,0.625},
				{207.564,125.796,10.000,0.710},
				{220.337,129.667,10.000,0.804},
				{233.497,133.537,10.000,0.906},
				{247.044,137.408,10.000,1.019},
				{260.978,141.279,10.000,1.142},
				{275.300,145.149,10.000,1.277},
				{290.008,149.020,10.000,1.423},
				{305.104,152.891,10.000,1.583},
				{320.586,156.761,10.000,1.756},
				{336.456,160.632,10.000,1.943},
				{352.713,164.503,10.000,2.146},
				{369.357,168.373,10.000,2.365},
				{386.387,172.244,10.000,2.601},
				{403.805,176.114,10.000,2.855},
				{421.610,179.985,10.000,3.128},
				{439.802,183.856,10.000,3.422},
				{458.382,187.726,10.000,3.737},
				{477.348,191.597,10.000,4.074},
				{496.701,195.468,10.000,4.434},
				{516.441,199.338,10.000,4.819},
				{536.569,203.209,10.000,5.230},
				{557.083,207.080,10.000,5.667},
				{577.985,210.950,10.000,6.133},
				{599.273,214.821,10.000,6.628},
				{620.949,218.692,10.000,7.153},
				{642.998,222.286,10.000,7.709},
				{665.392,225.603,10.000,8.297},
				{688.104,228.645,10.000,8.917},
				{711.107,231.409,10.000,9.568},
				{734.373,233.898,10.000,10.250},
				{757.873,236.110,10.000,10.963},
				{781.581,238.045,10.000,11.707},
				{805.468,239.704,10.000,12.479},
				{829.508,241.086,10.000,13.280},
				{853.671,242.192,10.000,14.107},
				{877.932,243.021,10.000,14.959},
				{902.262,243.574,10.000,15.833},
				{926.633,243.851,10.000,16.728},
				{951.018,243.851,10.000,17.640},
				{975.403,243.851,10.000,18.568},
				{999.788,243.851,10.000,19.510},
				{1024.168,243.739,10.000,20.462},
				{1048.522,243.350,10.000,21.424},
				{1072.824,242.685,10.000,22.390},
				{1097.046,241.744,10.000,23.358},
				{1121.159,240.526,10.000,24.324},
				{1145.137,239.031,10.000,25.285},
				{1168.951,237.260,10.000,26.237},
				{1192.575,235.213,10.000,27.177},
				{1215.980,232.889,10.000,28.101},
				{1239.139,230.289,10.000,29.007},
				{1262.024,227.412,10.000,29.893},
				{1284.608,224.259,10.000,30.754},
				{1306.862,220.829,10.000,31.590},
				{1328.760,217.122,10.000,32.398},
				{1350.278,213.252,10.000,33.176},
				{1371.410,209.381,10.000,33.924},
				{1392.155,205.511,10.000,34.642},
				{1412.512,201.640,10.000,35.329},
				{1432.483,197.769,10.000,35.986},
				{1452.066,193.899,10.000,36.613},
				{1471.262,190.028,10.000,37.210},
				{1490.071,186.157,10.000,37.777},
				{1508.494,182.287,10.000,38.315},
				{1526.529,178.416,10.000,38.825},
				{1544.177,174.545,10.000,39.307},
				{1561.438,170.675,10.000,39.762},
				{1578.312,166.804,10.000,40.191},
				{1594.799,162.933,10.000,40.594},
				{1610.899,159.063,10.000,40.973},
				{1626.611,155.192,10.000,41.327},
				{1641.937,151.321,10.000,41.659},
				{1656.876,147.451,10.000,41.969},
				{1671.427,143.580,10.000,42.257},
				{1685.592,139.710,10.000,42.526},
				{1699.369,135.839,10.000,42.774},
				{1712.759,131.968,10.000,43.004},
				{1725.763,128.098,10.000,43.216},
				{1738.379,124.227,10.000,43.412},
				{1750.608,120.356,10.000,43.591},
				{1762.450,116.486,10.000,43.755},
				{1773.905,112.615,10.000,43.905},
				{1784.973,108.744,10.000,44.041},
				{1795.654,104.874,10.000,44.164},
				{1805.948,101.003,10.000,44.275},
				{1815.855,97.132,10.000,44.375},
				{1825.374,93.262,10.000,44.464},
				{1834.507,89.391,10.000,44.544},
				{1843.253,85.520,10.000,44.614},
				{1851.611,81.650,10.000,44.676},
				{1859.583,77.779,10.000,44.730},
				{1867.167,73.909,10.000,44.777},
				{1874.364,70.038,10.000,44.818},
				{1881.175,66.167,10.000,44.853},
				{1887.598,62.297,10.000,44.882},
				{1893.634,58.426,10.000,44.907},
				{1899.283,54.555,10.000,44.928},
				{1904.545,50.685,10.000,44.945},
				{1909.420,46.814,10.000,44.959},
				{1913.908,42.943,10.000,44.969},
				{1918.008,39.073,10.000,44.978},
				{1921.722,35.202,10.000,44.984},
				{1925.049,31.331,10.000,44.989},
				{1927.988,27.461,10.000,44.993},
				{1930.547,23.702,10.000,44.995},
				{1932.743,20.220,10.000,44.997},
				{1934.604,17.014,10.000,44.998},
				{1936.159,14.085,10.000,44.999},
				{1937.435,11.433,10.000,44.999},
				{1938.460,9.056,10.000,45.000},
				{1939.260,6.957,10.000,45.000},
				{1939.865,5.133,10.000,45.000},
				{1940.301,3.587,10.000,45.000},
				{1940.596,2.316,10.000,45.000},
				{1940.778,1.323,10.000,45.000},
				{1940.875,0.605,10.000,45.000},
				{1940.913,0.164,10.000,45.000},
				{1940.921,0.000,10.000,45.000},
				{1940.921,0.000,10.000,45.000}		};

}