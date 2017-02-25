package com.team319;

import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.trajectory.io.VelocityOnlyFileSerializer;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.BobPathGenerator;
import com.team319.trajectory.SrxTranslatorConfig;

/**
 * Forked from 254's 2014 Trajectory library just a comment to make a change
 * 
 * @author Jared341
 * @author ttremblay
 */
public class Main {

	public static void main(String[] args) {
		//SrxTranslator translator = new SrxTranslator();
		SrxTranslatorConfig standardConfig = new SrxTranslatorConfig();
		
		//Standard configs between all trajectories
		standardConfig.name = "StandardConfig";
		standardConfig.dt = .01;
		standardConfig.max_acc = 20.0;
		standardConfig.max_jerk = 60.0;
		standardConfig.max_vel = 4.0;
		standardConfig.wheelbase_width_feet = 32.5/12.0;
		standardConfig.wheel_dia_inches = 3.5;
		standardConfig.scale_factor = .743;
		
		BobPath blueHopperAutoPt1 = new BobPath(standardConfig, "BlueHopperAutoPt1", 1);
		blueHopperAutoPt1.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		blueHopperAutoPt1.addWaypoint(new WaypointSequence.Waypoint(5.5, .625, Math.toRadians(35.0)));
		blueHopperAutoPt1.addWaypoint(new WaypointSequence.Waypoint(6.75, 2.75, Math.toRadians(90.0)));		

		BobPath blueHopperAutoPt2 = new BobPath(standardConfig, "BlueHopperAutoPt2", -1);
		blueHopperAutoPt2.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		blueHopperAutoPt2.addWaypoint(new WaypointSequence.Waypoint(-4, -1, Math.toRadians(45)));
		
		BobPath toAppend = new BobPath(standardConfig, "toAppend", 1);
		toAppend.addWaypoint(new WaypointSequence.Waypoint(-4, -1, Math.toRadians(45)));
		toAppend.addWaypoint(new WaypointSequence.Waypoint(-4, 3, Math.toRadians(80)));	
		
				// Description of this auto mode path.
		//WaypointSequence p = new WaypointSequence(10);
		//p.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		//p.addWaypoint(new WaypointSequence.Waypoint(5.5, .625, Math.toRadians(35.0)));//BHApt1
		//p.addWaypoint(new WaypointSequence.Waypoint(6.75, 2.75, Math.toRadians(90.0)));//BHApt1//3.5
		//p.addWaypoint(new WaypointSequence.Waypoint(-4, -1, Math.toRadians(45)));//BHApt2
		//p.addWaypoint(new WaypointSequence.Waypoint(6.5, 2, Math.toRadians(-5)));//BHApt3
		
		//p.addWaypoint(new WaypointSequence.Waypoint(5.5, .625, Math.toRadians(35.0)));//RHApt1
		//p.addWaypoint(new WaypointSequence.Waypoint(6.75, 2.75, Math.toRadians(90.0)));//RHApt1
		//p.addWaypoint(new WaypointSequence.Waypoint(-4, -1, Math.toRadians(45)));//RHApt2
		//p.addWaypoint(new WaypointSequence.Waypoint(6.5, 2, Math.toRadians(-5)));//RHApt3
		
		//p.addWaypoint(new WaypointSequence.Waypoint(5, 0, 0));//drive forward 5 feet
		//p.addWaypoint(new WaypointSequence.Waypoint(15, 0, 0));//drive forward 15 feet
		
		

//		BobPathGenerator.exportPath("Paths", blueHopperAutoPt1);
//		BobPathGenerator.exportPath("Paths", blueHopperAutoPt2);
//		BobPathGenerator.appendAndExportPaths("Paths", "appendedPath", blueHopperAutoPt2, toAppend);
		
		generateTHPaths();
	}
	
