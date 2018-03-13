package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitch extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.38,23.00,0.00)
	// (12.08,23.83,0.00)
	// (15.42,21.17,-89.00)
	
    public SameSideSwitch() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitch(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.049,0.975,10.000,0.000},
				{0.195,1.951,10.000,0.000},
				{0.439,2.926,10.000,0.000},
				{0.780,3.902,10.000,0.000},
				{1.219,4.877,10.000,0.000},
				{1.756,5.852,10.000,0.000},
				{2.390,6.828,10.000,0.000},
				{3.121,7.803,10.000,0.000},
				{3.950,8.779,10.000,0.000},
				{4.877,9.754,10.000,0.000},
				{5.901,10.729,10.000,0.000},
				{7.023,11.705,10.000,0.000},
				{8.242,12.680,10.000,0.000},
				{9.559,13.656,10.000,0.000},
				{10.973,14.631,10.000,0.001},
				{12.485,15.606,10.000,0.001},
				{14.095,16.582,10.000,0.001},
				{15.802,17.557,10.000,0.001},
				{17.606,18.533,10.000,0.001},
				{19.508,19.508,10.000,0.002},
				{21.508,20.483,10.000,0.002},
				{23.605,21.459,10.000,0.003},
				{25.799,22.434,10.000,0.003},
				{28.092,23.410,10.000,0.004},
				{30.481,24.385,10.000,0.004},
				{32.969,25.360,10.000,0.005},
				{35.553,26.336,10.000,0.006},
				{38.236,27.311,10.000,0.007},
				{41.016,28.287,10.000,0.008},
				{43.893,29.262,10.000,0.009},
				{46.868,30.238,10.000,0.010},
				{49.941,31.213,10.000,0.012},
				{53.111,32.188,10.000,0.013},
				{56.378,33.164,10.000,0.015},
				{59.743,34.139,10.000,0.017},
				{63.206,35.115,10.000,0.019},
				{66.766,36.090,10.000,0.021},
				{70.424,37.065,10.000,0.023},
				{74.179,38.041,10.000,0.026},
				{78.032,39.016,10.000,0.028},
				{81.983,39.992,10.000,0.031},
				{86.031,40.967,10.000,0.034},
				{90.176,41.942,10.000,0.038},
				{94.419,42.918,10.000,0.041},
				{98.760,43.893,10.000,0.045},
				{103.198,44.869,10.000,0.049},
				{107.733,45.844,10.000,0.054},
				{112.366,46.819,10.000,0.058},
				{117.097,47.795,10.000,0.063},
				{121.925,48.770,10.000,0.068},
				{126.851,49.746,10.000,0.074},
				{131.875,50.721,10.000,0.080},
				{136.995,51.696,10.000,0.086},
				{142.214,52.672,10.000,0.092},
				{147.530,53.647,10.000,0.099},
				{152.943,54.623,10.000,0.106},
				{158.454,55.598,10.000,0.114},
				{164.063,56.573,10.000,0.122},
				{169.769,57.549,10.000,0.130},
				{175.573,58.524,10.000,0.139},
				{181.474,59.500,10.000,0.148},
				{187.473,60.475,10.000,0.157},
				{193.569,61.450,10.000,0.167},
				{199.763,62.426,10.000,0.178},
				{206.054,63.401,10.000,0.189},
				{212.443,64.377,10.000,0.200},
				{218.929,65.352,10.000,0.212},
				{225.513,66.327,10.000,0.224},
				{232.195,67.303,10.000,0.237},
				{238.974,68.278,10.000,0.251},
				{245.850,69.254,10.000,0.265},
				{252.825,70.229,10.000,0.279},
				{259.896,71.204,10.000,0.294},
				{267.065,72.180,10.000,0.310},
				{274.332,73.155,10.000,0.326},
				{281.696,74.131,10.000,0.343},
				{289.158,75.106,10.000,0.360},
				{296.718,76.081,10.000,0.378},
				{304.375,77.057,10.000,0.396},
				{312.129,78.032,10.000,0.416},
				{319.981,79.008,10.000,0.435},
				{327.931,79.983,10.000,0.456},
				{335.978,80.958,10.000,0.477},
				{344.122,81.934,10.000,0.499},
				{352.364,82.909,10.000,0.521},
				{360.704,83.885,10.000,0.544},
				{369.141,84.860,10.000,0.568},
				{377.676,85.835,10.000,0.593},
				{386.308,86.811,10.000,0.618},
				{395.038,87.786,10.000,0.644},
				{403.866,88.762,10.000,0.670},
				{412.791,89.737,10.000,0.698},
				{421.813,90.713,10.000,0.726},
				{430.933,91.688,10.000,0.755},
				{440.151,92.663,10.000,0.785},
				{449.466,93.639,10.000,0.815},
				{458.879,94.614,10.000,0.846},
				{468.389,95.590,10.000,0.878},
				{477.996,96.565,10.000,0.911},
				{487.702,97.540,10.000,0.945},
				{497.504,98.516,10.000,0.979},
				{507.405,99.491,10.000,1.014},
				{517.403,100.467,10.000,1.050},
				{527.498,101.442,10.000,1.087},
				{537.691,102.417,10.000,1.125},
				{547.982,103.393,10.000,1.163},
				{558.370,104.368,10.000,1.202},
				{568.855,105.344,10.000,1.242},
				{579.438,106.319,10.000,1.283},
				{590.119,107.294,10.000,1.325},
				{600.897,108.270,10.000,1.368},
				{611.773,109.245,10.000,1.411},
				{622.746,110.221,10.000,1.455},
				{633.817,111.196,10.000,1.501},
				{644.985,112.171,10.000,1.547},
				{656.251,113.147,10.000,1.593},
				{667.615,114.122,10.000,1.641},
				{679.076,115.098,10.000,1.689},
				{690.634,116.073,10.000,1.739},
				{702.290,117.048,10.000,1.789},
				{714.044,118.024,10.000,1.840},
				{725.895,118.999,10.000,1.892},
				{737.844,119.975,10.000,1.944},
				{749.890,120.950,10.000,1.998},
				{762.034,121.925,10.000,2.052},
				{774.275,122.901,10.000,2.107},
				{786.614,123.876,10.000,2.163},
				{799.050,124.852,10.000,2.220},
				{811.584,125.827,10.000,2.277},
				{824.216,126.802,10.000,2.336},
				{836.945,127.778,10.000,2.395},
				{849.771,128.753,10.000,2.455},
				{862.695,129.729,10.000,2.515},
				{875.717,130.704,10.000,2.577},
				{888.836,131.679,10.000,2.639},
				{902.053,132.655,10.000,2.701},
				{915.367,133.630,10.000,2.765},
				{928.779,134.606,10.000,2.829},
				{942.288,135.581,10.000,2.894},
				{955.895,136.556,10.000,2.960},
				{969.600,137.532,10.000,3.026},
				{983.402,138.507,10.000,3.093},
				{997.301,139.483,10.000,3.161},
				{1011.298,140.458,10.000,3.229},
				{1025.393,141.433,10.000,3.298},
				{1039.585,142.409,10.000,3.367},
				{1053.875,143.384,10.000,3.437},
				{1068.262,144.360,10.000,3.508},
				{1082.746,145.335,10.000,3.579},
				{1097.329,146.311,10.000,3.651},
				{1112.009,147.286,10.000,3.723},
				{1126.786,148.261,10.000,3.795},
				{1141.661,149.237,10.000,3.868},
				{1156.633,150.212,10.000,3.942},
				{1171.703,151.188,10.000,4.016},
				{1186.871,152.163,10.000,4.090},
				{1202.136,153.138,10.000,4.165},
				{1217.498,154.114,10.000,4.240},
				{1232.959,155.089,10.000,4.315},
				{1248.516,156.065,10.000,4.391},
				{1264.172,157.040,10.000,4.467},
				{1279.924,158.015,10.000,4.543},
				{1295.775,158.991,10.000,4.619},
				{1311.722,159.966,10.000,4.695},
				{1327.768,160.942,10.000,4.772},
				{1343.911,161.917,10.000,4.849},
				{1360.151,162.892,10.000,4.926},
				{1376.489,163.868,10.000,5.003},
				{1392.925,164.843,10.000,5.080},
				{1409.458,165.819,10.000,5.157},
				{1426.088,166.794,10.000,5.234},
				{1442.817,167.769,10.000,5.310},
				{1459.642,168.745,10.000,5.387},
				{1476.566,169.720,10.000,5.464},
				{1493.586,170.696,10.000,5.540},
				{1510.705,171.671,10.000,5.617},
				{1527.921,172.646,10.000,5.693},
				{1545.234,173.622,10.000,5.768},
				{1562.645,174.597,10.000,5.844},
				{1580.153,175.573,10.000,5.919},
				{1597.759,176.548,10.000,5.994},
				{1615.463,177.523,10.000,6.068},
				{1633.264,178.499,10.000,6.142},
				{1651.163,179.474,10.000,6.215},
				{1669.159,180.450,10.000,6.288},
				{1687.253,181.425,10.000,6.360},
				{1705.444,182.400,10.000,6.432},
				{1723.733,183.376,10.000,6.503},
				{1742.119,184.351,10.000,6.573},
				{1760.603,185.327,10.000,6.643},
				{1779.184,186.302,10.000,6.712},
				{1797.863,187.277,10.000,6.780},
				{1816.640,188.253,10.000,6.847},
				{1835.514,189.228,10.000,6.913},
				{1854.486,190.204,10.000,6.978},
				{1873.555,191.179,10.000,7.043},
				{1892.721,192.154,10.000,7.106},
				{1911.986,193.130,10.000,7.168},
				{1931.347,194.105,10.000,7.229},
				{1950.807,195.081,10.000,7.289},
				{1970.315,195.081,10.000,7.348},
				{1989.823,195.081,10.000,7.405},
				{2009.331,195.081,10.000,7.461},
				{2028.839,195.081,10.000,7.515},
				{2048.347,195.081,10.000,7.567},
				{2067.855,195.081,10.000,7.618},
				{2087.363,195.081,10.000,7.667},
				{2106.871,195.081,10.000,7.715},
				{2126.379,195.081,10.000,7.761},
				{2145.887,195.081,10.000,7.805},
				{2165.395,195.081,10.000,7.848},
				{2184.904,195.081,10.000,7.889},
				{2204.412,195.081,10.000,7.928},
				{2223.920,195.081,10.000,7.966},
				{2243.428,195.081,10.000,8.002},
				{2262.936,195.081,10.000,8.036},
				{2282.444,195.081,10.000,8.068},
				{2301.952,195.081,10.000,8.099},
				{2321.460,195.081,10.000,8.128},
				{2340.968,195.081,10.000,8.155},
				{2360.476,195.081,10.000,8.180},
				{2379.984,195.081,10.000,8.204},
				{2399.492,195.081,10.000,8.226},
				{2419.000,195.081,10.000,8.246},
				{2438.508,195.081,10.000,8.264},
				{2458.016,195.081,10.000,8.280},
				{2477.525,195.081,10.000,8.295},
				{2497.033,195.081,10.000,8.307},
				{2516.541,195.081,10.000,8.318},
				{2536.049,195.081,10.000,8.327},
				{2555.557,195.081,10.000,8.334},
				{2575.065,195.081,10.000,8.340},
				{2594.573,195.081,10.000,8.343},
				{2614.081,195.081,10.000,8.345},
				{2633.589,195.081,10.000,8.345},
				{2653.097,195.081,10.000,8.343},
				{2672.605,195.081,10.000,8.339},
				{2692.113,195.081,10.000,8.334},
				{2711.621,195.081,10.000,8.326},
				{2731.129,195.081,10.000,8.317},
				{2750.637,195.081,10.000,8.306},
				{2770.146,195.081,10.000,8.293},
				{2789.654,195.081,10.000,8.278},
				{2809.162,195.081,10.000,8.261},
				{2828.670,195.081,10.000,8.243},
				{2848.178,195.081,10.000,8.223},
				{2867.686,195.081,10.000,8.201},
				{2887.194,195.081,10.000,8.177},
				{2906.702,195.081,10.000,8.151},
				{2926.210,195.081,10.000,8.124},
				{2945.718,195.081,10.000,8.095},
				{2965.226,195.081,10.000,8.064},
				{2984.734,195.081,10.000,8.031},
				{3004.242,195.081,10.000,7.997},
				{3023.750,195.081,10.000,7.961},
				{3043.258,195.081,10.000,7.923},
				{3062.767,195.081,10.000,7.883},
				{3082.275,195.081,10.000,7.842},
				{3101.783,195.081,10.000,7.799},
				{3121.291,195.081,10.000,7.755},
				{3140.799,195.081,10.000,7.708},
				{3160.307,195.081,10.000,7.661},
				{3179.815,195.081,10.000,7.611},
				{3199.323,195.081,10.000,7.560},
				{3218.831,195.081,10.000,7.507},
				{3238.339,195.081,10.000,7.453},
				{3257.847,195.081,10.000,7.397},
				{3277.355,195.081,10.000,7.340},
				{3296.863,195.081,10.000,7.281},
				{3316.371,195.081,10.000,7.221},
				{3335.879,195.081,10.000,7.159},
				{3355.388,195.081,10.000,7.096},
				{3374.896,195.081,10.000,7.031},
				{3394.404,195.081,10.000,6.965},
				{3413.912,195.081,10.000,6.898},
				{3433.420,195.081,10.000,6.829},
				{3452.928,195.081,10.000,6.759},
				{3472.436,195.081,10.000,6.688},
				{3491.944,195.081,10.000,6.615},
				{3511.452,195.081,10.000,6.541},
				{3530.960,195.081,10.000,6.466},
				{3550.468,195.081,10.000,6.389},
				{3569.976,195.081,10.000,6.312},
				{3589.484,195.081,10.000,6.233},
				{3608.992,195.081,10.000,6.154},
				{3628.500,195.081,10.000,6.073},
				{3648.009,195.081,10.000,5.991},
				{3667.517,195.081,10.000,5.908},
				{3687.025,195.081,10.000,5.824},
				{3706.533,195.081,10.000,5.739},
				{3726.041,195.081,10.000,5.653},
				{3745.549,195.081,10.000,5.567},
				{3765.057,195.081,10.000,5.479},
				{3784.565,195.081,10.000,5.391},
				{3804.073,195.081,10.000,5.302},
				{3823.581,195.081,10.000,5.212},
				{3843.089,195.081,10.000,5.122},
				{3862.597,195.081,10.000,5.031},
				{3882.105,195.081,10.000,4.939},
				{3901.613,195.081,10.000,4.847},
				{3921.121,195.081,10.000,4.754},
				{3940.630,195.081,10.000,4.660},
				{3960.138,195.081,10.000,4.567},
				{3979.646,195.081,10.000,4.473},
				{3999.154,195.081,10.000,4.378},
				{4018.662,195.081,10.000,4.283},
				{4038.170,195.081,10.000,4.188},
				{4057.678,195.081,10.000,4.093},
				{4077.186,195.081,10.000,3.997},
				{4096.694,195.081,10.000,3.901},
				{4116.202,195.081,10.000,3.805},
				{4135.710,195.081,10.000,3.710},
				{4155.218,195.081,10.000,3.614},
				{4174.726,195.081,10.000,3.518},
				{4194.234,195.081,10.000,3.422},
				{4213.742,195.081,10.000,3.327},
				{4233.251,195.081,10.000,3.231},
				{4252.759,195.081,10.000,3.136},
				{4272.267,195.081,10.000,3.042},
				{4291.775,195.081,10.000,2.947},
				{4311.283,195.081,10.000,2.853},
				{4330.791,195.081,10.000,2.760},
				{4350.299,195.081,10.000,2.667},
				{4369.807,195.081,10.000,2.574},
				{4389.315,195.081,10.000,2.483},
				{4408.823,195.081,10.000,2.391},
				{4428.331,195.081,10.000,2.301},
				{4447.839,195.081,10.000,2.211},
				{4467.347,195.081,10.000,2.123},
				{4486.855,195.081,10.000,2.035},
				{4506.363,195.081,10.000,1.948},
				{4525.872,195.081,10.000,1.862},
				{4545.380,195.081,10.000,1.778},
				{4564.888,195.081,10.000,1.694},
				{4584.396,195.081,10.000,1.612},
				{4603.904,195.081,10.000,1.531},
				{4623.412,195.081,10.000,1.451},
				{4642.920,195.081,10.000,1.373},
				{4662.428,195.081,10.000,1.296},
				{4681.936,195.081,10.000,1.220},
				{4701.444,195.081,10.000,1.147},
				{4720.952,195.081,10.000,1.075},
				{4740.460,195.081,10.000,1.004},
				{4759.968,195.081,10.000,0.936},
				{4779.476,195.081,10.000,0.869},
				{4798.984,195.081,10.000,0.804},
				{4818.493,195.081,10.000,0.741},
				{4838.001,195.081,10.000,0.680},
				{4857.509,195.081,10.000,0.621},
				{4877.017,195.081,10.000,0.565},
				{4896.525,195.081,10.000,0.511},
				{4916.033,195.081,10.000,0.459},
				{4935.541,195.081,10.000,0.409},
				{4955.049,195.081,10.000,0.362},
				{4974.557,195.081,10.000,0.317},
				{4994.065,195.081,10.000,0.275},
				{5013.573,195.081,10.000,0.236},
				{5033.081,195.081,10.000,0.199},
				{5052.589,195.081,10.000,0.166},
				{5072.097,195.081,10.000,0.135},
				{5091.605,195.081,10.000,0.107},
				{5111.114,195.081,10.000,0.082},
				{5130.622,195.081,10.000,0.060},
				{5150.130,195.081,10.000,0.042},
				{5169.638,195.081,10.000,0.027},
				{5189.146,195.081,10.000,0.015},
				{5208.654,195.081,10.000,0.006},
				{5228.162,195.081,10.000,0.001},
				{5247.670,195.081,10.000,0.000},
				{5267.178,195.081,10.000,0.000},
				{5286.686,195.081,10.000,-0.000},
				{5306.194,195.081,10.000,-0.002},
				{5325.702,195.081,10.000,-0.005},
				{5345.210,195.081,10.000,-0.011},
				{5364.718,195.081,10.000,-0.020},
				{5384.226,195.081,10.000,-0.032},
				{5403.735,195.081,10.000,-0.048},
				{5423.243,195.081,10.000,-0.069},
				{5442.751,195.081,10.000,-0.096},
				{5462.259,195.081,10.000,-0.128},
				{5481.767,195.081,10.000,-0.167},
				{5501.275,195.081,10.000,-0.212},
				{5520.783,195.081,10.000,-0.265},
				{5540.291,195.081,10.000,-0.326},
				{5559.799,195.081,10.000,-0.396},
				{5579.307,195.081,10.000,-0.475},
				{5598.815,195.081,10.000,-0.563},
				{5618.323,195.081,10.000,-0.661},
				{5637.831,195.081,10.000,-0.770},
				{5657.339,195.081,10.000,-0.891},
				{5676.847,195.081,10.000,-1.023},
				{5696.356,195.081,10.000,-1.168},
				{5715.864,195.081,10.000,-1.325},
				{5735.372,195.081,10.000,-1.497},
				{5754.880,195.081,10.000,-1.682},
				{5774.388,195.081,10.000,-1.883},
				{5793.896,195.081,10.000,-2.099},
				{5813.404,195.081,10.000,-2.332},
				{5832.899,194.813,10.000,-2.581},
				{5852.331,193.838,10.000,-2.847},
				{5871.666,192.863,10.000,-3.131},
				{5890.904,191.887,10.000,-3.432},
				{5910.044,190.912,10.000,-3.751},
				{5929.086,189.936,10.000,-4.090},
				{5948.031,188.961,10.000,-4.447},
				{5966.878,187.985,10.000,-4.825},
				{5985.628,187.010,10.000,-5.223},
				{6004.280,186.035,10.000,-5.642},
				{6022.835,185.059,10.000,-6.084},
				{6041.292,184.084,10.000,-6.548},
				{6059.652,183.108,10.000,-7.035},
				{6077.914,182.133,10.000,-7.547},
				{6096.078,181.158,10.000,-8.083},
				{6114.145,180.182,10.000,-8.645},
				{6132.115,179.207,10.000,-9.233},
				{6149.987,178.231,10.000,-9.849},
				{6167.761,177.256,10.000,-10.492},
				{6185.438,176.281,10.000,-11.164},
				{6203.017,175.305,10.000,-11.866},
				{6220.499,174.330,10.000,-12.598},
				{6237.883,173.354,10.000,-13.360},
				{6255.170,172.379,10.000,-14.154},
				{6272.359,171.404,10.000,-14.980},
				{6289.451,170.428,10.000,-15.839},
				{6306.445,169.453,10.000,-16.731},
				{6323.341,168.477,10.000,-17.656},
				{6340.140,167.502,10.000,-18.615},
				{6356.842,166.527,10.000,-19.608},
				{6373.445,165.551,10.000,-20.635},
				{6389.952,164.576,10.000,-21.695},
				{6406.361,163.600,10.000,-22.788},
				{6422.672,162.625,10.000,-23.914},
				{6438.886,161.650,10.000,-25.072},
				{6455.002,160.674,10.000,-26.260},
				{6471.020,159.699,10.000,-27.478},
				{6486.942,158.723,10.000,-28.723},
				{6502.765,157.748,10.000,-29.994},
				{6518.491,156.773,10.000,-31.289},
				{6534.120,155.797,10.000,-32.605},
				{6549.651,154.822,10.000,-33.939},
				{6565.084,153.846,10.000,-35.290},
				{6580.420,152.871,10.000,-36.653},
				{6595.658,151.896,10.000,-38.026},
				{6610.799,150.920,10.000,-39.405},
				{6625.842,149.945,10.000,-40.787},
				{6640.788,148.969,10.000,-42.169},
				{6655.636,147.994,10.000,-43.547},
				{6670.387,147.019,10.000,-44.918},
				{6685.040,146.043,10.000,-46.279},
				{6699.595,145.068,10.000,-47.626},
				{6714.053,144.092,10.000,-48.957},
				{6728.414,143.117,10.000,-50.269},
				{6742.677,142.142,10.000,-51.560},
				{6756.842,141.166,10.000,-52.827},
				{6770.910,140.191,10.000,-54.069},
				{6784.880,139.215,10.000,-55.284},
				{6798.753,138.240,10.000,-56.470},
				{6812.528,137.265,10.000,-57.627},
				{6826.206,136.289,10.000,-58.754},
				{6839.786,135.314,10.000,-59.849},
				{6853.269,134.338,10.000,-60.913},
				{6866.654,133.363,10.000,-61.946},
				{6879.941,132.387,10.000,-62.947},
				{6893.131,131.412,10.000,-63.916},
				{6906.224,130.437,10.000,-64.854},
				{6919.219,129.461,10.000,-65.761},
				{6932.116,128.486,10.000,-66.638},
				{6944.916,127.510,10.000,-67.485},
				{6957.618,126.535,10.000,-68.302},
				{6970.223,125.560,10.000,-69.091},
				{6982.730,124.584,10.000,-69.852},
				{6995.140,123.609,10.000,-70.586},
				{7007.452,122.633,10.000,-71.293},
				{7019.666,121.658,10.000,-71.975},
				{7031.783,120.683,10.000,-72.632},
				{7043.803,119.707,10.000,-73.266},
				{7055.725,118.732,10.000,-73.876},
				{7067.549,117.756,10.000,-74.464},
				{7079.276,116.781,10.000,-75.030},
				{7090.905,115.806,10.000,-75.576},
				{7102.437,114.830,10.000,-76.101},
				{7113.871,113.855,10.000,-76.607},
				{7125.208,112.879,10.000,-77.095},
				{7136.447,111.904,10.000,-77.565},
				{7147.589,110.929,10.000,-78.017},
				{7158.633,109.953,10.000,-78.453},
				{7169.580,108.978,10.000,-78.873},
				{7180.429,108.002,10.000,-79.278},
				{7191.180,107.027,10.000,-79.668},
				{7201.834,106.052,10.000,-80.043},
				{7212.390,105.076,10.000,-80.405},
				{7222.849,104.101,10.000,-80.754},
				{7233.211,103.125,10.000,-81.090},
				{7243.474,102.150,10.000,-81.413},
				{7253.641,101.175,10.000,-81.725},
				{7263.709,100.199,10.000,-82.026},
				{7273.680,99.224,10.000,-82.315},
				{7283.554,98.248,10.000,-82.594},
				{7293.330,97.273,10.000,-82.863},
				{7303.009,96.298,10.000,-83.122},
				{7312.590,95.322,10.000,-83.372},
				{7322.073,94.347,10.000,-83.612},
				{7331.459,93.371,10.000,-83.844},
				{7340.747,92.396,10.000,-84.067},
				{7349.938,91.421,10.000,-84.282},
				{7359.031,90.445,10.000,-84.489},
				{7368.027,89.470,10.000,-84.689},
				{7376.925,88.494,10.000,-84.881},
				{7385.726,87.519,10.000,-85.066},
				{7394.429,86.544,10.000,-85.244},
				{7403.035,85.568,10.000,-85.415},
				{7411.543,84.593,10.000,-85.580},
				{7419.953,83.617,10.000,-85.739},
				{7428.266,82.642,10.000,-85.892},
				{7436.482,81.667,10.000,-86.039},
				{7444.600,80.691,10.000,-86.180},
				{7452.620,79.716,10.000,-86.316},
				{7460.543,78.740,10.000,-86.446},
				{7468.368,77.765,10.000,-86.572},
				{7476.096,76.790,10.000,-86.693},
				{7483.726,75.814,10.000,-86.808},
				{7491.259,74.839,10.000,-86.920},
				{7498.694,73.863,10.000,-87.026},
				{7506.031,72.888,10.000,-87.129},
				{7513.271,71.912,10.000,-87.227},
				{7520.414,70.937,10.000,-87.321},
				{7527.459,69.962,10.000,-87.412},
				{7534.406,68.986,10.000,-87.498},
				{7541.256,68.011,10.000,-87.581},
				{7548.008,67.035,10.000,-87.660},
				{7554.663,66.060,10.000,-87.736},
				{7561.220,65.085,10.000,-87.809},
				{7567.680,64.109,10.000,-87.878},
				{7574.042,63.134,10.000,-87.944},
				{7580.307,62.158,10.000,-88.007},
				{7586.474,61.183,10.000,-88.068},
				{7592.543,60.208,10.000,-88.125},
				{7598.515,59.232,10.000,-88.180},
				{7604.390,58.257,10.000,-88.232},
				{7610.167,57.281,10.000,-88.282},
				{7615.846,56.306,10.000,-88.329},
				{7621.428,55.331,10.000,-88.374},
				{7626.912,54.355,10.000,-88.416},
				{7632.299,53.380,10.000,-88.456},
				{7637.588,52.404,10.000,-88.495},
				{7642.780,51.429,10.000,-88.531},
				{7647.874,50.454,10.000,-88.565},
				{7652.871,49.478,10.000,-88.597},
				{7657.770,48.503,10.000,-88.628},
				{7662.571,47.527,10.000,-88.656},
				{7667.275,46.552,10.000,-88.683},
				{7671.881,45.577,10.000,-88.709},
				{7676.390,44.601,10.000,-88.733},
				{7680.802,43.626,10.000,-88.755},
				{7685.116,42.650,10.000,-88.776},
				{7689.332,41.675,10.000,-88.796},
				{7693.451,40.700,10.000,-88.814},
				{7697.472,39.724,10.000,-88.831},
				{7701.395,38.749,10.000,-88.847},
				{7705.221,37.773,10.000,-88.861},
				{7708.950,36.798,10.000,-88.875},
				{7712.581,35.823,10.000,-88.888},
				{7716.115,34.847,10.000,-88.899},
				{7719.550,33.872,10.000,-88.910},
				{7722.889,32.896,10.000,-88.920},
				{7726.130,31.921,10.000,-88.929},
				{7729.273,30.946,10.000,-88.937},
				{7732.319,29.970,10.000,-88.945},
				{7735.267,28.995,10.000,-88.951},
				{7738.118,28.019,10.000,-88.958},
				{7740.871,27.044,10.000,-88.963},
				{7743.527,26.069,10.000,-88.968},
				{7746.085,25.093,10.000,-88.973},
				{7748.545,24.118,10.000,-88.977},
				{7750.908,23.142,10.000,-88.980},
				{7753.174,22.167,10.000,-88.983},
				{7755.342,21.192,10.000,-88.986},
				{7757.412,20.216,10.000,-88.988},
				{7759.385,19.241,10.000,-88.990},
				{7761.260,18.265,10.000,-88.992},
				{7763.038,17.290,10.000,-88.994},
				{7764.718,16.314,10.000,-88.995},
				{7766.301,15.339,10.000,-88.996},
				{7767.786,14.364,10.000,-88.997},
				{7769.174,13.388,10.000,-88.998},
				{7770.464,12.413,10.000,-88.998},
				{7771.656,11.437,10.000,-88.999},
				{7772.751,10.462,10.000,-88.999},
				{7773.749,9.487,10.000,-88.999},
				{7774.648,8.511,10.000,-89.000},
				{7775.451,7.536,10.000,-89.000},
				{7776.156,6.560,10.000,-89.000},
				{7776.763,5.585,10.000,-89.000},
				{7777.273,4.610,10.000,-89.000},
				{7777.685,3.634,10.000,-89.000},
				{7777.999,2.659,10.000,-89.000},
				{7778.217,1.683,10.000,-89.000},
				{7778.336,0.708,10.000,-89.000},
				{7778.372,0.000,10.000,-89.000}		};

}