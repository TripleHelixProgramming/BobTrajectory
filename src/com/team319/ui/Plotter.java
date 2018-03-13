package com.team319.ui;

import java.text.DecimalFormat;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.Trajectory.Segment;
import com.team319.trajectory.SrxTranslatorConfig;

import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Plotter {
	
	public Plotter() { }

	public void plotChezyTrajectory(Path path, SrxTranslatorConfig config) {
		Stage stage = new Stage();

		stage.setTitle(config.name);

		final NumberAxis xAxis = new NumberAxis(0, 27, 1);
		final NumberAxis yAxis = new NumberAxis(0, 27, 1);
		final FieldChart sc = new FieldChart(xAxis, yAxis);
		xAxis.setLabel("x");
		yAxis.setLabel("y");
		DecimalFormat df = new DecimalFormat("0.00##");
		StringBuilder title = new StringBuilder();
		title.append(path.getName()).append(" : ").append(df.format(
				path.getLeftWheelTrajectory().getNumSegments() * path.getLeftWheelTrajectory().getSegment(0).dt))
				.append("s");
		sc.setTitle(title.toString());

		XYChart.Series<Number, Number> series1 = new ScatterChart.Series<>();

		series1.setName("Left");
		for (int i = 0; i < path.getPair().left.getNumSegments(); i++) {
			series1.getData().add(new XYChart.Data<Number, Number>(path.getPair().left.getSegment(i).x, path.getPair().left.getSegment(i).y));
		}

		XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
		series2.setName("Right");
		for (int i = 0; i < path.getPair().left.getNumSegments(); i++) {
			series2.getData().add(new XYChart.Data<Number, Number>(path.getPair().right.getSegment(i).x, path.getPair().right.getSegment(i).y));
		}

		XYChart.Series<Number, Number> series3 = new XYChart.Series<>();
		series3.setName("Center");
		for (int i = 0; i < path.getPair().center.getNumSegments(); i++) {
			Segment segment = path.getPair().center.getSegment(i);
			Data<Number, Number> data = new Data<Number, Number>(segment.x, segment.y);
			Region plotpoint = new Region();
	        plotpoint.setShape(new Circle(0.1));
	        plotpoint.setStyle("-fx-background-color: #" + getColor(segment.vel, 10) + "; -fx-stroke: #" +  getColor(segment.vel, 10) + ";");
	        data.setNode(plotpoint);
			series3.getData().add(data);
		}

		
		sc.getData().addAll(series1, series2, series3);
		Scene scene = new Scene(sc, 725, 780);
		scene.getStylesheets().clear();
		scene.getStylesheets().add(getClass().getResource("Plotter.css").toExternalForm());		
		stage.setScene(scene);
		stage.show();
	}
	
	private XYChart.Series<Number, Number> getBotSeries(Path path, double robotLength, double robotWidth) {
		XYChart.Series<Number, Number> series = new XYChart.Series<>();
		for (Segment segment : path.getPair().center.getSegments()) {
			series.getData().add(getPoint(robotLength/2.0, robotWidth/2.0, segment));
			series.getData().add(getPoint(robotLength/2.0, -robotWidth/2.0, segment));
			series.getData().add(getPoint(-robotLength/2.0, robotWidth/2.0, segment));
			series.getData().add(getPoint(-robotLength/2.0, -robotWidth/2.0, segment));
		}
		return series;
	}
	
	private XYChart.Data<Number, Number> getPoint(double startx, double starty, Segment segment) {
		double tempX = startx;
		double tempY = starty;
		double theta = segment.heading + Math.toRadians(90);

		double rotatedX = tempX * Math.cos(theta) - tempY * Math.sin(theta);
		double rotatedY = tempX * Math.sin(theta) + tempY * Math.cos(theta);
		
		return new XYChart.Data<Number, Number>(rotatedX + segment.x, rotatedY + segment.y);
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
}
