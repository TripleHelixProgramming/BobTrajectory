package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (10.00,9.08,0.00)
	
    public CenterToRightSwitchArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.445,8.895,10.000,0.000},
				{2.224,26.684,10.000,-0.000},
				{6.226,53.367,10.000,-0.000},
				{13.342,88.945,10.000,-0.000},
				{24.460,133.418,10.000,-0.000},
				{40.470,186.785,10.000,-0.000},
				{62.262,249.046,10.000,-0.000},
				{90.724,320.202,10.000,-0.000},
				{126.747,400.253,10.000,-0.000},
				{171.219,489.198,10.000,-0.001},
				{225.031,587.037,10.000,-0.001},
				{289.071,693.771,10.000,-0.002},
				{364.230,809.400,10.000,-0.004},
				{451.396,933.923,10.000,-0.006},
				{551.459,1067.341,10.000,-0.009},
				{665.309,1209.653,10.000,-0.013},
				{793.835,1360.859,10.000,-0.018},
				{937.926,1520.960,10.000,-0.025},
				{1098.471,1689.956,10.000,-0.034},
				{1276.361,1867.846,10.000,-0.046},
				{1472.041,2045.736,10.000,-0.061},
				{1685.509,2223.626,10.000,-0.080},
				{1916.766,2401.516,10.000,-0.103},
				{2165.812,2579.406,10.000,-0.131},
				{2432.647,2757.297,10.000,-0.165},
				{2717.271,2935.187,10.000,-0.205},
				{3019.684,3113.077,10.000,-0.253},
				{3339.887,3290.967,10.000,-0.308},
				{3677.878,3468.857,10.000,-0.372},
				{4033.658,3646.747,10.000,-0.446},
				{4407.227,3824.637,10.000,-0.531},
				{4798.586,4002.527,10.000,-0.626},
				{5207.733,4180.417,10.000,-0.735},
				{5634.669,4358.308,10.000,-0.857},
				{6079.394,4536.198,10.000,-0.993},
				{6541.909,4714.088,10.000,-1.145},
				{7022.212,4891.978,10.000,-1.313},
				{7520.304,5069.868,10.000,-1.500},
				{8036.185,5247.758,10.000,-1.705},
				{8569.856,5425.648,10.000,-1.930},
				{9121.315,5603.538,10.000,-2.176},
				{9690.563,5781.428,10.000,-2.445},
				{10277.601,5959.318,10.000,-2.738},
				{10882.427,6137.209,10.000,-3.055},
				{11505.042,6315.099,10.000,-3.399},
				{12145.447,6492.989,10.000,-3.770},
				{12803.640,6670.879,10.000,-4.170},
				{13479.623,6848.769,10.000,-4.600},
				{14173.394,7026.659,10.000,-5.062},
				{14884.954,7204.549,10.000,-5.556},
				{15613.859,7373.545,10.000,-6.084},
				{16359.219,7533.646,10.000,-6.645},
				{17120.143,7684.852,10.000,-7.241},
				{17895.744,7827.165,10.000,-7.872},
				{18685.132,7960.582,10.000,-8.537},
				{19487.416,8085.105,10.000,-9.237},
				{20301.708,8200.734,10.000,-9.970},
				{21127.118,8307.468,10.000,-10.736},
				{21962.757,8405.307,10.000,-11.534},
				{22807.735,8494.252,10.000,-12.363},
				{23661.163,8574.303,10.000,-13.222},
				{24522.151,8645.459,10.000,-14.108},
				{25389.810,8707.721,10.000,-15.019},
				{26263.250,8761.088,10.000,-15.954},
				{27141.582,8805.560,10.000,-16.909},
				{28023.917,8841.138,10.000,-17.882},
				{28909.365,8867.822,10.000,-18.870},
				{29797.037,8885.611,10.000,-19.870},
				{30686.043,8894.505,10.000,-20.878},
				{31575.493,8894.505,10.000,-21.891},
				{32464.944,8894.505,10.000,-22.906},
				{33354.394,8894.505,10.000,-23.921},
				{34243.845,8894.505,10.000,-24.933},
				{35133.295,8894.505,10.000,-25.940},
				{36022.746,8894.505,10.000,-26.940},
				{36912.196,8894.505,10.000,-27.929},
				{37801.647,8894.505,10.000,-28.907},
				{38691.097,8894.505,10.000,-29.871},
				{39580.548,8894.505,10.000,-30.819},
				{40469.998,8894.505,10.000,-31.750},
				{41359.449,8894.505,10.000,-32.662},
				{42248.899,8894.505,10.000,-33.552},
				{43138.350,8894.505,10.000,-34.421},
				{44027.800,8894.505,10.000,-35.267},
				{44917.251,8894.505,10.000,-36.088},
				{45806.701,8894.505,10.000,-36.885},
				{46696.152,8894.505,10.000,-37.655},
				{47585.602,8894.505,10.000,-38.400},
				{48475.053,8894.505,10.000,-39.117},
				{49364.504,8894.505,10.000,-39.807},
				{50253.954,8894.505,10.000,-40.469},
				{51143.405,8894.505,10.000,-41.103},
				{52032.855,8894.505,10.000,-41.710},
				{52922.306,8894.505,10.000,-42.288},
				{53811.756,8894.505,10.000,-42.838},
				{54701.207,8894.505,10.000,-43.361},
				{55590.657,8894.505,10.000,-43.855},
				{56480.108,8894.505,10.000,-44.322},
				{57369.558,8894.505,10.000,-44.761},
				{58259.009,8894.505,10.000,-45.173},
				{59148.459,8894.505,10.000,-45.558},
				{60037.910,8894.505,10.000,-45.916},
				{60927.360,8894.505,10.000,-46.247},
				{61816.811,8894.505,10.000,-46.551},
				{62706.261,8894.505,10.000,-46.830},
				{63595.712,8894.505,10.000,-47.082},
				{64485.162,8894.505,10.000,-47.308},
				{65374.613,8894.505,10.000,-47.509},
				{66264.063,8894.505,10.000,-47.684},
				{67153.514,8894.505,10.000,-47.834},
				{68042.964,8894.505,10.000,-47.959},
				{68932.415,8894.505,10.000,-48.058},
				{69821.865,8894.505,10.000,-48.133},
				{70711.316,8894.505,10.000,-48.183},
				{71600.766,8894.505,10.000,-48.207},
				{72490.217,8894.505,10.000,-48.207},
				{73379.667,8894.505,10.000,-48.182},
				{74269.118,8894.505,10.000,-48.132},
				{75158.568,8894.505,10.000,-48.057},
				{76048.019,8894.505,10.000,-47.957},
				{76937.469,8894.505,10.000,-47.832},
				{77826.920,8894.505,10.000,-47.682},
				{78716.370,8894.505,10.000,-47.506},
				{79605.821,8894.505,10.000,-47.305},
				{80495.272,8894.505,10.000,-47.079},
				{81384.722,8894.505,10.000,-46.826},
				{82274.173,8894.505,10.000,-46.547},
				{83163.623,8894.505,10.000,-46.242},
				{84053.074,8894.505,10.000,-45.911},
				{84942.524,8894.505,10.000,-45.553},
				{85831.975,8894.505,10.000,-45.167},
				{86721.425,8894.505,10.000,-44.755},
				{87610.876,8894.505,10.000,-44.315},
				{88500.326,8894.505,10.000,-43.848},
				{89389.777,8894.505,10.000,-43.353},
				{90279.227,8894.505,10.000,-42.830},
				{91168.678,8894.505,10.000,-42.280},
				{92058.128,8894.505,10.000,-41.701},
				{92947.579,8894.505,10.000,-41.094},
				{93837.029,8894.505,10.000,-40.459},
				{94726.480,8894.505,10.000,-39.797},
				{95615.930,8894.505,10.000,-39.106},
				{96505.381,8894.505,10.000,-38.389},
				{97394.831,8894.505,10.000,-37.644},
				{98284.282,8894.505,10.000,-36.873},
				{99173.732,8894.505,10.000,-36.076},
				{100063.183,8894.505,10.000,-35.255},
				{100952.633,8894.505,10.000,-34.409},
				{101842.084,8894.505,10.000,-33.539},
				{102731.534,8894.505,10.000,-32.648},
				{103620.985,8894.505,10.000,-31.737},
				{104510.435,8894.505,10.000,-30.806},
				{105399.886,8894.505,10.000,-29.857},
				{106289.336,8894.505,10.000,-28.893},
				{107178.787,8894.505,10.000,-27.915},
				{108068.237,8894.505,10.000,-26.925},
				{108957.688,8894.505,10.000,-25.926},
				{109847.138,8894.505,10.000,-24.919},
				{110736.589,8894.505,10.000,-23.906},
				{111626.039,8894.505,10.000,-22.892},
				{112515.490,8894.505,10.000,-21.876},
				{113404.934,8894.375,10.000,-20.863},
				{114293.920,8885.350,10.000,-19.855},
				{115181.559,8867.431,10.000,-18.856},
				{116066.962,8840.618,10.000,-17.868},
				{116949.238,8804.910,10.000,-16.895},
				{117827.499,8760.307,10.000,-15.940},
				{118700.855,8706.810,10.000,-15.006},
				{119568.416,8644.418,10.000,-14.094},
				{120429.294,8573.132,10.000,-13.209},
				{121282.598,8492.951,10.000,-12.351},
				{122127.439,8403.876,10.000,-11.522},
				{122962.928,8305.907,10.000,-10.725},
				{123788.176,8199.042,10.000,-9.959},
				{124602.292,8083.284,10.000,-9.226},
				{125404.388,7958.631,10.000,-8.527},
				{126193.574,7825.083,10.000,-7.863},
				{126968.960,7682.641,10.000,-7.233},
				{127729.657,7531.304,10.000,-6.637},
				{128474.776,7371.073,10.000,-6.076},
				{129203.427,7201.947,10.000,-5.549},
				{129914.727,7024.057,10.000,-5.055},
				{130608.238,6846.167,10.000,-4.594},
				{131283.960,6668.277,10.000,-4.164},
				{131941.894,6490.387,10.000,-3.765},
				{132582.038,6312.497,10.000,-3.394},
				{133204.393,6134.607,10.000,-3.050},
				{133808.959,5956.716,10.000,-2.733},
				{134395.736,5778.826,10.000,-2.441},
				{134964.724,5600.936,10.000,-2.173},
				{135515.924,5423.046,10.000,-1.926},
				{136049.334,5245.156,10.000,-1.702},
				{136564.955,5067.266,10.000,-1.497},
				{137062.787,4889.376,10.000,-1.311},
				{137542.830,4711.486,10.000,-1.142},
				{138005.084,4533.596,10.000,-0.991},
				{138449.549,4355.706,10.000,-0.855},
				{138876.225,4177.815,10.000,-0.733},
				{139285.112,3999.925,10.000,-0.625},
				{139676.210,3822.035,10.000,-0.529},
				{140049.519,3644.145,10.000,-0.445},
				{140405.039,3466.255,10.000,-0.371},
				{140742.770,3288.365,10.000,-0.307},
				{141062.712,3110.475,10.000,-0.252},
				{141364.865,2932.585,10.000,-0.205},
				{141649.229,2754.695,10.000,-0.165},
				{141915.804,2576.804,10.000,-0.131},
				{142164.590,2398.914,10.000,-0.103},
				{142395.587,2221.024,10.000,-0.080},
				{142608.795,2043.134,10.000,-0.061},
				{142804.214,1865.244,10.000,-0.046},
				{142981.850,1687.484,10.000,-0.034},
				{143142.155,1518.619,10.000,-0.025},
				{143286.019,1358.648,10.000,-0.018},
				{143414.329,1207.571,10.000,-0.013},
				{143527.977,1065.389,10.000,-0.009},
				{143627.852,932.102,10.000,-0.006},
				{143714.843,807.709,10.000,-0.004},
				{143789.838,692.210,10.000,-0.002},
				{143853.729,585.606,10.000,-0.001},
				{143907.404,487.897,10.000,-0.001},
				{143951.753,399.082,10.000,-0.000},
				{143987.666,319.161,10.000,-0.000},
				{144016.030,248.135,10.000,-0.000},
				{144037.737,186.004,10.000,-0.000},
				{144053.676,132.767,10.000,-0.000},
				{144064.735,88.425,10.000,-0.000},
				{144071.806,52.977,10.000,-0.000},
				{144075.776,26.423,10.000,-0.000},
				{144077.535,8.764,10.000,0.000},
				{144077.973,0.000,10.000,-360.000},
				{144077.973,0.000,10.000,-360.000}		};

}