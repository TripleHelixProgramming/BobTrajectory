package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightSwitchToFirstCubePt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,9.08,0.00)
	// (9.00,8.08,60.00)
	
    public RightSwitchToFirstCubePt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightSwitchToFirstCubePt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.542,-10.844,10.000,0.000},
				{-2.711,-32.532,10.000,0.000},
				{-7.591,-65.064,10.000,0.000},
				{-16.266,-108.440,10.000,0.000},
				{-29.821,-162.661,10.000,0.000},
				{-49.340,-227.725,10.000,0.001},
				{-75.908,-303.633,10.000,0.002},
				{-110.609,-390.386,10.000,0.003},
				{-154.528,-487.982,10.000,0.007},
				{-208.748,-596.423,10.000,0.012},
				{-274.354,-715.707,10.000,0.021},
				{-352.431,-845.836,10.000,0.035},
				{-444.064,-986.808,10.000,0.055},
				{-550.335,-1138.625,10.000,0.084},
				{-671.789,-1290.441,10.000,0.124},
				{-808.424,-1442.258,10.000,0.179},
				{-960.240,-1594.075,10.000,0.251},
				{-1127.239,-1745.891,10.000,0.345},
				{-1309.419,-1897.708,10.000,0.463},
				{-1506.780,-2049.525,10.000,0.610},
				{-1719.323,-2201.341,10.000,0.791},
				{-1947.048,-2353.158,10.000,1.011},
				{-2189.955,-2504.975,10.000,1.274},
				{-2448.043,-2656.791,10.000,1.588},
				{-2721.313,-2808.608,10.000,1.957},
				{-3009.765,-2960.425,10.000,2.390},
				{-3313.398,-3112.241,10.000,2.895},
				{-3632.213,-3264.058,10.000,3.480},
				{-3966.210,-3415.874,10.000,4.155},
				{-4315.388,-3567.691,10.000,4.932},
				{-4679.748,-3719.508,10.000,5.824},
				{-5059.290,-3871.324,10.000,6.843},
				{-5454.013,-4023.141,10.000,8.007},
				{-5863.918,-4174.958,10.000,9.334},
				{-6289.004,-4326.774,10.000,10.842},
				{-6729.273,-4478.591,10.000,12.553},
				{-7184.723,-4630.408,10.000,14.490},
				{-7655.354,-4782.224,10.000,16.674},
				{-8141.167,-4934.041,10.000,19.126},
				{-8641.620,-5075.013,10.000,21.857},
				{-9155.628,-5205.142,10.000,24.867},
				{-9682.106,-5324.427,10.000,28.140},
				{-10219.971,-5432.867,10.000,31.641},
				{-10768.138,-5530.463,10.000,35.314},
				{-11325.521,-5617.216,10.000,39.083},
				{-11891.038,-5693.124,10.000,42.862},
				{-12463.604,-5758.188,10.000,46.559},
				{-13042.134,-5812.409,10.000,50.090},
				{-13625.544,-5855.785,10.000,53.386},
				{-14212.749,-5888.317,10.000,56.400},
				{-14802.665,-5910.005,10.000,59.103},
				{-15393.955,-5915.790,10.000,61.485},
				{-15984.738,-5899.887,10.000,63.546},
				{-16573.390,-5873.140,10.000,65.299},
				{-17158.824,-5835.549,10.000,66.763},
				{-17739.957,-5787.114,10.000,67.960},
				{-18315.705,-5727.835,10.000,68.912},
				{-18884.982,-5657.712,10.000,69.641},
				{-19446.705,-5576.745,10.000,70.167},
				{-19999.789,-5484.933,10.000,70.509},
				{-20543.150,-5382.278,10.000,70.685},
				{-21075.702,-5268.779,10.000,70.713},
				{-21596.363,-5144.435,10.000,70.610},
				{-22104.047,-5009.248,10.000,70.391},
				{-22597.670,-4863.217,10.000,70.072},
				{-23076.401,-4711.400,10.000,69.669},
				{-23539.950,-4559.583,10.000,69.196},
				{-23988.318,-4407.767,10.000,68.668},
				{-24421.504,-4255.950,10.000,68.098},
				{-24839.508,-4104.133,10.000,67.497},
				{-25242.330,-3952.317,10.000,66.879},
				{-25629.971,-3800.500,10.000,66.254},
				{-26002.430,-3648.683,10.000,65.632},
				{-26359.708,-3496.867,10.000,65.022},
				{-26701.804,-3345.050,10.000,64.433},
				{-27028.718,-3193.233,10.000,63.873},
				{-27340.450,-3041.417,10.000,63.345},
				{-27637.001,-2889.600,10.000,62.856},
				{-27918.371,-2737.784,10.000,62.408},
				{-28184.558,-2585.967,10.000,62.004},
				{-28435.564,-2434.150,10.000,61.644},
				{-28671.388,-2282.334,10.000,61.328},
				{-28892.031,-2130.517,10.000,61.056},
				{-29097.491,-1978.700,10.000,60.824},
				{-29287.771,-1826.884,10.000,60.630},
				{-29462.868,-1675.067,10.000,60.472},
				{-29622.784,-1523.250,10.000,60.345},
				{-29767.518,-1371.434,10.000,60.245},
				{-29897.071,-1219.617,10.000,60.170},
				{-30011.442,-1067.800,10.000,60.114},
				{-30110.884,-921.043,10.000,60.074},
				{-30196.192,-785.129,10.000,60.046},
				{-30268.452,-660.059,10.000,60.028},
				{-30328.747,-545.834,10.000,60.016},
				{-30378.161,-442.452,10.000,60.008},
				{-30417.779,-349.915,10.000,60.004},
				{-30448.686,-268.221,10.000,60.002},
				{-30471.966,-197.372,10.000,60.001},
				{-30488.702,-137.366,10.000,60.000},
				{-30499.981,-88.205,10.000,60.000},
				{-30506.886,-49.888,10.000,60.000},
				{-30510.501,-22.414,10.000,60.000},
				{-30511.911,-5.785,10.000,60.000},
				{-30512.200,-0.000,10.000,60.000},
				{-30512.200,-0.000,10.000,60.000}		};

}