	private static void generateTHPaths() {
		SrxTranslatorConfig thConfig = new SrxTranslatorConfig();
		thConfig.name = "TripleHelixConfig";
		thConfig.dt = .01;
		thConfig.max_acc = 9.0;
		thConfig.max_jerk = 70.0;
		thConfig.max_vel = 4.0;
		thConfig.wheelbase_width_feet = 33/12.0;
		thConfig.wheel_dia_inches = 4;
		thConfig.scale_factor = 0.5;
		
		double robot_length = 33.5;    	// Max length 40 inches
		double robot_width = 36.0;		// Max width 36 inches
		
		// Center wall to Center Gear Lift (Robot Facing Forwards)
		BobPath centerGear = new BobPath(thConfig, "Center", 1);
		centerGear.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		centerGear.addWaypoint(new WaypointSequence.Waypoint((110.0 - robot_length)/12, 0, 0));
		
		//  Distance in feet.
		double forward = (78.5 - robot_length)/12;         
		double left_right = (71.76 - (robot_width/2))/12;
		
		//  Robot Facing Forward
		BobPath blueBoilerGear = new BobPath(thConfig, "BlueBoilerGear", 1);
		blueBoilerGear.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		blueBoilerGear.addWaypoint(new WaypointSequence.Waypoint(forward, left_right, Math.toRadians(-60)));	
	
		BobPath redLoaderGear = new BobPath(thConfig, "RedLoaderGear", 1);
		redLoaderGear.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		redLoaderGear.addWaypoint(new WaypointSequence.Waypoint(forward, left_right, Math.toRadians(-60)));	
		
		BobPath blueLoaderGear = new BobPath(thConfig, "BlueLoaderGear", 1);
		blueLoaderGear.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		blueLoaderGear.addWaypoint(new WaypointSequence.Waypoint(forward, -left_right, Math.toRadians(60)));	

		BobPath redBoilerGear = new BobPath(thConfig, "RedBoilerGear", 1);
		redBoilerGear.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		redBoilerGear.addWaypoint(new WaypointSequence.Waypoint(forward, -left_right, Math.toRadians(60)));	
		

		//  Robot faces Backwards in Wall to Hopper paths. 
		//  Richmond measurements to hopper were: forward - 5.98  right - 3.21
		BobPath redBoilerHopper = new BobPath(thConfig, "RedBoilerHopper", -1);
		redBoilerHopper.addWaypoint(new WaypointSequence.Waypoint(0, 0, 180));
		redBoilerHopper.addWaypoint(new WaypointSequence.Waypoint(5.98, 3.21, Math.toRadians(180)));
		
		BobPath blueBoilerHopper = new BobPath(thConfig, "BlueBoilerHopper", -1);
		blueBoilerHopper.addWaypoint(new WaypointSequence.Waypoint(0, 0, 180));
		blueBoilerHopper.addWaypoint(new WaypointSequence.Waypoint(5.98, -3.21, Math.toRadians(180)));		
		
		BobPath redGearHopper = new BobPath(thConfig, "RedGearHopper", -1);
		redGearHopper.addWaypoint(new WaypointSequence.Waypoint(forward, -left_right, Math.toRadians(60)));
		redGearHopper.addWaypoint(new WaypointSequence.Waypoint(4, 3, Math.toRadians(91)));
		redGearHopper.addWaypoint(new WaypointSequence.Waypoint(5.98, -3.21, Math.toRadians(180)));
		
		BobPath blueGearHopper = new BobPath(thConfig, "BlueGearHopper", -1);
		blueGearHopper.addWaypoint(new WaypointSequence.Waypoint(forward, left_right, Math.toRadians(60)));
		blueGearHopper.addWaypoint(new WaypointSequence.Waypoint(4, -3, Math.toRadians(91)));
		blueGearHopper.addWaypoint(new WaypointSequence.Waypoint(5.98, -3.21, Math.toRadians(180)));
		
//		BobPath testDrive = new BobPath(thConfig, "TestDrive", 1);
//		testDrive.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
//		testDrive.addWaypoint(new WaypointSequence.Waypoint(3, -3, Math.toRadians(89)));
		
		BobPathGenerator.appendAndExportPathWithSerializer(
				new VelocityOnlyFileSerializer() , "Paths", "RedBoilerGearHopper", redBoilerGear, redGearHopper);
		
		BobPathGenerator.appendAndExportPathWithSerializer(
				new VelocityOnlyFileSerializer() , "Paths", "BlueBoilerGearHopper", blueBoilerGear, blueGearHopper);
		
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", centerGear);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", blueBoilerGear);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", blueLoaderGear);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", redBoilerGear);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", redLoaderGear);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", redBoilerHopper);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", blueBoilerHopper);
		
		//BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", testDrive);
	}
}
