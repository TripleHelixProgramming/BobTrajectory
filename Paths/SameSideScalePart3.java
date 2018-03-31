package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (22.92,21.33,-150.00)
	// (18.92,19.83,-160.00)
	
	public SameSideScalePart3() {
		this(false);
	}
			
    public SameSideScalePart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.015,0.291,10.000},
				{0.073,0.583,10.000},
				{0.204,1.311,10.000},
				{0.437,2.331,10.000},
				{0.801,3.642,10.000},
				{1.326,5.247,10.000},
				{2.040,7.145,10.000},
				{2.960,9.192,10.000},
				{4.084,11.244,10.000},
				{5.414,13.300,10.000},
				{6.950,15.363,10.000},
				{8.694,17.433,10.000},
				{10.645,19.511,10.000},
				{12.804,21.597,10.000},
				{15.174,23.693,10.000},
				{17.754,25.800,10.000},
				{20.545,27.917,10.000},
				{23.550,30.047,10.000},
				{26.769,32.189,10.000},
				{30.204,34.345,10.000},
				{33.855,36.515,10.000},
				{37.725,38.700,10.000},
				{41.815,40.900,10.000},
				{46.127,43.116,10.000},
				{50.662,45.349,10.000},
				{55.421,47.598,10.000},
				{60.408,49.865,10.000},
				{65.623,52.149,10.000},
				{71.068,54.452,10.000},
				{76.745,56.773,10.000},
				{82.656,59.112,10.000},
				{88.804,61.471,10.000},
				{95.188,63.849,10.000},
				{101.813,66.245,10.000},
				{108.679,68.661,10.000},
				{115.789,71.097,10.000},
				{123.144,73.551,10.000},
				{130.746,76.024,10.000},
				{138.598,78.516,10.000},
				{146.701,81.027,10.000},
				{155.056,83.557,10.000},
				{163.667,86.104,10.000},
				{172.534,88.669,10.000},
				{181.659,91.251,10.000},
				{191.044,93.849,10.000},
				{200.690,96.464,10.000},
				{210.599,99.094,10.000},
				{220.773,101.739,10.000},
				{231.213,104.398,10.000},
				{241.920,107.069,10.000},
				{252.895,109.753,10.000},
				{264.140,112.448,10.000},
				{275.655,115.153,10.000},
				{287.442,117.867,10.000},
				{299.501,120.588,10.000},
				{311.833,123.316,10.000},
				{324.437,126.049,10.000},
				{337.316,128.786,10.000},
				{350.469,131.525,10.000},
				{363.895,134.265,10.000},
				{377.595,137.003,10.000},
				{391.569,139.739,10.000},
				{405.816,142.471,10.000},
				{420.336,145.196,10.000},
				{435.127,147.913,10.000},
				{450.189,150.619,10.000},
				{465.521,153.314,10.000},
				{481.120,155.994,10.000},
				{496.986,158.658,10.000},
				{513.116,161.303,10.000},
				{529.509,163.928,10.000},
				{546.162,166.529,10.000},
				{563.072,169.106,10.000},
				{580.238,171.654,10.000},
				{597.655,174.173,10.000},
				{615.304,176.486,10.000},
				{633.145,178.416,10.000},
				{651.141,179.962,10.000},
				{669.253,181.122,10.000},
				{687.443,181.897,10.000},
				{705.672,182.286,10.000},
				{723.901,182.292,10.000},
				{742.110,182.089,10.000},
				{760.295,181.852,10.000},
				{778.453,181.582,10.000},
				{796.581,181.281,10.000},
				{814.676,180.948,10.000},
				{832.735,180.586,10.000},
				{850.754,180.195,10.000},
				{868.732,179.775,10.000},
				{886.665,179.329,10.000},
				{904.550,178.857,10.000},
				{922.386,178.361,10.000},
				{940.171,177.841,10.000},
				{957.900,177.298,10.000},
				{975.574,176.734,10.000},
				{993.189,176.149,10.000},
				{1010.743,175.545,10.000},
				{1028.235,174.922,10.000},
				{1045.664,174.283,10.000},
				{1063.026,173.627,10.000},
				{1080.322,172.956,10.000},
				{1097.549,172.271,10.000},
				{1114.706,171.572,10.000},
				{1131.792,170.862,10.000},
				{1148.806,170.140,10.000},
				{1165.747,169.409,10.000},
				{1182.614,168.668,10.000},
				{1199.406,167.919,10.000},
				{1216.122,167.163,10.000},
				{1232.762,166.400,10.000},
				{1249.325,165.632,10.000},
				{1265.811,164.860,10.000},
				{1282.220,164.084,10.000},
				{1298.550,163.305,10.000},
				{1314.803,162.525,10.000},
				{1330.977,161.743,10.000},
				{1347.073,160.962,10.000},
				{1363.091,160.181,10.000},
				{1379.031,159.402,10.000},
				{1394.894,158.626,10.000},
				{1410.679,157.853,10.000},
				{1426.388,157.084,10.000},
				{1442.020,156.320,10.000},
				{1457.576,155.562,10.000},
				{1473.057,154.811,10.000},
				{1488.464,154.067,10.000},
				{1503.797,153.331,10.000},
				{1519.057,152.604,10.000},
				{1534.246,151.888,10.000},
				{1549.364,151.182,10.000},
				{1564.413,150.488,10.000},
				{1579.394,149.806,10.000},
				{1594.307,149.138,10.000},
				{1609.156,148.484,10.000},
				{1623.940,147.845,10.000},
				{1638.663,147.222,10.000},
				{1653.324,146.616,10.000},
				{1667.927,146.027,10.000},
				{1682.473,145.458,10.000},
				{1696.963,144.907,10.000},
				{1711.401,144.377,10.000},
				{1725.786,143.848,10.000},
				{1740.105,143.186,10.000},
				{1754.332,142.276,10.000},
				{1768.445,141.124,10.000},
				{1782.418,139.731,10.000},
				{1796.228,138.103,10.000},
				{1809.852,136.240,10.000},
				{1823.268,134.164,10.000},
				{1836.469,132.010,10.000},
				{1849.458,129.892,10.000},
				{1862.239,127.807,10.000},
				{1874.815,125.756,10.000},
				{1887.188,123.735,10.000},
				{1899.363,121.743,10.000},
				{1911.341,119.780,10.000},
				{1923.125,117.842,10.000},
				{1934.718,115.930,10.000},
				{1946.122,114.040,10.000},
				{1957.339,112.171,10.000},
				{1968.371,110.323,10.000},
				{1979.220,108.492,10.000},
				{1989.888,106.679,10.000},
				{2000.376,104.881,10.000},
				{2010.686,103.096,10.000},
				{2020.818,101.324,10.000},
				{2030.774,99.562,10.000},
				{2040.555,97.810,10.000},
				{2050.162,96.066,10.000},
				{2059.595,94.328,10.000},
				{2068.854,92.596,10.000},
				{2077.941,90.868,10.000},
				{2086.855,89.143,10.000},
				{2095.597,87.420,10.000},
				{2104.167,85.697,10.000},
				{2112.565,83.974,10.000},
				{2120.789,82.249,10.000},
				{2128.842,80.523,10.000},
				{2136.721,78.792,10.000},
				{2144.427,77.058,10.000},
				{2151.959,75.319,10.000},
				{2159.316,73.574,10.000},
				{2166.498,71.822,10.000},
				{2173.505,70.064,10.000},
				{2180.334,68.298,10.000},
				{2186.987,66.523,10.000},
				{2193.461,64.740,10.000},
				{2199.756,62.948,10.000},
				{2205.870,61.147,10.000},
				{2211.804,59.335,10.000},
				{2217.555,57.514,10.000},
				{2223.123,55.683,10.000},
				{2228.507,53.840,10.000},
				{2233.706,51.988,10.000},
				{2238.719,50.125,10.000},
				{2243.544,48.251,10.000},
				{2248.180,46.366,10.000},
				{2252.628,44.471,10.000},
				{2256.884,42.566,10.000},
				{2260.949,40.650,10.000},
				{2264.821,38.724,10.000},
				{2268.500,36.788,10.000},
				{2271.985,34.843,10.000},
				{2275.273,32.888,10.000},
				{2278.366,30.925,10.000},
				{2281.261,28.953,10.000},
				{2283.958,26.973,10.000},
				{2286.457,24.985,10.000},
				{2288.756,22.990,10.000},
				{2290.855,20.988,10.000},
				{2292.753,18.980,10.000},
				{2294.449,16.966,10.000},
				{2295.944,14.947,10.000},
				{2297.236,12.923,10.000},
				{2298.326,10.896,10.000},
				{2299.212,8.865,10.000},
				{2299.898,6.853,10.000},
				{2300.398,5.005,10.000},
				{2300.743,3.448,10.000},
				{2300.961,2.180,10.000},
				{2301.081,1.204,10.000},
				{2301.133,0.518,10.000},
				{2301.146,0.124,10.000},
				{2301.146,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.015,0.291,10.000},
				{0.073,0.582,10.000},
				{0.204,1.311,10.000},
				{0.437,2.329,10.000},
				{0.801,3.639,10.000},
				{1.325,5.238,10.000},
				{2.037,7.127,10.000},
				{2.953,9.157,10.000},
				{4.071,11.183,10.000},
				{5.392,13.204,10.000},
				{6.914,15.219,10.000},
				{8.636,17.227,10.000},
				{10.559,19.227,10.000},
				{12.681,21.218,10.000},
				{15.001,23.200,10.000},
				{17.518,25.171,10.000},
				{20.231,27.131,10.000},
				{23.139,29.079,10.000},
				{26.240,31.014,10.000},
				{29.534,32.936,10.000},
				{33.018,34.843,10.000},
				{36.692,36.736,10.000},
				{40.553,38.614,10.000},
				{44.600,40.475,10.000},
				{48.833,42.320,10.000},
				{53.247,44.149,10.000},
				{57.843,45.960,10.000},
				{62.619,47.753,10.000},
				{67.571,49.528,10.000},
				{72.700,51.284,10.000},
				{78.002,53.022,10.000},
				{83.476,54.741,10.000},
				{89.120,56.441,10.000},
				{94.932,58.122,10.000},
				{100.911,59.784,10.000},
				{107.053,61.426,10.000},
				{113.358,63.050,10.000},
				{119.824,64.654,10.000},
				{126.448,66.239,10.000},
				{133.228,67.806,10.000},
				{140.164,69.354,10.000},
				{147.252,70.885,10.000},
				{154.492,72.398,10.000},
				{161.881,73.893,10.000},
				{169.419,75.372,10.000},
				{177.102,76.835,10.000},
				{184.930,78.283,10.000},
				{192.902,79.715,10.000},
				{201.015,81.134,10.000},
				{209.269,82.540,10.000},
				{217.663,83.934,10.000},
				{226.194,85.317,10.000},
				{234.863,86.690,10.000},
				{243.669,88.053,10.000},
				{252.610,89.409,10.000},
				{261.686,90.759,10.000},
				{270.896,92.103,10.000},
				{280.240,93.444,10.000},
				{289.719,94.783,10.000},
				{299.331,96.121,10.000},
				{309.077,97.460,10.000},
				{318.957,98.802,10.000},
				{328.972,100.148,10.000},
				{339.122,101.501,10.000},
				{349.408,102.861,10.000},
				{359.831,104.232,10.000},
				{370.393,105.615,10.000},
				{381.094,107.013,10.000},
				{391.937,108.427,10.000},
				{402.922,109.859,10.000},
				{414.054,111.312,10.000},
				{425.332,112.788,10.000},
				{436.761,114.289,10.000},
				{448.343,115.818,10.000},
				{460.081,117.377,10.000},
				{471.966,118.851,10.000},
				{483.978,120.124,10.000},
				{496.098,121.200,10.000},
				{508.306,122.079,10.000},
				{520.582,122.760,10.000},
				{532.907,123.244,10.000},
				{545.260,123.530,10.000},
				{557.633,123.733,10.000},
				{570.030,123.970,10.000},
				{582.454,124.239,10.000},
				{594.908,124.541,10.000},
				{607.395,124.873,10.000},
				{619.919,125.236,10.000},
				{632.482,125.627,10.000},
				{645.086,126.046,10.000},
				{657.736,126.493,10.000},
				{670.432,126.964,10.000},
				{683.178,127.461,10.000},
				{695.976,127.981,10.000},
				{708.829,128.524,10.000},
				{721.737,129.088,10.000},
				{734.705,129.673,10.000},
				{747.732,130.277,10.000},
				{760.822,130.899,10.000},
				{773.976,131.539,10.000},
				{787.196,132.195,10.000},
				{800.482,132.866,10.000},
				{813.838,133.551,10.000},
				{827.262,134.250,10.000},
				{840.758,134.960,10.000},
				{854.327,135.682,10.000},
				{867.968,136.413,10.000},
				{881.683,137.154,10.000},
				{895.474,137.903,10.000},
				{909.340,138.659,10.000},
				{923.282,139.422,10.000},
				{937.301,140.190,10.000},
				{951.397,140.962,10.000},
				{965.571,141.738,10.000},
				{979.823,142.517,10.000},
				{994.152,143.297,10.000},
				{1008.560,144.079,10.000},
				{1023.046,144.860,10.000},
				{1037.610,145.641,10.000},
				{1052.252,146.419,10.000},
				{1066.972,147.196,10.000},
				{1081.769,147.969,10.000},
				{1096.642,148.738,10.000},
				{1111.593,149.502,10.000},
				{1126.619,150.260,10.000},
				{1141.720,151.011,10.000},
				{1156.895,151.755,10.000},
				{1172.144,152.491,10.000},
				{1187.466,153.218,10.000},
				{1202.860,153.934,10.000},
				{1218.324,154.640,10.000},
				{1233.857,155.334,10.000},
				{1249.458,156.016,10.000},
				{1265.127,156.684,10.000},
				{1280.861,157.338,10.000},
				{1296.658,157.977,10.000},
				{1312.518,158.600,10.000},
				{1328.439,159.206,10.000},
				{1344.418,159.794,10.000},
				{1360.455,160.364,10.000},
				{1376.546,160.915,10.000},
				{1392.691,161.445,10.000},
				{1408.884,161.931,10.000},
				{1425.106,162.217,10.000},
				{1441.322,162.167,10.000},
				{1457.500,161.778,10.000},
				{1473.605,161.046,10.000},
				{1489.602,159.968,10.000},
				{1505.456,158.542,10.000},
				{1521.135,156.789,10.000},
				{1536.621,154.865,10.000},
				{1551.912,152.906,10.000},
				{1567.003,150.912,10.000},
				{1581.892,148.887,10.000},
				{1596.575,146.830,10.000},
				{1611.049,144.743,10.000},
				{1625.312,142.630,10.000},
				{1639.361,140.489,10.000},
				{1653.193,138.325,10.000},
				{1666.807,136.137,10.000},
				{1680.200,133.928,10.000},
				{1693.370,131.698,10.000},
				{1706.315,129.451,10.000},
				{1719.033,127.187,10.000},
				{1731.524,124.908,10.000},
				{1743.786,122.615,10.000},
				{1755.817,120.310,10.000},
				{1767.616,117.993,10.000},
				{1779.183,115.668,10.000},
				{1790.516,113.335,10.000},
				{1801.616,110.995,10.000},
				{1812.481,108.649,10.000},
				{1823.110,106.299,10.000},
				{1833.505,103.947,10.000},
				{1843.664,101.592,10.000},
				{1853.588,99.237,10.000},
				{1863.276,96.883,10.000},
				{1872.729,94.530,10.000},
				{1881.947,92.179,10.000},
				{1890.930,89.832,10.000},
				{1899.679,87.488,10.000},
				{1908.194,85.150,10.000},
				{1916.476,82.817,10.000},
				{1924.525,80.491,10.000},
				{1932.342,78.172,10.000},
				{1939.928,75.861,10.000},
				{1947.284,73.557,10.000},
				{1954.410,71.263,10.000},
				{1961.308,68.977,10.000},
				{1967.978,66.701,10.000},
				{1974.422,64.435,10.000},
				{1980.639,62.178,10.000},
				{1986.633,59.932,10.000},
				{1992.402,57.697,10.000},
				{1997.950,55.472,10.000},
				{2003.275,53.257,10.000},
				{2008.381,51.054,10.000},
				{2013.267,48.860,10.000},
				{2017.934,46.678,10.000},
				{2022.385,44.506,10.000},
				{2026.619,42.344,10.000},
				{2030.639,40.192,10.000},
				{2034.444,38.050,10.000},
				{2038.036,35.918,10.000},
				{2041.415,33.795,10.000},
				{2044.583,31.681,10.000},
				{2047.541,29.575,10.000},
				{2050.288,27.478,10.000},
				{2052.827,25.388,10.000},
				{2055.158,23.306,10.000},
				{2057.281,21.230,10.000},
				{2059.197,19.160,10.000},
				{2060.906,17.096,10.000},
				{2062.410,15.038,10.000},
				{2063.709,12.984,10.000},
				{2064.802,10.933,10.000},
				{2065.691,8.887,10.000},
				{2066.377,6.864,10.000},
				{2066.878,5.010,10.000},
				{2067.223,3.450,10.000},
				{2067.441,2.181,10.000},
				{2067.562,1.204,10.000},
				{2067.613,0.519,10.000},
				{2067.626,0.124,10.000},
				{2067.626,0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}