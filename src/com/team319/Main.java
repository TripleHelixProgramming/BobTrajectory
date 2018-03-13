package com.team319;

import com.team254.lib.trajectory.WaypointSequence;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.BobPathGenerator;
import com.team319.trajectory.BobRotation;
import com.team319.trajectory.SrxTranslatorConfig;
/**
 * Forked from 254's 2014 Trajectory library just a comment to make a change
 * 
 * @author Jared341
 * @author ttremblay
 */
public class Main {
	
	private static SrxTranslatorConfig standardConfig = new SrxTranslatorConfig();
	private static final double ROBOT_LENGTH = 33;

	public static void main(String[] args) {
		//Standard configs between all trajectories
		standardConfig.name = "StandardConfig";
		standardConfig.dt = .01;
		standardConfig.max_acc = 5;
		standardConfig.max_jerk = 60.0;
		standardConfig.max_vel = 7.0; 
		standardConfig.wheelbase_width_feet = inInches(32);
		standardConfig.wheel_dia_inches = 5;
		standardConfig.scale_factor = 1.33; 
		standardConfig.encoder_ticks_per_rev = 480;
		standardConfig.robot_length_feet = inInches(33);

		generateCenterSwitch();
		generateSameSideSwitch();
		generateSameSideScale();
		generateOppositeSideScale();
		generateBaseline();
		generateConfig();
	}
	
	private static void generateCenterSwitch() {
		BobPath centerSwitch = new BobPath(standardConfig, "CenterSwitch", 1);
		centerSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH/2), 13.5, 0));
		centerSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(125), inInches(60) + 13.5, 0));
		
		BobPathGenerator.exportArcToJavaFile("Paths", centerSwitch);
	}
	
	private static void generateSameSideSwitch() {
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 4.0;
		slowConfig.max_acc = 2;
		
//		BobPath sameSideSwitch = new BobPath(standardConfig, "SameSideSwitch", 1);
//		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH), 0, 0));
//		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(140), inInches(-57), Math.toRadians(0.0)));
		
		BobPath sameSideSwitch = new BobPath(slowConfig, "SameSideSwitch", 1);
		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH/2),23, 0));
		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(145), inInches(10) + 23, 0));
		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(185), inInches(-22) + 23, Math.toRadians(-89)));
