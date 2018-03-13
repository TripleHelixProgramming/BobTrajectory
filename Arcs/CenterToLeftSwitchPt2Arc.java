package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,18.08,0.00)
	// (3.63,13.08,0.00)
	
    public CenterToLeftSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchPt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.445,-8.895,10.000,0.000},
				{-2.224,-26.684,10.000,0.000},
				{-6.226,-53.367,10.000,0.000},
				{-13.342,-88.945,10.000,0.000},
				{-24.460,-133.418,10.000,0.000},
				{-40.470,-186.785,10.000,0.000},
				{-62.262,-249.046,10.000,0.000},
				{-90.724,-320.202,10.000,0.000},
				{-126.747,-400.253,10.000,0.001},
				{-171.219,-489.198,10.000,0.001},
				{-225.031,-587.037,10.000,0.002},
				{-289.071,-693.771,10.000,0.003},
				{-364.230,-809.400,10.000,0.005},
				{-451.396,-933.923,10.000,0.007},
				{-551.459,-1067.341,10.000,0.011},
				{-665.309,-1209.653,10.000,0.016},
				{-793.835,-1360.859,10.000,0.022},
				{-937.926,-1520.960,10.000,0.031},
				{-1098.471,-1689.956,10.000,0.043},
				{-1276.361,-1867.846,10.000,0.057},
				{-1472.041,-2045.736,10.000,0.076},
				{-1685.509,-2223.626,10.000,0.100},
				{-1916.766,-2401.516,10.000,0.129},
				{-2165.812,-2579.406,10.000,0.164},
				{-2432.647,-2757.297,10.000,0.206},
				{-2717.271,-2935.187,10.000,0.257},
				{-3019.684,-3113.077,10.000,0.316},
				{-3339.887,-3290.967,10.000,0.386},
				{-3677.878,-3468.857,10.000,0.466},
				{-4033.658,-3646.747,10.000,0.559},
				{-4407.227,-3824.637,10.000,0.666},
				{-4798.586,-4002.527,10.000,0.788},
				{-5207.733,-4180.417,10.000,0.925},
				{-5634.669,-4358.308,10.000,1.081},
				{-6079.394,-4536.198,10.000,1.255},
				{-6541.909,-4714.088,10.000,1.450},
				{-7022.212,-4891.978,10.000,1.668},
				{-7520.304,-5069.868,10.000,1.910},
				{-8036.185,-5247.758,10.000,2.177},
				{-8569.856,-5425.648,10.000,2.473},
				{-9121.315,-5603.538,10.000,2.799},
				{-9690.563,-5781.428,10.000,3.157},
				{-10277.601,-5959.318,10.000,3.550},
				{-10882.427,-6137.209,10.000,3.980},
				{-11505.042,-6315.099,10.000,4.450},
				{-12145.447,-6492.989,10.000,4.963},
				{-12803.640,-6670.879,10.000,5.522},
				{-13479.623,-6848.769,10.000,6.129},
				{-14173.394,-7026.659,10.000,6.790},
				{-14884.954,-7204.549,10.000,7.506},
				{-15613.859,-7373.545,10.000,8.282},
				{-16359.219,-7533.646,10.000,9.120},
				{-17120.143,-7684.852,10.000,10.024},
				{-17895.744,-7827.165,10.000,10.995},
				{-18685.132,-7960.582,10.000,12.037},
				{-19487.416,-8085.105,10.000,13.151},
				{-20301.708,-8200.734,10.000,14.339},
				{-21127.118,-8307.468,10.000,15.603},
				{-21962.757,-8405.307,10.000,16.943},
				{-22807.735,-8494.252,10.000,18.358},
				{-23661.163,-8574.303,10.000,19.849},
				{-24522.151,-8645.459,10.000,21.411},
				{-25389.810,-8707.721,10.000,23.042},
				{-26263.250,-8761.088,10.000,24.736},
				{-27141.582,-8805.560,10.000,26.488},
				{-28023.917,-8841.138,10.000,28.290},
				{-28909.365,-8867.822,10.000,30.133},
				{-29797.037,-8885.611,10.000,32.007},
				{-30686.043,-8894.505,10.000,33.902},
				{-31575.493,-8894.505,10.000,35.804},
				{-32464.944,-8894.505,10.000,37.705},
				{-33354.394,-8894.505,10.000,39.593},
				{-34243.845,-8894.505,10.000,41.460},
				{-35133.295,-8894.505,10.000,43.297},
				{-36022.746,-8894.505,10.000,45.095},
				{-36912.196,-8894.505,10.000,46.847},
				{-37801.647,-8894.505,10.000,48.547},
				{-38691.097,-8894.505,10.000,50.191},
				{-39580.548,-8894.505,10.000,51.773},
				{-40469.998,-8894.505,10.000,53.292},
				{-41359.449,-8894.505,10.000,54.744},
				{-42248.899,-8894.505,10.000,56.130},
				{-43138.350,-8894.505,10.000,57.447},
				{-44027.800,-8894.505,10.000,58.697},
				{-44917.251,-8894.505,10.000,59.880},
				{-45806.701,-8894.505,10.000,60.998},
				{-46696.152,-8894.505,10.000,62.051},
				{-47585.602,-8894.505,10.000,63.042},
				{-48475.053,-8894.505,10.000,63.972},
				{-49364.504,-8894.505,10.000,64.843},
				{-50253.954,-8894.505,10.000,65.658},
				{-51143.405,-8894.505,10.000,66.418},
				{-52032.855,-8894.505,10.000,67.125},
				{-52922.306,-8894.505,10.000,67.782},
				{-53811.756,-8894.505,10.000,68.389},
				{-54701.207,-8894.505,10.000,68.950},
				{-55590.657,-8894.505,10.000,69.464},
				{-56480.108,-8894.505,10.000,69.935},
				{-57369.558,-8894.505,10.000,70.364},
				{-58259.009,-8894.505,10.000,70.751},
				{-59148.459,-8894.505,10.000,71.098},
				{-60037.910,-8894.505,10.000,71.407},
				{-60927.360,-8894.505,10.000,71.677},
				{-61816.811,-8894.505,10.000,71.911},
				{-62706.261,-8894.505,10.000,72.108},
				{-63595.712,-8894.505,10.000,72.269},
				{-64485.162,-8894.505,10.000,72.396},
				{-65374.613,-8894.505,10.000,72.488},
				{-66264.063,-8894.505,10.000,72.545},
				{-67153.514,-8894.505,10.000,72.568},
				{-68042.964,-8894.505,10.000,72.557},
				{-68932.415,-8894.505,10.000,72.511},
				{-69821.865,-8894.505,10.000,72.432},
				{-70711.316,-8894.505,10.000,72.317},
				{-71600.766,-8894.505,10.000,72.168},
				{-72490.217,-8894.505,10.000,71.983},
				{-73379.667,-8894.505,10.000,71.762},
				{-74269.118,-8894.505,10.000,71.505},
				{-75158.568,-8894.505,10.000,71.209},
				{-76048.019,-8894.505,10.000,70.876},
				{-76937.469,-8894.505,10.000,70.502},
				{-77826.920,-8894.505,10.000,70.088},
				{-78716.370,-8894.505,10.000,69.632},
				{-79605.821,-8894.505,10.000,69.133},
				{-80495.272,-8894.505,10.000,68.589},
				{-81384.722,-8894.505,10.000,67.998},
				{-82274.173,-8894.505,10.000,67.358},
				{-83163.623,-8894.505,10.000,66.669},
				{-84053.074,-8894.505,10.000,65.927},
				{-84942.524,-8894.505,10.000,65.132},
				{-85831.975,-8894.505,10.000,64.280},
				{-86721.425,-8894.505,10.000,63.371},
				{-87610.876,-8894.505,10.000,62.401},
				{-88500.326,-8894.505,10.000,61.370},
				{-89389.777,-8894.505,10.000,60.275},
				{-90279.227,-8894.505,10.000,59.114},
				{-91168.678,-8894.505,10.000,57.888},
				{-92058.128,-8894.505,10.000,56.594},
				{-92947.579,-8894.505,10.000,55.232},
				{-93837.029,-8894.505,10.000,53.803},
				{-94726.480,-8894.505,10.000,52.307},
				{-95615.930,-8894.505,10.000,50.746},
				{-96505.381,-8894.505,10.000,49.123},
				{-97394.831,-8894.505,10.000,47.442},
				{-98284.282,-8894.505,10.000,45.707},
				{-99173.732,-8894.505,10.000,43.924},
				{-100063.183,-8894.505,10.000,42.100},
				{-100952.633,-8894.505,10.000,40.243},
				{-101842.084,-8894.505,10.000,38.361},
				{-102731.534,-8894.505,10.000,36.463},
				{-103620.985,-8894.505,10.000,34.560},
				{-104510.145,-8888.692,10.000,32.662},
				{-105398.278,-8873.984,10.000,30.780},
				{-106284.497,-8850.381,10.000,28.925},
				{-107167.910,-8817.884,10.000,27.108},
				{-108047.629,-8776.492,10.000,25.338},
				{-108922.764,-8726.206,10.000,23.623},
				{-109792.425,-8667.026,10.000,21.969},
				{-110655.724,-8598.951,10.000,20.383},
				{-111511.771,-8521.981,10.000,18.868},
				{-112359.676,-8436.117,10.000,17.426},
				{-113198.549,-8341.359,10.000,16.060},
				{-114027.503,-8237.706,10.000,14.770},
				{-114845.646,-8125.158,10.000,13.556},
				{-115652.090,-8003.716,10.000,12.416},
				{-116445.944,-7873.379,10.000,11.350},
				{-117226.321,-7734.148,10.000,10.355},
				{-117992.329,-7586.023,10.000,9.428},
				{-118743.080,-7429.002,10.000,8.567},
				{-119477.685,-7263.088,10.000,7.770},
				{-120195.253,-7088.279,10.000,7.033},
				{-120895.187,-6910.389,10.000,6.354},
				{-121577.331,-6732.499,10.000,5.728},
				{-122241.686,-6554.608,10.000,5.153},
				{-122888.253,-6376.718,10.000,4.624},
				{-123517.030,-6198.828,10.000,4.140},
				{-124128.018,-6020.938,10.000,3.696},
				{-124721.218,-5843.048,10.000,3.290},
				{-125296.628,-5665.158,10.000,2.920},
				{-125854.249,-5487.268,10.000,2.584},
				{-126394.081,-5309.378,10.000,2.278},
				{-126916.125,-5131.488,10.000,2.000},
				{-127420.379,-4953.597,10.000,1.750},
				{-127906.844,-4775.707,10.000,1.524},
				{-128375.520,-4597.817,10.000,1.321},
				{-128826.408,-4419.927,10.000,1.140},
				{-129259.506,-4242.037,10.000,0.978},
				{-129674.815,-4064.147,10.000,0.834},
				{-130072.335,-3886.257,10.000,0.707},
				{-130452.066,-3708.367,10.000,0.595},
				{-130814.009,-3530.477,10.000,0.498},
				{-131158.162,-3352.587,10.000,0.413},
				{-131484.526,-3174.696,10.000,0.339},
				{-131793.101,-2996.806,10.000,0.277},
				{-132083.887,-2818.916,10.000,0.223},
				{-132356.884,-2641.026,10.000,0.178},
				{-132612.092,-2463.136,10.000,0.140},
				{-132849.512,-2285.246,10.000,0.109},
				{-133069.142,-2107.356,10.000,0.084},
				{-133270.983,-1929.466,10.000,0.064},
				{-133455.035,-1751.576,10.000,0.048},
				{-133621.589,-1579.499,10.000,0.035},
				{-133771.379,-1416.317,10.000,0.025},
				{-133905.297,-1262.029,10.000,0.018},
				{-134024.230,-1116.636,10.000,0.012},
				{-134129.069,-980.138,10.000,0.008},
				{-134220.702,-852.534,10.000,0.006},
				{-134300.020,-733.824,10.000,0.004},
				{-134367.912,-624.009,10.000,0.002},
				{-134425.267,-523.089,10.000,0.001},
				{-134472.974,-431.063,10.000,0.001},
				{-134511.924,-347.931,10.000,0.000},
				{-134543.005,-273.694,10.000,0.000},
				{-134567.107,-208.351,10.000,0.000},
				{-134585.120,-151.903,10.000,0.000},
				{-134597.933,-104.350,10.000,0.000},
				{-134606.435,-65.691,10.000,0.000},
				{-134611.516,-35.926,10.000,0.000},
				{-134614.065,-15.056,10.000,0.000},
				{-134614.972,-3.081,10.000,-0.000},
				{-134615.126,-0.000,10.000,-0.000},
				{-134615.126,-0.000,10.000,-0.000}		};

}