package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.00,0.00)
	// (16.67,23.00,0.00)
	// (22.92,21.75,-25.00)
	
    public SameSideScaleArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideScaleArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.014,0.271,10.000,0.000},
				{0.068,0.813,10.000,0.000},
				{0.190,1.626,10.000,0.000},
				{0.406,2.709,10.000,0.000},
				{0.745,4.064,10.000,0.000},
				{1.233,5.690,10.000,0.000},
				{1.897,7.586,10.000,0.000},
				{2.764,9.754,10.000,0.000},
				{3.861,12.193,10.000,0.000},
				{5.202,14.631,10.000,0.000},
				{6.787,17.070,10.000,0.000},
				{8.616,19.508,10.000,0.000},
				{10.689,21.947,10.000,0.000},
				{13.005,24.385,10.000,0.000},
				{15.566,26.824,10.000,0.000},
				{18.370,29.262,10.000,0.000},
				{21.418,31.701,10.000,0.000},
				{24.710,34.139,10.000,0.000},
				{28.246,36.578,10.000,0.000},
				{32.026,39.016,10.000,0.000},
				{36.049,41.455,10.000,0.000},
				{40.317,43.893,10.000,0.000},
				{44.828,46.332,10.000,0.000},
				{49.583,48.770,10.000,0.000},
				{54.582,51.209,10.000,0.000},
				{59.825,53.647,10.000,0.000},
				{65.311,56.086,10.000,0.000},
				{71.042,58.524,10.000,0.000},
				{77.016,60.963,10.000,0.000},
				{83.234,63.401,10.000,0.000},
				{89.696,65.840,10.000,0.000},
				{96.402,68.278,10.000,0.000},
				{103.352,70.717,10.000,0.000},
				{110.546,73.155,10.000,0.000},
				{117.983,75.594,10.000,0.000},
				{125.664,78.032,10.000,0.000},
				{133.590,80.471,10.000,0.000},
				{141.759,82.909,10.000,0.000},
				{150.171,85.348,10.000,0.000},
				{158.828,87.786,10.000,0.000},
				{167.729,90.225,10.000,0.000},
				{176.873,92.663,10.000,0.000},
				{186.261,95.102,10.000,0.000},
				{195.894,97.540,10.000,0.000},
				{205.769,99.979,10.000,0.000},
				{215.889,102.417,10.000,0.000},
				{226.253,104.856,10.000,0.000},
				{236.860,107.294,10.000,0.000},
				{247.712,109.733,10.000,0.000},
				{258.807,112.171,10.000,0.000},
				{270.146,114.610,10.000,0.000},
				{281.729,117.048,10.000,0.000},
				{293.556,119.487,10.000,0.000},
				{305.626,121.925,10.000,0.000},
				{317.941,124.364,10.000,0.000},
				{330.499,126.802,10.000,0.000},
				{343.301,129.241,10.000,0.000},
				{356.347,131.679,10.000,0.000},
				{369.637,134.118,10.000,0.000},
				{383.171,136.556,10.000,0.000},
				{396.949,138.995,10.000,0.000},
				{410.970,141.433,10.000,0.000},
				{425.235,143.872,10.000,0.000},
				{439.744,146.311,10.000,0.000},
				{454.497,148.749,10.000,0.000},
				{469.494,151.188,10.000,0.000},
				{484.735,153.626,10.000,0.000},
				{500.219,156.065,10.000,0.000},
				{515.948,158.503,10.000,0.000},
				{531.920,160.942,10.000,0.000},
				{548.136,163.380,10.000,0.000},
				{564.596,165.819,10.000,0.000},
				{581.300,168.257,10.000,0.000},
				{598.247,170.696,10.000,0.000},
				{615.439,173.134,10.000,0.000},
				{632.874,175.573,10.000,0.000},
				{650.553,178.011,10.000,0.000},
				{668.476,180.450,10.000,0.000},
				{686.643,182.888,10.000,0.000},
				{705.054,185.327,10.000,0.000},
				{723.709,187.765,10.000,0.000},
				{742.607,190.204,10.000,0.000},
				{761.749,192.642,10.000,0.000},
				{781.136,195.081,10.000,0.000},
				{800.766,197.519,10.000,0.000},
				{820.639,199.958,10.000,0.000},
				{840.757,202.396,10.000,0.000},
				{861.119,204.835,10.000,0.000},
				{881.724,207.273,10.000,0.000},
				{902.573,209.712,10.000,0.000},
				{923.666,212.150,10.000,0.000},
				{945.003,214.589,10.000,0.000},
				{966.584,217.027,10.000,0.000},
				{988.409,219.466,10.000,0.000},
				{1010.477,221.904,10.000,0.000},
				{1032.790,224.343,10.000,0.000},
				{1055.346,226.781,10.000,0.000},
				{1078.146,229.220,10.000,0.000},
				{1101.190,231.658,10.000,0.000},
				{1124.477,234.097,10.000,0.000},
				{1148.009,236.535,10.000,0.000},
				{1171.785,238.974,10.000,0.000},
				{1195.804,241.412,10.000,0.000},
				{1220.067,243.851,10.000,0.000},
				{1244.574,246.289,10.000,0.000},
				{1269.325,248.728,10.000,0.000},
				{1294.320,251.166,10.000,0.000},
				{1319.558,253.605,10.000,0.000},
				{1345.041,256.043,10.000,0.000},
				{1370.767,258.482,10.000,0.000},
				{1396.737,260.920,10.000,0.000},
				{1422.951,263.359,10.000,0.000},
				{1449.409,265.797,10.000,0.000},
				{1476.110,268.236,10.000,0.000},
				{1503.056,270.674,10.000,0.000},
				{1530.245,273.113,10.000,0.000},
				{1557.679,275.551,10.000,0.000},
				{1585.356,277.990,10.000,0.000},
				{1613.276,280.428,10.000,0.000},
				{1641.441,282.867,10.000,0.000},
				{1669.850,285.305,10.000,0.000},
				{1698.502,287.744,10.000,0.000},
				{1727.399,290.182,10.000,0.000},
				{1756.539,292.621,10.000,0.000},
				{1785.923,295.060,10.000,0.000},
				{1815.551,297.498,10.000,0.000},
				{1845.422,299.937,10.000,0.000},
				{1875.538,302.375,10.000,0.000},
				{1905.898,304.814,10.000,0.000},
				{1936.501,307.252,10.000,0.000},
				{1967.348,309.691,10.000,0.000},
				{1998.439,312.129,10.000,0.000},
				{2029.774,314.568,10.000,0.000},
				{2061.352,317.006,10.000,0.000},
				{2093.175,319.445,10.000,0.000},
				{2125.241,321.883,10.000,0.000},
				{2157.552,324.322,10.000,0.000},
				{2190.106,326.760,10.000,0.000},
				{2222.904,329.199,10.000,0.000},
				{2255.945,331.637,10.000,0.000},
				{2289.231,334.076,10.000,0.000},
				{2322.761,336.514,10.000,0.000},
				{2356.534,338.953,10.000,0.000},
				{2390.551,341.391,10.000,0.000},
				{2424.812,343.830,10.000,0.000},
				{2459.317,346.268,10.000,0.000},
				{2494.066,348.707,10.000,0.000},
				{2529.058,351.145,10.000,0.000},
				{2564.295,353.584,10.000,0.000},
				{2599.775,356.022,10.000,0.000},
				{2635.499,358.461,10.000,0.000},
				{2671.467,360.899,10.000,0.000},
				{2707.679,363.338,10.000,0.000},
				{2744.135,365.776,10.000,0.000},
				{2780.834,368.215,10.000,0.000},
				{2817.778,370.653,10.000,0.000},
				{2854.965,373.092,10.000,0.000},
				{2892.396,375.530,10.000,0.000},
				{2930.071,377.969,10.000,0.000},
				{2967.990,380.407,10.000,0.000},
				{3006.152,382.846,10.000,0.000},
				{3044.559,385.284,10.000,0.000},
				{3083.209,387.723,10.000,0.000},
				{3122.104,390.161,10.000,0.000},
				{3161.242,392.600,10.000,0.000},
				{3200.624,395.038,10.000,0.000},
				{3240.249,397.477,10.000,0.000},
				{3280.119,399.915,10.000,0.000},
				{3320.232,402.354,10.000,0.000},
				{3360.590,404.792,10.000,0.000},
				{3401.191,407.231,10.000,0.000},
				{3442.036,409.669,10.000,0.000},
				{3483.125,412.108,10.000,0.000},
				{3524.457,414.546,10.000,0.000},
				{3566.034,416.985,10.000,0.000},
				{3607.854,419.423,10.000,0.000},
				{3649.919,421.862,10.000,0.000},
				{3692.227,424.300,10.000,0.000},
				{3734.779,426.739,10.000,0.000},
				{3777.575,429.177,10.000,0.000},
				{3820.614,431.616,10.000,0.000},
				{3863.898,434.054,10.000,0.000},
				{3907.425,436.493,10.000,0.000},
				{3951.196,438.932,10.000,0.000},
				{3995.211,441.370,10.000,0.000},
				{4039.470,443.809,10.000,0.000},
				{4083.973,446.247,10.000,0.000},
				{4128.720,448.686,10.000,0.000},
				{4173.710,451.124,10.000,0.000},
				{4218.945,453.563,10.000,0.000},
				{4264.423,456.001,10.000,0.000},
				{4310.145,458.440,10.000,0.000},
				{4356.111,460.878,10.000,0.000},
				{4402.320,463.317,10.000,0.000},
				{4448.774,465.755,10.000,0.000},
				{4495.471,468.194,10.000,0.000},
				{4542.413,470.632,10.000,0.000},
				{4589.598,473.071,10.000,0.000},
				{4637.027,475.509,10.000,0.000},
				{4684.700,477.948,10.000,0.000},
				{4732.603,480.115,10.000,0.000},
				{4780.709,482.012,10.000,0.000},
				{4828.992,483.637,10.000,0.000},
				{4877.423,484.992,10.000,0.000},
				{4925.977,486.076,10.000,0.000},
				{4974.625,486.889,10.000,0.000},
				{5023.341,487.431,10.000,0.000},
				{5072.097,487.702,10.000,0.000},
				{5120.868,487.702,10.000,0.000},
				{5169.638,487.702,10.000,0.000},
				{5218.408,487.702,10.000,0.000},
				{5267.178,487.702,10.000,0.000},
				{5315.948,487.702,10.000,0.000},
				{5364.718,487.702,10.000,0.000},
				{5413.487,487.679,10.000,0.000},
				{5462.241,487.385,10.000,0.000},
				{5510.951,486.820,10.000,0.000},
				{5559.591,485.984,10.000,0.000},
				{5608.134,484.878,10.000,0.000},
				{5656.553,483.500,10.000,0.000},
				{5704.821,481.851,10.000,0.000},
				{5752.910,479.932,10.000,0.000},
				{5800.793,477.741,10.000,0.000},
				{5848.446,475.303,10.000,0.000},
				{5895.854,472.864,10.000,0.000},
				{5943.018,470.426,10.000,0.000},
				{5989.939,467.987,10.000,0.000},
				{6036.616,465.549,10.000,0.000},
				{6083.049,463.110,10.000,0.000},
				{6129.238,460.672,10.000,0.000},
				{6175.183,458.233,10.000,0.000},
				{6220.884,455.795,10.000,0.000},
				{6266.342,453.356,10.000,0.000},
				{6311.556,450.918,10.000,0.000},
				{6356.526,448.479,10.000,0.000},
				{6401.251,446.041,10.000,0.000},
				{6445.734,443.602,10.000,0.000},
				{6489.972,441.164,10.000,0.000},
				{6533.966,438.725,10.000,0.000},
				{6577.717,436.287,10.000,0.000},
				{6621.224,433.848,10.000,0.000},
				{6664.487,431.410,10.000,0.000},
				{6707.506,428.971,10.000,0.000},
				{6750.281,426.532,10.000,0.000},
				{6792.812,424.094,10.000,0.000},
				{6835.100,421.655,10.000,0.000},
				{6877.143,419.217,10.000,0.000},
				{6918.943,416.778,10.000,0.000},
				{6960.499,414.340,10.000,0.000},
				{7001.811,411.901,10.000,0.000},
				{7042.879,409.463,10.000,0.000},
				{7083.703,407.024,10.000,0.000},
				{7124.284,404.586,10.000,0.000},
				{7164.621,402.147,10.000,0.000},
				{7204.713,399.709,10.000,0.000},
				{7244.562,397.270,10.000,0.000},
				{7284.168,394.832,10.000,0.000},
				{7323.529,392.393,10.000,0.000},
				{7362.646,389.955,10.000,-0.003},
				{7401.520,387.516,10.000,-0.016},
				{7440.150,385.078,10.000,-0.041},
				{7478.535,382.639,10.000,-0.078},
				{7516.677,380.201,10.000,-0.125},
				{7554.576,377.762,10.000,-0.185},
				{7592.230,375.324,10.000,-0.255},
				{7629.640,372.885,10.000,-0.337},
				{7666.807,370.447,10.000,-0.430},
				{7703.730,368.008,10.000,-0.534},
				{7740.409,365.570,10.000,-0.648},
				{7776.844,363.131,10.000,-0.774},
				{7813.035,360.693,10.000,-0.910},
				{7848.982,358.254,10.000,-1.057},
				{7884.686,355.816,10.000,-1.214},
				{7920.145,353.377,10.000,-1.381},
				{7955.361,350.939,10.000,-1.558},
				{7990.333,348.500,10.000,-1.745},
				{8025.061,346.062,10.000,-1.941},
				{8059.545,343.623,10.000,-2.146},
				{8093.786,341.185,10.000,-2.361},
				{8127.782,338.746,10.000,-2.584},
				{8161.535,336.308,10.000,-2.816},
				{8195.044,333.869,10.000,-3.055},
				{8228.309,331.431,10.000,-3.303},
				{8261.330,328.992,10.000,-3.559},
				{8294.107,326.554,10.000,-3.821},
				{8326.641,324.115,10.000,-4.091},
				{8358.930,321.677,10.000,-4.368},
				{8390.976,319.238,10.000,-4.650},
				{8422.778,316.800,10.000,-4.939},
				{8454.336,314.361,10.000,-5.234},
				{8485.650,311.923,10.000,-5.534},
				{8516.721,309.484,10.000,-5.839},
				{8547.547,307.046,10.000,-6.149},
				{8578.130,304.607,10.000,-6.464},
				{8608.468,302.169,10.000,-6.782},
				{8638.563,299.730,10.000,-7.104},
				{8668.414,297.292,10.000,-7.429},
				{8698.022,294.853,10.000,-7.758},
				{8727.385,292.415,10.000,-8.089},
				{8756.505,289.976,10.000,-8.422},
				{8785.380,287.538,10.000,-8.757},
				{8814.012,285.099,10.000,-9.094},
				{8842.400,282.660,10.000,-9.432},
				{8870.544,280.222,10.000,-9.771},
				{8898.444,277.783,10.000,-10.110},
				{8926.101,275.345,10.000,-10.449},
				{8953.513,272.906,10.000,-10.789},
				{8980.682,270.468,10.000,-11.128},
				{9007.607,268.029,10.000,-11.466},
				{9034.288,265.591,10.000,-11.803},
				{9060.725,263.152,10.000,-12.139},
				{9086.919,260.714,10.000,-12.473},
				{9112.868,258.275,10.000,-12.805},
				{9138.574,255.837,10.000,-13.135},
				{9164.035,253.398,10.000,-13.463},
				{9189.253,250.960,10.000,-13.787},
				{9214.227,248.521,10.000,-14.109},
				{9238.958,246.083,10.000,-14.428},
				{9263.444,243.644,10.000,-14.743},
				{9287.686,241.206,10.000,-15.054},
				{9311.685,238.767,10.000,-15.362},
				{9335.440,236.329,10.000,-15.665},
				{9358.951,233.890,10.000,-15.965},
				{9382.218,231.452,10.000,-16.260},
				{9405.241,229.013,10.000,-16.550},
				{9428.021,226.575,10.000,-16.836},
				{9450.556,224.136,10.000,-17.117},
				{9472.848,221.698,10.000,-17.393},
				{9494.896,219.259,10.000,-17.664},
				{9516.700,216.821,10.000,-17.929},
				{9538.260,214.382,10.000,-18.190},
				{9559.576,211.944,10.000,-18.445},
				{9580.649,209.505,10.000,-18.695},
				{9601.477,207.067,10.000,-18.939},
				{9622.062,204.628,10.000,-19.178},
				{9642.403,202.190,10.000,-19.411},
				{9662.500,199.751,10.000,-19.639},
				{9682.353,197.313,10.000,-19.861},
				{9701.962,194.874,10.000,-20.077},
				{9721.328,192.436,10.000,-20.288},
				{9740.450,189.997,10.000,-20.493},
				{9759.327,187.559,10.000,-20.693},
				{9777.961,185.120,10.000,-20.887},
				{9796.351,182.682,10.000,-21.075},
				{9814.498,180.243,10.000,-21.258},
				{9832.400,177.805,10.000,-21.435},
				{9850.059,175.366,10.000,-21.606},
				{9867.473,172.928,10.000,-21.773},
				{9884.644,170.489,10.000,-21.933},
				{9901.571,168.051,10.000,-22.089},
				{9918.254,165.612,10.000,-22.239},
				{9934.694,163.174,10.000,-22.384},
				{9950.889,160.735,10.000,-22.523},
				{9966.841,158.297,10.000,-22.658},
				{9982.548,155.858,10.000,-22.787},
				{9998.012,153.420,10.000,-22.912},
				{10013.232,150.981,10.000,-23.031},
				{10028.208,148.543,10.000,-23.146},
				{10042.941,146.104,10.000,-23.257},
				{10057.429,143.666,10.000,-23.362},
				{10071.674,141.227,10.000,-23.463},
				{10085.675,138.789,10.000,-23.560},
				{10099.431,136.350,10.000,-23.652},
				{10112.945,133.911,10.000,-23.740},
				{10126.214,131.473,10.000,-23.824},
				{10139.239,129.034,10.000,-23.904},
				{10152.021,126.596,10.000,-23.980},
				{10164.558,124.157,10.000,-24.053},
				{10176.852,121.719,10.000,-24.121},
				{10188.902,119.280,10.000,-24.186},
				{10200.708,116.842,10.000,-24.248},
				{10212.271,114.403,10.000,-24.306},
				{10223.589,111.965,10.000,-24.361},
				{10234.664,109.526,10.000,-24.412},
				{10245.494,107.088,10.000,-24.461},
				{10256.081,104.649,10.000,-24.506},
				{10266.424,102.211,10.000,-24.549},
				{10276.523,99.772,10.000,-24.589},
				{10286.379,97.334,10.000,-24.626},
				{10295.990,94.895,10.000,-24.661},
				{10305.358,92.457,10.000,-24.694},
				{10314.481,90.018,10.000,-24.724},
				{10323.361,87.580,10.000,-24.752},
				{10331.997,85.141,10.000,-24.777},
				{10340.390,82.703,10.000,-24.801},
				{10348.538,80.264,10.000,-24.823},
				{10356.442,77.826,10.000,-24.843},
				{10364.103,75.387,10.000,-24.861},
				{10371.520,72.949,10.000,-24.878},
				{10378.693,70.510,10.000,-24.893},
				{10385.622,68.072,10.000,-24.907},
				{10392.307,65.633,10.000,-24.919},
				{10398.749,63.195,10.000,-24.930},
				{10404.946,60.756,10.000,-24.940},
				{10410.900,58.318,10.000,-24.949},
				{10416.610,55.879,10.000,-24.957},
				{10422.076,53.441,10.000,-24.964},
				{10427.298,51.002,10.000,-24.970},
				{10432.276,48.564,10.000,-24.975},
				{10437.011,46.125,10.000,-24.980},
				{10441.501,43.687,10.000,-24.983},
				{10445.748,41.248,10.000,-24.987},
				{10449.751,38.810,10.000,-24.990},
				{10453.510,36.371,10.000,-24.992},
				{10457.025,33.933,10.000,-24.994},
				{10460.296,31.494,10.000,-24.995},
				{10463.324,29.056,10.000,-24.997},
				{10466.107,26.617,10.000,-24.998},
				{10468.647,24.179,10.000,-24.998},
				{10470.943,21.740,10.000,-24.999},
				{10472.995,19.302,10.000,-24.999},
				{10474.804,16.863,10.000,-25.000},
				{10476.368,14.425,10.000,-25.000},
				{10477.688,11.986,10.000,-25.000},
				{10478.766,9.570,10.000,-25.000},
				{10479.616,7.426,10.000,-25.000},
				{10480.265,5.552,10.000,-25.000},
				{10480.740,3.949,10.000,-25.000},
				{10481.068,2.618,10.000,-25.000},
				{10481.277,1.557,10.000,-25.000},
				{10481.393,0.767,10.000,-25.000},
				{10481.444,0.248,10.000,-25.000},
				{10481.456,0.000,10.000,-25.000},
				{10481.456,0.000,10.000,-25.000}		};

}