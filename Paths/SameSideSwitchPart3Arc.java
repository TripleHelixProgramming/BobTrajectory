package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart3Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (14.33,21.50,-90.00)
	// (17.50,23.83,-179.00)
	// (21.25,24.25,-135.00)
	
    public SameSideSwitchPart3Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitchPart3Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{-0.015,-0.292,10.000,0.000},
				{-0.073,-0.876,10.000,90.000},
				{-0.204,-1.752,10.000,90.000},
				{-0.438,-2.920,10.000,90.000},
				{-0.803,-4.381,10.000,90.000},
				{-1.314,-5.841,10.000,90.000},
				{-1.971,-7.301,10.000,90.000},
				{-2.774,-8.761,10.000,90.000},
				{-3.723,-10.221,10.000,90.000},
				{-4.819,-11.681,10.000,89.999},
				{-6.060,-13.142,10.000,89.999},
				{-7.447,-14.602,10.000,89.998},
				{-8.980,-16.062,10.000,89.998},
				{-10.659,-17.522,10.000,89.997},
				{-12.485,-18.982,10.000,89.995},
				{-14.456,-20.443,10.000,89.994},
				{-16.573,-21.903,10.000,89.992},
				{-18.836,-23.363,10.000,89.989},
				{-21.246,-24.823,10.000,89.986},
				{-23.801,-26.283,10.000,89.983},
				{-26.502,-27.744,10.000,89.979},
				{-29.350,-29.204,10.000,89.974},
				{-32.343,-30.664,10.000,89.968},
				{-35.482,-32.124,10.000,89.962},
				{-38.768,-33.584,10.000,89.955},
				{-42.199,-35.044,10.000,89.946},
				{-45.777,-36.505,10.000,89.937},
				{-49.500,-37.965,10.000,89.926},
				{-53.370,-39.425,10.000,89.914},
				{-57.385,-40.885,10.000,89.901},
				{-61.547,-42.345,10.000,89.887},
				{-65.854,-43.806,10.000,89.870},
				{-70.308,-45.266,10.000,89.852},
				{-74.907,-46.726,10.000,89.833},
				{-79.653,-48.186,10.000,89.811},
				{-84.545,-49.646,10.000,89.787},
				{-89.582,-51.106,10.000,89.762},
				{-94.766,-52.567,10.000,89.734},
				{-100.096,-54.027,10.000,89.703},
				{-105.571,-55.487,10.000,89.670},
				{-111.193,-56.947,10.000,89.635},
				{-116.961,-58.407,10.000,89.596},
				{-122.875,-59.868,10.000,89.555},
				{-128.934,-61.328,10.000,89.511},
				{-135.140,-62.788,10.000,89.463},
				{-141.492,-64.248,10.000,89.412},
				{-147.990,-65.708,10.000,89.357},
				{-154.634,-67.168,10.000,89.299},
				{-161.423,-68.629,10.000,89.237},
				{-168.359,-70.089,10.000,89.170},
				{-175.441,-71.549,10.000,89.100},
				{-182.669,-73.009,10.000,89.025},
				{-190.043,-74.469,10.000,88.945},
				{-197.563,-75.930,10.000,88.860},
				{-205.229,-77.390,10.000,88.770},
				{-213.041,-78.850,10.000,88.675},
				{-220.999,-80.310,10.000,88.574},
				{-229.103,-81.770,10.000,88.468},
				{-237.353,-83.231,10.000,88.355},
				{-245.749,-84.691,10.000,88.236},
				{-254.291,-86.151,10.000,88.111},
				{-262.979,-87.611,10.000,87.978},
				{-271.813,-89.071,10.000,87.839},
				{-280.794,-90.531,10.000,87.692},
				{-289.920,-91.992,10.000,87.537},
				{-299.192,-93.452,10.000,87.373},
				{-308.610,-94.912,10.000,87.201},
				{-318.174,-96.372,10.000,87.020},
				{-327.884,-97.832,10.000,86.830},
				{-337.741,-99.293,10.000,86.630},
				{-347.743,-100.753,10.000,86.420},
				{-357.891,-102.213,10.000,86.198},
				{-368.186,-103.673,10.000,85.966},
				{-378.626,-105.133,10.000,85.722},
				{-389.212,-106.593,10.000,85.465},
				{-399.945,-108.054,10.000,85.195},
				{-410.823,-109.514,10.000,84.912},
				{-421.847,-110.974,10.000,84.614},
				{-433.018,-112.434,10.000,84.301},
				{-444.334,-113.894,10.000,83.973},
				{-455.797,-115.355,10.000,83.628},
				{-467.405,-116.815,10.000,83.265},
				{-479.160,-118.275,10.000,82.884},
				{-491.060,-119.735,10.000,82.483},
				{-503.107,-121.195,10.000,82.062},
				{-515.299,-122.656,10.000,81.619},
				{-527.638,-124.116,10.000,81.154},
				{-540.122,-125.576,10.000,80.665},
				{-552.753,-127.036,10.000,80.150},
				{-565.530,-128.496,10.000,79.608},
				{-578.452,-129.956,10.000,79.038},
				{-591.521,-131.417,10.000,78.439},
				{-604.735,-132.877,10.000,77.807},
				{-618.096,-134.337,10.000,77.142},
				{-631.603,-135.797,10.000,76.442},
				{-645.256,-137.257,10.000,75.705},
				{-659.054,-138.718,10.000,74.928},
				{-672.999,-140.178,10.000,74.109},
				{-687.090,-141.638,10.000,73.247},
				{-701.327,-143.098,10.000,72.339},
				{-715.710,-144.558,10.000,71.381},
				{-730.238,-146.018,10.000,70.373},
				{-744.913,-147.479,10.000,69.312},
				{-759.734,-148.939,10.000,68.194},
				{-774.701,-150.399,10.000,67.018},
				{-789.814,-151.859,10.000,65.782},
				{-805.073,-153.319,10.000,64.484},
				{-820.478,-154.780,10.000,63.122},
				{-836.029,-156.240,10.000,61.695},
				{-851.726,-157.700,10.000,60.202},
				{-867.569,-159.160,10.000,58.644},
				{-883.558,-160.620,10.000,57.020},
				{-899.693,-162.080,10.000,55.333},
				{-915.974,-163.541,10.000,53.585},
				{-932.401,-165.001,10.000,51.780},
				{-948.974,-166.461,10.000,49.922},
				{-965.693,-167.921,10.000,48.018},
				{-982.558,-169.381,10.000,46.075},
				{-999.569,-170.842,10.000,44.101},
				{-1016.727,-172.302,10.000,42.105},
				{-1034.030,-173.762,10.000,40.096},
				{-1051.479,-175.222,10.000,38.086},
				{-1069.074,-176.682,10.000,36.084},
				{-1086.815,-178.143,10.000,34.100},
				{-1104.703,-179.603,10.000,32.144},
				{-1122.736,-181.063,10.000,30.225},
				{-1140.915,-182.523,10.000,28.352},
				{-1159.241,-183.983,10.000,26.531},
				{-1177.712,-185.443,10.000,24.768},
				{-1196.329,-186.904,10.000,23.069},
				{-1215.093,-188.364,10.000,21.436},
				{-1234.002,-189.824,10.000,19.872},
				{-1253.057,-191.284,10.000,18.380},
				{-1272.259,-192.744,10.000,16.959},
				{-1291.606,-194.205,10.000,15.610},
				{-1311.100,-195.665,10.000,14.331},
				{-1330.739,-197.125,10.000,13.123},
				{-1350.525,-198.585,10.000,11.983},
				{-1370.456,-200.045,10.000,10.909},
				{-1390.534,-201.505,10.000,9.900},
				{-1410.757,-202.966,10.000,8.953},
				{-1431.127,-204.426,10.000,8.066},
				{-1451.643,-205.886,10.000,7.236},
				{-1472.304,-207.346,10.000,6.462},
				{-1493.112,-208.806,10.000,5.742},
				{-1514.065,-210.267,10.000,5.072},
				{-1535.165,-211.727,10.000,4.451},
				{-1556.411,-213.187,10.000,3.877},
				{-1577.803,-214.647,10.000,3.347},
				{-1599.340,-216.107,10.000,2.861},
				{-1621.024,-217.568,10.000,2.416},
				{-1642.854,-219.028,10.000,2.010},
				{-1664.830,-220.488,10.000,1.643},
				{-1686.951,-221.948,10.000,1.312},
				{-1709.219,-223.408,10.000,1.016},
				{-1731.633,-224.868,10.000,0.754},
				{-1754.193,-226.329,10.000,0.524},
				{-1776.899,-227.789,10.000,0.325},
				{-1799.751,-229.249,10.000,0.157},
				{-1822.749,-230.709,10.000,0.017},
				{-1845.892,-232.169,10.000,-0.096},
				{-1869.182,-233.630,10.000,-0.182},
				{-1892.618,-235.090,10.000,-0.243},
				{-1916.200,-236.550,10.000,-0.280},
				{-1939.928,-238.010,10.000,-0.294},
				{-1963.802,-239.470,10.000,-0.288},
				{-1987.822,-240.930,10.000,-0.261},
				{-2011.974,-242.099,10.000,-0.217},
				{-2036.228,-242.975,10.000,-0.156},
				{-2060.554,-243.559,10.000,-0.080},
				{-2084.925,-243.851,10.000,0.007},
				{-2109.310,-243.851,10.000,0.105},
				{-2133.695,-243.851,10.000,0.209},
				{-2158.080,-243.851,10.000,0.318},
				{-2182.465,-243.851,10.000,0.429},
				{-2206.850,-243.851,10.000,0.539},
				{-2231.235,-243.851,10.000,0.645},
				{-2255.620,-243.851,10.000,0.743},
				{-2279.991,-243.562,10.000,0.830},
				{-2304.318,-242.981,10.000,0.903},
				{-2328.572,-242.108,10.000,0.958},
				{-2352.725,-240.943,10.000,0.991},
				{-2376.746,-239.486,10.000,0.997},
				{-2400.622,-238.025,10.000,0.897},
				{-2424.351,-236.565,10.000,0.666},
				{-2447.935,-235.105,10.000,0.319},
				{-2471.372,-233.645,10.000,-0.128},
				{-2494.664,-232.185,10.000,-0.660},
				{-2517.809,-230.724,10.000,-1.262},
				{-2540.809,-229.264,10.000,-1.924},
				{-2563.662,-227.804,10.000,-2.630},
				{-2586.370,-226.344,10.000,-3.371},
				{-2608.931,-224.884,10.000,-4.135},
				{-2631.346,-223.424,10.000,-4.913},
				{-2653.616,-221.963,10.000,-5.696},
				{-2675.739,-220.503,10.000,-6.475},
				{-2697.716,-219.043,10.000,-7.244},
				{-2719.548,-217.583,10.000,-7.996},
				{-2741.233,-216.123,10.000,-8.725},
				{-2762.772,-214.662,10.000,-9.427},
				{-2784.165,-213.202,10.000,-10.098},
				{-2805.413,-211.742,10.000,-10.734},
				{-2826.514,-210.282,10.000,-11.332},
				{-2847.469,-208.822,10.000,-11.891},
				{-2868.278,-207.361,10.000,-12.408},
				{-2888.941,-205.901,10.000,-12.881},
				{-2909.458,-204.441,10.000,-13.311},
				{-2929.829,-202.981,10.000,-13.695},
				{-2950.055,-201.521,10.000,-14.034},
				{-2970.134,-200.061,10.000,-14.327},
				{-2990.067,-198.600,10.000,-14.574},
				{-3009.854,-197.140,10.000,-14.774},
				{-3029.495,-195.680,10.000,-14.928},
				{-3048.990,-194.220,10.000,-15.035},
				{-3068.339,-192.760,10.000,-15.096},
				{-3087.542,-191.299,10.000,-15.111},
				{-3106.599,-189.839,10.000,-15.080},
				{-3125.509,-188.379,10.000,-15.002},
				{-3144.274,-186.919,10.000,-14.878},
				{-3162.893,-185.459,10.000,-14.709},
				{-3181.366,-183.999,10.000,-14.493},
				{-3199.693,-182.538,10.000,-14.232},
				{-3217.874,-181.078,10.000,-13.925},
				{-3235.909,-179.618,10.000,-13.572},
				{-3253.797,-178.158,10.000,-13.173},
				{-3271.540,-176.698,10.000,-12.728},
				{-3289.137,-175.237,10.000,-12.238},
				{-3306.588,-173.777,10.000,-11.702},
				{-3323.892,-172.317,10.000,-11.121},
				{-3341.051,-170.857,10.000,-10.495},
				{-3358.064,-169.397,10.000,-9.824},
				{-3374.930,-167.936,10.000,-9.108},
				{-3391.651,-166.476,10.000,-8.349},
				{-3408.226,-165.016,10.000,-7.547},
				{-3424.654,-163.556,10.000,-6.702},
				{-3440.937,-162.096,10.000,-5.816},
				{-3457.073,-160.636,10.000,-4.890},
				{-3473.064,-159.175,10.000,-3.926},
				{-3488.908,-157.715,10.000,-2.925},
				{-3504.607,-156.255,10.000,-1.889},
				{-3520.159,-154.795,10.000,-0.821},
				{-3535.566,-153.335,10.000,0.277},
				{-3550.826,-151.874,10.000,1.402},
				{-3565.941,-150.414,10.000,2.552},
				{-3580.909,-148.954,10.000,3.722},
				{-3595.732,-147.494,10.000,4.910},
				{-3610.408,-146.034,10.000,6.113},
				{-3624.938,-144.574,10.000,7.326},
				{-3639.323,-143.113,10.000,8.546},
				{-3653.561,-141.653,10.000,9.769},
				{-3667.653,-140.193,10.000,10.992},
				{-3681.600,-138.733,10.000,12.210},
				{-3695.400,-137.273,10.000,13.421},
				{-3709.054,-135.812,10.000,14.622},
				{-3722.562,-134.352,10.000,15.808},
				{-3735.925,-132.892,10.000,16.977},
				{-3749.141,-131.432,10.000,18.127},
				{-3762.211,-129.972,10.000,19.255},
				{-3775.135,-128.512,10.000,20.359},
				{-3787.913,-127.051,10.000,21.437},
				{-3800.545,-125.591,10.000,22.488},
				{-3813.032,-124.131,10.000,23.511},
				{-3825.372,-122.671,10.000,24.504},
				{-3837.566,-121.211,10.000,25.467},
				{-3849.614,-119.750,10.000,26.399},
				{-3861.516,-118.290,10.000,27.300},
				{-3873.272,-116.830,10.000,28.170},
				{-3884.882,-115.370,10.000,29.008},
				{-3896.346,-113.910,10.000,29.816},
				{-3907.664,-112.449,10.000,30.593},
				{-3918.836,-110.989,10.000,31.340},
				{-3929.862,-109.529,10.000,32.056},
				{-3940.741,-108.069,10.000,32.744},
				{-3951.475,-106.609,10.000,33.404},
				{-3962.063,-105.149,10.000,34.035},
				{-3972.505,-103.688,10.000,34.640},
				{-3982.801,-102.228,10.000,35.218},
				{-3992.951,-100.768,10.000,35.771},
				{-4002.955,-99.308,10.000,36.298},
				{-4012.812,-97.848,10.000,36.802},
				{-4022.524,-96.387,10.000,37.283},
				{-4032.090,-94.927,10.000,37.742},
				{-4041.509,-93.467,10.000,38.179},
				{-4050.783,-92.007,10.000,38.595},
				{-4059.911,-90.547,10.000,38.991},
				{-4068.893,-89.087,10.000,39.368},
				{-4077.728,-87.626,10.000,39.726},
				{-4086.418,-86.166,10.000,40.066},
				{-4094.961,-84.706,10.000,40.389},
				{-4103.359,-83.246,10.000,40.696},
				{-4111.611,-81.786,10.000,40.987},
				{-4119.716,-80.325,10.000,41.262},
				{-4127.676,-78.865,10.000,41.523},
				{-4135.489,-77.405,10.000,41.769},
				{-4143.157,-75.945,10.000,42.002},
				{-4150.678,-74.485,10.000,42.222},
				{-4158.054,-73.024,10.000,42.430},
				{-4165.283,-71.564,10.000,42.626},
				{-4172.366,-70.104,10.000,42.810},
				{-4179.304,-68.644,10.000,42.983},
				{-4186.095,-67.184,10.000,43.146},
				{-4192.741,-65.724,10.000,43.299},
				{-4199.240,-64.263,10.000,43.442},
				{-4205.593,-62.803,10.000,43.576},
				{-4211.801,-61.343,10.000,43.701},
				{-4217.862,-59.883,10.000,43.818},
				{-4223.777,-58.423,10.000,43.926},
				{-4229.546,-56.962,10.000,44.027},
				{-4235.170,-55.502,10.000,44.121},
				{-4240.647,-54.042,10.000,44.208},
				{-4245.978,-52.582,10.000,44.289},
				{-4251.163,-51.122,10.000,44.363},
				{-4256.202,-49.662,10.000,44.431},
				{-4261.096,-48.201,10.000,44.494},
				{-4265.843,-46.741,10.000,44.552},
				{-4270.444,-45.281,10.000,44.604},
				{-4274.899,-43.821,10.000,44.652},
				{-4279.208,-42.361,10.000,44.695},
				{-4283.371,-40.900,10.000,44.734},
				{-4287.388,-39.440,10.000,44.770},
				{-4291.259,-37.980,10.000,44.801},
				{-4294.984,-36.520,10.000,44.830},
				{-4298.563,-35.060,10.000,44.855},
				{-4301.996,-33.600,10.000,44.877},
				{-4305.283,-32.139,10.000,44.897},
				{-4308.424,-30.679,10.000,44.914},
				{-4311.419,-29.219,10.000,44.929},
				{-4314.268,-27.759,10.000,44.942},
				{-4316.970,-26.299,10.000,44.953},
				{-4319.527,-24.838,10.000,44.963},
				{-4321.938,-23.378,10.000,44.971},
				{-4324.203,-21.918,10.000,44.977},
				{-4326.322,-20.458,10.000,44.983},
				{-4328.295,-18.998,10.000,44.987},
				{-4330.121,-17.537,10.000,44.991},
				{-4331.802,-16.077,10.000,44.993},
				{-4333.337,-14.617,10.000,44.995},
				{-4334.725,-13.157,10.000,44.997},
				{-4335.968,-11.697,10.000,44.998},
				{-4337.065,-10.237,10.000,44.999},
				{-4338.015,-8.776,10.000,44.999},
				{-4338.820,-7.316,10.000,45.000},
				{-4339.479,-5.856,10.000,45.000},
				{-4339.991,-4.396,10.000,45.000},
				{-4340.358,-2.936,10.000,45.000},
				{-4340.593,-1.764,10.000,45.000},
				{-4340.725,-0.885,10.000,45.000},
				{-4340.785,-0.298,10.000,45.000},
				{-4340.800,-0.003,10.000,45.000},
				{-4340.800,-0.000,10.000,45.000},
				{-4340.800,-0.000,10.000,45.000}		};

}