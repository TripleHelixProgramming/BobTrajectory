package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScale extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.38,23.00,0.00)
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
				{5413.489,487.702,10.000},
				{5462.259,487.702,10.000},
				{5511.029,487.702,10.000},
				{5559.791,487.622,10.000},
				{5608.524,487.329,10.000},
				{5657.200,486.764,10.000},
				{5705.793,485.928,10.000},
				{5754.275,484.821,10.000},
				{5802.620,483.444,10.000},
				{5850.799,481.795,10.000},
				{5898.787,479.875,10.000},
				{5946.555,477.685,10.000},
				{5994.085,475.303,10.000},
				{6041.372,472.864,10.000},
				{6088.414,470.426,10.000},
				{6135.213,467.987,10.000},
				{6181.768,465.549,10.000},
				{6228.079,463.110,10.000},
				{6274.146,460.672,10.000},
				{6319.970,458.233,10.000},
				{6365.549,455.795,10.000},
				{6410.885,453.356,10.000},
				{6455.976,450.918,10.000},
				{6500.824,448.479,10.000},
				{6545.428,446.041,10.000},
				{6589.789,443.602,10.000},
				{6633.905,441.164,10.000},
				{6677.777,438.725,10.000},
				{6721.406,436.287,10.000},
				{6764.791,433.848,10.000},
				{6807.932,431.410,10.000},
				{6850.829,428.971,10.000},
				{6893.482,426.532,10.000},
				{6935.892,424.094,10.000},
				{6978.057,421.655,10.000},
				{7019.979,419.217,10.000},
				{7061.657,416.778,10.000},
				{7103.091,414.340,10.000},
				{7144.281,411.901,10.000},
				{7185.227,409.463,10.000},
				{7225.929,407.024,10.000},
				{7266.388,404.586,10.000},
				{7306.603,402.147,10.000},
				{7346.574,399.709,10.000},
				{7386.301,397.270,10.000},
				{7425.784,394.832,10.000},
				{7465.025,392.413,10.000},
				{7504.098,390.731,10.000},
				{7543.041,389.427,10.000},
				{7581.853,388.124,10.000},
				{7620.535,386.820,10.000},
				{7659.087,385.513,10.000},
				{7697.507,384.201,10.000},
				{7735.795,382.882,10.000},
				{7773.950,381.556,10.000},
				{7811.972,380.219,10.000},
				{7849.859,378.871,10.000},
				{7887.610,377.510,10.000},
				{7925.224,376.135,10.000},
				{7962.698,374.744,10.000},
				{8000.032,373.337,10.000},
				{8037.223,371.911,10.000},
				{8074.270,370.466,10.000},
				{8111.170,369.001,10.000},
				{8147.921,367.514,10.000},
				{8184.522,366.004,10.000},
				{8220.969,364.471,10.000},
				{8257.260,362.913,10.000},
				{8293.393,361.329,10.000},
				{8329.365,359.719,10.000},
				{8365.173,358.082,10.000},
				{8400.815,356.416,10.000},
				{8436.287,354.721,10.000},
				{8471.586,352.997,10.000},
				{8506.710,351.241,10.000},
				{8541.656,349.455,10.000},
				{8576.419,347.636,10.000},
				{8610.998,345.785,10.000},
				{8645.388,343.901,10.000},
				{8679.586,341.983,10.000},
				{8713.590,340.032,10.000},
				{8747.394,338.046,10.000},
				{8780.997,336.025,10.000},
				{8814.394,333.970,10.000},
				{8847.581,331.879,10.000},
				{8880.557,329.754,10.000},
				{8913.316,327.593,10.000},
				{8945.856,325.397,10.000},
				{8978.173,323.167,10.000},
				{9010.263,320.901,10.000},
				{9042.123,318.601,10.000},
				{9073.749,316.266,10.000},
				{9105.139,313.898,10.000},
				{9136.289,311.496,10.000},
				{9167.195,309.062,10.000},
				{9197.854,306.595,10.000},
				{9228.264,304.096,10.000},
				{9258.421,301.567,10.000},
				{9288.322,299.007,10.000},
				{9317.963,296.418,10.000},
				{9347.343,293.800,10.000},
				{9376.459,291.155,10.000},
				{9405.307,288.483,10.000},
				{9433.886,285.785,10.000},
				{9462.192,283.062,10.000},
				{9490.223,280.316,10.000},
				{9517.978,277.547,10.000},
				{9545.454,274.757,10.000},
				{9572.648,271.946,10.000},
				{9599.560,269.116,10.000},
				{9626.187,266.267,10.000},
				{9652.527,263.401,10.000},
				{9678.579,260.520,10.000},
				{9704.341,257.623,10.000},
				{9729.812,254.712,10.000},
				{9754.991,251.789,10.000},
				{9779.877,248.854,10.000},
				{9804.467,245.908,10.000},
				{9828.763,242.953,10.000},
				{9852.762,239.990,10.000},
				{9876.464,237.018,10.000},
				{9899.868,234.040,10.000},
				{9922.973,231.057,10.000},
				{9945.780,228.068,10.000},
				{9968.288,225.076,10.000},
				{9990.496,222.081,10.000},
				{10012.404,219.084,10.000},
				{10034.013,216.086,10.000},
				{10055.321,213.087,10.000},
				{10076.330,210.088,10.000},
				{10097.039,207.090,10.000},
				{10117.449,204.093,10.000},
				{10137.559,201.099,10.000},
				{10157.369,198.108,10.000},
				{10176.881,195.121,10.000},
				{10196.095,192.137,10.000},
				{10215.011,189.158,10.000},
				{10233.629,186.184,10.000},
				{10251.951,183.216,10.000},
				{10269.976,180.253,10.000},
				{10287.706,177.297,10.000},
				{10305.141,174.348,10.000},
				{10322.281,171.407,10.000},
				{10339.129,168.473,10.000},
				{10355.683,165.547,10.000},
				{10371.946,162.629,10.000},
				{10387.918,159.720,10.000},
				{10403.600,156.819,10.000},
				{10418.993,153.928,10.000},
				{10434.098,151.046,10.000},
				{10448.915,148.173,10.000},
				{10463.446,145.311,10.000},
				{10477.692,142.458,10.000},
				{10491.653,139.615,10.000},
				{10505.331,136.782,10.000},
				{10518.727,133.960,10.000},
				{10531.842,131.148,10.000},
				{10544.677,128.347,10.000},
				{10557.232,125.556,10.000},
				{10569.510,122.775,10.000},
				{10581.511,120.006,10.000},
				{10593.235,117.247,10.000},
				{10604.685,114.499,10.000},
				{10615.861,111.761,10.000},
				{10626.765,109.034,10.000},
				{10637.396,106.318,10.000},
				{10647.758,103.612,10.000},
				{10657.849,100.917,10.000},
				{10667.673,98.233,10.000},
				{10677.229,95.559,10.000},
				{10686.518,92.895,10.000},
				{10695.542,90.242,10.000},
				{10704.302,87.598,10.000},
				{10712.799,84.965,10.000},
				{10721.033,82.342,10.000},
				{10729.006,79.728,10.000},
				{10736.718,77.123,10.000},
				{10744.171,74.529,10.000},
				{10751.365,71.943,10.000},
				{10758.302,69.366,10.000},
				{10764.981,66.798,10.000},
				{10771.405,64.239,10.000},
				{10777.574,61.688,10.000},
				{10783.489,59.145,10.000},
				{10789.150,56.610,10.000},
				{10794.558,54.082,10.000},
				{10799.714,51.562,10.000},
				{10804.619,49.049,10.000},
				{10809.273,46.543,10.000},
				{10813.678,44.043,10.000},
				{10817.833,41.550,10.000},
				{10821.739,39.062,10.000},
				{10825.397,36.580,10.000},
				{10828.807,34.103,10.000},
				{10831.970,31.632,10.000},
				{10834.887,29.165,10.000},
				{10837.557,26.702,10.000},
				{10839.981,24.243,10.000},
				{10842.160,21.788,10.000},
				{10844.094,19.336,10.000},
				{10845.782,16.887,10.000},
				{10847.226,14.440,10.000},
				{10848.426,11.996,10.000},
				{10849.389,9.632,10.000},
				{10850.138,7.485,10.000},
				{10850.698,5.610,10.000},
				{10851.099,4.006,10.000},
				{10851.367,2.674,10.000},
				{10851.528,1.613,10.000},
				{10851.610,0.823,10.000},
				{10851.641,0.304,10.000},
				{10851.646,0.056,10.000},
				{10851.646,0.000,10.000}
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
				{5413.489,487.702,10.000},
				{5462.259,487.702,10.000},
				{5511.029,487.702,10.000},
				{5559.791,487.622,10.000},
				{5608.524,487.329,10.000},
				{5657.200,486.764,10.000},
				{5705.793,485.928,10.000},
				{5754.275,484.821,10.000},
				{5802.620,483.444,10.000},
				{5850.799,481.795,10.000},
				{5898.787,479.875,10.000},
				{5946.555,477.685,10.000},
				{5994.085,475.303,10.000},
				{6041.372,472.864,10.000},
				{6088.414,470.426,10.000},
				{6135.213,467.987,10.000},
				{6181.768,465.549,10.000},
				{6228.079,463.110,10.000},
				{6274.146,460.672,10.000},
				{6319.970,458.233,10.000},
				{6365.549,455.795,10.000},
				{6410.885,453.356,10.000},
				{6455.976,450.918,10.000},
				{6500.824,448.479,10.000},
				{6545.428,446.041,10.000},
				{6589.789,443.602,10.000},
				{6633.905,441.164,10.000},
				{6677.777,438.725,10.000},
				{6721.406,436.287,10.000},
				{6764.791,433.848,10.000},
				{6807.932,431.410,10.000},
				{6850.829,428.971,10.000},
				{6893.482,426.532,10.000},
				{6935.892,424.094,10.000},
				{6978.057,421.655,10.000},
				{7019.979,419.217,10.000},
				{7061.657,416.778,10.000},
				{7103.091,414.340,10.000},
				{7144.281,411.901,10.000},
				{7185.227,409.463,10.000},
				{7225.929,407.024,10.000},
				{7266.388,404.586,10.000},
				{7306.603,402.147,10.000},
				{7346.574,399.709,10.000},
				{7386.301,397.270,10.000},
				{7425.784,394.832,10.000},
				{7465.021,392.374,10.000},
				{7503.939,389.179,10.000},
				{7542.500,385.606,10.000},
				{7580.703,382.032,10.000},
				{7618.549,378.459,10.000},
				{7656.038,374.889,10.000},
				{7693.170,371.324,10.000},
				{7729.947,367.765,10.000},
				{7766.368,364.215,10.000},
				{7802.436,360.674,10.000},
				{7838.150,357.145,10.000},
				{7873.513,353.629,10.000},
				{7908.526,350.127,10.000},
				{7943.190,346.641,10.000},
				{7977.507,343.172,10.000},
				{8011.479,339.720,10.000},
				{8045.108,336.288,10.000},
				{8078.396,332.877,10.000},
				{8111.344,329.487,10.000},
				{8143.956,326.119,10.000},
				{8176.234,322.775,10.000},
				{8208.179,319.456,10.000},
				{8239.796,316.163,10.000},
				{8271.085,312.896,10.000},
				{8302.051,309.656,10.000},
				{8332.695,306.445,10.000},
				{8363.022,303.263,10.000},
				{8393.033,300.110,10.000},
				{8422.731,296.988,10.000},
				{8452.121,293.898,10.000},
				{8481.205,290.840,10.000},
				{8509.987,287.814,10.000},
				{8538.469,284.821,10.000},
				{8566.655,281.861,10.000},
				{8594.548,278.936,10.000},
				{8622.153,276.045,10.000},
				{8649.472,273.188,10.000},
				{8676.508,270.367,10.000},
				{8703.266,267.580,10.000},
				{8729.749,264.829,10.000},
				{8755.960,262.112,10.000},
				{8781.903,259.431,10.000},
				{8807.582,256.785,10.000},
				{8832.999,254.173,10.000},
				{8858.159,251.596,10.000},
				{8883.064,249.054,10.000},
				{8907.719,246.545,10.000},
				{8932.126,244.070,10.000},
				{8956.288,241.627,10.000},
				{8980.210,239.217,10.000},
				{9003.894,236.839,10.000},
				{9027.343,234.491,10.000},
				{9050.561,232.174,10.000},
				{9073.549,229.886,10.000},
				{9096.312,227.627,10.000},
				{9118.851,225.395,10.000},
				{9141.171,223.190,10.000},
				{9163.272,221.011,10.000},
				{9185.157,218.857,10.000},
				{9206.830,216.726,10.000},
				{9228.292,214.618,10.000},
				{9249.545,212.531,10.000},
				{9270.591,210.465,10.000},
				{9291.433,208.419,10.000},
				{9312.072,206.390,10.000},
				{9332.510,204.379,10.000},
				{9352.748,202.384,10.000},
				{9372.789,200.403,10.000},
				{9392.632,198.437,10.000},
				{9412.281,196.483,10.000},
				{9431.735,194.541,10.000},
				{9450.996,192.610,10.000},
				{9470.065,190.688,10.000},
				{9488.942,188.775,10.000},
				{9507.629,186.869,10.000},
				{9526.126,184.970,10.000},
				{9544.434,183.076,10.000},
				{9562.552,181.188,10.000},
				{9580.483,179.303,10.000},
				{9598.225,177.421,10.000},
				{9615.779,175.541,10.000},
				{9633.145,173.663,10.000},
				{9650.324,171.785,10.000},
				{9667.314,169.906,10.000},
				{9684.117,168.027,10.000},
				{9700.732,166.147,10.000},
				{9717.158,164.264,10.000},
				{9733.396,162.378,10.000},
				{9749.445,160.489,10.000},
				{9765.304,158.595,10.000},
				{9780.974,156.697,10.000},
				{9796.453,154.794,10.000},
				{9811.742,152.886,10.000},
				{9826.839,150.971,10.000},
				{9841.744,149.050,10.000},
				{9856.456,147.122,10.000},
				{9870.975,145.186,10.000},
				{9885.299,143.243,10.000},
				{9899.428,141.292,10.000},
				{9913.362,139.333,10.000},
				{9927.098,137.365,10.000},
				{9940.637,135.389,10.000},
				{9953.977,133.403,10.000},
				{9967.118,131.408,10.000},
				{9980.058,129.403,10.000},
				{9992.797,127.389,10.000},
				{10005.334,125.365,10.000},
				{10017.667,123.331,10.000},
				{10029.796,121.287,10.000},
				{10041.719,119.232,10.000},
				{10053.436,117.167,10.000},
				{10064.945,115.091,10.000},
				{10076.245,113.005,10.000},
				{10087.336,110.909,10.000},
				{10098.216,108.801,10.000},
				{10108.884,106.683,10.000},
				{10119.340,104.554,10.000},
				{10129.581,102.415,10.000},
				{10139.608,100.265,10.000},
				{10149.418,98.104,10.000},
				{10159.011,95.932,10.000},
				{10168.386,93.750,10.000},
				{10177.542,91.558,10.000},
				{10186.478,89.355,10.000},
				{10195.192,87.141,10.000},
				{10203.684,84.918,10.000},
				{10211.952,82.684,10.000},
				{10219.996,80.441,10.000},
				{10227.815,78.187,10.000},
				{10235.407,75.924,10.000},
				{10242.772,73.651,10.000},
				{10249.909,71.369,10.000},
				{10256.817,69.078,10.000},
				{10263.495,66.777,10.000},
				{10269.942,64.468,10.000},
				{10276.157,62.151,10.000},
				{10282.139,59.825,10.000},
				{10287.888,57.491,10.000},
				{10293.403,55.149,10.000},
				{10298.683,52.799,10.000},
				{10303.727,50.442,10.000},
				{10308.535,48.078,10.000},
				{10313.106,45.707,10.000},
				{10317.439,43.330,10.000},
				{10321.533,40.947,10.000},
				{10325.389,38.557,10.000},
				{10329.005,36.162,10.000},
				{10332.382,33.762,10.000},
				{10335.517,31.357,10.000},
				{10338.412,28.947,10.000},
				{10341.065,26.532,10.000},
				{10343.477,24.114,10.000},
				{10345.646,21.693,10.000},
				{10347.573,19.268,10.000},
				{10349.256,16.840,10.000},
				{10350.697,14.409,10.000},
				{10351.895,11.977,10.000},
				{10352.857,9.621,10.000},
				{10353.605,7.479,10.000},
				{10354.166,5.607,10.000},
				{10354.566,4.005,10.000},
				{10354.834,2.674,10.000},
				{10354.995,1.613,10.000},
				{10355.077,0.823,10.000},
				{10355.108,0.304,10.000},
				{10355.113,0.056,10.000},
				{10355.113,0.000,10.000}
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