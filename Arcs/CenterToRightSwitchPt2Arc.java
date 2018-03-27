package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,9.08,0.00)
	// (3.63,13.08,0.00)
	
    public CenterToRightSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.596,-11.919,10.000,0.000},
				{-2.980,-35.756,10.000,0.000},
				{-8.343,-71.513,10.000,0.000},
				{-17.878,-119.188,10.000,0.000},
				{-32.777,-178.782,10.000,0.000},
				{-54.231,-250.295,10.000,0.000},
				{-83.432,-333.726,10.000,0.000},
				{-121.572,-429.077,10.000,0.000},
				{-169.843,-536.346,10.000,0.000},
				{-229.437,-655.534,10.000,0.000},
				{-301.545,-786.640,10.000,0.000},
				{-387.361,-929.666,10.000,0.000},
				{-488.075,-1084.610,10.000,-0.010},
				{-604.879,-1251.473,10.000,-0.010},
				{-738.965,-1430.255,10.000,-0.010},
				{-891.526,-1620.956,10.000,-0.020},
				{-1063.752,-1823.575,10.000,-0.030},
				{-1256.837,-2038.114,10.000,-0.040},
				{-1471.971,-2264.571,10.000,-0.050},
				{-1710.347,-2502.947,10.000,-0.070},
				{-1972.560,-2741.322,10.000,-0.090},
				{-2258.611,-2979.698,10.000,-0.120},
				{-2568.500,-3218.074,10.000,-0.160},
				{-2902.226,-3456.450,10.000,-0.200},
				{-3259.790,-3694.826,10.000,-0.260},
				{-3641.191,-3933.202,10.000,-0.320},
				{-4046.430,-4171.578,10.000,-0.390},
				{-4475.507,-4409.954,10.000,-0.480},
				{-4928.421,-4648.329,10.000,-0.580},
				{-5405.173,-4886.705,10.000,-0.690},
				{-5905.762,-5125.081,10.000,-0.820},
				{-6430.189,-5363.457,10.000,-0.970},
				{-6978.454,-5601.833,10.000,-1.140},
				{-7550.556,-5840.209,10.000,-1.330},
				{-8146.495,-6078.585,10.000,-1.540},
				{-8766.273,-6316.960,10.000,-1.780},
				{-9409.887,-6555.336,10.000,-2.040},
				{-10077.340,-6793.712,10.000,-2.340},
				{-10768.630,-7032.088,10.000,-2.660},
				{-11483.757,-7270.464,10.000,-3.020},
				{-12222.723,-7508.840,10.000,-3.410},
				{-12985.525,-7747.216,10.000,-3.840},
				{-13772.166,-7985.592,10.000,-4.300},
				{-14582.644,-8223.967,10.000,-4.820},
				{-15416.959,-8462.343,10.000,-5.370},
				{-16275.112,-8700.719,10.000,-5.980},
				{-17157.103,-8939.095,10.000,-6.630},
				{-18062.931,-9177.471,10.000,-7.340},
				{-18992.597,-9415.847,10.000,-8.100},
				{-19946.101,-9654.223,10.000,-8.930},
				{-20922.846,-9880.680,10.000,-9.810},
				{-21921.641,-10095.218,10.000,-10.760},
				{-22941.293,-10297.837,10.000,-11.770},
				{-23980.612,-10488.538,10.000,-12.850},
				{-25038.405,-10667.320,10.000,-13.990},
				{-26113.480,-10834.183,10.000,-15.200},
				{-27204.646,-10989.127,10.000,-16.470},
				{-28310.710,-11132.153,10.000,-17.790},
				{-29430.480,-11263.260,10.000,-19.180},
				{-30562.766,-11382.448,10.000,-20.620},
				{-31706.374,-11489.717,10.000,-22.110},
				{-32860.113,-11585.067,10.000,-23.650},
				{-34022.792,-11668.499,10.000,-25.220},
				{-35193.217,-11740.011,10.000,-26.810},
				{-36370.198,-11799.605,10.000,-28.430},
				{-37552.542,-11847.281,10.000,-30.060},
				{-38739.058,-11883.037,10.000,-31.690},
				{-39928.554,-11906.875,10.000,-33.310},
				{-41119.837,-11918.793,10.000,-34.920},
				{-42311.716,-11918.793,10.000,-36.500},
				{-43503.596,-11918.793,10.000,-38.050},
				{-44695.475,-11918.793,10.000,-39.570},
				{-45887.354,-11918.793,10.000,-41.040},
				{-47079.234,-11918.793,10.000,-42.470},
				{-48271.113,-11918.793,10.000,-43.840},
				{-49462.992,-11918.793,10.000,-45.160},
				{-50654.872,-11918.793,10.000,-46.430},
				{-51846.751,-11918.793,10.000,-47.640},
				{-53038.630,-11918.793,10.000,-48.790},
				{-54230.510,-11918.793,10.000,-49.890},
				{-55422.389,-11918.793,10.000,-50.920},
				{-56614.268,-11918.793,10.000,-51.900},
				{-57806.148,-11918.793,10.000,-52.820},
				{-58998.027,-11918.793,10.000,-53.690},
				{-60189.906,-11918.793,10.000,-54.500},
				{-61381.786,-11918.793,10.000,-55.260},
				{-62573.665,-11918.793,10.000,-55.960},
				{-63765.544,-11918.793,10.000,-56.610},
				{-64957.424,-11918.793,10.000,-57.210},
				{-66149.303,-11918.793,10.000,-57.760},
				{-67341.182,-11918.793,10.000,-58.260},
				{-68533.062,-11918.793,10.000,-58.720},
				{-69724.941,-11918.793,10.000,-59.130},
				{-70916.820,-11918.793,10.000,-59.490},
				{-72108.700,-11918.793,10.000,-59.810},
				{-73300.579,-11918.793,10.000,-60.090},
				{-74492.458,-11918.793,10.000,-60.320},
				{-75684.338,-11918.793,10.000,-60.510},
				{-76876.217,-11918.793,10.000,-60.670},
				{-78068.096,-11918.793,10.000,-60.780},
				{-79259.976,-11918.793,10.000,-60.840},
				{-80451.855,-11918.793,10.000,-60.870},
				{-81643.734,-11918.793,10.000,-60.860},
				{-82835.614,-11918.793,10.000,-60.810},
				{-84027.493,-11918.793,10.000,-60.720},
				{-85219.372,-11918.793,10.000,-60.580},
				{-86411.252,-11918.793,10.000,-60.410},
				{-87603.131,-11918.793,10.000,-60.190},
				{-88795.010,-11918.793,10.000,-59.930},
				{-89986.890,-11918.793,10.000,-59.630},
				{-91178.769,-11918.793,10.000,-59.280},
				{-92370.648,-11918.793,10.000,-58.890},
				{-93562.528,-11918.793,10.000,-58.460},
				{-94754.407,-11918.793,10.000,-57.970},
				{-95946.286,-11918.793,10.000,-57.440},
				{-97138.166,-11918.793,10.000,-56.860},
				{-98330.045,-11918.793,10.000,-56.230},
				{-99521.924,-11918.793,10.000,-55.550},
				{-100713.804,-11918.793,10.000,-54.820},
				{-101905.683,-11918.793,10.000,-54.030},
				{-103097.562,-11918.793,10.000,-53.190},
				{-104289.442,-11918.793,10.000,-52.290},
				{-105481.321,-11918.793,10.000,-51.340},
				{-106673.200,-11918.793,10.000,-50.320},
				{-107865.080,-11918.793,10.000,-49.250},
				{-109056.959,-11918.793,10.000,-48.120},
				{-110248.838,-11918.793,10.000,-46.940},
				{-111440.718,-11918.793,10.000,-45.690},
				{-112632.597,-11918.793,10.000,-44.390},
				{-113824.476,-11918.793,10.000,-43.040},
				{-115016.356,-11918.793,10.000,-41.640},
				{-116208.235,-11918.793,10.000,-40.180},
				{-117400.114,-11918.793,10.000,-38.680},
				{-118591.994,-11918.793,10.000,-37.150},
				{-119783.873,-11918.793,10.000,-35.580},
				{-120975.403,-11911.800,10.000,-33.980},
				{-122165.637,-11892.888,10.000,-32.360},
				{-123353.384,-11862.057,10.000,-30.730},
				{-124537.453,-11819.307,10.000,-29.100},
				{-125716.650,-11764.639,10.000,-27.480},
				{-126889.784,-11698.052,10.000,-25.870},
				{-128055.664,-11619.546,10.000,-24.290},
				{-129213.098,-11529.121,10.000,-22.740},
				{-130360.892,-11426.777,10.000,-21.240},
				{-131497.857,-11312.515,10.000,-19.770},
				{-132622.799,-11186.333,10.000,-18.360},
				{-133734.528,-11048.233,10.000,-17.010},
				{-134831.850,-10898.214,10.000,-15.720},
				{-135913.575,-10736.277,10.000,-14.480},
				{-136978.510,-10562.420,10.000,-13.320},
				{-138025.463,-10376.645,10.000,-12.210},
				{-139053.243,-10178.951,10.000,-11.170},
				{-140060.657,-9969.338,10.000,-10.200},
				{-141046.514,-9747.807,10.000,-9.290},
				{-142009.623,-9514.356,10.000,-8.440},
				{-142949.139,-9275.981,10.000,-7.650},
				{-143864.819,-9037.605,10.000,-6.920},
				{-144756.660,-8799.229,10.000,-6.240},
				{-145624.665,-8560.853,10.000,-5.620},
				{-146468.831,-8322.477,10.000,-5.040},
				{-147289.160,-8084.101,10.000,-4.510},
				{-148085.651,-7845.725,10.000,-4.030},
				{-148858.305,-7607.350,10.000,-3.580},
				{-149607.121,-7368.974,10.000,-3.170},
				{-150332.100,-7130.598,10.000,-2.800},
				{-151033.241,-6892.222,10.000,-2.470},
				{-151710.544,-6653.846,10.000,-2.160},
				{-152364.010,-6415.470,10.000,-1.890},
				{-152993.638,-6177.094,10.000,-1.640},
				{-153599.429,-5938.718,10.000,-1.410},
				{-154181.382,-5700.343,10.000,-1.220},
				{-154739.497,-5461.967,10.000,-1.040},
				{-155273.775,-5223.591,10.000,-0.880},
				{-155784.216,-4985.215,10.000,-0.740},
				{-156270.818,-4746.839,10.000,-0.620},
				{-156733.583,-4508.463,10.000,-0.520},
				{-157172.511,-4270.087,10.000,-0.430},
				{-157587.601,-4031.712,10.000,-0.350},
				{-157978.853,-3793.336,10.000,-0.280},
				{-158346.268,-3554.960,10.000,-0.220},
				{-158689.845,-3316.584,10.000,-0.180},
				{-159009.585,-3078.208,10.000,-0.140},
				{-159305.487,-2839.832,10.000,-0.110},
				{-159577.551,-2601.456,10.000,-0.080},
				{-159825.778,-2363.080,10.000,-0.060},
				{-160050.517,-2131.698,10.000,-0.040},
				{-160252.714,-1912.234,10.000,-0.030},
				{-160433.560,-1704.689,10.000,-0.020},
				{-160594.247,-1509.063,10.000,-0.020},
				{-160735.968,-1325.356,10.000,-0.010},
				{-160859.914,-1153.567,10.000,-0.010},
				{-160967.278,-993.697,10.000,0.000},
				{-161059.250,-845.746,10.000,0.000},
				{-161137.023,-709.714,10.000,0.000},
				{-161201.788,-585.601,10.000,0.000},
				{-161254.739,-473.406,10.000,0.000},
				{-161297.066,-373.130,10.000,0.000},
				{-161329.961,-284.773,10.000,0.000},
				{-161354.616,-208.335,10.000,0.000},
				{-161372.224,-143.815,10.000,0.000},
				{-161383.975,-91.215,10.000,0.000},
				{-161391.063,-50.533,10.000,0.000},
				{-161394.678,-21.770,10.000,0.000},
				{-161396.012,-4.925,10.000,0.000},
				{-161396.259,-0.000,10.000,0.000},
				{-161396.259,-0.000,10.000,0.000}		};

}