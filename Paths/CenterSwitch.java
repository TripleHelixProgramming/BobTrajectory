package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterSwitch extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.38,13.50,0.00)
	// (10.58,18.50,0.00)
	
	public CenterSwitch() {
		this(false);
	}
			
    public CenterSwitch(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.014,0.271,10.000},
				{0.068,0.542,10.000},
				{0.190,1.219,10.000},
				{0.406,2.167,10.000},
				{0.745,3.386,10.000},
				{1.232,4.875,10.000},
				{1.896,6.634,10.000},
				{2.762,8.662,10.000},
				{3.858,10.958,10.000},
				{5.196,13.386,10.000},
				{6.777,15.810,10.000},
				{8.600,18.229,10.000},
				{10.665,20.643,10.000},
				{12.970,23.050,10.000},
				{15.515,25.451,10.000},
				{18.299,27.843,10.000},
				{21.322,30.227,10.000},
				{24.582,32.602,10.000},
				{28.079,34.967,10.000},
				{31.811,37.322,10.000},
				{35.777,39.665,10.000},
				{39.977,41.997,10.000},
				{44.409,44.316,10.000},
				{49.071,46.622,10.000},
				{53.962,48.915,10.000},
				{59.082,51.193,10.000},
				{64.427,53.456,10.000},
				{69.998,55.704,10.000},
				{75.791,57.935,10.000},
				{81.806,60.150,10.000},
				{88.041,62.348,10.000},
				{94.494,64.529,10.000},
				{101.163,66.690,10.000},
				{108.046,68.834,10.000},
				{115.142,70.957,10.000},
				{122.448,73.061,10.000},
				{129.963,75.145,10.000},
				{137.683,77.208,10.000},
				{145.608,79.249,10.000},
				{153.735,81.269,10.000},
				{162.062,83.266,10.000},
				{170.586,85.240,10.000},
				{179.305,87.191,10.000},
				{188.217,89.119,10.000},
				{197.319,91.022,10.000},
				{206.609,92.900,10.000},
				{216.084,94.752,10.000},
				{225.742,96.579,10.000},
				{235.580,98.380,10.000},
				{245.596,100.154,10.000},
				{255.786,101.901,10.000},
				{266.148,103.619,10.000},
				{276.679,105.310,10.000},
				{287.376,106.971,10.000},
				{298.236,108.603,10.000},
				{309.257,110.205,10.000},
				{320.434,111.777,10.000},
				{331.766,113.318,10.000},
				{343.249,114.827,10.000},
				{354.879,116.304,10.000},
				{366.654,117.749,10.000},
				{378.570,119.161,10.000},
				{390.624,120.539,10.000},
				{402.812,121.883,10.000},
				{415.132,123.193,10.000},
				{427.579,124.469,10.000},
				{440.149,125.709,10.000},
				{452.841,126.914,10.000},
				{465.649,128.083,10.000},
				{478.571,129.217,10.000},
				{491.602,130.315,10.000},
				{504.740,131.377,10.000},
				{517.980,132.403,10.000},
				{531.320,133.394,10.000},
				{544.755,134.350,10.000},
				{558.282,135.271,10.000},
				{571.898,136.159,10.000},
				{585.599,137.014,10.000},
				{599.383,137.837,10.000},
				{613.246,138.630,10.000},
				{627.185,139.395,10.000},
				{641.199,140.133,10.000},
				{655.283,140.847,10.000},
				{669.437,141.539,10.000},
				{683.659,142.213,10.000},
				{697.946,142.871,10.000},
				{712.298,143.518,10.000},
				{726.713,144.158,10.000},
				{741.193,144.796,10.000},
				{755.737,145.436,10.000},
				{770.345,146.084,10.000},
				{785.020,146.747,10.000},
				{799.763,147.431,10.000},
				{814.577,148.143,10.000},
				{829.466,148.890,10.000},
				{844.434,149.680,10.000},
				{859.486,150.521,10.000},
				{874.628,151.421,10.000},
				{889.867,152.390,10.000},
				{905.211,153.435,10.000},
				{920.667,154.565,10.000},
				{936.246,155.789,10.000},
				{951.958,157.115,10.000},
				{967.813,158.552,10.000},
				{983.823,160.107,10.000},
				{1000.002,161.787,10.000},
				{1016.362,163.599,10.000},
				{1032.917,165.548,10.000},
				{1049.681,167.640,10.000},
				{1066.669,169.879,10.000},
				{1083.895,172.267,10.000},
				{1101.376,174.807,10.000},
				{1119.126,177.499,10.000},
				{1137.160,180.344,10.000},
				{1155.494,183.341,10.000},
				{1174.143,186.486,10.000},
				{1193.121,189.778,10.000},
				{1212.442,193.211,10.000},
				{1232.120,196.782,10.000},
				{1252.169,200.485,10.000},
				{1272.600,204.314,10.000},
				{1293.426,208.261,10.000},
				{1314.658,212.321,10.000},
				{1336.307,216.487,10.000},
				{1358.382,220.750,10.000},
				{1380.892,225.103,10.000},
				{1403.846,229.540,10.000},
				{1427.252,234.054,10.000},
				{1451.116,238.638,10.000},
				{1475.444,243.285,10.000},
				{1500.243,247.989,10.000},
				{1525.517,252.745,10.000},
				{1551.272,257.549,10.000},
				{1577.512,262.394,10.000},
				{1604.240,267.278,10.000},
				{1631.459,272.197,10.000},
				{1659.174,277.148,10.000},
				{1687.387,282.128,10.000},
				{1716.100,287.136,10.000},
				{1745.318,292.171,10.000},
				{1775.029,297.111,10.000},
				{1805.211,301.827,10.000},
				{1835.843,306.311,10.000},
				{1866.898,310.555,10.000},
				{1898.353,314.551,10.000},
				{1930.182,318.292,10.000},
				{1962.360,321.771,10.000},
				{1994.858,324.982,10.000},
				{2027.650,327.920,10.000},
				{2060.721,330.711,10.000},
				{2094.069,333.486,10.000},
				{2127.694,336.251,10.000},
				{2161.595,339.008,10.000},
				{2195.771,341.762,10.000},
				{2230.223,344.516,10.000},
				{2264.951,347.275,10.000},
				{2299.955,350.042,10.000},
				{2335.237,352.821,10.000},
				{2370.795,355.578,10.000},
				{2406.612,358.173,10.000},
				{2442.662,360.497,10.000},
				{2478.916,362.546,10.000},
				{2515.348,364.313,10.000},
				{2551.927,365.792,10.000},
				{2588.624,366.974,10.000},
				{2625.410,367.853,10.000},
				{2662.252,368.420,10.000},
				{2699.122,368.706,10.000},
				{2736.008,368.857,10.000},
				{2772.906,368.981,10.000},
				{2809.814,369.076,10.000},
				{2846.728,369.141,10.000},
				{2883.645,369.174,10.000},
				{2920.562,369.170,10.000},
				{2957.475,369.128,10.000},
				{2994.379,369.042,10.000},
				{3031.270,368.907,10.000},
				{3068.142,368.720,10.000},
				{3104.989,368.473,10.000},
				{3141.805,368.161,10.000},
				{3178.583,367.778,10.000},
				{3215.314,367.316,10.000},
				{3251.991,366.769,10.000},
				{3288.604,366.129,10.000},
				{3325.143,365.389,10.000},
				{3361.597,364.543,10.000},
				{3397.956,363.582,10.000},
				{3434.206,362.500,10.000},
				{3470.335,361.291,10.000},
				{3506.330,359.949,10.000},
				{3542.176,358.468,10.000},
				{3577.861,356.843,10.000},
				{3613.368,355.072,10.000},
				{3648.683,353.151,10.000},
				{3683.791,351.078,10.000},
				{3718.676,348.853,10.000},
				{3753.324,346.475,10.000},
				{3787.718,343.945,10.000},
				{3821.845,341.267,10.000},
				{3855.689,338.444,10.000},
				{3889.237,335.479,10.000},
				{3922.475,332.378,10.000},
				{3955.390,329.147,10.000},
				{3987.969,325.792,10.000},
				{4020.201,322.322,10.000},
				{4052.075,318.743,10.000},
				{4083.582,315.064,10.000},
				{4114.711,311.294,10.000},
				{4145.455,307.441,10.000},
				{4175.807,303.513,10.000},
				{4205.759,299.520,10.000},
				{4235.306,295.470,10.000},
				{4264.443,291.371,10.000},
				{4293.166,287.231,10.000},
				{4321.471,283.057,10.000},
				{4349.357,278.858,10.000},
				{4376.821,274.639,10.000},
				{4403.862,270.408,10.000},
				{4430.479,266.170,10.000},
				{4456.672,261.931,10.000},
				{4482.442,257.696,10.000},
				{4507.788,253.469,10.000},
				{4532.714,249.254,10.000},
				{4557.219,245.055,10.000},
				{4581.307,240.876,10.000},
				{4604.979,236.719,10.000},
				{4628.238,232.587,10.000},
				{4651.086,228.483,10.000},
				{4673.527,224.407,10.000},
				{4695.563,220.362,10.000},
				{4717.198,216.348,10.000},
				{4738.434,212.368,10.000},
				{4759.277,208.422,10.000},
				{4779.728,204.510,10.000},
				{4799.791,200.634,10.000},
				{4819.470,196.793,10.000},
				{4838.769,192.987,10.000},
				{4857.691,189.218,10.000},
				{4876.239,185.484,10.000},
				{4894.418,181.786,10.000},
				{4912.230,178.123,10.000},
				{4929.680,174.496,10.000},
				{4946.770,170.904,10.000},
				{4963.505,167.346,10.000},
				{4979.887,163.822,10.000},
				{4995.920,160.333,10.000},
				{5011.608,156.876,10.000},
				{5026.953,153.453,10.000},
				{5041.959,150.062,10.000},
				{5056.629,146.702,10.000},
				{5070.967,143.375,10.000},
				{5084.975,140.078,10.000},
				{5098.656,136.811,10.000},
				{5112.013,133.574,10.000},
				{5125.050,130.366,10.000},
				{5137.768,127.187,10.000},
				{5150.172,124.036,10.000},
				{5162.263,120.913,10.000},
				{5174.045,117.817,10.000},
				{5185.520,114.748,10.000},
				{5196.690,111.705,10.000},
				{5207.559,108.688,10.000},
				{5218.129,105.696,10.000},
				{5228.401,102.728,10.000},
				{5238.380,99.785,10.000},
				{5248.066,96.865,10.000},
				{5257.463,93.969,10.000},
				{5266.573,91.095,10.000},
				{5275.397,88.243,10.000},
				{5283.939,85.414,10.000},
				{5292.199,82.605,10.000},
				{5300.181,79.817,10.000},
				{5307.886,77.049,10.000},
				{5315.316,74.301,10.000},
				{5322.473,71.573,10.000},
				{5329.359,68.862,10.000},
				{5335.976,66.170,10.000},
				{5342.326,63.496,10.000},
				{5348.410,60.838,10.000},
				{5354.230,58.197,10.000},
				{5359.787,55.572,10.000},
				{5365.083,52.963,10.000},
				{5370.120,50.368,10.000},
				{5374.898,47.787,10.000},
				{5379.420,45.219,10.000},
				{5383.687,42.665,10.000},
				{5387.699,40.123,10.000},
				{5391.458,37.592,10.000},
				{5394.966,35.073,10.000},
				{5398.222,32.564,10.000},
				{5401.228,30.064,10.000},
				{5403.986,27.573,10.000},
				{5406.495,25.091,10.000},
				{5408.757,22.616,10.000},
				{5410.771,20.148,10.000},
				{5412.540,17.686,10.000},
				{5414.063,15.230,10.000},
				{5415.341,12.778,10.000},
				{5416.377,10.367,10.000},
				{5417.190,8.131,10.000},
				{5417.807,6.168,10.000},
				{5418.255,4.478,10.000},
				{5418.561,3.059,10.000},
				{5418.752,1.913,10.000},
				{5418.856,1.037,10.000},
				{5418.899,0.433,10.000},
				{5418.909,0.099,10.000},
				{5418.909,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.014,0.271,10.000},
				{0.068,0.542,10.000},
				{0.190,1.219,10.000},
				{0.406,2.168,10.000},
				{0.745,3.388,10.000},
				{1.233,4.879,10.000},
				{1.897,6.643,10.000},
				{2.765,8.679,10.000},
				{3.864,10.989,10.000},
				{5.208,13.437,10.000},
				{6.797,15.890,10.000},
				{8.632,18.348,10.000},
				{10.713,20.812,10.000},
				{13.041,23.281,10.000},
				{15.617,25.758,10.000},
				{18.441,28.243,10.000},
				{21.515,30.736,10.000},
				{24.838,33.238,10.000},
				{28.413,35.750,10.000},
				{32.241,38.272,10.000},
				{36.321,40.805,10.000},
				{40.656,43.351,10.000},
				{45.247,45.909,10.000},
				{50.095,48.480,10.000},
				{55.201,51.064,10.000},
				{60.568,53.663,10.000},
				{66.195,56.277,10.000},
				{72.086,58.906,10.000},
				{78.241,61.551,10.000},
				{84.663,64.213,10.000},
				{91.352,66.893,10.000},
				{98.311,69.589,10.000},
				{105.541,72.305,10.000},
				{113.045,75.038,10.000},
				{120.824,77.792,10.000},
				{128.881,80.565,10.000},
				{137.217,83.358,10.000},
				{145.834,86.172,10.000},
				{154.735,89.008,10.000},
				{163.921,91.865,10.000},
				{173.396,94.745,10.000},
				{183.160,97.648,10.000},
				{193.218,100.574,10.000},
				{203.570,103.524,10.000},
				{214.220,106.498,10.000},
				{225.170,109.497,10.000},
				{236.422,112.521,10.000},
				{247.979,115.571,10.000},
				{259.843,118.647,10.000},
				{272.018,121.750,10.000},
				{284.507,124.881,10.000},
				{297.310,128.039,10.000},
				{310.433,131.226,10.000},
				{323.877,134.441,10.000},
				{337.646,137.686,10.000},
				{351.742,140.961,10.000},
				{366.168,144.266,10.000},
				{380.929,147.602,10.000},
				{396.026,150.970,10.000},
				{411.463,154.370,10.000},
				{427.243,157.802,10.000},
				{443.370,161.268,10.000},
				{459.846,164.766,10.000},
				{476.676,168.299,10.000},
				{493.863,171.866,10.000},
				{511.410,175.468,10.000},
				{529.320,179.104,10.000},
				{547.598,182.776,10.000},
				{566.246,186.484,10.000},
				{585.269,190.227,10.000},
				{604.669,194.007,10.000},
				{624.452,197.822,10.000},
				{644.619,201.672,10.000},
				{665.175,205.558,10.000},
				{686.122,209.479,10.000},
				{707.466,213.435,10.000},
				{729.208,217.424,10.000},
				{751.353,221.446,10.000},
				{773.903,225.500,10.000},
				{796.861,229.583,10.000},
				{820.231,233.696,10.000},
				{844.014,237.834,10.000},
				{868.214,241.997,10.000},
				{892.832,246.182,10.000},
				{917.871,250.385,10.000},
				{943.331,254.604,10.000},
				{969.215,258.834,10.000},
				{995.522,263.071,10.000},
				{1022.253,267.310,10.000},
				{1049.407,271.547,10.000},
				{1076.985,275.775,10.000},
				{1104.984,279.989,10.000},
				{1133.402,284.182,10.000},
				{1162.237,288.347,10.000},
				{1191.484,292.477,10.000},
				{1221.141,296.564,10.000},
				{1251.201,300.600,10.000},
				{1281.659,304.576,10.000},
				{1312.507,308.485,10.000},
				{1343.739,312.317,10.000},
				{1375.345,316.063,10.000},
				{1407.317,319.716,10.000},
				{1439.643,323.267,10.000},
				{1472.314,326.707,10.000},
				{1505.317,330.029,10.000},
				{1538.639,333.226,10.000},
				{1572.269,336.291,10.000},
				{1606.190,339.218,10.000},
				{1640.391,342.003,10.000},
				{1674.855,344.642,10.000},
				{1709.568,347.130,10.000},
				{1744.515,349.467,10.000},
				{1779.680,351.652,10.000},
				{1815.048,353.684,10.000},
				{1850.605,355.565,10.000},
				{1886.334,357.296,10.000},
				{1922.222,358.882,10.000},
				{1958.255,360.325,10.000},
				{1994.418,361.631,10.000},
				{2030.699,362.805,10.000},
				{2067.084,363.854,10.000},
				{2103.562,364.784,10.000},
				{2140.122,365.601,10.000},
				{2176.754,366.313,10.000},
				{2213.446,366.927,10.000},
				{2250.191,367.450,10.000},
				{2286.980,367.890,10.000},
				{2323.806,368.254,10.000},
				{2360.661,368.548,10.000},
				{2397.538,368.778,10.000},
				{2434.433,368.951,10.000},
				{2471.341,369.071,10.000},
				{2508.255,369.146,10.000},
				{2545.173,369.177,10.000},
				{2582.090,369.171,10.000},
				{2619.003,369.129,10.000},
				{2655.908,369.055,10.000},
				{2692.804,368.952,10.000},
				{2729.686,368.821,10.000},
				{2766.552,368.663,10.000},
				{2803.385,368.330,10.000},
				{2840.153,367.678,10.000},
				{2876.824,366.716,10.000},
				{2913.370,365.453,10.000},
				{2949.759,363.895,10.000},
				{2985.964,362.051,10.000},
				{3021.957,359.927,10.000},
				{3057.710,357.529,10.000},
				{3093.196,354.862,10.000},
				{3128.403,352.072,10.000},
				{3163.333,349.296,10.000},
				{3197.986,346.532,10.000},
				{3232.364,343.774,10.000},
				{3266.466,341.021,10.000},
				{3300.292,338.266,10.000},
				{3333.843,335.508,10.000},
				{3367.117,332.740,10.000},
				{3400.113,329.961,10.000},
				{3432.826,327.131,10.000},
				{3465.238,324.120,10.000},
				{3497.322,320.836,10.000},
				{3529.050,317.286,10.000},
				{3560.398,313.477,10.000},
				{3591.340,309.414,10.000},
				{3621.850,305.105,10.000},
				{3651.906,300.558,10.000},
				{3681.484,295.781,10.000},
				{3710.566,290.816,10.000},
				{3739.144,285.788,10.000},
				{3767.223,280.787,10.000},
				{3794.804,275.814,10.000},
				{3821.892,270.872,10.000},
				{3848.488,265.962,10.000},
				{3874.597,261.088,10.000},
				{3900.222,256.254,10.000},
				{3925.368,251.463,10.000},
				{3950.040,246.720,10.000},
				{3974.243,242.030,10.000},
				{3997.983,237.400,10.000},
				{4021.267,232.834,10.000},
				{4044.101,228.340,10.000},
				{4066.493,223.925,10.000},
				{4088.453,219.595,10.000},
				{4109.988,215.357,10.000},
				{4131.110,211.220,10.000},
				{4151.829,207.189,10.000},
				{4172.157,203.273,10.000},
				{4192.104,199.478,10.000},
				{4211.685,195.810,10.000},
				{4230.913,192.275,10.000},
				{4249.801,188.879,10.000},
				{4268.363,185.626,10.000},
				{4286.615,182.520,10.000},
				{4304.572,179.565,10.000},
				{4322.248,176.760,10.000},
				{4339.659,174.109,10.000},
				{4356.820,171.610,10.000},
				{4373.746,169.262,10.000},
				{4390.452,167.063,10.000},
				{4406.953,165.010,10.000},
				{4423.263,163.098,10.000},
				{4439.395,161.322,10.000},
				{4455.363,159.676,10.000},
				{4471.178,158.154,10.000},
				{4486.853,156.747,10.000},
				{4502.398,155.449,10.000},
				{4517.823,154.251,10.000},
				{4533.138,153.145,10.000},
				{4548.350,152.121,10.000},
				{4563.467,151.172,10.000},
				{4578.496,150.288,10.000},
				{4593.442,149.461,10.000},
				{4608.310,148.684,10.000},
				{4623.105,147.947,10.000},
				{4637.829,147.244,10.000},
				{4652.486,146.566,10.000},
				{4667.077,145.908,10.000},
				{4681.603,145.262,10.000},
				{4696.065,144.623,10.000},
				{4710.464,143.985,10.000},
				{4724.798,143.344,10.000},
				{4739.067,142.694,10.000},
				{4753.271,142.032,10.000},
				{4767.406,141.354,10.000},
				{4781.472,140.656,10.000},
				{4795.465,139.936,10.000},
				{4809.384,139.191,10.000},
				{4823.226,138.419,10.000},
				{4836.988,137.617,10.000},
				{4850.666,136.786,10.000},
				{4864.259,135.922,10.000},
				{4877.761,135.025,10.000},
				{4891.171,134.095,10.000},
				{4904.483,133.129,10.000},
				{4917.696,132.129,10.000},
				{4930.806,131.093,10.000},
				{4943.808,130.021,10.000},
				{4956.699,128.914,10.000},
				{4969.476,127.771,10.000},
				{4982.135,126.592,10.000},
				{4994.673,125.377,10.000},
				{5007.086,124.128,10.000},
				{5019.370,122.843,10.000},
				{5031.523,121.524,10.000},
				{5043.540,120.170,10.000},
				{5055.418,118.783,10.000},
				{5067.154,117.362,10.000},
				{5078.745,115.909,10.000},
				{5090.187,114.423,10.000},
				{5101.478,112.905,10.000},
				{5112.613,111.356,10.000},
				{5123.591,109.776,10.000},
				{5134.408,108.166,10.000},
				{5145.060,106.526,10.000},
				{5155.546,104.857,10.000},
				{5165.862,103.159,10.000},
				{5176.005,101.432,10.000},
				{5185.973,99.678,10.000},
				{5195.762,97.897,10.000},
				{5205.371,96.089,10.000},
				{5214.797,94.255,10.000},
				{5224.036,92.396,10.000},
				{5233.088,90.511,10.000},
				{5241.948,88.601,10.000},
				{5250.614,86.668,10.000},
				{5259.086,84.710,10.000},
				{5267.358,82.730,10.000},
				{5275.431,80.726,10.000},
				{5283.301,78.701,10.000},
				{5290.967,76.654,10.000},
				{5298.425,74.585,10.000},
				{5305.675,72.496,10.000},
				{5312.713,70.387,10.000},
				{5319.539,68.258,10.000},
				{5326.150,66.110,10.000},
				{5332.544,63.943,10.000},
				{5338.720,61.758,10.000},
				{5344.676,59.555,10.000},
				{5350.409,57.336,10.000},
				{5355.919,55.100,10.000},
				{5361.204,52.848,10.000},
				{5366.262,50.581,10.000},
				{5371.092,48.299,10.000},
				{5375.692,46.002,10.000},
				{5380.062,43.693,10.000},
				{5384.199,41.370,10.000},
				{5388.102,39.035,10.000},
				{5391.771,36.689,10.000},
				{5395.204,34.331,10.000},
				{5398.400,31.963,10.000},
				{5401.359,29.586,10.000},
				{5404.079,27.200,10.000},
				{5406.560,24.805,10.000},
				{5408.800,22.403,10.000},
				{5410.799,19.994,10.000},
				{5412.557,17.579,10.000},
				{5414.073,15.158,10.000},
				{5415.346,12.733,10.000},
				{5416.380,10.340,10.000},
				{5417.192,8.116,10.000},
				{5417.808,6.160,10.000},
				{5418.255,4.474,10.000},
				{5418.561,3.058,10.000},
				{5418.752,1.912,10.000},
				{5418.856,1.037,10.000},
				{5418.899,0.432,10.000},
				{5418.909,0.099,10.000},
				{5418.909,0.000,10.000}
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