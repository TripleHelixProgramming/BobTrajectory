package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterSwitch extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.38,13.50,0.00)
	// (10.42,18.50,0.00)
	
    public CenterSwitch() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterSwitch(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.122,2.439,10.000,0.000},
				{0.488,4.877,10.000,0.000},
				{1.097,7.316,10.000,0.000},
				{1.951,9.754,10.000,0.000},
				{3.048,12.193,10.000,0.000},
				{4.389,14.631,10.000,0.000},
				{5.974,17.070,10.000,0.001},
				{7.803,19.508,10.000,0.001},
				{9.876,21.947,10.000,0.002},
				{12.193,24.385,10.000,0.003},
				{14.753,26.824,10.000,0.005},
				{17.557,29.262,10.000,0.007},
				{20.605,31.701,10.000,0.009},
				{23.897,34.139,10.000,0.012},
				{27.433,36.578,10.000,0.016},
				{31.213,39.016,10.000,0.021},
				{35.236,41.455,10.000,0.027},
				{39.504,43.893,10.000,0.034},
				{44.015,46.332,10.000,0.042},
				{48.770,48.770,10.000,0.051},
				{53.769,51.209,10.000,0.062},
				{59.012,53.647,10.000,0.075},
				{64.499,56.086,10.000,0.089},
				{70.229,58.524,10.000,0.106},
				{76.203,60.963,10.000,0.124},
				{82.422,63.401,10.000,0.145},
				{88.884,65.840,10.000,0.169},
				{95.590,68.278,10.000,0.195},
				{102.539,70.717,10.000,0.223},
				{109.733,73.155,10.000,0.255},
				{117.170,75.594,10.000,0.291},
				{124.852,78.032,10.000,0.329},
				{132.777,80.471,10.000,0.372},
				{140.946,82.909,10.000,0.418},
				{149.359,85.348,10.000,0.468},
				{158.015,87.786,10.000,0.523},
				{166.916,90.225,10.000,0.582},
				{176.060,92.663,10.000,0.646},
				{185.449,95.102,10.000,0.715},
				{195.081,97.540,10.000,0.790},
				{204.957,99.979,10.000,0.870},
				{215.076,102.417,10.000,0.955},
				{225.440,104.856,10.000,1.047},
				{236.048,107.294,10.000,1.145},
				{246.899,109.733,10.000,1.250},
				{257.994,112.171,10.000,1.362},
				{269.333,114.610,10.000,1.481},
				{280.916,117.048,10.000,1.607},
				{292.743,119.487,10.000,1.741},
				{304.814,121.925,10.000,1.884},
				{317.128,124.364,10.000,2.034},
				{329.686,126.802,10.000,2.193},
				{342.489,129.241,10.000,2.362},
				{355.535,131.679,10.000,2.539},
				{368.824,134.118,10.000,2.727},
				{382.358,136.556,10.000,2.924},
				{396.136,138.995,10.000,3.132},
				{410.157,141.433,10.000,3.350},
				{424.422,143.872,10.000,3.580},
				{438.932,146.311,10.000,3.820},
				{453.684,148.749,10.000,4.073},
				{468.681,151.188,10.000,4.338},
				{483.922,153.626,10.000,4.615},
				{499.407,156.065,10.000,4.905},
				{515.135,158.503,10.000,5.209},
				{531.107,160.942,10.000,5.526},
				{547.323,163.380,10.000,5.857},
				{563.783,165.819,10.000,6.202},
				{580.487,168.257,10.000,6.563},
				{597.435,170.696,10.000,6.938},
				{614.626,173.134,10.000,7.329},
				{632.061,175.573,10.000,7.736},
				{649.741,178.011,10.000,8.159},
				{667.664,180.450,10.000,8.599},
				{685.830,182.888,10.000,9.056},
				{704.241,185.327,10.000,9.530},
				{722.896,187.765,10.000,10.021},
				{741.794,190.204,10.000,10.531},
				{760.937,192.642,10.000,11.058},
				{780.323,195.081,10.000,11.604},
				{799.953,197.519,10.000,12.169},
				{819.827,199.958,10.000,12.752},
				{839.944,202.396,10.000,13.354},
				{860.306,204.835,10.000,13.975},
				{880.911,207.273,10.000,14.614},
				{901.760,209.712,10.000,15.273},
				{922.853,212.150,10.000,15.950},
				{944.190,214.589,10.000,16.646},
				{965.771,217.027,10.000,17.360},
				{987.596,219.466,10.000,18.092},
				{1009.664,221.904,10.000,18.841},
				{1031.977,224.343,10.000,19.608},
				{1054.533,226.781,10.000,20.391},
				{1077.333,229.220,10.000,21.190},
				{1100.377,231.658,10.000,22.004},
				{1123.665,234.097,10.000,22.833},
				{1147.196,236.535,10.000,23.674},
				{1170.972,238.974,10.000,24.528},
				{1194.991,241.412,10.000,25.393},
				{1219.254,243.851,10.000,26.268},
				{1243.761,246.289,10.000,27.151},
				{1268.512,248.728,10.000,28.041},
				{1293.507,251.166,10.000,28.937},
				{1318.745,253.605,10.000,29.838},
				{1344.228,256.043,10.000,30.741},
				{1369.954,258.482,10.000,31.645},
				{1395.924,260.920,10.000,32.548},
				{1422.138,263.359,10.000,33.450},
				{1448.596,265.797,10.000,34.347},
				{1475.298,268.236,10.000,35.240},
				{1502.243,270.674,10.000,36.125},
				{1529.432,273.113,10.000,37.002},
				{1556.866,275.551,10.000,37.868},
				{1584.543,277.990,10.000,38.723},
				{1612.464,280.428,10.000,39.566},
				{1640.628,282.867,10.000,40.393},
				{1669.037,285.305,10.000,41.206},
				{1697.690,287.744,10.000,42.001},
				{1726.586,290.182,10.000,42.779},
				{1755.726,292.621,10.000,43.538},
				{1785.110,295.060,10.000,44.277},
				{1814.738,297.498,10.000,44.995},
				{1844.610,299.937,10.000,45.691},
				{1874.725,302.375,10.000,46.366},
				{1905.085,304.814,10.000,47.017},
				{1935.688,307.252,10.000,47.645},
				{1966.535,309.691,10.000,48.249},
				{1997.626,312.129,10.000,48.828},
				{2028.961,314.568,10.000,49.382},
				{2060.540,317.006,10.000,49.911},
				{2092.362,319.445,10.000,50.414},
				{2124.428,321.883,10.000,50.891},
				{2156.739,324.322,10.000,51.342},
				{2189.293,326.760,10.000,51.766},
				{2222.091,329.199,10.000,52.164},
				{2255.133,331.637,10.000,52.534},
				{2288.418,334.076,10.000,52.877},
				{2321.948,336.514,10.000,53.192},
				{2355.721,338.953,10.000,53.480},
				{2389.738,341.391,10.000,53.740},
				{2423.877,341.391,10.000,53.970},
				{2458.016,341.391,10.000,54.171},
				{2492.156,341.391,10.000,54.342},
				{2526.295,341.391,10.000,54.483},
				{2560.434,341.391,10.000,54.596},
				{2594.573,341.391,10.000,54.680},
				{2628.712,341.391,10.000,54.735},
				{2662.851,341.391,10.000,54.761},
				{2696.990,341.391,10.000,54.759},
				{2731.129,341.391,10.000,54.727},
				{2765.268,341.391,10.000,54.668},
				{2799.408,341.391,10.000,54.579},
				{2833.547,341.391,10.000,54.462},
				{2867.686,341.391,10.000,54.315},
				{2901.825,341.391,10.000,54.139},
				{2935.964,341.391,10.000,53.934},
				{2970.083,340.987,10.000,53.699},
				{3004.060,338.548,10.000,53.434},
				{3037.793,336.110,10.000,53.142},
				{3071.282,333.671,10.000,52.822},
				{3104.527,331.233,10.000,52.475},
				{3137.528,328.794,10.000,52.100},
				{3170.286,326.356,10.000,51.698},
				{3202.799,323.917,10.000,51.269},
				{3235.069,321.479,10.000,50.814},
				{3267.095,319.040,10.000,50.333},
				{3298.877,316.602,10.000,49.825},
				{3330.415,314.163,10.000,49.292},
				{3361.710,311.725,10.000,48.734},
				{3392.760,309.286,10.000,48.150},
				{3423.567,306.848,10.000,47.543},
				{3454.130,304.409,10.000,46.911},
				{3484.449,301.971,10.000,46.256},
				{3514.524,299.532,10.000,45.578},
				{3544.355,297.094,10.000,44.878},
				{3573.943,294.655,10.000,44.156},
				{3603.286,292.217,10.000,43.414},
				{3632.386,289.778,10.000,42.652},
				{3661.242,287.340,10.000,41.871},
				{3689.854,284.901,10.000,41.073},
				{3718.222,282.462,10.000,40.258},
				{3746.346,280.024,10.000,39.427},
				{3774.227,277.585,10.000,38.583},
				{3801.863,275.147,10.000,37.726},
				{3829.256,272.708,10.000,36.857},
				{3856.405,270.270,10.000,35.979},
				{3883.310,267.831,10.000,35.093},
				{3909.971,265.393,10.000,34.199},
				{3936.389,262.954,10.000,33.301},
				{3962.562,260.516,10.000,32.399},
				{3988.492,258.077,10.000,31.495},
				{4014.178,255.639,10.000,30.591},
				{4039.620,253.200,10.000,29.689},
				{4064.818,250.762,10.000,28.789},
				{4089.772,248.323,10.000,27.894},
				{4114.483,245.885,10.000,27.004},
				{4138.949,243.446,10.000,26.123},
				{4163.172,241.008,10.000,25.249},
				{4187.151,238.569,10.000,24.386},
				{4210.886,236.131,10.000,23.534},
				{4234.377,233.692,10.000,22.695},
				{4257.624,231.254,10.000,21.869},
				{4280.628,228.815,10.000,21.057},
				{4303.387,226.377,10.000,20.261},
				{4325.903,223.938,10.000,19.480},
				{4348.175,221.500,10.000,18.716},
				{4370.203,219.061,10.000,17.970},
				{4391.987,216.623,10.000,17.241},
				{4413.527,214.184,10.000,16.530},
				{4434.824,211.746,10.000,15.837},
				{4455.877,209.307,10.000,15.163},
				{4476.685,206.869,10.000,14.507},
				{4497.250,204.430,10.000,13.871},
				{4517.571,201.992,10.000,13.253},
				{4537.649,199.553,10.000,12.654},
				{4557.482,197.115,10.000,12.074},
				{4577.072,194.676,10.000,11.513},
				{4596.417,192.238,10.000,10.970},
				{4615.519,189.799,10.000,10.446},
				{4634.377,187.361,10.000,9.939},
				{4652.991,184.922,10.000,9.451},
				{4671.362,182.484,10.000,8.979},
				{4689.488,180.045,10.000,8.525},
				{4707.371,177.607,10.000,8.088},
				{4725.009,175.168,10.000,7.668},
				{4742.404,172.730,10.000,7.264},
				{4759.555,170.291,10.000,6.875},
				{4776.462,167.853,10.000,6.502},
				{4793.126,165.414,10.000,6.144},
				{4809.545,162.976,10.000,5.801},
				{4825.721,160.537,10.000,5.473},
				{4841.653,158.099,10.000,5.158},
				{4857.341,155.660,10.000,4.857},
				{4872.785,153.222,10.000,4.569},
				{4887.985,150.783,10.000,4.293},
				{4902.941,148.345,10.000,4.031},
				{4917.654,145.906,10.000,3.780},
				{4932.123,143.468,10.000,3.541},
				{4946.347,141.029,10.000,3.313},
				{4960.328,138.591,10.000,3.097},
				{4974.065,136.152,10.000,2.891},
				{4987.559,133.713,10.000,2.695},
				{5000.808,131.275,10.000,2.509},
				{5013.814,128.836,10.000,2.333},
				{5026.575,126.398,10.000,2.167},
				{5039.093,123.959,10.000,2.009},
				{5051.367,121.521,10.000,1.860},
				{5063.398,119.082,10.000,1.719},
				{5075.184,116.644,10.000,1.586},
				{5086.726,114.205,10.000,1.461},
				{5098.025,111.767,10.000,1.343},
				{5109.080,109.328,10.000,1.233},
				{5119.891,106.890,10.000,1.129},
				{5130.458,104.451,10.000,1.032},
				{5140.781,102.013,10.000,0.941},
				{5150.860,99.574,10.000,0.856},
				{5160.696,97.136,10.000,0.777},
				{5170.287,94.697,10.000,0.704},
				{5179.635,92.259,10.000,0.635},
				{5188.739,89.820,10.000,0.572},
				{5197.599,87.382,10.000,0.514},
				{5206.216,84.943,10.000,0.460},
				{5214.588,82.505,10.000,0.410},
				{5222.717,80.066,10.000,0.364},
				{5230.601,77.628,10.000,0.323},
				{5238.242,75.189,10.000,0.285},
				{5245.639,72.751,10.000,0.250},
				{5252.792,70.312,10.000,0.219},
				{5259.702,67.874,10.000,0.190},
				{5266.367,65.435,10.000,0.165},
				{5272.789,62.997,10.000,0.142},
				{5278.966,60.558,10.000,0.121},
				{5284.900,58.120,10.000,0.103},
				{5290.590,55.681,10.000,0.087},
				{5296.036,53.243,10.000,0.073},
				{5301.239,50.804,10.000,0.060},
				{5306.197,48.366,10.000,0.050},
				{5310.912,45.927,10.000,0.041},
				{5315.383,43.489,10.000,0.033},
				{5319.610,41.050,10.000,0.026},
				{5323.593,38.612,10.000,0.020},
				{5327.332,36.173,10.000,0.016},
				{5330.827,33.735,10.000,0.012},
				{5334.079,31.296,10.000,0.009},
				{5337.087,28.858,10.000,0.006},
				{5339.850,26.419,10.000,0.004},
				{5342.370,23.981,10.000,0.003},
				{5344.647,21.542,10.000,0.002},
				{5346.679,19.104,10.000,0.001},
				{5348.467,16.665,10.000,0.001},
				{5350.012,14.227,10.000,0.000},
				{5351.313,11.788,10.000,0.000},
				{5352.369,9.350,10.000,0.000},
				{5353.183,6.911,10.000,0.000},
				{5353.752,4.473,10.000,0.000},
				{5354.077,2.034,10.000,-0.000},
				{5354.179,0.000,10.000,-0.000}		};

}