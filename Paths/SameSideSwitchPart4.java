package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (7.00,23.00,0.00)
	// (3.42,21.67,45.00)
	
    public SameSideSwitchPart4() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SameSideSwitchPart4(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.194,3.871,10.000,0.000},
				{0.774,7.741,10.000,0.000},
				{1.742,11.612,10.000,0.000},
				{3.097,15.483,10.000,0.000},
				{4.838,19.353,10.000,0.000},
				{6.967,23.224,10.000,0.001},
				{9.483,27.095,10.000,0.001},
				{12.386,30.965,10.000,0.002},
				{15.676,34.836,10.000,0.004},
				{19.353,38.706,10.000,0.006},
				{23.417,42.577,10.000,0.008},
				{27.869,46.448,10.000,0.012},
				{32.707,50.318,10.000,0.017},
				{37.932,54.189,10.000,0.022},
				{43.545,58.060,10.000,0.030},
				{49.544,61.930,10.000,0.038},
				{55.931,65.801,10.000,0.049},
				{62.705,69.672,10.000,0.062},
				{69.865,73.542,10.000,0.077},
				{77.413,77.413,10.000,0.095},
				{85.348,81.284,10.000,0.115},
				{93.670,85.154,10.000,0.139},
				{102.379,89.025,10.000,0.167},
				{111.475,92.896,10.000,0.198},
				{120.958,96.766,10.000,0.234},
				{130.828,100.637,10.000,0.275},
				{141.085,104.508,10.000,0.321},
				{151.729,108.378,10.000,0.373},
				{162.761,112.249,10.000,0.430},
				{174.179,116.119,10.000,0.495},
				{185.985,119.990,10.000,0.566},
				{198.177,123.861,10.000,0.645},
				{210.757,127.731,10.000,0.733},
				{223.723,131.602,10.000,0.829},
				{237.077,135.473,10.000,0.935},
				{250.818,139.343,10.000,1.052},
				{264.946,143.214,10.000,1.179},
				{279.461,147.085,10.000,1.317},
				{294.363,150.955,10.000,1.468},
				{309.652,154.826,10.000,1.632},
				{325.328,158.697,10.000,1.811},
				{341.391,162.567,10.000,2.003},
				{357.841,166.438,10.000,2.212},
				{374.679,170.309,10.000,2.437},
				{391.903,174.179,10.000,2.680},
				{409.515,178.050,10.000,2.941},
				{427.513,181.920,10.000,3.222},
				{445.899,185.791,10.000,3.524},
				{464.671,189.662,10.000,3.847},
				{483.831,193.532,10.000,4.193},
				{503.378,197.403,10.000,4.562},
				{523.312,201.274,10.000,4.957},
				{543.633,205.144,10.000,5.378},
				{564.341,209.015,10.000,5.827},
				{585.436,212.886,10.000,6.304},
				{606.918,216.756,10.000,6.810},
				{628.787,220.627,10.000,7.348},
				{651.043,224.498,10.000,7.918},
				{673.686,228.368,10.000,8.521},
				{696.717,232.239,10.000,9.157},
				{720.134,236.110,10.000,9.829},
				{743.939,239.980,10.000,10.537},
				{768.130,243.851,10.000,11.282},
				{792.515,243.851,10.000,12.057},
				{816.900,243.851,10.000,12.857},
				{841.285,243.851,10.000,13.680},
				{865.670,243.851,10.000,14.525},
				{890.056,243.851,10.000,15.392},
				{914.441,243.851,10.000,16.278},
				{938.826,243.851,10.000,17.182},
				{963.211,243.851,10.000,18.102},
				{987.596,243.851,10.000,19.037},
				{1011.981,243.851,10.000,19.985},
				{1036.366,243.851,10.000,20.943},
				{1060.751,243.851,10.000,21.909},
				{1085.136,243.851,10.000,22.882},
				{1109.521,243.851,10.000,23.858},
				{1133.906,243.851,10.000,24.835},
				{1158.291,243.851,10.000,25.811},
				{1182.598,242.282,10.000,26.780},
				{1206.633,238.411,10.000,27.733},
				{1230.280,234.540,10.000,28.662},
				{1253.541,230.670,10.000,29.566},
				{1276.414,226.799,10.000,30.443},
				{1298.901,222.928,10.000,31.292},
				{1321.000,219.058,10.000,32.113},
				{1342.712,215.187,10.000,32.904},
				{1364.037,211.317,10.000,33.665},
				{1384.976,207.446,10.000,34.396},
				{1405.527,203.575,10.000,35.096},
				{1425.691,199.705,10.000,35.765},
				{1445.467,195.834,10.000,36.404},
				{1464.857,191.963,10.000,37.013},
				{1483.860,188.093,10.000,37.592},
				{1502.476,184.222,10.000,38.141},
				{1520.705,180.351,10.000,38.662},
				{1538.546,176.481,10.000,39.155},
				{1556.001,172.610,10.000,39.620},
				{1573.068,168.739,10.000,40.059},
				{1589.749,164.869,10.000,40.472},
				{1606.042,160.998,10.000,40.860},
				{1621.948,157.127,10.000,41.224},
				{1637.467,153.257,10.000,41.564},
				{1652.600,149.386,10.000,41.882},
				{1667.345,145.516,10.000,42.178},
				{1681.703,141.645,10.000,42.453},
				{1695.674,137.774,10.000,42.709},
				{1709.257,133.904,10.000,42.945},
				{1722.454,130.033,10.000,43.164},
				{1735.264,126.162,10.000,43.365},
				{1747.687,122.292,10.000,43.549},
				{1759.722,118.421,10.000,43.718},
				{1771.371,114.550,10.000,43.872},
				{1782.632,110.680,10.000,44.013},
				{1793.507,106.809,10.000,44.140},
				{1803.994,102.938,10.000,44.254},
				{1814.095,99.068,10.000,44.358},
				{1823.808,95.197,10.000,44.450},
				{1833.134,91.326,10.000,44.532},
				{1842.073,87.456,10.000,44.605},
				{1850.625,83.585,10.000,44.669},
				{1858.790,79.714,10.000,44.725},
				{1866.568,75.844,10.000,44.774},
				{1873.959,71.973,10.000,44.816},
				{1880.963,68.103,10.000,44.852},
				{1887.579,64.232,10.000,44.882},
				{1893.809,60.361,10.000,44.908},
				{1899.652,56.491,10.000,44.929},
				{1905.107,52.620,10.000,44.947},
				{1910.176,48.749,10.000,44.960},
				{1914.857,44.879,10.000,44.972},
				{1919.151,41.008,10.000,44.980},
				{1923.059,37.137,10.000,44.987},
				{1926.579,33.267,10.000,44.991},
				{1929.712,29.396,10.000,44.995},
				{1932.458,25.525,10.000,44.997},
				{1934.817,21.655,10.000,44.998},
				{1936.789,17.784,10.000,44.999},
				{1938.374,13.913,10.000,45.000},
				{1939.572,10.043,10.000,45.000},
				{1940.382,6.172,10.000,45.000},
				{1940.806,2.302,10.000,45.000}		};

}