package com.team319.ui;

import java.text.DecimalFormat;
import java.util.List;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.TrajectoryGenerator.Config;
import com.team254.lib.trajectory.Waypoint;
import com.team319.trajectory.BoTHPath;
import com.team319.trajectory.BoTHPathGenerator;

import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

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
	public void plotChezyTrajectory(Path path) {
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
			left.getData().add(new Data<Number, Number>(path.getPair().left.getSegment(i).y, path.getPair().left.getSegment(i).x));
		}

		Series<Number, Number> right = new Series<>();
		right.setName("Right");
		for (int i = 0; i < path.getPair().left.getNumSegments(); i++) {
			Data<Number, Number> data = new Data<Number, Number>(path.getPair().right.getSegment(i).y, path.getPair().right.getSegment(i).x);
			right.getData().add(data);
		}
		
		sc.getData().addAll(left, right);
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
		plotChezyTrajectory(BoTHPathGenerator.makePath(config, path));
		plotWaypoints(path.getWaypoints());
	}
}
