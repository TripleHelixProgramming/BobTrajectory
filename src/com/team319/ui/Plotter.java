package com.team319.ui;

import java.text.DecimalFormat;
import java.util.List;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.Trajectory.Segment;
import com.team254.lib.trajectory.TrajectoryGenerator.Config;
import com.team254.lib.trajectory.Waypoint;
import com.team319.trajectory.BoTHPath;
import com.team319.trajectory.BoTHPathGenerator;

import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;

public class Plotter {
	
	private boolean initialized;
	private ScatterChart<Number, Number> sc;
	
	private void initialize() {
		initialized = true;
		
		final NumberAxis yAxis = new NumberAxis(0, 324, 12);
		final NumberAxis xAxis = new NumberAxis(-162, 162, 12);
		sc = new ScatterChart<Number, Number>(xAxis, yAxis);
		sc.setScaleX(1);
		sc.setScaleY(1);
		sc.setLegendVisible(false);
		sc.setTitle("");
	}
		
	public Plotter(){}
	
	@SuppressWarnings("unchecked")
	public void plotChezyTrajectory(Path path, double maxVelocity) {
		if (!initialized) {
			initialize();
		}
		
		DecimalFormat df = new DecimalFormat("0.00##");
		StringBuilder title = new StringBuilder();
		title.append(path.getName()).append(" : ")
		.append(df.format(path.getLeftWheelTrajectory().getNumSegments() * path.getLeftWheelTrajectory().getSegment(0).dt))
		.append("s");
		sc.setTitle(title.toString());

		Series<Number, Number> left = new Series<>();
		left.setName("Left");
		for (int i = 0; i < path.getPair().left.getNumSegments(); i++) {
			Segment segment = path.getPair().left.getSegment(i);
			Data<Number, Number> data = new Data<Number, Number>(segment.y, segment.x);
			Region plotpoint = new Region();
	        plotpoint.setShape(new Circle(0.1));
	        plotpoint.setStyle("-fx-background-color: #" + getColor(segment.vel, maxVelocity) + "; -fx-stroke: #" +  getColor(segment.vel, maxVelocity) + ";");
	        data.setNode(plotpoint);
			left.getData().add(data);
		}

		Series<Number, Number> right = new Series<>();
		right.setName("Right");
		for (int i = 0; i < path.getPair().left.getNumSegments(); i++) {
			Segment segment = path.getPair().right.getSegment(i);
			Data<Number, Number> data = new Data<Number, Number>(segment.y, segment.x);
			Region plotpoint = new Region();
	        plotpoint.setShape(new Circle(0.1));
	        plotpoint.setStyle("-fx-background-color: #" + getColor(segment.vel, maxVelocity) + "; -fx-stroke: #" +  getColor(segment.vel, maxVelocity) + ";");
	        data.setNode(plotpoint);
			right.getData().add(data);
		}
		
		sc.getData().addAll(left, right);
	}
	
	private String getColor(double speed, double limit) {
		if (speed >= limit) {
			return "000000";
		}
		if (speed / limit == 0.5) {
			return "ffff00";
		}
		double percentage = speed / limit * 100;
	    int green = percentage < 50 ? 255 : (int)Math.floor(256 - (percentage - 50 ) * 5.12);
	    int red = percentage > 50 ? 255 : (int)Math.floor((percentage) * 5.12);
	    return String.format("%02X", red) + String.format("%02X", green) + "00";
	}
	
	public void clearChart() {
		sc.getData().clear();
		sc.setTitle("");
	}
	
	public ScatterChart<Number, Number> getChart() {
		if (!initialized) {
			initialize();
		}
		return sc;
	}
	
	private void plotWaypoints(List<Waypoint> sequence) {
		Series<Number, Number> waypoints = new Series<>();
		waypoints.setName("Waypoints");
		for (Waypoint waypoint : sequence) {
			waypoints.getData().add(new XYChart.Data<Number, Number>(waypoint.getX(), waypoint.getY()));
		}
		sc.getData().add(waypoints);
	}
	
	public void plotPath(Config config, BoTHPath path) {
		clearChart();
		if (path == null || path.getWaypoints().size() < 2) {
			return;
		}
		plotChezyTrajectory(BoTHPathGenerator.makePath(config, path), config.getMaxVelocity());
		plotWaypoints(path.getWaypoints());
	}
}
