package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterSwitch extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.50,0.00)
	// (10.00,18.50,0.00)
	
	public CenterSwitch() {
		this(false);
	}
			
    public CenterSwitch(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.014,0.283,10.000},
				{0.071,0.566,10.000},
				{0.198,1.274,10.000},
				{0.425,2.265,10.000},
				{0.779,3.538,10.000},
				{1.288,5.094,10.000},
				{1.981,6.932,10.000},
				{2.886,9.050,10.000},
				{4.031,11.447,10.000},
				{5.429,13.982,10.000},
				{7.080,16.511,10.000},
				{8.983,19.033,10.000},
				{11.138,21.548,10.000},
				{13.544,24.054,10.000},
				{16.199,26.550,10.000},
				{19.102,29.037,10.000},
				{22.253,31.511,10.000},
				{25.651,33.973,10.000},
				{29.293,36.422,10.000},
				{33.179,38.857,10.000},
				{37.306,41.276,10.000},
				{41.674,43.679,10.000},
				{46.281,46.066,10.000},
				{51.124,48.435,10.000},
				{56.203,50.785,10.000},
				{61.514,53.116,10.000},
				{67.057,55.426,10.000},
				{72.828,57.715,10.000},
				{78.827,59.983,10.000},
				{85.050,62.228,10.000},
				{91.495,64.450,10.000},
				{98.159,66.647,10.000},
				{105.041,68.820,10.000},
				{112.138,70.967,10.000},
				{119.447,73.088,10.000},
				{126.965,75.181,10.000},
				{134.690,77.247,10.000},
				{142.618,79.284,10.000},
				{150.747,81.292,10.000},
				{159.074,83.270,10.000},
				{167.596,85.217,10.000},
				{176.309,87.133,10.000},
				{185.211,89.016,10.000},
				{194.297,90.866,10.000},
				{203.566,92.682,10.000},
				{213.012,94.464,10.000},
				{222.633,96.210,10.000},
				{232.425,97.921,10.000},
				{242.385,99.593,10.000},
				{252.507,101.229,10.000},
				{262.790,102.825,10.000},
				{273.228,104.381,10.000},
				{283.818,105.897,10.000},
				{294.555,107.371,10.000},
				{305.435,108.803,10.000},
				{316.454,110.191,10.000},
				{327.608,111.535,10.000},
				{338.891,112.834,10.000},
				{350.300,114.086,10.000},
				{361.829,115.291,10.000},
				{373.474,116.447,10.000},
				{385.229,117.554,10.000},
				{397.090,118.610,10.000},
				{409.052,119.616,10.000},
				{421.108,120.569,10.000},
				{433.255,121.469,10.000},
				{445.487,122.315,10.000},
				{457.797,123.107,10.000},
				{470.182,123.843,10.000},
				{482.634,124.524,10.000},
				{495.149,125.149,10.000},
				{507.721,125.718,10.000},
				{520.344,126.231,10.000},
				{533.013,126.688,10.000},
				{545.722,127.090,10.000},
				{558.465,127.437,10.000},
				{571.239,127.732,10.000},
				{584.036,127.975,10.000},
				{596.853,128.169,10.000},
				{609.685,128.316,10.000},
				{622.527,128.419,10.000},
				{635.375,128.483,10.000},
				{648.226,128.511,10.000},
				{661.077,128.510,10.000},
				{673.925,128.483,10.000},
				{686.769,128.440,10.000},
				{699.608,128.386,10.000},
				{712.441,128.331,10.000},
				{725.269,128.284,10.000},
				{738.095,128.255,10.000},
				{750.920,128.255,10.000},
				{763.750,128.297,10.000},
				{776.589,128.393,10.000},
				{789.445,128.558,10.000},
				{802.326,128.805,10.000},
				{815.240,129.148,10.000},
				{828.201,129.604,10.000},
				{841.220,130.188,10.000},
				{854.311,130.914,10.000},
				{867.491,131.797,10.000},
				{880.776,132.853,10.000},
				{894.185,134.094,10.000},
				{907.739,135.533,10.000},
				{921.457,137.182,10.000},
				{935.362,139.050,10.000},
				{949.476,141.145,10.000},
				{963.824,143.475,10.000},
				{978.428,146.042,10.000},
				{993.313,148.849,10.000},
				{1008.502,151.897,10.000},
				{1024.021,155.182,10.000},
				{1039.891,158.702,10.000},
				{1056.136,162.450,10.000},
				{1072.778,166.418,10.000},
				{1089.837,170.598,10.000},
				{1107.335,174.978,10.000},
				{1125.290,179.547,10.000},
				{1143.719,184.293,10.000},
				{1162.640,189.202,10.000},
				{1182.066,194.262,10.000},
				{1202.011,199.458,10.000},
				{1222.489,204.777,10.000},
				{1243.510,210.208,10.000},
				{1265.084,215.736,10.000},
				{1287.219,221.351,10.000},
				{1309.923,227.042,10.000},
				{1333.203,232.798,10.000},
				{1357.064,238.610,10.000},
				{1381.511,244.470,10.000},
				{1406.548,250.372,10.000},
				{1432.179,256.308,10.000},
				{1458.406,262.274,10.000},
				{1485.233,268.266,10.000},
				{1512.661,274.281,10.000},
				{1540.692,280.316,10.000},
				{1569.329,286.370,10.000},
				{1598.574,292.444,10.000},
				{1628.428,298.538,10.000},
				{1658.893,304.652,10.000},
				{1689.972,310.790,10.000},
				{1721.654,316.824,10.000},
				{1753.916,322.621,10.000},
				{1786.734,328.172,10.000},
				{1820.081,333.471,10.000},
				{1853.932,338.511,10.000},
				{1888.260,343.286,10.000},
				{1923.040,347.791,10.000},
				{1958.242,352.021,10.000},
				{1993.839,355.971,10.000},
				{2029.809,359.699,10.000},
				{2066.129,363.203,10.000},
				{2102.771,366.417,10.000},
				{2139.704,369.338,10.000},
				{2176.900,371.959,10.000},
				{2214.328,374.275,10.000},
				{2251.956,376.281,10.000},
				{2289.753,377.968,10.000},
				{2327.686,379.331,10.000},
				{2365.731,380.449,10.000},
				{2403.878,381.476,10.000},
				{2442.126,382.481,10.000},
				{2480.473,383.466,10.000},
				{2518.916,384.431,10.000},
				{2557.454,385.377,10.000},
				{2596.084,386.304,10.000},
				{2634.805,387.209,10.000},
				{2673.614,388.089,10.000},
				{2712.508,388.941,10.000},
				{2751.484,389.761,10.000},
				{2790.538,390.543,10.000},
				{2829.666,391.279,10.000},
				{2868.863,391.963,10.000},
				{2908.121,392.586,10.000},
				{2947.435,393.137,10.000},
				{2986.796,393.607,10.000},
				{3026.194,393.984,10.000},
				{3065.620,394.256,10.000},
				{3105.061,394.410,10.000},
				{3144.504,394.433,10.000},
				{3183.935,394.311,10.000},
				{3223.338,394.032,10.000},
				{3262.696,393.582,10.000},
				{3301.991,392.948,10.000},
				{3341.203,392.118,10.000},
				{3380.311,391.082,10.000},
				{3419.294,389.829,10.000},
				{3458.129,388.351,10.000},
				{3496.793,386.641,10.000},
				{3535.263,384.695,10.000},
				{3573.514,382.509,10.000},
				{3611.522,380.083,10.000},
				{3649.264,377.418,10.000},
				{3686.716,374.517,10.000},
				{3723.854,371.386,10.000},
				{3760.657,368.031,10.000},
				{3797.104,364.463,10.000},
				{3833.173,360.691,10.000},
				{3868.846,356.729,10.000},
				{3904.104,352.588,10.000},
				{3938.933,348.284,10.000},
				{3973.316,343.830,10.000},
				{4007.240,339.242,10.000},
				{4040.694,334.536,10.000},
				{4073.666,329.726,10.000},
				{4106.149,324.828,10.000},
				{4138.135,319.855,10.000},
				{4169.617,314.822,10.000},
				{4200.591,309.742,10.000},
				{4231.054,304.628,10.000},
				{4261.003,299.491,10.000},
				{4290.437,294.341,10.000},
				{4319.356,289.189,10.000},
				{4347.760,284.043,10.000},
				{4375.651,278.911,10.000},
				{4403.031,273.801,10.000},
				{4429.903,268.719,10.000},
				{4456.270,263.670,10.000},
				{4482.136,258.659,10.000},
				{4507.505,253.690,10.000},
				{4532.382,248.766,10.000},
				{4556.771,243.891,10.000},
				{4580.678,239.066,10.000},
				{4604.107,234.294,10.000},
				{4627.064,229.575,10.000},
				{4649.556,224.911,10.000},
				{4671.586,220.303,10.000},
				{4693.161,215.751,10.000},
				{4714.287,211.255,10.000},
				{4734.968,206.815,10.000},
				{4755.211,202.430,10.000},
				{4775.021,198.101,10.000},
				{4794.404,193.827,10.000},
				{4813.365,189.607,10.000},
				{4831.909,185.440,10.000},
				{4850.041,181.326,10.000},
				{4867.767,177.263,10.000},
				{4885.093,173.252,10.000},
				{4902.022,169.290,10.000},
				{4918.559,165.377,10.000},
				{4934.710,161.511,10.000},
				{4950.480,157.693,10.000},
				{4965.872,153.920,10.000},
				{4980.891,150.192,10.000},
				{4995.542,146.509,10.000},
				{5009.829,142.868,10.000},
				{5023.755,139.269,10.000},
				{5037.326,135.711,10.000},
				{5050.546,132.193,10.000},
				{5063.417,128.714,10.000},
				{5075.945,125.274,10.000},
				{5088.132,121.871,10.000},
				{5099.982,118.505,10.000},
				{5111.500,115.174,10.000},
				{5122.687,111.879,10.000},
				{5133.549,108.617,10.000},
				{5144.088,105.389,10.000},
				{5154.307,102.194,10.000},
				{5164.210,99.030,10.000},
				{5173.800,95.898,10.000},
				{5183.080,92.796,10.000},
				{5192.052,89.723,10.000},
				{5200.720,86.680,10.000},
				{5209.087,83.665,10.000},
				{5217.154,80.677,10.000},
				{5224.926,77.715,10.000},
				{5232.404,74.780,10.000},
				{5239.591,71.870,10.000},
				{5246.489,68.984,10.000},
				{5253.101,66.122,10.000},
				{5259.430,63.283,10.000},
				{5265.476,60.466,10.000},
				{5271.243,57.671,10.000},
				{5276.733,54.896,10.000},
				{5281.947,52.140,10.000},
				{5286.887,49.404,10.000},
				{5291.556,46.686,10.000},
				{5295.954,43.985,10.000},
				{5300.085,41.301,10.000},
				{5303.948,38.632,10.000},
				{5307.545,35.977,10.000},
				{5310.879,33.337,10.000},
				{5313.950,30.709,10.000},
				{5316.759,28.093,10.000},
				{5319.308,25.488,10.000},
				{5321.598,22.893,10.000},
				{5323.628,20.307,10.000},
				{5325.401,17.729,10.000},
				{5326.917,15.159,10.000},
				{5328.176,12.594,10.000},
				{5329.188,10.115,10.000},
				{5329.974,7.862,10.000},
				{5330.564,5.895,10.000},
				{5330.985,4.213,10.000},
				{5331.266,2.815,10.000},
				{5331.437,1.702,10.000},
				{5331.524,0.872,10.000},
				{5331.556,0.325,10.000},
				{5331.562,0.061,10.000},
				{5331.562,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.014,0.283,10.000},
				{0.071,0.566,10.000},
				{0.198,1.274,10.000},
				{0.425,2.266,10.000},
				{0.779,3.541,10.000},
				{1.289,5.100,10.000},
				{1.983,6.944,10.000},
				{2.891,9.073,10.000},
				{4.039,11.489,10.000},
				{5.445,14.052,10.000},
				{7.107,16.620,10.000},
				{9.026,19.195,10.000},
				{11.204,21.777,10.000},
				{13.641,24.368,10.000},
				{16.337,26.968,10.000},
				{19.295,29.579,10.000},
				{22.515,32.202,10.000},
				{25.999,34.837,10.000},
				{29.748,37.485,10.000},
				{33.762,40.147,10.000},
				{38.045,42.825,10.000},
				{42.597,45.519,10.000},
				{47.420,48.229,10.000},
				{52.515,50.957,10.000},
				{57.886,53.704,10.000},
				{63.533,56.471,10.000},
				{69.459,59.257,10.000},
				{75.665,62.065,10.000},
				{82.155,64.894,10.000},
				{88.929,67.746,10.000},
				{95.991,70.622,10.000},
				{103.343,73.521,10.000},
				{110.988,76.445,10.000},
				{118.927,79.395,10.000},
				{127.165,82.372,10.000},
				{135.702,85.375,10.000},
				{144.543,88.406,10.000},
				{153.689,91.466,10.000},
				{163.145,94.555,10.000},
				{172.912,97.675,10.000},
				{182.995,100.825,10.000},
				{193.395,104.006,10.000},
				{204.117,107.220,10.000},
				{215.164,110.467,10.000},
				{226.539,113.747,10.000},
				{238.245,117.063,10.000},
				{250.286,120.413,10.000},
				{262.666,123.800,10.000},
				{275.389,127.224,10.000},
				{288.458,130.686,10.000},
				{301.876,134.187,10.000},
				{315.649,137.728,10.000},
				{329.780,141.309,10.000},
				{344.273,144.932,10.000},
				{359.133,148.597,10.000},
				{374.363,152.306,10.000},
				{389.969,156.059,10.000},
				{405.955,159.857,10.000},
				{422.325,163.702,10.000},
				{439.085,167.594,10.000},
				{456.238,171.535,10.000},
				{473.791,175.525,10.000},
				{491.747,179.566,10.000},
				{510.113,183.658,10.000},
				{528.893,187.802,10.000},
				{548.093,191.998,10.000},
				{567.718,196.249,10.000},
				{587.773,200.555,10.000},
				{608.265,204.915,10.000},
				{629.198,209.331,10.000},
				{650.578,213.803,10.000},
				{672.411,218.331,10.000},
				{694.703,222.915,10.000},
				{717.459,227.555,10.000},
				{740.684,232.250,10.000},
				{764.383,236.999,10.000},
				{788.564,241.802,10.000},
				{813.229,246.655,10.000},
				{838.385,251.559,10.000},
				{864.036,256.508,10.000},
				{890.186,261.502,10.000},
				{916.840,266.535,10.000},
				{944.000,271.604,10.000},
				{971.670,276.702,10.000},
				{999.853,281.826,10.000},
				{1028.549,286.966,10.000},
				{1057.761,292.117,10.000},
				{1087.488,297.269,10.000},
				{1117.729,302.413,10.000},
				{1148.483,307.538,10.000},
				{1179.746,312.635,10.000},
				{1211.515,317.690,10.000},
				{1243.784,322.690,10.000},
				{1276.547,327.622,10.000},
				{1309.794,332.472,10.000},
				{1343.516,337.225,10.000},
				{1377.703,341.866,10.000},
				{1412.341,346.380,10.000},
				{1447.416,350.751,10.000},
				{1482.913,354.964,10.000},
				{1518.813,359.005,10.000},
				{1555.099,362.861,10.000},
				{1591.751,366.519,10.000},
				{1628.748,369.967,10.000},
				{1666.067,373.196,10.000},
				{1703.687,376.197,10.000},
				{1741.583,378.965,10.000},
				{1779.733,381.494,10.000},
				{1818.111,383.784,10.000},
				{1856.695,385.833,10.000},
				{1895.459,387.645,10.000},
				{1934.381,389.222,10.000},
				{1973.438,390.571,10.000},
				{2012.608,391.700,10.000},
				{2051.870,392.618,10.000},
				{2091.204,393.335,10.000},
				{2130.590,393.863,10.000},
				{2170.011,394.214,10.000},
				{2209.452,394.402,10.000},
				{2248.896,394.440,10.000},
				{2288.330,394.341,10.000},
				{2327.742,394.119,10.000},
				{2367.120,393.786,10.000},
				{2406.456,393.355,10.000},
				{2445.739,392.837,10.000},
				{2484.964,392.244,10.000},
				{2524.122,391.585,10.000},
				{2563.209,390.870,10.000},
				{2602.220,390.107,10.000},
				{2641.150,389.303,10.000},
				{2679.997,388.464,10.000},
				{2718.756,387.595,10.000},
				{2757.426,386.701,10.000},
				{2796.005,385.783,10.000},
				{2834.489,384.845,10.000},
				{2872.878,383.888,10.000},
				{2911.169,382.911,10.000},
				{2949.360,381.915,10.000},
				{2987.450,380.898,10.000},
				{3025.436,379.857,10.000},
				{3063.300,378.637,10.000},
				{3101.008,377.088,10.000},
				{3138.530,375.218,10.000},
				{3175.834,373.034,10.000},
				{3212.888,370.543,10.000},
				{3249.663,367.750,10.000},
				{3286.129,364.661,10.000},
				{3322.257,361.281,10.000},
				{3358.018,357.613,10.000},
				{3393.391,353.724,10.000},
				{3428.352,349.615,10.000},
				{3462.875,345.229,10.000},
				{3496.932,340.571,10.000},
				{3530.497,335.645,10.000},
				{3563.543,330.458,10.000},
				{3596.044,325.016,10.000},
				{3627.977,319.324,10.000},
				{3659.316,313.392,10.000},
				{3690.046,307.299,10.000},
				{3720.163,301.175,10.000},
				{3749.671,295.073,10.000},
				{3778.570,288.991,10.000},
				{3806.862,282.928,10.000},
				{3834.551,276.884,10.000},
				{3861.637,270.861,10.000},
				{3888.123,264.859,10.000},
				{3914.011,258.881,10.000},
				{3939.304,252.931,10.000},
				{3964.005,247.014,10.000},
				{3988.119,241.135,10.000},
				{4011.649,235.301,10.000},
				{4034.601,229.520,10.000},
				{4056.981,223.800,10.000},
				{4078.796,218.151,10.000},
				{4100.055,212.584,10.000},
				{4120.766,207.110,10.000},
				{4140.940,201.741,10.000},
				{4160.589,196.490,10.000},
				{4179.726,191.370,10.000},
				{4198.365,186.394,10.000},
				{4216.523,181.576,10.000},
				{4234.216,176.929,10.000},
				{4251.462,172.466,10.000},
				{4268.282,168.198,10.000},
				{4284.696,164.137,10.000},
				{4300.725,160.293,10.000},
				{4316.392,156.674,10.000},
				{4331.721,153.286,10.000},
				{4346.735,150.136,10.000},
				{4361.457,147.224,10.000},
				{4375.912,144.553,10.000},
				{4390.125,142.122,10.000},
				{4404.117,139.926,10.000},
				{4417.913,137.960,10.000},
				{4431.535,136.218,10.000},
				{4445.004,134.689,10.000},
				{4458.340,133.364,10.000},
				{4471.563,132.230,10.000},
				{4484.691,131.274,10.000},
				{4497.739,130.481,10.000},
				{4510.723,129.838,10.000},
				{4523.656,129.329,10.000},
				{4536.549,128.939,10.000},
				{4549.415,128.652,10.000},
				{4562.260,128.453,10.000},
				{4575.093,128.329,10.000},
				{4587.919,128.265,10.000},
				{4600.744,128.248,10.000},
				{4613.571,128.266,10.000},
				{4626.401,128.307,10.000},
				{4639.237,128.359,10.000},
				{4652.079,128.415,10.000},
				{4664.925,128.464,10.000},
				{4677.775,128.498,10.000},
				{4690.626,128.511,10.000},
				{4703.476,128.497,10.000},
				{4716.321,128.449,10.000},
				{4729.157,128.363,10.000},
				{4741.981,128.235,10.000},
				{4754.787,128.062,10.000},
				{4767.571,127.841,10.000},
				{4780.328,127.568,10.000},
				{4793.052,127.244,10.000},
				{4805.739,126.865,10.000},
				{4818.382,126.432,10.000},
				{4830.976,125.943,10.000},
				{4843.516,125.399,10.000},
				{4855.996,124.798,10.000},
				{4868.410,124.141,10.000},
				{4880.753,123.429,10.000},
				{4893.019,122.661,10.000},
				{4905.203,121.838,10.000},
				{4917.299,120.961,10.000},
				{4929.302,120.031,10.000},
				{4941.207,119.048,10.000},
				{4953.008,118.014,10.000},
				{4964.701,116.928,10.000},
				{4976.280,115.793,10.000},
				{4987.741,114.609,10.000},
				{4999.079,113.378,10.000},
				{5010.289,112.099,10.000},
				{5021.366,110.775,10.000},
				{5032.307,109.405,10.000},
				{5043.106,107.992,10.000},
				{5053.760,106.536,10.000},
				{5064.263,105.038,10.000},
				{5074.613,103.499,10.000},
				{5084.805,101.920,10.000},
				{5094.836,100.302,10.000},
				{5104.700,98.645,10.000},
				{5114.395,96.951,10.000},
				{5123.917,95.220,10.000},
				{5133.262,93.454,10.000},
				{5142.428,91.652,10.000},
				{5151.409,89.816,10.000},
				{5160.204,87.947,10.000},
				{5168.809,86.046,10.000},
				{5177.220,84.112,10.000},
				{5185.435,82.147,10.000},
				{5193.450,80.152,10.000},
				{5201.263,78.128,10.000},
				{5208.870,76.074,10.000},
				{5216.269,73.993,10.000},
				{5223.458,71.884,10.000},
				{5230.432,69.748,10.000},
				{5237.191,67.586,10.000},
				{5243.731,65.399,10.000},
				{5250.050,63.188,10.000},
				{5256.145,60.953,10.000},
				{5262.015,58.695,10.000},
				{5267.656,56.415,10.000},
				{5273.067,54.113,10.000},
				{5278.247,51.791,10.000},
				{5283.192,49.450,10.000},
				{5287.900,47.089,10.000},
				{5292.371,44.710,10.000},
				{5296.603,42.314,10.000},
				{5300.593,39.901,10.000},
				{5304.340,37.473,10.000},
				{5307.843,35.030,10.000},
				{5311.101,32.574,10.000},
				{5314.111,30.104,10.000},
				{5316.873,27.623,10.000},
				{5319.386,25.131,10.000},
				{5321.649,22.629,10.000},
				{5323.661,20.118,10.000},
				{5325.421,17.599,10.000},
				{5326.928,15.073,10.000},
				{5328.182,12.541,10.000},
				{5329.191,10.084,10.000},
				{5329.975,7.845,10.000},
				{5330.564,5.887,10.000},
				{5330.985,4.209,10.000},
				{5331.266,2.814,10.000},
				{5331.437,1.701,10.000},
				{5331.524,0.872,10.000},
				{5331.556,0.325,10.000},
				{5331.562,0.061,10.000},
				{5331.562,0.000,10.000}
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