//		sameSideSwitch.addWaypoint(new WaypointSequence.Waypoint(inInches(185), inInches(0) + 23, 0));
		
		SrxTranslatorConfig turnConfig = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 4.0;
		turnConfig.max_acc = 3;
		
		BobRotation sameSideSwitchPart1point3 = new BobRotation(turnConfig, "SameSideSwitchPart1point3", -90, 1);
		
		SrxTranslatorConfig straightConfig = new SrxTranslatorConfig(standardConfig);
		straightConfig.max_vel = 5.0;
		straightConfig.max_acc = 8;
		
		BobPath sameSideSwitchPart1point6 = new BobPath(straightConfig, "SameSideSwitchPart1point6", 2);
		sameSideSwitchPart1point6.addWaypoint(new WaypointSequence.Waypoint(inInches(0), inInches(0) + 23, Math.toRadians(0)));
		sameSideSwitchPart1point6.addWaypoint(new WaypointSequence.Waypoint(inInches(22), inInches(0) + 23, 0));
		
		BobRotation sameSideSwitchPart2 = new BobRotation(turnConfig, "SameSideSwitchPart2", -90, 2);
		
		BobPath sameSideSwitchPart3 = new BobPath(straightConfig, "SameSideSwitchPart3", -1);
		sameSideSwitchPart3.addWaypoint(new WaypointSequence.Waypoint(inInches(0), inInches(0) + 23, Math.toRadians(0)));
		sameSideSwitchPart3.addWaypoint(new WaypointSequence.Waypoint(inInches(84), inInches(0) + 23, 0));
		
		BobPath sameSideSwitchPart4 = new BobPath(straightConfig, "SameSideSwitchPart4", 1);
		sameSideSwitchPart4.addWaypoint(new WaypointSequence.Waypoint(inInches(84), inInches(0) + 23, 0));
		sameSideSwitchPart4.addWaypoint(new WaypointSequence.Waypoint(inInches(41), inInches(-16) + 23, Math.toRadians(45)));
		
		
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideSwitch);
		BobPathGenerator.exportRotationToJavaFile("Paths", sameSideSwitchPart1point3);
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideSwitchPart1point6);
		BobPathGenerator.exportRotationToJavaFile("Paths", sameSideSwitchPart2);
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideSwitchPart3);
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideSwitchPart4);
	}
	
	private static void generateSameSideScale() {
		SrxTranslatorConfig sameSideScaleConfig = new SrxTranslatorConfig(standardConfig);
		sameSideScaleConfig.max_vel = 3.0;
		sameSideScaleConfig.max_acc = 4;
		
		SrxTranslatorConfig firstPathConfig = new SrxTranslatorConfig(standardConfig);
		firstPathConfig.max_vel = 10;
		firstPathConfig.max_acc = 5;
		
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 2.0;
		slowConfig.max_acc = 3;
		
		SrxTranslatorConfig turnConfig = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 4.0;
		turnConfig.max_acc = 3;
		
		SrxTranslatorConfig turnConfigFast = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 5.0;
		turnConfig.max_acc = 4;
		
		BobPath sameSideScale = new BobPath(firstPathConfig, "SameSideScale", 1);
		sameSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH/2), 0 + 23, 0));
		sameSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(200), inInches(0) + 23, 0));
		sameSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(282), inInches(-15) + 23, Math.toRadians(-25)));
		
		BobRotation sameSideScalePart2 = new BobRotation(turnConfig, "SameSideScalePart2", -148, 2);
		
		BobPath sameSideScalePart3 = new BobPath(sameSideScaleConfig, "SameSideScalePart3", 1);
		sameSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(0), inInches(0) + 23, Math.toRadians(0)));
		sameSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(50), inInches(0) + 23, Math.toRadians(0)));
		
		BobRotation sameSideScalePart4 = new BobRotation(turnConfigFast, "SameSideScalePart4", 165, 2);
		
		BobPath sameSideScalePart5 = new BobPath(sameSideScaleConfig, "SameSideScalePart5", 1);
		sameSideScalePart5.addWaypoint(new WaypointSequence.Waypoint(inInches(0), inInches(0) + 23, Math.toRadians(0)));
		sameSideScalePart5.addWaypoint(new WaypointSequence.Waypoint(inInches(47), inInches(0) + 23, Math.toRadians(0)));
		
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideScale);
		BobPathGenerator.exportRotationToJavaFile("Paths", sameSideScalePart2);
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideScalePart3);
		BobPathGenerator.exportRotationToJavaFile("Paths", sameSideScalePart4);
		BobPathGenerator.exportArcToJavaFile("Paths", sameSideScalePart5);
	}
	
	private static void generateOppositeSideScale() {
		SrxTranslatorConfig oppositeSideScaleConfig = new SrxTranslatorConfig(standardConfig);
		oppositeSideScaleConfig.max_vel = 5.0;
		oppositeSideScaleConfig.max_acc = 3;
		
		BobPath oppositeSideScale = new BobPath(oppositeSideScaleConfig, "OppositeSideScale", 1);
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH/2), 0 + 23, 0));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(160), inInches(0) + 23, 0));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(235), inInches(-65) + 23, Math.toRadians(-89.99)));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(235), inInches(-155) + 23, Math.toRadians(-89.99)));
		oppositeSideScale.addWaypoint(new WaypointSequence.Waypoint(inInches(275), inInches(-210) + 23, Math.toRadians(0.00)));
		
		SrxTranslatorConfig turnConfig = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 4.0;
		turnConfig.max_acc = 3;
		
		BobRotation oppositeSideScalePart2 = new BobRotation(turnConfig, "OppositeSideScalePart2", 171, 2);
		
		BobPath oppositeSideScalePart3 = new BobPath(turnConfig, "OppositeSideScalePart3", 1);
		oppositeSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(0, 0 + 23, 0));
		oppositeSideScalePart3.addWaypoint(new WaypointSequence.Waypoint(inInches(38), 0 + 23, 0));
		
		SrxTranslatorConfig turnConfigFast = new SrxTranslatorConfig(standardConfig);
		turnConfig.max_vel = 5.0;
		turnConfig.max_acc = 4;
		
		BobRotation oppositeSideScalePart4 = new BobRotation(turnConfigFast, "OppositeSideScalePart4", 180, 2);
		
		BobPathGenerator.exportArcToJavaFile("Paths", oppositeSideScale);
		BobPathGenerator.exportRotationToJavaFile("Paths", oppositeSideScalePart2);
		BobPathGenerator.exportArcToJavaFile("Paths", oppositeSideScalePart3);
		BobPathGenerator.exportRotationToJavaFile("Paths", oppositeSideScalePart4);
	}
	
	private static void generateBaseline() {
		SrxTranslatorConfig oppositeSideScaleConfig = new SrxTranslatorConfig(standardConfig);
		oppositeSideScaleConfig.max_vel = 5.0;
		oppositeSideScaleConfig.max_acc = 3;
		
		BobPath baseline = new BobPath(oppositeSideScaleConfig, "Baseline", 1);
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(ROBOT_LENGTH/2), 0 + 23, 0));
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(160), inInches(0) + 23, 0));
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(235), inInches(-65) + 23, Math.toRadians(-89.99)));
		baseline.addWaypoint(new WaypointSequence.Waypoint(inInches(235), inInches(-100) + 23, Math.toRadians(-89.99)));

		BobPathGenerator.exportArcToJavaFile("Paths", baseline);
	}
	
	private static void generateConfig() {
		SrxTranslatorConfig slowConfig = new SrxTranslatorConfig(standardConfig);
		slowConfig.max_vel = 2.0;
		slowConfig.max_acc = 3;
		
		BobPath scalingCalibration = new BobPath(standardConfig, "scaling_calibration", 1);
		scalingCalibration.addWaypoint(new WaypointSequence.Waypoint(0.0, 0.0, 0.0));
		scalingCalibration.addWaypoint(new WaypointSequence.Waypoint(5.0, 0.0, Math.toRadians(0.0)));
		
		BobPath turningCalibration = new BobPath(slowConfig, "turning_calibration", 1);
		turningCalibration.addWaypoint(new WaypointSequence.Waypoint(0, 0, 0));
		turningCalibration.addWaypoint(new WaypointSequence.Waypoint(4.0, 4.0, Math.toRadians(89.99)));

		BobPathGenerator.exportPathToJavaFile("Paths", scalingCalibration);
		BobPathGenerator.exportPathToJavaFile("Paths", turningCalibration);
	}
	
	private static double inInches(double inches) {
		return ((double) inches) / 12.0;
	}
}
