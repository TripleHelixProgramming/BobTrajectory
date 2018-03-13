package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class OppositeSideScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.38,23.00,0.00)
	// (13.33,23.00,0.00)
	// (19.58,17.58,-89.99)
	// (19.58,10.08,-89.99)
	// (22.92,5.50,0.00)
	
    public OppositeSideScaleArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public OppositeSideScaleArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.015,0.292,10.000,0.000},
				{0.073,0.876,10.000,0.000},
				{0.204,1.752,10.000,0.000},
				{0.438,2.920,10.000,0.000},
				{0.803,4.381,10.000,0.000},
				{1.314,5.841,10.000,0.000},
				{1.971,7.301,10.000,0.000},
				{2.774,8.761,10.000,0.000},
				{3.723,10.221,10.000,0.000},
				{4.819,11.681,10.000,0.000},
				{6.060,13.142,10.000,0.000},
				{7.447,14.602,10.000,0.000},
				{8.980,16.062,10.000,0.000},
				{10.659,17.522,10.000,0.000},
				{12.485,18.982,10.000,0.000},
				{14.456,20.443,10.000,0.000},
				{16.573,21.903,10.000,0.000},
				{18.836,23.363,10.000,0.000},
				{21.246,24.823,10.000,0.000},
				{23.801,26.283,10.000,0.000},
				{26.502,27.744,10.000,0.000},
				{29.350,29.204,10.000,0.000},
				{32.343,30.664,10.000,0.000},
				{35.482,32.124,10.000,0.000},
				{38.768,33.584,10.000,0.000},
				{42.199,35.044,10.000,0.000},
				{45.777,36.505,10.000,0.000},
				{49.500,37.965,10.000,0.000},
				{53.370,39.425,10.000,0.000},
				{57.385,40.885,10.000,0.000},
				{61.547,42.345,10.000,0.000},
				{65.854,43.806,10.000,0.000},
				{70.308,45.266,10.000,0.000},
				{74.907,46.726,10.000,0.000},
				{79.653,48.186,10.000,0.000},
				{84.545,49.646,10.000,0.000},
				{89.582,51.106,10.000,0.000},
				{94.766,52.567,10.000,0.000},
				{100.096,54.027,10.000,0.000},
				{105.571,55.487,10.000,0.000},
				{111.193,56.947,10.000,0.000},
				{116.961,58.407,10.000,0.000},
				{122.875,59.868,10.000,0.000},
				{128.934,61.328,10.000,0.000},
				{135.140,62.788,10.000,0.000},
				{141.492,64.248,10.000,0.000},
				{147.990,65.708,10.000,0.000},
				{154.634,67.168,10.000,0.000},
				{161.423,68.629,10.000,0.000},
				{168.359,70.089,10.000,0.000},
				{175.441,71.549,10.000,0.000},
				{182.669,73.009,10.000,0.000},
				{190.043,74.469,10.000,0.000},
				{197.563,75.930,10.000,0.000},
				{205.229,77.390,10.000,0.000},
				{213.041,78.850,10.000,0.000},
				{220.999,80.310,10.000,0.000},
				{229.103,81.770,10.000,0.000},
				{237.353,83.231,10.000,0.000},
				{245.749,84.691,10.000,0.000},
				{254.291,86.151,10.000,0.000},
				{262.979,87.611,10.000,0.000},
				{271.813,89.071,10.000,0.000},
				{280.794,90.531,10.000,0.000},
				{289.920,91.992,10.000,0.000},
				{299.192,93.452,10.000,0.000},
				{308.610,94.912,10.000,0.000},
				{318.174,96.372,10.000,0.000},
				{327.884,97.832,10.000,0.000},
				{337.741,99.293,10.000,0.000},
				{347.743,100.753,10.000,0.000},
				{357.891,102.213,10.000,0.000},
				{368.186,103.673,10.000,0.000},
				{378.626,105.133,10.000,0.000},
				{389.212,106.593,10.000,0.000},
				{399.945,108.054,10.000,0.000},
				{410.823,109.514,10.000,0.000},
				{421.847,110.974,10.000,0.000},
				{433.018,112.434,10.000,0.000},
				{444.334,113.894,10.000,0.000},
				{455.797,115.355,10.000,0.000},
				{467.405,116.815,10.000,0.000},
				{479.160,118.275,10.000,0.000},
				{491.060,119.735,10.000,0.000},
				{503.107,121.195,10.000,0.000},
				{515.299,122.656,10.000,0.000},
				{527.638,124.116,10.000,0.000},
				{540.122,125.576,10.000,0.000},
				{552.753,127.036,10.000,0.000},
				{565.530,128.496,10.000,0.000},
				{578.452,129.956,10.000,0.000},
				{591.521,131.417,10.000,0.000},
				{604.735,132.877,10.000,0.000},
				{618.096,134.337,10.000,0.000},
				{631.603,135.797,10.000,0.000},
				{645.256,137.257,10.000,0.000},
				{659.054,138.718,10.000,0.000},
				{672.999,140.178,10.000,0.000},
				{687.090,141.638,10.000,0.000},
				{701.327,143.098,10.000,0.000},
				{715.710,144.558,10.000,0.000},
				{730.238,146.018,10.000,0.000},
				{744.913,147.479,10.000,0.000},
				{759.734,148.939,10.000,0.000},
				{774.701,150.399,10.000,0.000},
				{789.814,151.859,10.000,0.000},
				{805.073,153.319,10.000,0.000},
				{820.478,154.780,10.000,0.000},
				{836.029,156.240,10.000,0.000},
				{851.726,157.700,10.000,0.000},
				{867.569,159.160,10.000,0.000},
				{883.558,160.620,10.000,0.000},
				{899.693,162.080,10.000,0.000},
				{915.974,163.541,10.000,0.000},
				{932.401,165.001,10.000,0.000},
				{948.974,166.461,10.000,0.000},
				{965.693,167.921,10.000,0.000},
				{982.558,169.381,10.000,0.000},
				{999.569,170.842,10.000,0.000},
				{1016.727,172.302,10.000,0.000},
				{1034.030,173.762,10.000,0.000},
				{1051.479,175.222,10.000,0.000},
				{1069.074,176.682,10.000,0.000},
				{1086.815,178.143,10.000,0.000},
				{1104.703,179.603,10.000,0.000},
				{1122.736,181.063,10.000,0.000},
				{1140.915,182.523,10.000,0.000},
				{1159.241,183.983,10.000,0.000},
				{1177.712,185.443,10.000,0.000},
				{1196.329,186.904,10.000,0.000},
				{1215.093,188.364,10.000,0.000},
				{1234.002,189.824,10.000,0.000},
				{1253.057,191.284,10.000,0.000},
				{1272.259,192.744,10.000,0.000},
				{1291.606,194.205,10.000,0.000},
				{1311.100,195.665,10.000,0.000},
				{1330.739,197.125,10.000,0.000},
				{1350.525,198.585,10.000,0.000},
				{1370.456,200.045,10.000,0.000},
				{1390.534,201.505,10.000,0.000},
				{1410.757,202.966,10.000,0.000},
				{1431.127,204.426,10.000,0.000},
				{1451.643,205.886,10.000,0.000},
				{1472.304,207.346,10.000,0.000},
				{1493.112,208.806,10.000,0.000},
				{1514.065,210.267,10.000,0.000},
				{1535.165,211.727,10.000,0.000},
				{1556.411,213.187,10.000,0.000},
				{1577.803,214.647,10.000,0.000},
				{1599.340,216.107,10.000,0.000},
				{1621.024,217.568,10.000,0.000},
				{1642.854,219.028,10.000,0.000},
				{1664.830,220.488,10.000,0.000},
				{1686.951,221.948,10.000,0.000},
				{1709.219,223.408,10.000,0.000},
				{1731.633,224.868,10.000,0.000},
				{1754.193,226.329,10.000,0.000},
				{1776.899,227.789,10.000,0.000},
				{1799.751,229.249,10.000,0.000},
				{1822.749,230.709,10.000,0.000},
				{1845.892,232.169,10.000,0.000},
				{1869.182,233.630,10.000,0.000},
				{1892.618,235.090,10.000,0.000},
				{1916.200,236.550,10.000,0.000},
				{1939.928,238.010,10.000,0.000},
				{1963.802,239.470,10.000,0.000},
				{1987.822,240.930,10.000,0.000},
				{2011.974,242.099,10.000,0.000},
				{2036.228,242.975,10.000,0.000},
				{2060.554,243.559,10.000,0.000},
				{2084.925,243.851,10.000,0.000},
				{2109.310,243.851,10.000,0.000},
				{2133.695,243.851,10.000,0.000},
				{2158.080,243.851,10.000,0.000},
				{2182.465,243.851,10.000,0.000},
				{2206.850,243.851,10.000,0.000},
				{2231.235,243.851,10.000,0.000},
				{2255.620,243.851,10.000,0.000},
				{2280.005,243.851,10.000,0.000},
				{2304.390,243.851,10.000,0.000},
				{2328.775,243.851,10.000,0.000},
				{2353.161,243.851,10.000,0.000},
				{2377.546,243.851,10.000,0.000},
				{2401.931,243.851,10.000,0.000},
				{2426.316,243.851,10.000,0.000},
				{2450.701,243.851,10.000,0.000},
				{2475.086,243.851,10.000,0.000},
				{2499.471,243.851,10.000,0.000},
				{2523.856,243.851,10.000,0.000},
				{2548.241,243.851,10.000,0.000},
				{2572.626,243.851,10.000,0.000},
				{2597.011,243.851,10.000,0.000},
				{2621.397,243.851,10.000,0.000},
				{2645.782,243.851,10.000,0.000},
				{2670.167,243.851,10.000,0.000},
				{2694.552,243.851,10.000,0.000},
				{2718.937,243.851,10.000,0.000},
				{2743.322,243.851,10.000,0.000},
				{2767.707,243.851,10.000,0.000},
				{2792.092,243.851,10.000,0.000},
				{2816.477,243.851,10.000,0.000},
				{2840.862,243.851,10.000,0.000},
				{2865.247,243.851,10.000,0.000},
				{2889.632,243.851,10.000,0.000},
				{2914.018,243.851,10.000,0.000},
				{2938.403,243.851,10.000,0.000},
				{2962.788,243.851,10.000,0.000},
				{2987.173,243.851,10.000,0.000},
				{3011.558,243.851,10.000,0.000},
				{3035.943,243.851,10.000,0.000},
				{3060.328,243.851,10.000,0.000},
				{3084.713,243.851,10.000,0.000},
				{3109.098,243.851,10.000,0.000},
				{3133.483,243.851,10.000,0.000},
				{3157.868,243.851,10.000,0.000},
				{3182.253,243.851,10.000,0.000},
				{3206.639,243.851,10.000,0.000},
				{3231.024,243.851,10.000,0.000},
				{3255.409,243.851,10.000,0.000},
				{3279.794,243.851,10.000,0.000},
				{3304.179,243.851,10.000,0.000},
				{3328.564,243.851,10.000,0.000},
				{3352.949,243.851,10.000,0.000},
				{3377.334,243.851,10.000,0.000},
				{3401.719,243.851,10.000,0.000},
				{3426.104,243.851,10.000,0.000},
				{3450.489,243.851,10.000,0.000},
				{3474.874,243.851,10.000,0.000},
				{3499.260,243.851,10.000,0.000},
				{3523.645,243.851,10.000,0.000},
				{3548.030,243.851,10.000,0.000},
				{3572.415,243.851,10.000,0.000},
				{3596.800,243.851,10.000,0.000},
				{3621.185,243.851,10.000,0.000},
				{3645.570,243.851,10.000,0.000},
				{3669.955,243.851,10.000,0.000},
				{3694.340,243.851,10.000,0.000},
				{3718.725,243.851,10.000,0.000},
				{3743.110,243.851,10.000,0.000},
				{3767.495,243.851,10.000,0.000},
				{3791.881,243.851,10.000,0.000},
				{3816.266,243.851,10.000,0.000},
				{3840.651,243.851,10.000,0.000},
				{3865.036,243.851,10.000,0.000},
				{3889.421,243.851,10.000,0.000},
				{3913.806,243.851,10.000,0.000},
				{3938.191,243.851,10.000,0.000},
				{3962.576,243.851,10.000,0.000},
				{3986.961,243.851,10.000,0.000},
				{4011.346,243.851,10.000,0.000},
				{4035.731,243.851,10.000,0.000},
				{4060.116,243.851,10.000,0.000},
				{4084.502,243.851,10.000,0.000},
				{4108.887,243.851,10.000,0.000},
				{4133.272,243.851,10.000,0.000},
				{4157.657,243.851,10.000,0.000},
				{4182.042,243.851,10.000,0.000},
				{4206.427,243.851,10.000,0.000},
				{4230.812,243.851,10.000,0.000},
				{4255.197,243.851,10.000,0.000},
				{4279.582,243.851,10.000,0.000},
				{4303.967,243.851,10.000,0.000},
				{4328.352,243.851,10.000,0.000},
				{4352.737,243.851,10.000,0.000},
				{4377.123,243.851,10.000,0.000},
				{4401.508,243.851,10.000,0.000},
				{4425.893,243.851,10.000,0.000},
				{4450.278,243.851,10.000,0.000},
				{4474.663,243.851,10.000,0.000},
				{4499.048,243.851,10.000,0.000},
				{4523.433,243.851,10.000,0.000},
				{4547.818,243.851,10.000,0.000},
				{4572.203,243.851,10.000,0.000},
				{4596.588,243.851,10.000,0.000},
				{4620.973,243.851,10.000,0.000},
				{4645.358,243.851,10.000,0.000},
				{4669.744,243.851,10.000,0.000},
				{4694.129,243.851,10.000,0.000},
				{4718.514,243.851,10.000,0.000},
				{4742.899,243.851,10.000,0.000},
				{4767.284,243.851,10.000,0.000},
				{4791.669,243.851,10.000,0.000},
				{4816.054,243.851,10.000,0.000},
				{4840.439,243.851,10.000,0.000},
				{4864.824,243.851,10.000,0.000},
				{4889.209,243.851,10.000,0.000},
				{4913.594,243.851,10.000,0.000},
				{4937.979,243.851,10.000,0.000},
				{4962.365,243.851,10.000,0.000},
				{4986.750,243.851,10.000,0.000},
				{5011.135,243.851,10.000,0.000},
				{5035.520,243.851,10.000,0.000},
				{5059.905,243.851,10.000,0.000},
				{5084.290,243.851,10.000,0.000},
				{5108.675,243.851,10.000,0.000},
				{5133.060,243.851,10.000,0.000},
				{5157.445,243.851,10.000,0.000},
				{5181.830,243.851,10.000,0.000},
				{5206.215,243.851,10.000,0.000},
				{5230.600,243.851,10.000,0.000},
				{5254.986,243.851,10.000,0.000},
				{5279.371,243.851,10.000,0.000},
				{5303.756,243.851,10.000,0.000},
				{5328.141,243.851,10.000,0.000},
				{5352.526,243.851,10.000,0.000},
				{5376.911,243.851,10.000,0.000},
				{5401.296,243.851,10.000,0.000},
				{5425.681,243.851,10.000,0.000},
				{5450.066,243.851,10.000,0.000},
				{5474.451,243.851,10.000,0.000},
				{5498.836,243.851,10.000,0.000},
				{5523.221,243.851,10.000,0.000},
				{5547.607,243.851,10.000,0.000},
				{5571.992,243.851,10.000,0.000},
				{5596.377,243.851,10.000,0.000},
				{5620.762,243.851,10.000,0.000},
				{5645.147,243.851,10.000,0.000},
				{5669.532,243.851,10.000,0.000},
				{5693.917,243.851,10.000,0.000},
				{5718.302,243.851,10.000,0.000},
				{5742.687,243.851,10.000,0.000},
				{5767.072,243.851,10.000,0.000},
				{5791.457,243.851,10.000,0.000},
				{5815.842,243.851,10.000,0.000},
				{5840.228,243.851,10.000,-0.000},
				{5864.613,243.851,10.000,-0.002},
				{5888.998,243.851,10.000,-0.007},
				{5913.383,243.851,10.000,-0.014},
				{5937.768,243.851,10.000,-0.024},
				{5962.153,243.851,10.000,-0.036},
				{5986.538,243.851,10.000,-0.052},
				{6010.923,243.851,10.000,-0.070},
				{6035.308,243.851,10.000,-0.092},
				{6059.693,243.851,10.000,-0.116},
				{6084.078,243.851,10.000,-0.144},
				{6108.463,243.851,10.000,-0.175},
				{6132.849,243.851,10.000,-0.209},
				{6157.234,243.851,10.000,-0.247},
				{6181.619,243.851,10.000,-0.288},
				{6206.004,243.851,10.000,-0.333},
				{6230.389,243.851,10.000,-0.382},
				{6254.774,243.851,10.000,-0.434},
				{6279.159,243.851,10.000,-0.491},
				{6303.544,243.851,10.000,-0.551},
				{6327.929,243.851,10.000,-0.615},
				{6352.314,243.851,10.000,-0.684},
				{6376.699,243.851,10.000,-0.757},
				{6401.084,243.851,10.000,-0.834},
				{6425.470,243.851,10.000,-0.916},
				{6449.855,243.851,10.000,-1.002},
				{6474.240,243.851,10.000,-1.093},
				{6498.625,243.851,10.000,-1.189},
				{6523.010,243.851,10.000,-1.290},
				{6547.395,243.851,10.000,-1.395},
				{6571.780,243.851,10.000,-1.506},
				{6596.165,243.851,10.000,-1.622},
				{6620.550,243.851,10.000,-1.744},
				{6644.935,243.851,10.000,-1.871},
				{6669.320,243.851,10.000,-2.004},
				{6693.705,243.851,10.000,-2.143},
				{6718.091,243.851,10.000,-2.287},
				{6742.476,243.851,10.000,-2.438},
				{6766.861,243.851,10.000,-2.595},
				{6791.246,243.851,10.000,-2.758},
				{6815.631,243.851,10.000,-2.928},
				{6840.016,243.851,10.000,-3.105},
				{6864.401,243.851,10.000,-3.289},
				{6888.786,243.851,10.000,-3.479},
				{6913.171,243.851,10.000,-3.677},
				{6937.556,243.851,10.000,-3.883},
				{6961.941,243.851,10.000,-4.096},
				{6986.326,243.851,10.000,-4.317},
				{7010.712,243.851,10.000,-4.546},
				{7035.097,243.851,10.000,-4.784},
				{7059.482,243.851,10.000,-5.030},
				{7083.867,243.851,10.000,-5.285},
				{7108.252,243.851,10.000,-5.548},
				{7132.637,243.851,10.000,-5.821},
				{7157.022,243.851,10.000,-6.104},
				{7181.407,243.851,10.000,-6.397},
				{7205.792,243.851,10.000,-6.699},
				{7230.177,243.851,10.000,-7.012},
				{7254.562,243.851,10.000,-7.336},
				{7278.948,243.851,10.000,-7.670},
				{7303.333,243.851,10.000,-8.016},
				{7327.718,243.851,10.000,-8.373},
				{7352.103,243.851,10.000,-8.743},
				{7376.488,243.851,10.000,-9.124},
				{7400.873,243.851,10.000,-9.519},
				{7425.258,243.851,10.000,-9.926},
				{7449.643,243.851,10.000,-10.346},
				{7474.028,243.851,10.000,-10.781},
				{7498.413,243.851,10.000,-11.229},
				{7522.798,243.851,10.000,-11.692},
				{7547.183,243.851,10.000,-12.170},
				{7571.569,243.851,10.000,-12.663},
				{7595.954,243.851,10.000,-13.172},
				{7620.339,243.851,10.000,-13.697},
				{7644.724,243.851,10.000,-14.238},
				{7669.109,243.851,10.000,-14.796},
				{7693.494,243.851,10.000,-15.372},
				{7717.879,243.851,10.000,-15.965},
				{7742.264,243.851,10.000,-16.577},
				{7766.649,243.851,10.000,-17.206},
				{7791.034,243.851,10.000,-17.855},
				{7815.419,243.851,10.000,-18.523},
				{7839.804,243.851,10.000,-19.210},
				{7864.190,243.851,10.000,-19.917},
				{7888.575,243.851,10.000,-20.644},
				{7912.960,243.851,10.000,-21.391},
				{7937.345,243.851,10.000,-22.159},
				{7961.730,243.851,10.000,-22.947},
				{7986.115,243.851,10.000,-23.756},
				{8010.500,243.851,10.000,-24.586},
				{8034.885,243.851,10.000,-25.436},
				{8059.270,243.851,10.000,-26.307},
				{8083.655,243.851,10.000,-27.198},
				{8108.040,243.851,10.000,-28.109},
				{8132.425,243.851,10.000,-29.040},
				{8156.811,243.851,10.000,-29.991},
				{8181.196,243.851,10.000,-30.959},
				{8205.581,243.851,10.000,-31.946},
				{8229.966,243.851,10.000,-32.950},
				{8254.351,243.851,10.000,-33.971},
				{8278.736,243.851,10.000,-35.007},
				{8303.121,243.851,10.000,-36.057},
				{8327.506,243.851,10.000,-37.121},
				{8351.891,243.851,10.000,-38.196},
				{8376.276,243.851,10.000,-39.282},
				{8400.661,243.851,10.000,-40.377},
				{8425.046,243.851,10.000,-41.479},
				{8449.432,243.851,10.000,-42.588},
				{8473.817,243.851,10.000,-43.701},
				{8498.202,243.851,10.000,-44.816},
				{8522.587,243.851,10.000,-45.933},
				{8546.972,243.851,10.000,-47.048},
				{8571.357,243.851,10.000,-48.162},
				{8595.742,243.851,10.000,-49.271},
				{8620.127,243.851,10.000,-50.374},
				{8644.512,243.851,10.000,-51.470},
				{8668.897,243.851,10.000,-52.558},
				{8693.282,243.851,10.000,-53.635},
				{8717.667,243.851,10.000,-54.701},
				{8742.053,243.851,10.000,-55.753},
				{8766.438,243.851,10.000,-56.792},
				{8790.823,243.851,10.000,-57.815},
				{8815.208,243.851,10.000,-58.823},
				{8839.593,243.851,10.000,-59.813},
				{8863.978,243.851,10.000,-60.786},
				{8888.363,243.851,10.000,-61.740},
				{8912.748,243.851,10.000,-62.676},
				{8937.133,243.851,10.000,-63.592},
				{8961.518,243.851,10.000,-64.488},
				{8985.903,243.851,10.000,-65.365},
				{9010.288,243.851,10.000,-66.221},
				{9034.674,243.851,10.000,-67.056},
				{9059.059,243.851,10.000,-67.872},
				{9083.444,243.851,10.000,-68.667},
				{9107.829,243.851,10.000,-69.441},
				{9132.214,243.851,10.000,-70.196},
				{9156.599,243.851,10.000,-70.930},
				{9180.984,243.851,10.000,-71.645},
				{9205.369,243.851,10.000,-72.340},
				{9229.754,243.851,10.000,-73.016},
				{9254.139,243.851,10.000,-73.673},
				{9278.524,243.851,10.000,-74.311},
				{9302.909,243.851,10.000,-74.931},
				{9327.295,243.851,10.000,-75.533},
				{9351.680,243.851,10.000,-76.118},
				{9376.065,243.851,10.000,-76.685},
				{9400.450,243.851,10.000,-77.236},
				{9424.835,243.851,10.000,-77.770},
				{9449.220,243.851,10.000,-78.288},
				{9473.605,243.851,10.000,-78.790},
				{9497.990,243.851,10.000,-79.277},
				{9522.375,243.851,10.000,-79.749},
				{9546.760,243.851,10.000,-80.207},
				{9571.145,243.851,10.000,-80.650},
				{9595.530,243.851,10.000,-81.080},
				{9619.916,243.851,10.000,-81.496},
				{9644.301,243.851,10.000,-81.899},
				{9668.686,243.851,10.000,-82.289},
				{9693.071,243.851,10.000,-82.667},
				{9717.456,243.851,10.000,-83.032},
				{9741.841,243.851,10.000,-83.385},
				{9766.226,243.851,10.000,-83.727},
				{9790.611,243.851,10.000,-84.058},
				{9814.996,243.851,10.000,-84.377},
				{9839.381,243.851,10.000,-84.686},
				{9863.766,243.851,10.000,-84.984},
				{9888.151,243.851,10.000,-85.272},
				{9912.537,243.851,10.000,-85.549},
				{9936.922,243.851,10.000,-85.817},
				{9961.307,243.851,10.000,-86.075},
				{9985.692,243.851,10.000,-86.324},
				{10010.077,243.851,10.000,-86.563},
				{10034.462,243.851,10.000,-86.794},
				{10058.847,243.851,10.000,-87.015},
				{10083.232,243.851,10.000,-87.228},
				{10107.617,243.851,10.000,-87.432},
				{10132.002,243.851,10.000,-87.627},
				{10156.387,243.851,10.000,-87.814},
				{10180.772,243.851,10.000,-87.993},
				{10205.158,243.851,10.000,-88.164},
				{10229.543,243.851,10.000,-88.327},
				{10253.928,243.851,10.000,-88.482},
				{10278.313,243.851,10.000,-88.629},
				{10302.698,243.851,10.000,-88.768},
				{10327.083,243.851,10.000,-88.900},
				{10351.468,243.851,10.000,-89.024},
				{10375.853,243.851,10.000,-89.140},
				{10400.238,243.851,10.000,-89.249},
				{10424.623,243.851,10.000,-89.351},
				{10449.008,243.851,10.000,-89.445},
				{10473.393,243.851,10.000,-89.532},
				{10497.779,243.851,10.000,-89.611},
				{10522.164,243.851,10.000,-89.683},
				{10546.549,243.851,10.000,-89.747},
				{10570.934,243.851,10.000,-89.804},
				{10595.319,243.851,10.000,-89.853},
				{10619.704,243.851,10.000,-89.895},
				{10644.089,243.851,10.000,-89.930},
				{10668.474,243.851,10.000,-89.956},
				{10692.859,243.851,10.000,-89.975},
				{10717.244,243.851,10.000,-89.987},
				{10741.629,243.851,10.000,-89.990},
				{10766.014,243.851,10.000,-89.990},
				{10790.400,243.851,10.000,-89.990},
				{10814.785,243.851,10.000,-89.990},
				{10839.170,243.851,10.000,-89.990},
				{10863.555,243.851,10.000,-89.990},
				{10887.940,243.851,10.000,-89.990},
				{10912.325,243.851,10.000,-89.991},
				{10936.710,243.851,10.000,-89.991},
				{10961.095,243.851,10.000,-89.991},
				{10985.480,243.851,10.000,-89.991},
				{11009.865,243.851,10.000,-89.991},
				{11034.250,243.851,10.000,-89.992},
				{11058.635,243.851,10.000,-89.992},
				{11083.021,243.851,10.000,-89.992},
				{11107.406,243.851,10.000,-89.992},
				{11131.791,243.851,10.000,-89.993},
				{11156.176,243.851,10.000,-89.993},
				{11180.561,243.851,10.000,-89.993},
				{11204.946,243.851,10.000,-89.994},
				{11229.331,243.851,10.000,-89.994},
				{11253.716,243.851,10.000,-89.994},
				{11278.101,243.851,10.000,-89.995},
				{11302.486,243.851,10.000,-89.995},
				{11326.871,243.851,10.000,-89.995},
				{11351.256,243.851,10.000,-89.996},
				{11375.642,243.851,10.000,-89.996},
				{11400.027,243.851,10.000,-89.997},
				{11424.412,243.851,10.000,-89.997},
				{11448.797,243.851,10.000,-89.997},
				{11473.182,243.851,10.000,-89.998},
				{11497.567,243.851,10.000,-89.998},
				{11521.952,243.851,10.000,-89.998},
				{11546.337,243.851,10.000,-89.999},
				{11570.722,243.851,10.000,-89.999},
				{11595.107,243.851,10.000,-90.000},
				{11619.492,243.851,10.000,-90.000},
				{11643.877,243.851,10.000,-90.000},
				{11668.263,243.851,10.000,-90.001},
				{11692.648,243.851,10.000,-90.001},
				{11717.033,243.851,10.000,-90.002},
				{11741.418,243.851,10.000,-90.002},
				{11765.803,243.851,10.000,-90.002},
				{11790.188,243.851,10.000,-90.003},
				{11814.573,243.851,10.000,-90.003},
				{11838.958,243.851,10.000,-90.003},
				{11863.343,243.851,10.000,-90.004},
				{11887.728,243.851,10.000,-90.004},
				{11912.113,243.851,10.000,-90.004},
				{11936.499,243.851,10.000,-90.005},
				{11960.884,243.851,10.000,-90.005},
				{11985.269,243.851,10.000,-90.005},
				{12009.654,243.851,10.000,-90.005},
				{12034.039,243.851,10.000,-90.006},
				{12058.424,243.851,10.000,-90.006},
				{12082.809,243.851,10.000,-90.006},
				{12107.194,243.851,10.000,-90.006},
				{12131.579,243.851,10.000,-90.007},
				{12155.964,243.851,10.000,-90.007},
				{12180.349,243.851,10.000,-90.007},
				{12204.734,243.851,10.000,-90.007},
				{12229.120,243.851,10.000,-90.007},
				{12253.505,243.851,10.000,-90.008},
				{12277.890,243.851,10.000,-90.008},
				{12302.275,243.851,10.000,-90.008},
				{12326.660,243.851,10.000,-90.008},
				{12351.045,243.851,10.000,-90.008},
				{12375.430,243.851,10.000,-90.008},
				{12399.815,243.851,10.000,-90.008},
				{12424.200,243.851,10.000,-90.009},
				{12448.585,243.851,10.000,-90.009},
				{12472.970,243.851,10.000,-90.009},
				{12497.355,243.851,10.000,-90.009},
				{12521.741,243.851,10.000,-90.009},
				{12546.126,243.851,10.000,-90.009},
				{12570.511,243.851,10.000,-90.009},
				{12594.896,243.851,10.000,-90.009},
				{12619.281,243.851,10.000,-90.009},
				{12643.666,243.851,10.000,-90.009},
				{12668.051,243.851,10.000,-90.009},
				{12692.436,243.851,10.000,-90.009},
				{12716.821,243.851,10.000,-90.009},
				{12741.206,243.851,10.000,-90.008},
				{12765.591,243.851,10.000,-90.008},
				{12789.976,243.851,10.000,-90.008},
				{12814.362,243.851,10.000,-90.008},
				{12838.747,243.851,10.000,-90.008},
				{12863.132,243.851,10.000,-90.008},
				{12887.517,243.851,10.000,-90.008},
				{12911.902,243.851,10.000,-90.007},
				{12936.287,243.851,10.000,-90.007},
				{12960.672,243.851,10.000,-90.007},
				{12985.057,243.851,10.000,-90.007},
				{13009.442,243.851,10.000,-90.007},
				{13033.827,243.851,10.000,-90.006},
				{13058.212,243.851,10.000,-90.006},
				{13082.597,243.851,10.000,-90.006},
				{13106.983,243.851,10.000,-90.006},
				{13131.368,243.851,10.000,-90.005},
				{13155.753,243.851,10.000,-90.005},
				{13180.138,243.851,10.000,-90.005},
				{13204.523,243.851,10.000,-90.004},
				{13228.908,243.851,10.000,-90.004},
				{13253.293,243.851,10.000,-90.004},
				{13277.678,243.851,10.000,-90.004},
				{13302.063,243.851,10.000,-90.003},
				{13326.448,243.851,10.000,-90.003},
				{13350.833,243.851,10.000,-90.003},
				{13375.218,243.851,10.000,-90.002},
				{13399.604,243.851,10.000,-90.002},
				{13423.989,243.851,10.000,-90.001},
				{13448.374,243.851,10.000,-90.001},
				{13472.759,243.851,10.000,-90.001},
				{13497.144,243.851,10.000,-90.000},
				{13521.529,243.851,10.000,-90.000},
				{13545.914,243.851,10.000,-90.000},
				{13570.299,243.851,10.000,-89.999},
				{13594.684,243.851,10.000,-89.999},
				{13619.069,243.851,10.000,-89.998},
				{13643.454,243.851,10.000,-89.998},
				{13667.839,243.851,10.000,-89.998},
				{13692.225,243.851,10.000,-89.997},
				{13716.610,243.851,10.000,-89.997},
				{13740.995,243.851,10.000,-89.997},
				{13765.380,243.851,10.000,-89.996},
				{13789.765,243.851,10.000,-89.996},
				{13814.150,243.851,10.000,-89.995},
				{13838.535,243.851,10.000,-89.995},
				{13862.920,243.851,10.000,-89.995},
				{13887.305,243.851,10.000,-89.994},
				{13911.690,243.851,10.000,-89.994},
				{13936.075,243.851,10.000,-89.994},
				{13960.460,243.851,10.000,-89.993},
				{13984.846,243.851,10.000,-89.993},
				{14009.231,243.851,10.000,-89.993},
				{14033.616,243.851,10.000,-89.992},
				{14058.001,243.851,10.000,-89.992},
				{14082.386,243.851,10.000,-89.992},
				{14106.771,243.851,10.000,-89.992},
				{14131.156,243.851,10.000,-89.991},
				{14155.541,243.851,10.000,-89.991},
				{14179.926,243.851,10.000,-89.991},
				{14204.311,243.851,10.000,-89.991},
				{14228.696,243.851,10.000,-89.991},
				{14253.081,243.851,10.000,-89.990},
				{14277.467,243.851,10.000,-89.990},
				{14301.852,243.851,10.000,-89.990},
				{14326.237,243.851,10.000,-89.990},
				{14350.622,243.851,10.000,-89.990},
				{14375.007,243.851,10.000,-89.990},
				{14399.392,243.851,10.000,-89.990},
				{14423.777,243.851,10.000,-89.997},
				{14448.162,243.851,10.000,-90.016},
				{14472.547,243.851,10.000,-90.046},
				{14496.932,243.851,10.000,-90.085},
				{14521.317,243.851,10.000,-90.131},
				{14545.702,243.851,10.000,-90.185},
				{14570.088,243.851,10.000,-90.244},
				{14594.473,243.851,10.000,-90.308},
				{14618.858,243.851,10.000,-90.376},
				{14643.243,243.851,10.000,-90.445},
				{14667.628,243.851,10.000,-90.517},
				{14692.013,243.851,10.000,-90.588},
				{14716.398,243.851,10.000,-90.659},
				{14740.783,243.851,10.000,-90.729},
				{14765.168,243.851,10.000,-90.797},
				{14789.553,243.851,10.000,-90.861},
				{14813.938,243.851,10.000,-90.921},
				{14838.323,243.851,10.000,-90.977},
				{14862.709,243.851,10.000,-91.027},
				{14887.094,243.851,10.000,-91.071},
				{14911.479,243.851,10.000,-91.107},
				{14935.864,243.851,10.000,-91.137},
				{14960.249,243.851,10.000,-91.157},
				{14984.634,243.851,10.000,-91.169},
				{15009.019,243.851,10.000,-91.171},
				{15033.404,243.851,10.000,-91.163},
				{15057.789,243.851,10.000,-91.144},
				{15082.174,243.851,10.000,-91.114},
				{15106.559,243.851,10.000,-91.071},
				{15130.944,243.851,10.000,-91.015},
				{15155.330,243.851,10.000,-90.946},
				{15179.715,243.851,10.000,-90.863},
				{15204.100,243.851,10.000,-90.765},
				{15228.485,243.851,10.000,-90.652},
				{15252.870,243.851,10.000,-90.523},
				{15277.255,243.851,10.000,-90.377},
				{15301.640,243.851,10.000,-90.213},
				{15326.025,243.851,10.000,-90.031},
				{15350.410,243.851,10.000,-89.829},
				{15374.795,243.851,10.000,-89.608},
				{15399.180,243.851,10.000,-89.365},
				{15423.565,243.851,10.000,-89.101},
				{15447.951,243.851,10.000,-88.814},
				{15472.336,243.851,10.000,-88.503},
				{15496.721,243.851,10.000,-88.167},
				{15521.106,243.851,10.000,-87.805},
				{15545.491,243.851,10.000,-87.415},
				{15569.876,243.851,10.000,-86.997},
				{15594.261,243.851,10.000,-86.548},
				{15618.646,243.851,10.000,-86.067},
				{15643.031,243.851,10.000,-85.554},
				{15667.416,243.851,10.000,-85.005},
				{15691.801,243.851,10.000,-84.420},
				{15716.186,243.851,10.000,-83.797},
				{15740.572,243.851,10.000,-83.133},
				{15764.947,243.649,10.000,-82.426},
				{15789.287,243.155,10.000,-81.677},
				{15813.563,242.369,10.000,-80.883},
				{15837.746,241.291,10.000,-80.043},
				{15861.806,239.921,10.000,-79.158},
				{15885.725,238.460,10.000,-78.227},
				{15909.499,237.000,10.000,-77.248},
				{15933.126,235.540,10.000,-76.220},
				{15956.607,234.080,10.000,-75.143},
				{15979.941,232.620,10.000,-74.016},
				{16003.130,231.159,10.000,-72.838},
				{16026.173,229.699,10.000,-71.609},
				{16049.070,228.239,10.000,-70.330},
				{16071.821,226.779,10.000,-69.000},
				{16094.426,225.319,10.000,-67.621},
				{16116.885,223.858,10.000,-66.194},
				{16139.198,222.398,10.000,-64.721},
				{16161.365,220.938,10.000,-63.206},
				{16183.385,219.478,10.000,-61.650},
				{16205.260,218.018,10.000,-60.058},
				{16226.989,216.558,10.000,-58.435},
				{16248.572,215.097,10.000,-56.784},
				{16270.008,213.637,10.000,-55.112},
				{16291.299,212.177,10.000,-53.424},
				{16312.444,210.717,10.000,-51.726},
				{16333.442,209.257,10.000,-50.024},
				{16354.295,207.796,10.000,-48.325},
				{16375.002,206.336,10.000,-46.634},
				{16395.562,204.876,10.000,-44.958},
				{16415.977,203.416,10.000,-43.302},
				{16436.246,201.956,10.000,-41.671},
				{16456.368,200.496,10.000,-40.070},
				{16476.345,199.035,10.000,-38.503},
				{16496.175,197.575,10.000,-36.973},
				{16515.860,196.115,10.000,-35.484},
				{16535.398,194.655,10.000,-34.037},
				{16554.791,193.195,10.000,-32.635},
				{16574.037,191.734,10.000,-31.279},
				{16593.138,190.274,10.000,-29.970},
				{16612.092,188.814,10.000,-28.707},
				{16630.900,187.354,10.000,-27.491},
				{16649.563,185.894,10.000,-26.322},
				{16668.079,184.434,10.000,-25.199},
				{16686.449,182.973,10.000,-24.120},
				{16704.674,181.513,10.000,-23.086},
				{16722.752,180.053,10.000,-22.094},
				{16740.684,178.593,10.000,-21.144},
				{16758.471,177.133,10.000,-20.234},
				{16776.111,175.672,10.000,-19.362},
				{16793.605,174.212,10.000,-18.528},
				{16810.953,172.752,10.000,-17.729},
				{16828.156,171.292,10.000,-16.964},
				{16845.212,169.832,10.000,-16.233},
				{16862.122,168.371,10.000,-15.532},
				{16878.886,166.911,10.000,-14.862},
				{16895.504,165.451,10.000,-14.221},
				{16911.976,163.991,10.000,-13.607},
				{16928.302,162.531,10.000,-13.019},
				{16944.482,161.071,10.000,-12.456},
				{16960.516,159.610,10.000,-11.916},
				{16976.404,158.150,10.000,-11.400},
				{16992.146,156.690,10.000,-10.905},
				{17007.742,155.230,10.000,-10.431},
				{17023.192,153.770,10.000,-9.977},
				{17038.496,152.309,10.000,-9.542},
				{17053.654,150.849,10.000,-9.125},
				{17068.666,149.389,10.000,-8.725},
				{17083.532,147.929,10.000,-8.341},
				{17098.252,146.469,10.000,-7.973},
				{17112.826,145.009,10.000,-7.620},
				{17127.254,143.548,10.000,-7.282},
				{17141.536,142.088,10.000,-6.957},
				{17155.671,140.628,10.000,-6.646},
				{17169.661,139.168,10.000,-6.347},
				{17183.505,137.708,10.000,-6.060},
				{17197.203,136.247,10.000,-5.785},
				{17210.754,134.787,10.000,-5.520},
				{17224.160,133.327,10.000,-5.267},
				{17237.420,131.867,10.000,-5.023},
				{17250.533,130.407,10.000,-4.790},
				{17263.501,128.946,10.000,-4.566},
				{17276.323,127.486,10.000,-4.351},
				{17288.998,126.026,10.000,-4.144},
				{17301.528,124.566,10.000,-3.946},
				{17313.912,123.106,10.000,-3.756},
				{17326.149,121.646,10.000,-3.574},
				{17338.241,120.185,10.000,-3.399},
				{17350.186,118.725,10.000,-3.231},
				{17361.986,117.265,10.000,-3.070},
				{17373.639,115.805,10.000,-2.916},
				{17385.147,114.345,10.000,-2.768},
				{17396.508,112.884,10.000,-2.626},
				{17407.724,111.424,10.000,-2.490},
				{17418.793,109.964,10.000,-2.360},
				{17429.716,108.504,10.000,-2.235},
				{17440.494,107.044,10.000,-2.116},
				{17451.125,105.584,10.000,-2.001},
				{17461.611,104.123,10.000,-1.892},
				{17471.950,102.663,10.000,-1.787},
				{17482.143,101.203,10.000,-1.687},
				{17492.190,99.743,10.000,-1.592},
				{17502.092,98.283,10.000,-1.500},
				{17511.847,96.822,10.000,-1.413},
				{17521.456,95.362,10.000,-1.330},
				{17530.919,93.902,10.000,-1.251},
				{17540.237,92.442,10.000,-1.175},
				{17549.408,90.982,10.000,-1.103},
				{17558.433,89.522,10.000,-1.034},
				{17567.312,88.061,10.000,-0.969},
				{17576.045,86.601,10.000,-0.906},
				{17584.632,85.141,10.000,-0.847},
				{17593.073,83.681,10.000,-0.791},
				{17601.368,82.221,10.000,-0.738},
				{17609.518,80.760,10.000,-0.687},
				{17617.521,79.300,10.000,-0.640},
				{17625.378,77.840,10.000,-0.594},
				{17633.089,76.380,10.000,-0.551},
				{17640.654,74.920,10.000,-0.511},
				{17648.073,73.459,10.000,-0.473},
				{17655.345,71.999,10.000,-0.437},
				{17662.472,70.539,10.000,-0.403},
				{17669.453,69.079,10.000,-0.371},
				{17676.288,67.619,10.000,-0.341},
				{17682.977,66.159,10.000,-0.313},
				{17689.520,64.698,10.000,-0.286},
				{17695.917,63.238,10.000,-0.262},
				{17702.168,61.778,10.000,-0.239},
				{17708.272,60.318,10.000,-0.217},
				{17714.231,58.858,10.000,-0.197},
				{17720.044,57.397,10.000,-0.178},
				{17725.711,55.937,10.000,-0.161},
				{17731.231,54.477,10.000,-0.145},
				{17736.606,53.017,10.000,-0.130},
				{17741.835,51.557,10.000,-0.117},
				{17746.917,50.097,10.000,-0.104},
				{17751.854,48.636,10.000,-0.093},
				{17756.645,47.176,10.000,-0.082},
				{17761.289,45.716,10.000,-0.073},
				{17765.788,44.256,10.000,-0.064},
				{17770.140,42.796,10.000,-0.056},
				{17774.347,41.335,10.000,-0.049},
				{17778.407,39.875,10.000,-0.042},
				{17782.322,38.415,10.000,-0.036},
				{17786.090,36.955,10.000,-0.031},
				{17789.713,35.495,10.000,-0.027},
				{17793.189,34.034,10.000,-0.023},
				{17796.520,32.574,10.000,-0.019},
				{17799.704,31.114,10.000,-0.016},
				{17802.743,29.654,10.000,-0.013},
				{17805.635,28.194,10.000,-0.011},
				{17808.381,26.734,10.000,-0.009},
				{17810.982,25.273,10.000,-0.007},
				{17813.436,23.813,10.000,-0.005},
				{17815.744,22.353,10.000,-0.004},
				{17817.907,20.893,10.000,-0.003},
				{17819.923,19.433,10.000,-0.002},
				{17821.793,17.972,10.000,-0.002},
				{17823.517,16.512,10.000,-0.001},
				{17825.096,15.052,10.000,-0.001},
				{17826.528,13.592,10.000,-0.001},
				{17827.814,12.132,10.000,-0.000},
				{17828.954,10.672,10.000,-0.000},
				{17829.948,9.211,10.000,-0.000},
				{17830.796,7.751,10.000,-0.000},
				{17831.499,6.291,10.000,-0.000},
				{17832.055,4.831,10.000,-0.000},
				{17832.465,3.371,10.000,-0.000},
				{17832.739,2.112,10.000,-0.000},
				{17832.902,1.146,10.000,-0.000},
				{17832.983,0.472,10.000,-0.000},
				{17833.011,0.090,10.000,-0.000},
				{17833.015,0.000,10.000,0.000},
				{17833.015,0.000,10.000,0.000}		};

}