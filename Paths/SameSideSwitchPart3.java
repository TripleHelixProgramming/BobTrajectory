package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (14.33,21.50,-90.00)
	// (17.50,23.83,-179.00)
	// (21.25,24.25,-135.00)
	
	public SameSideSwitchPart3() {
		this(false);
	}
			
    public SameSideSwitchPart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.015,-0.292,10.000},
				{-0.073,-0.584,10.000},
				{-0.204,-1.314,10.000},
				{-0.438,-2.336,10.000},
				{-0.803,-3.649,10.000},
				{-1.314,-5.107,10.000},
				{-1.970,-6.564,10.000},
				{-2.772,-8.019,10.000},
				{-3.719,-9.472,10.000},
				{-4.812,-10.923,10.000},
				{-6.049,-12.371,10.000},
				{-7.430,-13.815,10.000},
				{-8.956,-15.256,10.000},
				{-10.625,-16.692,10.000},
				{-12.437,-18.125,10.000},
				{-14.393,-19.552,10.000},
				{-16.490,-20.975,10.000},
				{-18.729,-22.392,10.000},
				{-21.110,-23.803,10.000},
				{-23.630,-25.208,10.000},
				{-26.291,-26.606,10.000},
				{-29.091,-27.998,10.000},
				{-32.029,-29.382,10.000},
				{-35.105,-30.759,10.000},
				{-38.318,-32.128,10.000},
				{-41.666,-33.488,10.000},
				{-45.150,-34.841,10.000},
				{-48.769,-36.184,10.000},
				{-52.521,-37.518,10.000},
				{-56.405,-38.842,10.000},
				{-60.421,-40.157,10.000},
				{-64.567,-41.461,10.000},
				{-68.842,-42.755,10.000},
				{-73.246,-44.038,10.000},
				{-77.777,-45.310,10.000},
				{-82.434,-46.570,10.000},
				{-87.216,-47.818,10.000},
				{-92.121,-49.054,10.000},
				{-97.149,-50.277,10.000},
				{-102.297,-51.487,10.000},
				{-107.566,-52.683,10.000},
				{-112.952,-53.866,10.000},
				{-118.456,-55.034,10.000},
				{-124.074,-56.187,10.000},
				{-129.807,-57.325,10.000},
				{-135.652,-58.448,10.000},
				{-141.607,-59.554,10.000},
				{-147.671,-60.643,10.000},
				{-153.843,-61.714,10.000},
				{-160.120,-62.768,10.000},
				{-166.500,-63.803,10.000},
				{-172.982,-64.819,10.000},
				{-179.563,-65.815,10.000},
				{-186.242,-66.790,10.000},
				{-193.017,-67.743,10.000},
				{-199.884,-68.673,10.000},
				{-206.842,-69.581,10.000},
				{-213.888,-70.464,10.000},
				{-221.020,-71.321,10.000},
				{-228.236,-72.152,10.000},
				{-235.531,-72.955,10.000},
				{-242.904,-73.729,10.000},
				{-250.351,-74.472,10.000},
				{-257.870,-75.184,10.000},
				{-265.456,-75.862,10.000},
				{-273.106,-76.506,10.000},
				{-280.818,-77.112,10.000},
				{-288.586,-77.679,10.000},
				{-296.406,-78.206,10.000},
				{-304.275,-78.689,10.000},
				{-312.188,-79.127,10.000},
				{-320.140,-79.517,10.000},
				{-328.125,-79.856,10.000},
				{-336.139,-80.142,10.000},
				{-344.176,-80.370,10.000},
				{-352.230,-80.539,10.000},
				{-360.295,-80.643,10.000},
				{-368.363,-80.680,10.000},
				{-376.427,-80.645,10.000},
				{-384.481,-80.534,10.000},
				{-392.515,-80.341,10.000},
				{-400.521,-80.063,10.000},
				{-408.490,-79.692,10.000},
				{-416.413,-79.224,10.000},
				{-424.278,-78.652,10.000},
				{-432.075,-77.969,10.000},
				{-439.791,-77.168,10.000},
				{-447.416,-76.243,10.000},
				{-454.934,-75.184,10.000},
				{-462.332,-73.983,10.000},
				{-469.596,-72.632,10.000},
				{-476.708,-71.122,10.000},
				{-483.652,-69.442,10.000},
				{-490.411,-67.584,10.000},
				{-496.964,-65.537,10.000},
				{-503.294,-63.292,10.000},
				{-509.377,-60.839,10.000},
				{-515.194,-58.168,10.000},
				{-520.721,-55.272,10.000},
				{-525.936,-52.144,10.000},
				{-530.814,-48.777,10.000},
				{-535.330,-45.169,10.000},
				{-539.462,-41.320,10.000},
				{-543.186,-37.234,10.000},
				{-546.478,-32.919,10.000},
				{-549.317,-28.391,10.000},
				{-551.684,-23.671,10.000},
				{-553.563,-18.792,10.000},
				{-554.942,-13.792,10.000},
				{-555.815,-8.724,10.000},
				{-556.180,-3.652,10.000},
				{-556.315,-1.350,10.000},
				{-556.934,-6.193,10.000},
				{-558.012,-10.778,10.000},
				{-559.512,-14.998,10.000},
				{-561.385,-18.737,10.000},
				{-563.574,-21.881,10.000},
				{-566.005,-24.316,10.000},
				{-568.599,-25.939,10.000},
				{-571.265,-26.662,10.000},
				{-573.907,-26.417,10.000},
				{-576.423,-25.163,10.000},
				{-578.712,-22.884,10.000},
				{-580.672,-19.597,10.000},
				{-582.206,-15.345,10.000},
				{-583.226,-10.197,10.000},
				{-583.650,-4.242,10.000},
				{-583.892,-2.417,10.000},
				{-584.858,-9.667,10.000},
				{-586.598,-17.393,10.000},
				{-589.146,-25.481,10.000},
				{-592.528,-33.826,10.000},
				{-596.761,-42.329,10.000},
				{-601.852,-50.904,10.000},
				{-607.799,-59.478,10.000},
				{-614.598,-67.988,10.000},
				{-622.237,-76.384,10.000},
				{-630.699,-84.628,10.000},
				{-639.968,-92.690,10.000},
				{-650.023,-100.548,10.000},
				{-660.842,-108.190,10.000},
				{-672.403,-115.607,10.000},
				{-684.683,-122.796,10.000},
				{-697.658,-129.758,10.000},
				{-711.308,-136.496,10.000},
				{-725.609,-143.016,10.000},
				{-740.542,-149.326,10.000},
				{-756.085,-155.434,10.000},
				{-772.220,-161.349,10.000},
				{-788.928,-167.080,10.000},
				{-806.192,-172.636,10.000},
				{-823.995,-178.028,10.000},
				{-842.321,-183.262,10.000},
				{-861.156,-188.347,10.000},
				{-880.485,-193.291,10.000},
				{-900.295,-198.100,10.000},
				{-920.573,-202.779,10.000},
				{-941.306,-207.333,10.000},
				{-962.483,-211.766,10.000},
				{-984.091,-216.079,10.000},
				{-1006.118,-220.274,10.000},
				{-1028.553,-224.351,10.000},
				{-1051.384,-228.306,10.000},
				{-1074.597,-232.139,10.000},
				{-1098.182,-235.842,10.000},
				{-1122.123,-239.409,10.000},
				{-1146.406,-242.832,10.000},
				{-1171.001,-245.951,10.000},
				{-1195.861,-248.599,10.000},
				{-1220.936,-250.754,10.000},
				{-1246.176,-252.398,10.000},
				{-1271.527,-253.511,10.000},
				{-1296.950,-254.227,10.000},
				{-1322.418,-254.684,10.000},
				{-1347.905,-254.865,10.000},
				{-1373.380,-254.757,10.000},
				{-1398.815,-254.342,10.000},
				{-1424.175,-253.605,10.000},
				{-1449.413,-252.382,10.000},
				{-1474.465,-250.513,10.000},
				{-1499.264,-247.992,10.000},
				{-1523.747,-244.827,10.000},
				{-1547.827,-240.801,10.000},
				{-1570.708,-228.808,10.000},
				{-1592.138,-214.305,10.000},
				{-1612.278,-201.401,10.000},
				{-1631.281,-190.027,10.000},
				{-1649.292,-180.110,10.000},
				{-1666.450,-171.576,10.000},
				{-1682.884,-164.349,10.000},
				{-1698.719,-158.350,10.000},
				{-1714.069,-153.497,10.000},
				{-1729.040,-149.707,10.000},
				{-1743.729,-146.893,10.000},
				{-1758.226,-144.968,10.000},
				{-1772.610,-143.845,10.000},
				{-1786.954,-143.437,10.000},
				{-1801.320,-143.660,10.000},
				{-1815.763,-144.432,10.000},
				{-1830.331,-145.679,10.000},
				{-1845.064,-147.329,10.000},
				{-1859.996,-149.318,10.000},
				{-1875.155,-151.586,10.000},
				{-1890.563,-154.082,10.000},
				{-1906.239,-156.760,10.000},
				{-1922.197,-159.582,10.000},
				{-1938.448,-162.512,10.000},
				{-1955.001,-165.524,10.000},
				{-1971.860,-168.594,10.000},
				{-1989.030,-171.704,10.000},
				{-2006.514,-174.837,10.000},
				{-2024.313,-177.984,10.000},
				{-2042.426,-181.136,10.000},
				{-2060.855,-184.286,10.000},
				{-2079.598,-187.430,10.000},
				{-2098.655,-190.567,10.000},
				{-2118.024,-193.696,10.000},
				{-2137.706,-196.815,10.000},
				{-2157.698,-199.927,10.000},
				{-2178.002,-203.032,10.000},
				{-2198.615,-206.132,10.000},
				{-2219.537,-209.227,10.000},
				{-2240.769,-212.318,10.000},
				{-2262.310,-215.407,10.000},
				{-2284.159,-218.492,10.000},
				{-2306.316,-221.572,10.000},
				{-2328.781,-224.645,10.000},
				{-2351.552,-227.708,10.000},
				{-2374.627,-230.754,10.000},
				{-2398.005,-233.777,10.000},
				{-2421.681,-236.768,10.000},
				{-2445.653,-239.716,10.000},
				{-2469.914,-242.610,10.000},
				{-2494.457,-245.433,10.000},
				{-2519.274,-248.170,10.000},
				{-2544.354,-250.800,10.000},
				{-2569.685,-253.304,10.000},
				{-2595.251,-255.660,10.000},
				{-2621.035,-257.842,10.000},
				{-2647.018,-259.827,10.000},
				{-2673.177,-261.590,10.000},
				{-2699.487,-263.104,10.000},
				{-2725.922,-264.347,10.000},
				{-2752.451,-265.295,10.000},
				{-2779.044,-265.926,10.000},
				{-2805.666,-266.224,10.000},
				{-2832.284,-266.173,10.000},
				{-2858.860,-265.763,10.000},
				{-2885.359,-264.987,10.000},
				{-2911.743,-263.844,10.000},
				{-2937.977,-262.336,10.000},
				{-2964.024,-260.470,10.000},
				{-2989.850,-258.260,10.000},
				{-3015.422,-255.722,10.000},
				{-3040.709,-252.874,10.000},
				{-3065.683,-249.740,10.000},
				{-3090.318,-246.345,10.000},
				{-3114.589,-242.715,10.000},
				{-3138.477,-238.879,10.000},
				{-3161.963,-234.863,10.000},
				{-3185.033,-230.697,10.000},
				{-3207.674,-226.406,10.000},
				{-3229.875,-222.016,10.000},
				{-3251.631,-217.553,10.000},
				{-3272.934,-213.038,10.000},
				{-3293.783,-208.491,10.000},
				{-3314.177,-203.932,10.000},
				{-3334.114,-199.377,10.000},
				{-3353.599,-194.841,10.000},
				{-3372.632,-190.335,10.000},
				{-3391.219,-185.872,10.000},
				{-3409.365,-181.459,10.000},
				{-3427.076,-177.105,10.000},
				{-3444.357,-172.815,10.000},
				{-3461.217,-168.595,10.000},
				{-3477.661,-164.447,10.000},
				{-3493.699,-160.375,10.000},
				{-3509.337,-156.381,10.000},
				{-3524.583,-152.465,10.000},
				{-3539.446,-148.628,10.000},
				{-3553.933,-144.870,10.000},
				{-3568.052,-141.190,10.000},
				{-3581.811,-137.588,10.000},
				{-3595.217,-134.062,10.000},
				{-3608.278,-130.611,10.000},
				{-3621.002,-127.233,10.000},
				{-3633.394,-123.926,10.000},
				{-3645.463,-120.689,10.000},
				{-3657.215,-117.520,10.000},
				{-3668.657,-114.417,10.000},
				{-3679.794,-111.377,10.000},
				{-3690.634,-108.399,10.000},
				{-3701.182,-105.481,10.000},
				{-3711.445,-102.622,10.000},
				{-3721.426,-99.818,10.000},
				{-3731.133,-97.069,10.000},
				{-3740.571,-94.372,10.000},
				{-3749.743,-91.726,10.000},
				{-3758.656,-89.130,10.000},
				{-3767.314,-86.581,10.000},
				{-3775.722,-84.079,10.000},
				{-3783.884,-81.621,10.000},
				{-3791.805,-79.206,10.000},
				{-3799.488,-76.833,10.000},
				{-3806.938,-74.502,10.000},
				{-3814.159,-72.209,10.000},
				{-3821.155,-69.955,10.000},
				{-3827.929,-67.738,10.000},
				{-3834.484,-65.558,10.000},
				{-3840.826,-63.412,10.000},
				{-3846.956,-61.301,10.000},
				{-3852.878,-59.222,10.000},
				{-3858.595,-57.176,10.000},
				{-3864.112,-55.161,10.000},
				{-3869.429,-53.177,10.000},
				{-3874.551,-51.222,10.000},
				{-3879.481,-49.296,10.000},
				{-3884.221,-47.398,10.000},
				{-3888.773,-45.526,10.000},
				{-3893.142,-43.682,10.000},
				{-3897.328,-41.862,10.000},
				{-3901.335,-40.068,10.000},
				{-3905.164,-38.297,10.000},
				{-3908.819,-36.549,10.000},
				{-3912.302,-34.824,10.000},
				{-3915.614,-33.120,10.000},
				{-3918.757,-31.437,10.000},
				{-3921.735,-29.774,10.000},
				{-3924.548,-28.129,10.000},
				{-3927.198,-26.503,10.000},
				{-3929.687,-24.895,10.000},
				{-3932.018,-23.302,10.000},
				{-3934.190,-21.725,10.000},
				{-3936.206,-20.163,10.000},
				{-3938.068,-18.615,10.000},
				{-3939.776,-17.079,10.000},
				{-3941.331,-15.555,10.000},
				{-3942.735,-14.042,10.000},
				{-3943.989,-12.539,10.000},
				{-3945.094,-11.044,10.000},
				{-3946.049,-9.558,10.000},
				{-3946.857,-8.078,10.000},
				{-3947.518,-6.604,10.000},
				{-3948.031,-5.135,10.000},
				{-3948.398,-3.670,10.000},
				{-3948.633,-2.351,10.000},
				{-3948.766,-1.325,10.000},
				{-3948.825,-0.592,10.000},
				{-3948.840,-0.151,10.000},
				{-3948.840,-0.002,10.000},
				{-3948.840,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.015,-0.292,10.000},
				{-0.073,-0.584,10.000},
				{-0.204,-1.314,10.000},
				{-0.438,-2.337,10.000},
				{-0.803,-3.652,10.000},
				{-1.315,-5.114,10.000},
				{-1.972,-6.577,10.000},
				{-2.777,-8.043,10.000},
				{-3.728,-9.510,10.000},
				{-4.826,-10.980,10.000},
				{-6.071,-12.453,10.000},
				{-7.464,-13.929,10.000},
				{-9.005,-15.408,10.000},
				{-10.694,-16.892,10.000},
				{-12.532,-18.380,10.000},
				{-14.519,-19.873,10.000},
				{-16.656,-21.371,10.000},
				{-18.944,-22.874,10.000},
				{-21.382,-24.383,10.000},
				{-23.972,-25.899,10.000},
				{-26.714,-27.421,10.000},
				{-29.609,-28.949,10.000},
				{-32.657,-30.486,10.000},
				{-35.860,-32.029,10.000},
				{-39.218,-33.581,10.000},
				{-42.732,-35.140,10.000},
				{-46.403,-36.708,10.000},
				{-50.232,-38.286,10.000},
				{-54.219,-39.872,10.000},
				{-58.366,-41.468,10.000},
				{-62.673,-43.074,10.000},
				{-67.142,-44.690,10.000},
				{-71.774,-46.316,10.000},
				{-76.569,-47.954,10.000},
				{-81.529,-49.602,10.000},
				{-86.655,-51.263,10.000},
				{-91.949,-52.935,10.000},
				{-97.411,-54.619,10.000},
				{-103.042,-56.317,10.000},
				{-108.845,-58.027,10.000},
				{-114.820,-59.751,10.000},
				{-120.969,-61.489,10.000},
				{-127.293,-63.241,10.000},
				{-133.794,-65.008,10.000},
				{-140.473,-66.790,10.000},
				{-147.332,-68.588,10.000},
				{-154.372,-70.403,10.000},
				{-161.596,-72.234,10.000},
				{-169.004,-74.083,10.000},
				{-176.599,-75.949,10.000},
				{-184.382,-77.835,10.000},
				{-192.356,-79.739,10.000},
				{-200.523,-81.664,10.000},
				{-208.884,-83.609,10.000},
				{-217.441,-85.577,10.000},
				{-226.198,-87.566,10.000},
				{-235.156,-89.579,10.000},
				{-244.318,-91.617,10.000},
				{-253.686,-93.680,10.000},
				{-263.263,-95.769,10.000},
				{-273.051,-97.887,10.000},
				{-283.054,-100.033,10.000},
				{-293.275,-102.210,10.000},
				{-303.717,-104.419,10.000},
				{-314.383,-106.661,10.000},
				{-325.277,-108.938,10.000},
				{-336.402,-111.252,10.000},
				{-347.763,-113.605,10.000},
				{-359.363,-115.999,10.000},
				{-371.206,-118.436,10.000},
				{-383.298,-120.918,10.000},
				{-395.643,-123.448,10.000},
				{-408.246,-126.030,10.000},
				{-421.112,-128.664,10.000},
				{-434.248,-131.356,10.000},
				{-447.659,-134.108,10.000},
				{-461.351,-136.924,10.000},
				{-475.332,-139.807,10.000},
				{-489.608,-142.763,10.000},
				{-504.188,-145.794,10.000},
				{-519.078,-148.907,10.000},
				{-534.289,-152.106,10.000},
				{-549.829,-155.397,10.000},
				{-565.707,-158.786,10.000},
				{-581.935,-162.278,10.000},
				{-598.523,-165.881,10.000},
				{-615.483,-169.602,10.000},
				{-632.828,-173.448,10.000},
				{-650.571,-177.427,10.000},
				{-668.726,-181.548,10.000},
				{-687.308,-185.819,10.000},
				{-706.333,-190.250,10.000},
				{-725.818,-194.850,10.000},
				{-745.780,-199.628,10.000},
				{-766.240,-204.595,10.000},
				{-787.216,-209.761,10.000},
				{-808.729,-215.134,10.000},
				{-830.802,-220.725,10.000},
				{-853.456,-226.541,10.000},
				{-876.715,-232.589,10.000},
				{-900.602,-238.876,10.000},
				{-925.143,-245.404,10.000},
				{-950.360,-252.173,10.000},
				{-976.278,-259.179,10.000},
				{-1002.919,-266.414,10.000},
				{-1030.306,-273.862,10.000},
				{-1058.456,-281.501,10.000},
				{-1087.386,-289.300,10.000},
				{-1117.108,-297.219,10.000},
				{-1147.628,-305.206,10.000},
				{-1178.948,-313.198,10.000},
				{-1211.060,-321.120,10.000},
				{-1243.948,-328.882,10.000},
				{-1277.587,-336.387,10.000},
				{-1311.939,-343.526,10.000},
				{-1346.958,-350.185,10.000},
				{-1382.583,-356.248,10.000},
				{-1418.743,-361.603,10.000},
				{-1455.358,-366.146,10.000},
				{-1492.336,-369.788,10.000},
				{-1529.583,-372.464,10.000},
				{-1566.996,-374.129,10.000},
				{-1604.473,-374.771,10.000},
				{-1641.913,-374.404,10.000},
				{-1679.220,-373.073,10.000},
				{-1716.305,-370.846,10.000},
				{-1753.086,-367.812,10.000},
				{-1789.494,-364.074,10.000},
				{-1825.468,-359.745,10.000},
				{-1860.962,-354.941,10.000},
				{-1895.939,-349.773,10.000},
				{-1930.374,-344.350,10.000},
				{-1964.251,-338.768,10.000},
				{-1997.563,-333.114,10.000},
				{-2030.309,-327.462,10.000},
				{-2062.496,-321.873,10.000},
				{-2094.136,-316.398,10.000},
				{-2125.244,-311.075,10.000},
				{-2155.837,-305.935,10.000},
				{-2185.937,-300.997,10.000},
				{-2215.565,-296.277,10.000},
				{-2244.743,-291.781,10.000},
				{-2273.494,-287.512,10.000},
				{-2301.841,-283.472,10.000},
				{-2329.806,-279.654,10.000},
				{-2357.412,-276.055,10.000},
				{-2384.678,-272.665,10.000},
				{-2411.626,-269.478,10.000},
				{-2438.275,-266.484,10.000},
				{-2464.642,-263.673,10.000},
				{-2490.746,-261.037,10.000},
				{-2516.602,-258.567,10.000},
				{-2542.228,-256.253,10.000},
				{-2567.636,-254.088,10.000},
				{-2592.843,-252.065,10.000},
				{-2617.861,-250.176,10.000},
				{-2642.702,-248.418,10.000},
				{-2667.381,-246.784,10.000},
				{-2691.908,-245.272,10.000},
				{-2716.296,-243.879,10.000},
				{-2740.556,-242.604,10.000},
				{-2764.701,-241.448,10.000},
				{-2788.742,-240.413,10.000},
				{-2812.692,-239.501,10.000},
				{-2836.564,-238.718,10.000},
				{-2860.371,-238.071,10.000},
				{-2884.128,-237.568,10.000},
				{-2907.836,-237.078,10.000},
				{-2931.483,-236.475,10.000},
				{-2955.061,-235.779,10.000},
				{-2978.562,-235.011,10.000},
				{-3001.981,-234.190,10.000},
				{-3025.329,-233.474,10.000},
				{-3048.631,-233.018,10.000},
				{-3071.914,-232.836,10.000},
				{-3095.209,-232.945,10.000},
				{-3118.545,-233.360,10.000},
				{-3141.954,-234.096,10.000},
				{-3165.457,-235.030,10.000},
				{-3189.060,-236.030,10.000},
				{-3212.770,-237.096,10.000},
				{-3236.592,-238.223,10.000},
				{-3260.555,-239.627,10.000},
				{-3285.425,-248.703,10.000},
				{-3311.454,-260.285,10.000},
				{-3338.481,-270.268,10.000},
				{-3366.353,-278.721,10.000},
				{-3394.925,-285.717,10.000},
				{-3424.058,-291.331,10.000},
				{-3453.621,-295.637,10.000},
				{-3483.493,-298.716,10.000},
				{-3513.558,-300.648,10.000},
				{-3543.710,-301.517,10.000},
				{-3573.851,-301.411,10.000},
				{-3603.892,-300.415,10.000},
				{-3633.754,-298.618,10.000},
				{-3663.365,-296.106,10.000},
				{-3692.661,-292.963,10.000},
				{-3721.588,-289.270,10.000},
				{-3750.098,-285.103,10.000},
				{-3778.151,-280.533,10.000},
				{-3805.714,-275.624,10.000},
				{-3832.757,-270.436,10.000},
				{-3859.259,-265.020,10.000},
				{-3885.202,-259.421,10.000},
				{-3910.570,-253.680,10.000},
				{-3935.352,-247.829,10.000},
				{-3959.542,-241.897,10.000},
				{-3983.133,-235.907,10.000},
				{-4006.121,-229.877,10.000},
				{-4028.503,-223.823,10.000},
				{-4050.278,-217.756,10.000},
				{-4071.447,-211.684,10.000},
				{-4092.008,-205.614,10.000},
				{-4111.963,-199.549,10.000},
				{-4131.312,-193.492,10.000},
				{-4150.057,-187.443,10.000},
				{-4168.197,-181.403,10.000},
				{-4185.734,-175.371,10.000},
				{-4202.669,-169.345,10.000},
				{-4219.001,-163.325,10.000},
				{-4234.732,-157.310,10.000},
				{-4249.862,-151.298,10.000},
				{-4264.391,-145.289,10.000},
				{-4278.319,-139.283,10.000},
				{-4291.647,-133.282,10.000},
				{-4304.376,-127.288,10.000},
				{-4316.507,-121.306,10.000},
				{-4328.041,-115.339,10.000},
				{-4338.980,-109.396,10.000},
				{-4349.329,-103.484,10.000},
				{-4359.090,-97.615,10.000},
				{-4368.270,-91.801,10.000},
				{-4376.876,-86.057,10.000},
				{-4384.916,-80.400,10.000},
				{-4392.401,-74.848,10.000},
				{-4399.343,-69.423,10.000},
				{-4405.758,-64.148,10.000},
				{-4411.662,-59.044,10.000},
				{-4417.076,-54.139,10.000},
				{-4422.022,-49.456,10.000},
				{-4426.524,-45.020,10.000},
				{-4430.609,-40.857,10.000},
				{-4434.308,-36.989,10.000},
				{-4437.652,-33.437,10.000},
				{-4440.674,-30.219,10.000},
				{-4443.409,-27.349,10.000},
				{-4445.893,-24.839,10.000},
				{-4448.162,-22.694,10.000},
				{-4450.254,-20.917,10.000},
				{-4452.204,-19.505,10.000},
				{-4454.049,-18.450,10.000},
				{-4455.823,-17.740,10.000},
				{-4457.559,-17.358,10.000},
				{-4459.288,-17.286,10.000},
				{-4461.038,-17.500,10.000},
				{-4462.835,-17.975,10.000},
				{-4464.703,-18.684,10.000},
				{-4466.664,-19.601,10.000},
				{-4468.733,-20.696,10.000},
				{-4470.927,-21.942,10.000},
				{-4473.259,-23.313,10.000},
				{-4475.737,-24.782,10.000},
				{-4478.369,-26.326,10.000},
				{-4481.162,-27.921,10.000},
				{-4484.116,-29.547,10.000},
				{-4487.235,-31.186,10.000},
				{-4490.517,-32.820,10.000},
				{-4493.960,-34.437,10.000},
				{-4497.563,-36.022,10.000},
				{-4501.319,-37.565,10.000},
				{-4505.225,-39.058,10.000},
				{-4509.274,-40.492,10.000},
				{-4513.460,-41.861,10.000},
				{-4517.776,-43.162,10.000},
				{-4522.215,-44.389,10.000},
				{-4526.769,-45.540,10.000},
				{-4531.431,-46.615,10.000},
				{-4536.192,-47.610,10.000},
				{-4541.045,-48.527,10.000},
				{-4545.981,-49.365,10.000},
				{-4550.993,-50.124,10.000},
				{-4556.074,-50.806,10.000},
				{-4561.215,-51.412,10.000},
				{-4566.409,-51.943,10.000},
				{-4571.649,-52.400,10.000},
				{-4576.928,-52.787,10.000},
				{-4582.238,-53.103,10.000},
				{-4587.574,-53.352,10.000},
				{-4592.927,-53.535,10.000},
				{-4598.293,-53.654,10.000},
				{-4603.664,-53.712,10.000},
				{-4609.035,-53.709,10.000},
				{-4614.399,-53.649,10.000},
				{-4619.753,-53.532,10.000},
				{-4625.089,-53.361,10.000},
				{-4630.402,-53.137,10.000},
				{-4635.689,-52.862,10.000},
				{-4640.942,-52.538,10.000},
				{-4646.159,-52.167,10.000},
				{-4651.334,-51.749,10.000},
				{-4656.463,-51.287,10.000},
				{-4661.541,-50.781,10.000},
				{-4666.564,-50.233,10.000},
				{-4671.529,-49.645,10.000},
				{-4676.430,-49.017,10.000},
				{-4681.265,-48.350,10.000},
				{-4686.030,-47.647,10.000},
				{-4690.721,-46.907,10.000},
				{-4695.334,-46.132,10.000},
				{-4699.866,-45.323,10.000},
				{-4704.314,-44.481,10.000},
				{-4708.675,-43.607,10.000},
				{-4712.945,-42.702,10.000},
				{-4717.122,-41.766,10.000},
				{-4721.202,-40.800,10.000},
				{-4725.182,-39.806,10.000},
				{-4729.061,-38.784,10.000},
				{-4732.834,-37.735,10.000},
				{-4736.500,-36.659,10.000},
				{-4740.056,-35.558,10.000},
				{-4743.499,-34.432,10.000},
				{-4746.828,-33.283,10.000},
				{-4750.039,-32.110,10.000},
				{-4753.130,-30.915,10.000},
				{-4756.100,-29.698,10.000},
				{-4758.946,-28.461,10.000},
				{-4761.666,-27.204,10.000},
				{-4764.259,-25.928,10.000},
				{-4766.723,-24.634,10.000},
				{-4769.055,-23.322,10.000},
				{-4771.254,-21.994,10.000},
				{-4773.319,-20.651,10.000},
				{-4775.248,-19.292,10.000},
				{-4777.041,-17.921,10.000},
				{-4778.694,-16.536,10.000},
				{-4780.208,-15.139,10.000},
				{-4781.581,-13.732,10.000},
				{-4782.813,-12.315,10.000},
				{-4783.902,-10.889,10.000},
				{-4784.847,-9.455,10.000},
				{-4785.649,-8.015,10.000},
				{-4786.306,-6.568,10.000},
				{-4786.817,-5.117,10.000},
				{-4787.183,-3.662,10.000},
				{-4787.418,-2.349,10.000},
				{-4787.551,-1.325,10.000},
				{-4787.610,-0.592,10.000},
				{-4787.625,-0.151,10.000},
				{-4787.625,-0.002,10.000},
				{-4787.625,-0.000,10.000}
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