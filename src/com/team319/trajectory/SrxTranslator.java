package com.team319.trajectory;


import java.util.ArrayList;
import java.util.List;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.Trajectory;
import com.team254.lib.trajectory.Trajectory.Segment;
import com.team254.lib.trajectory.TrajectoryGenerator.Config;

public class SrxTranslator {


	// Reads a Path object generated from 254's trajectory planning software and
	// creates a CombinedSrxMotionProfile from it
	public SrxTrajectory getSrxTrajectoryFromChezyPath(Path chezyPath, Config config) {

		// create an array of points for the SRX
		List<SrxTrajectoryPoint> left = extractSRXPointsFromChezyTrajectory(chezyPath.getPair().left, config.getWheelDiameter(),
				config.getScaleFactor());

		// do it again for the right side
		List<SrxTrajectoryPoint> right = extractSRXPointsFromChezyTrajectory(chezyPath.getPair().right, config.getWheelDiameter(),
				config.getScaleFactor());

		// Combine
		return new SrxTrajectory(left, right);
	}

	public List<SrxTrajectoryPoint> extractSRXPointsFromChezyTrajectory(Trajectory traj, double wheelDiameterInches,
			double scaleFactor) {
		// create an array of points for the SRX
		List<SrxTrajectoryPoint> points = new ArrayList<>();

		// Fill that array
		for (Segment segment : traj.getSegments()) {
			// translate from inches to rotations
			double position = convertInchesToEncoderRotations(segment.pos, wheelDiameterInches, scaleFactor);

			// translate from ips to rpm
			double rpm = convertIpsToEncoderRpm(segment.vel, wheelDiameterInches, scaleFactor);

			// translate from seconds to milliseconds
			int dt = (int) (segment.dt * 1000);
			points.add(new SrxTrajectoryPoint(position, rpm, dt));
		}

		return points;
	}

	public double convertIpsToEncoderRpm(double ips, double wheelDiameterInches, double scaleFactor) {
		// feet per minute
		double ipm = ips * 60;
		// wheel rpm
		double rpm = ipm / (wheelDiameterInches * Math.PI);
		// encoder rpm
		double encoderRpm = rpm * scaleFactor;

		return encoderRpm;
	}

	public double convertInchesToEncoderRotations(double inches, double wheelDiameterInches, double scaleFactor) {
		// convert feet to wheel rotations using the circumference of the wheel
		double wheelRotations = inches / (wheelDiameterInches * Math.PI);

		// convert wheel rotations to encoder rotations using the reduction
		// between the two
		double encoderRotations = wheelRotations * scaleFactor;
		return encoderRotations;
	}
}
