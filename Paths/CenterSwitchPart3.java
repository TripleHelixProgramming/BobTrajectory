package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterSwitchPart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.67,13.50,0.00)
	// (6.67,13.50,0.00)
	
	public CenterSwitchPart3() {
		this(false);
	}
			
    public CenterSwitchPart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.015,0.304,10.000},
				{0.076,0.608,10.000},
				{0.213,1.367,10.000},
				{0.456,2.430,10.000},
				{0.835,3.797,10.000},
				{1.382,5.468,10.000},
				{2.127,7.443,10.000},
				{3.099,9.722,10.000},
				{4.329,12.304,10.000},
				{5.848,15.190,10.000},
				{7.671,18.228,10.000},
				{9.797,21.266,10.000},
				{12.228,24.304,10.000},
				{14.962,27.342,10.000},
				{18.000,30.380,10.000},
				{21.342,33.418,10.000},
				{24.987,36.456,10.000},
				{28.937,39.494,10.000},
				{33.190,42.532,10.000},
				{37.747,45.570,10.000},
				{42.608,48.608,10.000},
				{47.772,51.645,10.000},
				{53.240,54.683,10.000},
				{59.013,57.721,10.000},
				{65.088,60.759,10.000},
				{71.468,63.797,10.000},
				{78.152,66.835,10.000},
				{85.139,69.873,10.000},
				{92.430,72.911,10.000},
				{100.025,75.949,10.000},
				{107.924,78.987,10.000},
				{116.126,82.025,10.000},
				{124.633,85.063,10.000},
				{133.443,88.101,10.000},
				{142.557,91.139,10.000},
				{151.974,94.177,10.000},
				{161.696,97.215,10.000},
				{171.721,100.253,10.000},
				{182.050,103.291,10.000},
				{192.683,106.329,10.000},
				{203.620,109.367,10.000},
				{214.860,112.405,10.000},
				{226.405,115.443,10.000},
				{238.253,118.481,10.000},
				{250.405,121.519,10.000},
				{262.860,124.557,10.000},
				{275.620,127.595,10.000},
				{288.683,130.633,10.000},
				{302.050,133.671,10.000},
				{315.721,136.709,10.000},
				{329.696,139.747,10.000},
				{343.974,142.785,10.000},
				{358.556,145.823,10.000},
				{373.442,148.860,10.000},
				{388.632,151.898,10.000},
				{404.126,154.936,10.000},
				{419.923,157.974,10.000},
				{436.025,161.012,10.000},
				{452.430,164.050,10.000},
				{469.138,167.088,10.000},
				{486.151,170.126,10.000},
				{503.467,173.164,10.000},
				{521.088,176.202,10.000},
				{539.012,179.240,10.000},
				{557.240,182.278,10.000},
				{575.771,185.316,10.000},
				{594.607,188.354,10.000},
				{613.746,191.392,10.000},
				{633.189,194.430,10.000},
				{652.936,197.468,10.000},
				{672.986,200.506,10.000},
				{693.341,203.544,10.000},
				{713.999,206.582,10.000},
				{734.961,209.620,10.000},
				{756.226,212.658,10.000},
				{777.796,215.696,10.000},
				{799.669,218.734,10.000},
				{821.847,221.772,10.000},
				{844.328,224.810,10.000},
				{867.112,227.848,10.000},
				{890.201,230.886,10.000},
				{913.593,233.924,10.000},
				{937.289,236.962,10.000},
				{961.289,240.000,10.000},
				{985.593,243.038,10.000},
				{1010.201,246.076,10.000},
				{1035.112,249.113,10.000},
				{1060.312,252.000,10.000},
				{1085.770,254.582,10.000},
				{1111.456,256.860,10.000},
				{1137.340,258.835,10.000},
				{1163.390,260.506,10.000},
				{1189.578,261.873,10.000},
				{1215.871,262.936,10.000},
				{1242.241,263.696,10.000},
				{1268.656,264.151,10.000},
				{1295.078,264.216,10.000},
				{1321.466,263.889,10.000},
				{1347.792,263.258,10.000},
				{1374.025,262.324,10.000},
				{1400.133,261.085,10.000},
				{1426.087,259.543,10.000},
				{1451.857,257.697,10.000},
				{1477.412,255.548,10.000},
				{1502.721,253.094,10.000},
				{1527.755,250.337,10.000},
				{1552.491,247.363,10.000},
				{1576.924,244.325,10.000},
				{1601.053,241.287,10.000},
				{1624.878,238.249,10.000},
				{1648.399,235.211,10.000},
				{1671.616,232.174,10.000},
				{1694.530,229.136,10.000},
				{1717.139,226.098,10.000},
				{1739.445,223.060,10.000},
				{1761.448,220.022,10.000},
				{1783.146,216.984,10.000},
				{1804.541,213.946,10.000},
				{1825.631,210.908,10.000},
				{1846.418,207.870,10.000},
				{1866.901,204.832,10.000},
				{1887.081,201.794,10.000},
				{1906.956,198.756,10.000},
				{1926.528,195.718,10.000},
				{1945.796,192.680,10.000},
				{1964.760,189.642,10.000},
				{1983.421,186.604,10.000},
				{2001.777,183.566,10.000},
				{2019.830,180.528,10.000},
				{2037.579,177.490,10.000},
				{2055.024,174.452,10.000},
				{2072.166,171.414,10.000},
				{2089.003,168.376,10.000},
				{2105.537,165.338,10.000},
				{2121.767,162.300,10.000},
				{2137.694,159.262,10.000},
				{2153.316,156.224,10.000},
				{2168.635,153.186,10.000},
				{2183.649,150.148,10.000},
				{2198.360,147.110,10.000},
				{2212.768,144.072,10.000},
				{2226.871,141.034,10.000},
				{2240.671,137.996,10.000},
				{2254.167,134.959,10.000},
				{2267.359,131.921,10.000},
				{2280.247,128.883,10.000},
				{2292.831,125.845,10.000},
				{2305.112,122.807,10.000},
				{2317.089,119.769,10.000},
				{2328.762,116.731,10.000},
				{2340.131,113.693,10.000},
				{2351.197,110.655,10.000},
				{2361.958,107.617,10.000},
				{2372.416,104.579,10.000},
				{2382.570,101.541,10.000},
				{2392.421,98.503,10.000},
				{2401.967,95.465,10.000},
				{2411.210,92.427,10.000},
				{2420.149,89.389,10.000},
				{2428.784,86.351,10.000},
				{2437.115,83.313,10.000},
				{2445.143,80.275,10.000},
				{2452.866,77.237,10.000},
				{2460.286,74.199,10.000},
				{2467.402,71.161,10.000},
				{2474.215,68.123,10.000},
				{2480.723,65.085,10.000},
				{2486.928,62.047,10.000},
				{2492.829,59.009,10.000},
				{2498.426,55.971,10.000},
				{2503.719,52.933,10.000},
				{2508.709,49.895,10.000},
				{2513.395,46.857,10.000},
				{2517.777,43.819,10.000},
				{2521.855,40.781,10.000},
				{2525.629,37.743,10.000},
				{2529.100,34.706,10.000},
				{2532.266,31.668,10.000},
				{2535.129,28.630,10.000},
				{2537.689,25.592,10.000},
				{2539.944,22.554,10.000},
				{2541.895,19.516,10.000},
				{2543.543,16.478,10.000},
				{2544.896,13.527,10.000},
				{2545.978,10.816,10.000},
				{2546.818,8.409,10.000},
				{2547.449,6.305,10.000},
				{2547.900,4.506,10.000},
				{2548.201,3.010,10.000},
				{2548.382,1.818,10.000},
				{2548.475,0.930,10.000},
				{2548.510,0.345,10.000},
				{2548.516,0.064,10.000},
				{2548.516,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.015,0.304,10.000},
				{0.076,0.608,10.000},
				{0.213,1.367,10.000},
				{0.456,2.430,10.000},
				{0.835,3.797,10.000},
				{1.382,5.468,10.000},
				{2.127,7.443,10.000},
				{3.099,9.722,10.000},
				{4.329,12.304,10.000},
				{5.848,15.190,10.000},
				{7.671,18.228,10.000},
				{9.797,21.266,10.000},
				{12.228,24.304,10.000},
				{14.962,27.342,10.000},
				{18.000,30.380,10.000},
				{21.342,33.418,10.000},
				{24.987,36.456,10.000},
				{28.937,39.494,10.000},
				{33.190,42.532,10.000},
				{37.747,45.570,10.000},
				{42.608,48.608,10.000},
				{47.772,51.645,10.000},
				{53.240,54.683,10.000},
				{59.013,57.721,10.000},
				{65.088,60.759,10.000},
				{71.468,63.797,10.000},
				{78.152,66.835,10.000},
				{85.139,69.873,10.000},
				{92.430,72.911,10.000},
				{100.025,75.949,10.000},
				{107.924,78.987,10.000},
				{116.126,82.025,10.000},
				{124.633,85.063,10.000},
				{133.443,88.101,10.000},
				{142.557,91.139,10.000},
				{151.974,94.177,10.000},
				{161.696,97.215,10.000},
				{171.721,100.253,10.000},
				{182.050,103.291,10.000},
				{192.683,106.329,10.000},
				{203.620,109.367,10.000},
				{214.860,112.405,10.000},
				{226.405,115.443,10.000},
				{238.253,118.481,10.000},
				{250.405,121.519,10.000},
				{262.860,124.557,10.000},
				{275.620,127.595,10.000},
				{288.683,130.633,10.000},
				{302.050,133.671,10.000},
				{315.721,136.709,10.000},
				{329.696,139.747,10.000},
				{343.974,142.785,10.000},
				{358.556,145.823,10.000},
				{373.442,148.860,10.000},
				{388.632,151.898,10.000},
				{404.126,154.936,10.000},
				{419.923,157.974,10.000},
				{436.025,161.012,10.000},
				{452.430,164.050,10.000},
				{469.138,167.088,10.000},
				{486.151,170.126,10.000},
				{503.467,173.164,10.000},
				{521.088,176.202,10.000},
				{539.012,179.240,10.000},
				{557.240,182.278,10.000},
				{575.771,185.316,10.000},
				{594.607,188.354,10.000},
				{613.746,191.392,10.000},
				{633.189,194.430,10.000},
				{652.936,197.468,10.000},
				{672.986,200.506,10.000},
				{693.341,203.544,10.000},
				{713.999,206.582,10.000},
				{734.961,209.620,10.000},
				{756.226,212.658,10.000},
				{777.796,215.696,10.000},
				{799.669,218.734,10.000},
				{821.847,221.772,10.000},
				{844.328,224.810,10.000},
				{867.112,227.848,10.000},
				{890.201,230.886,10.000},
				{913.593,233.924,10.000},
				{937.289,236.962,10.000},
				{961.289,240.000,10.000},
				{985.593,243.038,10.000},
				{1010.201,246.076,10.000},
				{1035.112,249.113,10.000},
				{1060.312,252.000,10.000},
				{1085.770,254.582,10.000},
				{1111.456,256.860,10.000},
				{1137.340,258.835,10.000},
				{1163.390,260.506,10.000},
				{1189.578,261.873,10.000},
				{1215.871,262.936,10.000},
				{1242.241,263.696,10.000},
				{1268.656,264.151,10.000},
				{1295.078,264.216,10.000},
				{1321.466,263.889,10.000},
				{1347.792,263.258,10.000},
				{1374.025,262.324,10.000},
				{1400.133,261.085,10.000},
				{1426.087,259.543,10.000},
				{1451.857,257.697,10.000},
				{1477.412,255.548,10.000},
				{1502.721,253.094,10.000},
				{1527.755,250.337,10.000},
				{1552.491,247.363,10.000},
				{1576.924,244.325,10.000},
				{1601.053,241.287,10.000},
				{1624.878,238.249,10.000},
				{1648.399,235.211,10.000},
				{1671.616,232.174,10.000},
				{1694.530,229.136,10.000},
				{1717.139,226.098,10.000},
				{1739.445,223.060,10.000},
				{1761.448,220.022,10.000},
				{1783.146,216.984,10.000},
				{1804.541,213.946,10.000},
				{1825.631,210.908,10.000},
				{1846.418,207.870,10.000},
				{1866.901,204.832,10.000},
				{1887.081,201.794,10.000},
				{1906.956,198.756,10.000},
				{1926.528,195.718,10.000},
				{1945.796,192.680,10.000},
				{1964.760,189.642,10.000},
				{1983.421,186.604,10.000},
				{2001.777,183.566,10.000},
				{2019.830,180.528,10.000},
				{2037.579,177.490,10.000},
				{2055.024,174.452,10.000},
				{2072.166,171.414,10.000},
				{2089.003,168.376,10.000},
				{2105.537,165.338,10.000},
				{2121.767,162.300,10.000},
				{2137.694,159.262,10.000},
				{2153.316,156.224,10.000},
				{2168.635,153.186,10.000},
				{2183.649,150.148,10.000},
				{2198.360,147.110,10.000},
				{2212.768,144.072,10.000},
				{2226.871,141.034,10.000},
				{2240.671,137.996,10.000},
				{2254.167,134.959,10.000},
				{2267.359,131.921,10.000},
				{2280.247,128.883,10.000},
				{2292.831,125.845,10.000},
				{2305.112,122.807,10.000},
				{2317.089,119.769,10.000},
				{2328.762,116.731,10.000},
				{2340.131,113.693,10.000},
				{2351.197,110.655,10.000},
				{2361.958,107.617,10.000},
				{2372.416,104.579,10.000},
				{2382.570,101.541,10.000},
				{2392.421,98.503,10.000},
				{2401.967,95.465,10.000},
				{2411.210,92.427,10.000},
				{2420.149,89.389,10.000},
				{2428.784,86.351,10.000},
				{2437.115,83.313,10.000},
				{2445.143,80.275,10.000},
				{2452.866,77.237,10.000},
				{2460.286,74.199,10.000},
				{2467.402,71.161,10.000},
				{2474.215,68.123,10.000},
				{2480.723,65.085,10.000},
				{2486.928,62.047,10.000},
				{2492.829,59.009,10.000},
				{2498.426,55.971,10.000},
				{2503.719,52.933,10.000},
				{2508.709,49.895,10.000},
				{2513.395,46.857,10.000},
				{2517.777,43.819,10.000},
				{2521.855,40.781,10.000},
				{2525.629,37.743,10.000},
				{2529.100,34.706,10.000},
				{2532.266,31.668,10.000},
				{2535.129,28.630,10.000},
				{2537.689,25.592,10.000},
				{2539.944,22.554,10.000},
				{2541.895,19.516,10.000},
				{2543.543,16.478,10.000},
				{2544.896,13.527,10.000},
				{2545.978,10.816,10.000},
				{2546.818,8.409,10.000},
				{2547.449,6.305,10.000},
				{2547.900,4.506,10.000},
				{2548.201,3.010,10.000},
				{2548.382,1.818,10.000},
				{2548.475,0.930,10.000},
				{2548.510,0.345,10.000},
				{2548.516,0.064,10.000},
				{2548.516,0.000,10.000}
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