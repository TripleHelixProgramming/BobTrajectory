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
		
		

		BobPathGenerator.exportPath("Paths", blueHopperAutoPt1);
		BobPathGenerator.exportPath("Paths", blueHopperAutoPt2);
		BobPathGenerator.appendAndExportPaths("Paths", "appendedPath", blueHopperAutoPt2, toAppend);
		
		generateTHPaths();
	}
	
	private static void generateTHPaths() {
		SrxTranslatorConfig thConfig = new SrxTranslatorConfig();
		thConfig.name = "TripleHelixConfig";
		thConfig.dt = .01;
		thConfig.max_acc = 9.0;
		thConfig.max_jerk = 70.0;
		thConfig.max_vel = 3.0;
		thConfig.wheelbase_width_feet = 33/12.0;
		thConfig.wheel_dia_inches = 4;
		thConfig.scale_factor = 0.5;
		
		BobPath redGear = new BobPath(thConfig, "RedGear", 1);
		redGear.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		redGear.addWaypoint(new WaypointSequence.Waypoint(7.4, 2, Math.toRadians(60)));
		
		BobPath redGearToHopper = new BobPath(thConfig, "RedGearToHopper", -1);
		redGearToHopper.addWaypoint(new WaypointSequence.Waypoint(7.4, 2, Math.toRadians(60)));
		redGearToHopper.addWaypoint(new WaypointSequence.Waypoint(6.8, -6.1, Math.toRadians(90)));
		
		BobPath redGearToHopper2 = new BobPath(thConfig, "RedGearToHopper2", -1);
		redGearToHopper2.addWaypoint(new WaypointSequence.Waypoint(7.4, 2, Math.toRadians(60)));
		redGearToHopper2.addWaypoint(new WaypointSequence.Waypoint(4, -3, Math.toRadians(91)));
		redGearToHopper2.addWaypoint(new WaypointSequence.Waypoint(6.8, -6.1, Math.toRadians(180)));
		
		BobPath redHopper = new BobPath(thConfig, "RedHopper", 1);
		redHopper.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		redHopper.addWaypoint(new WaypointSequence.Waypoint(78.5 / 12, -36.25/12, 0));
		
		BobPath testDrive = new BobPath(thConfig, "TestDrive", 1);
		testDrive.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		testDrive.addWaypoint(new WaypointSequence.Waypoint(3, -3, Math.toRadians(89)));
		
		BobPath redHopper2 = new BobPath(thConfig, "RedHopper2", 1);
		redHopper2.addWaypoint(new WaypointSequence.Waypoint(1, 0, -45));
		redHopper2.addWaypoint(new WaypointSequence.Waypoint(6.5, -3.02, 0));
		
		BobPathGenerator.appendAndExportPathWithSerializer(
				new VelocityOnlyFileSerializer() , "Paths", "RedGearAndHopper", redGear, redGearToHopper);
		BobPathGenerator.appendAndExportPathWithSerializer(
				new VelocityOnlyFileSerializer() , "Paths", "RedGearAndHopper2", redGear, redGearToHopper2);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", redGear);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", redHopper);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", redHopper2);
		BobPathGenerator.exportPathWithSerializer(new VelocityOnlyFileSerializer() , "Paths", testDrive);
	}
}
