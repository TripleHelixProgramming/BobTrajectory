package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScale extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.00,0.00)
	// (16.67,23.00,0.00)
	// (22.92,21.75,-25.00)
	
	public SameSideScale() {
		this(false);
	}
			
    public SameSideScale(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.014,0.271,10.000},
				{0.068,0.542,10.000},
				{0.190,1.219,10.000},
				{0.406,2.168,10.000},
				{0.745,3.387,10.000},
				{1.233,4.877,10.000},
				{1.897,6.638,10.000},
				{2.764,8.670,10.000},
				{3.861,10.973,10.000},
				{5.202,13.412,10.000},
				{6.787,15.850,10.000},
				{8.616,18.289,10.000},
				{10.689,20.727,10.000},
				{13.005,23.166,10.000},
				{15.566,25.604,10.000},
				{18.370,28.043,10.000},
				{21.418,30.481,10.000},
				{24.710,32.920,10.000},
				{28.246,35.358,10.000},
				{32.026,37.797,10.000},
				{36.049,40.235,10.000},
				{40.317,42.674,10.000},
				{44.828,45.112,10.000},
				{49.583,47.551,10.000},
				{54.582,49.989,10.000},
				{59.825,52.428,10.000},
				{65.311,54.866,10.000},
				{71.042,57.305,10.000},
				{77.016,59.743,10.000},
				{83.234,62.182,10.000},
				{89.696,64.620,10.000},
				{96.402,67.059,10.000},
				{103.352,69.497,10.000},
				{110.546,71.936,10.000},
				{117.983,74.375,10.000},
				{125.664,76.813,10.000},
				{133.590,79.252,10.000},
				{141.759,81.690,10.000},
				{150.171,84.129,10.000},
				{158.828,86.567,10.000},
				{167.729,89.006,10.000},
				{176.873,91.444,10.000},
				{186.261,93.883,10.000},
				{195.894,96.321,10.000},
				{205.769,98.760,10.000},
				{215.889,101.198,10.000},
				{226.253,103.637,10.000},
				{236.860,106.075,10.000},
				{247.712,108.514,10.000},
				{258.807,110.952,10.000},
				{270.146,113.391,10.000},
				{281.729,115.829,10.000},
				{293.556,118.268,10.000},
				{305.626,120.706,10.000},
				{317.941,123.145,10.000},
				{330.499,125.583,10.000},
				{343.301,128.022,10.000},
				{356.347,130.460,10.000},
				{369.637,132.899,10.000},
				{383.171,135.337,10.000},
				{396.949,137.776,10.000},
				{410.970,140.214,10.000},
				{425.235,142.653,10.000},
				{439.744,145.091,10.000},
				{454.497,147.530,10.000},
				{469.494,149.968,10.000},
				{484.735,152.407,10.000},
				{500.219,154.845,10.000},
				{515.948,157.284,10.000},
				{531.920,159.722,10.000},
				{548.136,162.161,10.000},
				{564.596,164.599,10.000},
				{581.300,167.038,10.000},
				{598.247,169.476,10.000},
				{615.439,171.915,10.000},
				{632.874,174.353,10.000},
				{650.553,176.792,10.000},
				{668.476,179.230,10.000},
				{686.643,181.669,10.000},
				{705.054,184.107,10.000},
				{723.709,186.546,10.000},
				{742.607,188.984,10.000},
				{761.749,191.423,10.000},
				{781.136,193.861,10.000},
				{800.766,196.300,10.000},
				{820.639,198.738,10.000},
				{840.757,201.177,10.000},
				{861.119,203.615,10.000},
				{881.724,206.054,10.000},
				{902.573,208.492,10.000},
				{923.666,210.931,10.000},
				{945.003,213.369,10.000},
				{966.584,215.808,10.000},
				{988.409,218.246,10.000},
				{1010.477,220.685,10.000},
				{1032.790,223.124,10.000},
				{1055.346,225.562,10.000},
				{1078.146,228.001,10.000},
				{1101.190,230.439,10.000},
				{1124.477,232.878,10.000},
				{1148.009,235.316,10.000},
				{1171.785,237.755,10.000},
				{1195.804,240.193,10.000},
				{1220.067,242.632,10.000},
				{1244.574,245.070,10.000},
				{1269.325,247.509,10.000},
				{1294.320,249.947,10.000},
				{1319.558,252.386,10.000},
				{1345.041,254.824,10.000},
				{1370.767,257.263,10.000},
				{1396.737,259.701,10.000},
				{1422.951,262.140,10.000},
				{1449.409,264.578,10.000},
				{1476.110,267.017,10.000},
				{1503.056,269.455,10.000},
				{1530.245,271.894,10.000},
				{1557.679,274.332,10.000},
				{1585.356,276.771,10.000},
				{1613.276,279.209,10.000},
				{1641.441,281.648,10.000},
				{1669.850,284.086,10.000},
				{1698.502,286.525,10.000},
				{1727.399,288.963,10.000},
				{1756.539,291.402,10.000},
				{1785.923,293.840,10.000},
				{1815.551,296.279,10.000},
				{1845.422,298.717,10.000},
				{1875.538,301.156,10.000},
				{1905.898,303.594,10.000},
				{1936.501,306.033,10.000},
				{1967.348,308.471,10.000},
				{1998.439,310.910,10.000},
				{2029.774,313.348,10.000},
				{2061.352,315.787,10.000},
				{2093.175,318.225,10.000},
				{2125.241,320.664,10.000},
				{2157.552,323.102,10.000},
				{2190.106,325.541,10.000},
				{2222.904,327.979,10.000},
				{2255.945,330.418,10.000},
				{2289.231,332.856,10.000},
				{2322.761,335.295,10.000},
				{2356.534,337.733,10.000},
				{2390.551,340.172,10.000},
				{2424.812,342.610,10.000},
				{2459.317,345.049,10.000},
				{2494.066,347.487,10.000},
				{2529.058,349.926,10.000},
				{2564.295,352.364,10.000},
				{2599.775,354.803,10.000},
				{2635.499,357.241,10.000},
				{2671.467,359.680,10.000},
				{2707.679,362.118,10.000},
				{2744.135,364.557,10.000},
				{2780.834,366.996,10.000},
				{2817.778,369.434,10.000},
				{2854.965,371.873,10.000},
				{2892.396,374.311,10.000},
				{2930.071,376.750,10.000},
				{2967.990,379.188,10.000},
				{3006.152,381.627,10.000},
				{3044.559,384.065,10.000},
				{3083.209,386.504,10.000},
				{3122.104,388.942,10.000},
				{3161.242,391.381,10.000},
				{3200.624,393.819,10.000},
				{3240.249,396.258,10.000},
				{3280.119,398.696,10.000},
				{3320.232,401.135,10.000},
				{3360.590,403.573,10.000},
				{3401.191,406.012,10.000},
				{3442.036,408.450,10.000},
				{3483.125,410.889,10.000},
				{3524.457,413.327,10.000},
				{3566.034,415.766,10.000},
				{3607.854,418.204,10.000},
				{3649.919,420.643,10.000},
				{3692.227,423.081,10.000},
				{3734.779,425.520,10.000},
				{3777.575,427.958,10.000},
				{3820.614,430.397,10.000},
				{3863.898,432.835,10.000},
				{3907.425,435.274,10.000},
				{3951.196,437.712,10.000},
				{3995.211,440.151,10.000},
				{4039.470,442.589,10.000},
				{4083.973,445.028,10.000},
				{4128.720,447.466,10.000},
				{4173.710,449.905,10.000},
				{4218.945,452.343,10.000},
				{4264.423,454.782,10.000},
				{4310.145,457.220,10.000},
				{4356.111,459.659,10.000},
				{4402.320,462.097,10.000},
				{4448.774,464.536,10.000},
				{4495.471,466.974,10.000},
				{4542.413,469.413,10.000},
				{4589.598,471.851,10.000},
				{4637.027,474.290,10.000},
				{4684.700,476.728,10.000},
				{4732.603,479.031,10.000},
				{4780.709,481.064,10.000},
				{4828.992,482.825,10.000},
				{4877.423,484.315,10.000},
				{4925.977,485.534,10.000},
				{4974.625,486.482,10.000},
				{5023.341,487.160,10.000},
				{5072.097,487.566,10.000},
				{5120.868,487.702,10.000},
				{5169.638,487.702,10.000},
				{5218.408,487.702,10.000},
				{5267.178,487.702,10.000},
				{5315.948,487.702,10.000},
				{5364.718,487.702,10.000},
				{5413.487,487.690,10.000},
				{5462.241,487.532,10.000},
				{5510.951,487.102,10.000},
				{5559.591,486.402,10.000},
				{5608.134,485.431,10.000},
				{5656.553,484.189,10.000},
				{5704.821,482.676,10.000},
				{5752.910,480.891,10.000},
				{5800.793,478.836,10.000},
				{5848.446,476.522,10.000},
				{5895.854,474.083,10.000},
				{5943.018,471.645,10.000},
				{5989.939,469.206,10.000},
				{6036.616,466.768,10.000},
				{6083.049,464.329,10.000},
				{6129.238,461.891,10.000},
				{6175.183,459.452,10.000},
				{6220.884,457.014,10.000},
				{6266.342,454.575,10.000},
				{6311.556,452.137,10.000},
				{6356.526,449.698,10.000},
				{6401.251,447.260,10.000},
				{6445.734,444.821,10.000},
				{6489.972,442.383,10.000},
				{6533.966,439.944,10.000},
				{6577.717,437.506,10.000},
				{6621.224,435.067,10.000},
				{6664.487,432.629,10.000},
				{6707.506,430.190,10.000},
				{6750.281,427.752,10.000},
				{6792.812,425.313,10.000},
				{6835.100,422.875,10.000},
				{6877.143,420.436,10.000},
				{6918.943,417.998,10.000},
				{6960.499,415.559,10.000},
				{7001.811,413.121,10.000},
				{7042.879,410.682,10.000},
				{7083.703,408.244,10.000},
				{7124.284,405.805,10.000},
				{7164.621,403.367,10.000},
				{7204.713,400.928,10.000},
				{7244.562,398.490,10.000},
				{7284.168,396.051,10.000},
				{7323.529,393.613,10.000},
				{7362.673,391.440,10.000},
				{7401.681,390.079,10.000},
				{7440.558,388.776,10.000},
				{7479.306,387.472,10.000},
				{7517.922,386.167,10.000},
				{7556.408,384.858,10.000},
				{7594.762,383.543,10.000},
				{7632.984,382.221,10.000},
				{7671.073,380.889,10.000},
				{7709.028,379.547,10.000},
				{7746.847,378.193,10.000},
				{7784.530,376.825,10.000},
				{7822.074,375.442,10.000},
				{7859.478,374.043,10.000},
				{7896.741,372.627,10.000},
				{7933.860,371.192,10.000},
				{7970.834,369.736,10.000},
				{8007.660,368.260,10.000},
				{8044.336,366.762,10.000},
				{8080.860,365.241,10.000},
				{8117.230,363.696,10.000},
				{8153.442,362.125,10.000},
				{8189.495,360.528,10.000},
				{8225.386,358.905,10.000},
				{8261.111,357.253,10.000},
				{8296.668,355.573,10.000},
				{8332.055,353.863,10.000},
				{8367.267,352.123,10.000},
				{8402.302,350.352,10.000},
				{8437.157,348.550,10.000},
				{8471.829,346.715,10.000},
				{8506.313,344.847,10.000},
				{8540.608,342.947,10.000},
				{8574.709,341.012,10.000},
				{8608.614,339.043,10.000},
				{8642.318,337.040,10.000},
				{8675.818,335.002,10.000},
				{8709.111,332.929,10.000},
				{8742.193,330.821,10.000},
				{8775.061,328.678,10.000},
				{8807.711,326.500,10.000},
				{8840.139,324.287,10.000},
				{8872.343,322.038,10.000},
				{8904.319,319.756,10.000},
				{8936.063,317.438,10.000},
				{8967.571,315.087,10.000},
				{8998.841,312.702,10.000},
				{9029.870,310.283,10.000},
				{9060.653,307.833,10.000},
				{9091.188,305.350,10.000},
				{9121.472,302.836,10.000},
				{9151.501,300.291,10.000},
				{9181.272,297.716,10.000},
				{9210.783,295.113,10.000},
				{9240.032,292.481,10.000},
				{9269.014,289.822,10.000},
				{9297.727,287.137,10.000},
				{9326.170,284.427,10.000},
				{9354.339,281.692,10.000},
				{9382.233,278.934,10.000},
				{9409.848,276.155,10.000},
				{9437.184,273.354,10.000},
				{9464.237,270.533,10.000},
				{9491.006,267.693,10.000},
				{9517.490,264.836,10.000},
				{9543.686,261.962,10.000},
				{9569.593,259.073,10.000},
				{9595.210,256.169,10.000},
				{9620.536,253.252,10.000},
				{9645.568,250.323,10.000},
				{9670.306,247.382,10.000},
				{9694.749,244.432,10.000},
				{9718.896,241.472,10.000},
				{9742.747,238.505,10.000},
				{9766.300,235.530,10.000},
				{9789.555,232.549,10.000},
				{9812.511,229.563,10.000},
				{9835.168,226.573,10.000},
				{9857.526,223.579,10.000},
				{9879.584,220.583,10.000},
				{9901.343,217.585,10.000},
				{9922.802,214.586,10.000},
				{9943.960,211.587,10.000},
				{9964.819,208.588,10.000},
				{9985.378,205.591,10.000},
				{10005.638,202.596,10.000},
				{10025.598,199.603,10.000},
				{10045.259,196.614,10.000},
				{10064.622,193.628,10.000},
				{10083.687,190.646,10.000},
				{10102.454,187.670,10.000},
				{10120.924,184.699,10.000},
				{10139.097,181.733,10.000},
				{10156.974,178.774,10.000},
				{10174.557,175.822,10.000},
				{10191.844,172.876,10.000},
				{10208.838,169.938,10.000},
				{10225.539,167.008,10.000},
				{10241.948,164.086,10.000},
				{10258.065,161.173,10.000},
				{10273.892,158.268,10.000},
				{10289.429,155.372,10.000},
				{10304.677,152.485,10.000},
				{10319.638,149.608,10.000},
				{10334.312,146.740,10.000},
				{10348.700,143.883,10.000},
				{10362.804,141.035,10.000},
				{10376.624,138.197,10.000},
				{10390.161,135.369,10.000},
				{10403.416,132.552,10.000},
				{10416.390,129.746,10.000},
				{10429.085,126.949,10.000},
				{10441.502,124.164,10.000},
				{10453.641,121.389,10.000},
				{10465.503,118.625,10.000},
				{10477.090,115.871,10.000},
				{10488.403,113.128,10.000},
				{10499.442,110.396,10.000},
				{10510.210,107.674,10.000},
				{10520.706,104.964,10.000},
				{10530.933,102.263,10.000},
				{10540.890,99.574,10.000},
				{10550.579,96.894,10.000},
				{10560.002,94.226,10.000},
				{10569.159,91.567,10.000},
				{10578.051,88.919,10.000},
				{10586.679,86.280,10.000},
				{10595.044,83.652,10.000},
				{10603.147,81.033,10.000},
				{10610.989,78.424,10.000},
				{10618.572,75.825,10.000},
				{10625.895,73.234,10.000},
				{10632.961,70.653,10.000},
				{10639.769,68.081,10.000},
				{10646.320,65.517,10.000},
				{10652.617,62.962,10.000},
				{10658.658,60.415,10.000},
				{10664.446,57.876,10.000},
				{10669.980,55.345,10.000},
				{10675.262,52.821,10.000},
				{10680.293,50.305,10.000},
				{10685.072,47.795,10.000},
				{10689.602,45.292,10.000},
				{10693.881,42.796,10.000},
				{10697.912,40.305,10.000},
				{10701.694,37.820,10.000},
				{10705.228,35.341,10.000},
				{10708.514,32.867,10.000},
				{10711.554,30.398,10.000},
				{10714.347,27.933,10.000},
				{10716.895,25.472,10.000},
				{10719.196,23.015,10.000},
				{10721.252,20.561,10.000},
				{10723.063,18.111,10.000},
				{10724.630,15.663,10.000},
				{10725.951,13.217,10.000},
				{10727.030,10.786,10.000},
				{10727.880,8.502,10.000},
				{10728.529,6.491,10.000},
				{10729.004,4.752,10.000},
				{10729.333,3.284,10.000},
				{10729.541,2.087,10.000},
				{10729.658,1.162,10.000},
				{10729.708,0.507,10.000},
				{10729.721,0.124,10.000},
				{10729.721,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.014,0.271,10.000},
				{0.068,0.542,10.000},
				{0.190,1.219,10.000},
				{0.406,2.168,10.000},
				{0.745,3.387,10.000},
				{1.233,4.877,10.000},
				{1.897,6.638,10.000},
				{2.764,8.670,10.000},
				{3.861,10.973,10.000},
				{5.202,13.412,10.000},
				{6.787,15.850,10.000},
				{8.616,18.289,10.000},
				{10.689,20.727,10.000},
				{13.005,23.166,10.000},
				{15.566,25.604,10.000},
				{18.370,28.043,10.000},
				{21.418,30.481,10.000},
				{24.710,32.920,10.000},
				{28.246,35.358,10.000},
				{32.026,37.797,10.000},
				{36.049,40.235,10.000},
				{40.317,42.674,10.000},
				{44.828,45.112,10.000},
				{49.583,47.551,10.000},
				{54.582,49.989,10.000},
				{59.825,52.428,10.000},
				{65.311,54.866,10.000},
				{71.042,57.305,10.000},
				{77.016,59.743,10.000},
				{83.234,62.182,10.000},
				{89.696,64.620,10.000},
				{96.402,67.059,10.000},
				{103.352,69.497,10.000},
				{110.546,71.936,10.000},
				{117.983,74.375,10.000},
				{125.664,76.813,10.000},
				{133.590,79.252,10.000},
				{141.759,81.690,10.000},
				{150.171,84.129,10.000},
				{158.828,86.567,10.000},
				{167.729,89.006,10.000},
				{176.873,91.444,10.000},
				{186.261,93.883,10.000},
				{195.894,96.321,10.000},
				{205.769,98.760,10.000},
				{215.889,101.198,10.000},
				{226.253,103.637,10.000},
				{236.860,106.075,10.000},
				{247.712,108.514,10.000},
				{258.807,110.952,10.000},
				{270.146,113.391,10.000},
				{281.729,115.829,10.000},
				{293.556,118.268,10.000},
				{305.626,120.706,10.000},
				{317.941,123.145,10.000},
				{330.499,125.583,10.000},
				{343.301,128.022,10.000},
				{356.347,130.460,10.000},
				{369.637,132.899,10.000},
				{383.171,135.337,10.000},
				{396.949,137.776,10.000},
				{410.970,140.214,10.000},
				{425.235,142.653,10.000},
				{439.744,145.091,10.000},
				{454.497,147.530,10.000},
				{469.494,149.968,10.000},
				{484.735,152.407,10.000},
				{500.219,154.845,10.000},
				{515.948,157.284,10.000},
				{531.920,159.722,10.000},
				{548.136,162.161,10.000},
				{564.596,164.599,10.000},
				{581.300,167.038,10.000},
				{598.247,169.476,10.000},
				{615.439,171.915,10.000},
				{632.874,174.353,10.000},
				{650.553,176.792,10.000},
				{668.476,179.230,10.000},
				{686.643,181.669,10.000},
				{705.054,184.107,10.000},
				{723.709,186.546,10.000},
				{742.607,188.984,10.000},
				{761.749,191.423,10.000},
				{781.136,193.861,10.000},
				{800.766,196.300,10.000},
				{820.639,198.738,10.000},
				{840.757,201.177,10.000},
				{861.119,203.615,10.000},
				{881.724,206.054,10.000},
				{902.573,208.492,10.000},
				{923.666,210.931,10.000},
				{945.003,213.369,10.000},
				{966.584,215.808,10.000},
				{988.409,218.246,10.000},
				{1010.477,220.685,10.000},
				{1032.790,223.124,10.000},
				{1055.346,225.562,10.000},
				{1078.146,228.001,10.000},
				{1101.190,230.439,10.000},
				{1124.477,232.878,10.000},
				{1148.009,235.316,10.000},
				{1171.785,237.755,10.000},
				{1195.804,240.193,10.000},
				{1220.067,242.632,10.000},
				{1244.574,245.070,10.000},
				{1269.325,247.509,10.000},
				{1294.320,249.947,10.000},
				{1319.558,252.386,10.000},
				{1345.041,254.824,10.000},
				{1370.767,257.263,10.000},
				{1396.737,259.701,10.000},
				{1422.951,262.140,10.000},
				{1449.409,264.578,10.000},
				{1476.110,267.017,10.000},
				{1503.056,269.455,10.000},
				{1530.245,271.894,10.000},
				{1557.679,274.332,10.000},
				{1585.356,276.771,10.000},
				{1613.276,279.209,10.000},
				{1641.441,281.648,10.000},
				{1669.850,284.086,10.000},
				{1698.502,286.525,10.000},
				{1727.399,288.963,10.000},
				{1756.539,291.402,10.000},
				{1785.923,293.840,10.000},
				{1815.551,296.279,10.000},
				{1845.422,298.717,10.000},
				{1875.538,301.156,10.000},
				{1905.898,303.594,10.000},
				{1936.501,306.033,10.000},
				{1967.348,308.471,10.000},
				{1998.439,310.910,10.000},
				{2029.774,313.348,10.000},
				{2061.352,315.787,10.000},
				{2093.175,318.225,10.000},
				{2125.241,320.664,10.000},
				{2157.552,323.102,10.000},
				{2190.106,325.541,10.000},
				{2222.904,327.979,10.000},
				{2255.945,330.418,10.000},
				{2289.231,332.856,10.000},
				{2322.761,335.295,10.000},
				{2356.534,337.733,10.000},
				{2390.551,340.172,10.000},
				{2424.812,342.610,10.000},
				{2459.317,345.049,10.000},
				{2494.066,347.487,10.000},
				{2529.058,349.926,10.000},
				{2564.295,352.364,10.000},
				{2599.775,354.803,10.000},
				{2635.499,357.241,10.000},
				{2671.467,359.680,10.000},
				{2707.679,362.118,10.000},
				{2744.135,364.557,10.000},
				{2780.834,366.996,10.000},
				{2817.778,369.434,10.000},
				{2854.965,371.873,10.000},
				{2892.396,374.311,10.000},
				{2930.071,376.750,10.000},
				{2967.990,379.188,10.000},
				{3006.152,381.627,10.000},
				{3044.559,384.065,10.000},
				{3083.209,386.504,10.000},
				{3122.104,388.942,10.000},
				{3161.242,391.381,10.000},
				{3200.624,393.819,10.000},
				{3240.249,396.258,10.000},
				{3280.119,398.696,10.000},
				{3320.232,401.135,10.000},
				{3360.590,403.573,10.000},
				{3401.191,406.012,10.000},
				{3442.036,408.450,10.000},
				{3483.125,410.889,10.000},
				{3524.457,413.327,10.000},
				{3566.034,415.766,10.000},
				{3607.854,418.204,10.000},
				{3649.919,420.643,10.000},
				{3692.227,423.081,10.000},
				{3734.779,425.520,10.000},
				{3777.575,427.958,10.000},
				{3820.614,430.397,10.000},
				{3863.898,432.835,10.000},
				{3907.425,435.274,10.000},
				{3951.196,437.712,10.000},
				{3995.211,440.151,10.000},
				{4039.470,442.589,10.000},
				{4083.973,445.028,10.000},
				{4128.720,447.466,10.000},
				{4173.710,449.905,10.000},
				{4218.945,452.343,10.000},
				{4264.423,454.782,10.000},
				{4310.145,457.220,10.000},
				{4356.111,459.659,10.000},
				{4402.320,462.097,10.000},
				{4448.774,464.536,10.000},
				{4495.471,466.974,10.000},
				{4542.413,469.413,10.000},
				{4589.598,471.851,10.000},
				{4637.027,474.290,10.000},
				{4684.700,476.728,10.000},
				{4732.603,479.031,10.000},
				{4780.709,481.064,10.000},
				{4828.992,482.825,10.000},
				{4877.423,484.315,10.000},
				{4925.977,485.534,10.000},
				{4974.625,486.482,10.000},
				{5023.341,487.160,10.000},
				{5072.097,487.566,10.000},
				{5120.868,487.702,10.000},
				{5169.638,487.702,10.000},
				{5218.408,487.702,10.000},
				{5267.178,487.702,10.000},
				{5315.948,487.702,10.000},
				{5364.718,487.702,10.000},
				{5413.487,487.690,10.000},
				{5462.241,487.532,10.000},
				{5510.951,487.102,10.000},
				{5559.591,486.402,10.000},
				{5608.134,485.431,10.000},
				{5656.553,484.189,10.000},
				{5704.821,482.676,10.000},
				{5752.910,480.891,10.000},
				{5800.793,478.836,10.000},
				{5848.446,476.522,10.000},
				{5895.854,474.083,10.000},
				{5943.018,471.645,10.000},
				{5989.939,469.206,10.000},
				{6036.616,466.768,10.000},
				{6083.049,464.329,10.000},
				{6129.238,461.891,10.000},
				{6175.183,459.452,10.000},
				{6220.884,457.014,10.000},
				{6266.342,454.575,10.000},
				{6311.556,452.137,10.000},
				{6356.526,449.698,10.000},
				{6401.251,447.260,10.000},
				{6445.734,444.821,10.000},
				{6489.972,442.383,10.000},
				{6533.966,439.944,10.000},
				{6577.717,437.506,10.000},
				{6621.224,435.067,10.000},
				{6664.487,432.629,10.000},
				{6707.506,430.190,10.000},
				{6750.281,427.752,10.000},
				{6792.812,425.313,10.000},
				{6835.100,422.875,10.000},
				{6877.143,420.436,10.000},
				{6918.943,417.998,10.000},
				{6960.499,415.559,10.000},
				{7001.811,413.121,10.000},
				{7042.879,410.682,10.000},
				{7083.703,408.244,10.000},
				{7124.284,405.805,10.000},
				{7164.621,403.367,10.000},
				{7204.713,400.928,10.000},
				{7244.562,398.490,10.000},
				{7284.168,396.051,10.000},
				{7323.529,393.613,10.000},
				{7362.620,390.908,10.000},
				{7401.359,387.392,10.000},
				{7439.741,383.818,10.000},
				{7477.765,380.245,10.000},
				{7515.432,376.673,10.000},
				{7552.743,373.105,10.000},
				{7589.697,369.543,10.000},
				{7626.296,365.988,10.000},
				{7662.540,362.443,10.000},
				{7698.431,358.908,10.000},
				{7733.970,355.385,10.000},
				{7769.157,351.876,10.000},
				{7803.995,348.382,10.000},
				{7838.486,344.904,10.000},
				{7872.630,341.443,10.000},
				{7906.430,338.001,10.000},
				{7939.888,334.579,10.000},
				{7973.006,331.178,10.000},
				{8005.786,327.799,10.000},
				{8038.230,324.444,10.000},
				{8070.341,321.112,10.000},
				{8102.122,317.805,10.000},
				{8133.574,314.525,10.000},
				{8164.702,311.272,10.000},
				{8195.506,308.046,10.000},
				{8225.991,304.849,10.000},
				{8256.159,301.682,10.000},
				{8286.014,298.545,10.000},
				{8315.558,295.439,10.000},
				{8344.794,292.364,10.000},
				{8373.726,289.322,10.000},
				{8402.358,286.313,10.000},
				{8430.691,283.336,10.000},
				{8458.731,280.394,10.000},
				{8486.479,277.486,10.000},
				{8513.940,274.612,10.000},
				{8541.118,271.773,10.000},
				{8568.015,268.969,10.000},
				{8594.634,266.199,10.000},
				{8620.981,263.466,10.000},
				{8647.058,260.767,10.000},
				{8672.868,258.103,10.000},
				{8698.415,255.474,10.000},
				{8723.703,252.880,10.000},
				{8748.735,250.321,10.000},
				{8773.515,247.795,10.000},
				{8798.045,245.303,10.000},
				{8822.330,242.844,10.000},
				{8846.372,240.418,10.000},
				{8870.174,238.024,10.000},
				{8893.740,235.661,10.000},
				{8917.073,233.329,10.000},
				{8940.176,231.026,10.000},
				{8963.051,228.753,10.000},
				{8985.702,226.508,10.000},
				{9008.131,224.290,10.000},
				{9030.340,222.098,10.000},
				{9052.333,219.931,10.000},
				{9074.112,217.788,10.000},
				{9095.679,215.669,10.000},
				{9117.036,213.572,10.000},
				{9138.186,211.496,10.000},
				{9159.130,209.440,10.000},
				{9179.870,207.402,10.000},
				{9200.408,205.382,10.000},
				{9220.746,203.379,10.000},
				{9240.886,201.392,10.000},
				{9260.827,199.419,10.000},
				{9280.573,197.459,10.000},
				{9300.124,195.511,10.000},
				{9319.482,193.574,10.000},
				{9338.647,191.648,10.000},
				{9357.620,189.730,10.000},
				{9376.402,187.821,10.000},
				{9394.994,185.919,10.000},
				{9413.396,184.023,10.000},
				{9431.609,182.132,10.000},
				{9449.634,180.245,10.000},
				{9467.470,178.362,10.000},
				{9485.118,176.481,10.000},
				{9502.578,174.602,10.000},
				{9519.850,172.724,10.000},
				{9536.935,170.846,10.000},
				{9553.832,168.967,10.000},
				{9570.540,167.088,10.000},
				{9587.061,165.206,10.000},
				{9603.393,163.322,10.000},
				{9619.537,161.434,10.000},
				{9635.491,159.543,10.000},
				{9651.256,157.647,10.000},
				{9666.830,155.747,10.000},
				{9682.214,153.841,10.000},
				{9697.407,151.929,10.000},
				{9712.409,150.011,10.000},
				{9727.217,148.087,10.000},
				{9741.833,146.155,10.000},
				{9756.254,144.216,10.000},
				{9770.481,142.269,10.000},
				{9784.513,140.314,10.000},
				{9798.348,138.351,10.000},
				{9811.986,136.379,10.000},
				{9825.425,134.397,10.000},
				{9838.666,132.407,10.000},
				{9851.707,130.407,10.000},
				{9864.547,128.398,10.000},
				{9877.184,126.379,10.000},
				{9889.619,124.350,10.000},
				{9901.850,122.310,10.000},
				{9913.877,120.261,10.000},
				{9925.697,118.201,10.000},
				{9937.310,116.131,10.000},
				{9948.715,114.050,10.000},
				{9959.911,111.959,10.000},
				{9970.896,109.857,10.000},
				{9981.671,107.744,10.000},
				{9992.233,105.620,10.000},
				{10002.581,103.486,10.000},
				{10012.715,101.341,10.000},
				{10022.634,99.186,10.000},
				{10032.336,97.020,10.000},
				{10041.820,94.843,10.000},
				{10051.086,92.656,10.000},
				{10060.132,90.458,10.000},
				{10068.957,88.250,10.000},
				{10077.560,86.031,10.000},
				{10085.940,83.803,10.000},
				{10094.096,81.564,10.000},
				{10102.028,79.315,10.000},
				{10109.734,77.057,10.000},
				{10117.212,74.789,10.000},
				{10124.464,72.512,10.000},
				{10131.486,70.225,10.000},
				{10138.279,67.929,10.000},
				{10144.841,65.624,10.000},
				{10151.173,63.311,10.000},
				{10157.271,60.989,10.000},
				{10163.137,58.659,10.000},
				{10168.769,56.321,10.000},
				{10174.167,53.975,10.000},
				{10179.329,51.622,10.000},
				{10184.255,49.261,10.000},
				{10188.945,46.894,10.000},
				{10193.397,44.520,10.000},
				{10197.611,42.139,10.000},
				{10201.586,39.753,10.000},
				{10205.322,37.360,10.000},
				{10208.818,34.963,10.000},
				{10212.074,32.560,10.000},
				{10215.089,30.152,10.000},
				{10217.863,27.740,10.000},
				{10220.396,25.324,10.000},
				{10222.686,22.904,10.000},
				{10224.734,20.480,10.000},
				{10226.540,18.054,10.000},
				{10228.102,15.625,10.000},
				{10229.421,13.193,10.000},
				{10230.498,10.771,10.000},
				{10231.348,8.494,10.000},
				{10231.997,6.487,10.000},
				{10232.472,4.750,10.000},
				{10232.800,3.283,10.000},
				{10233.009,2.087,10.000},
				{10233.125,1.162,10.000},
				{10233.176,0.507,10.000},
				{10233.188,0.124,10.000},
				{10233.188,0.000,10.000}
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