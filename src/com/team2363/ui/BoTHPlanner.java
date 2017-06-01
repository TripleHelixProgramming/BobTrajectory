package com.team2363.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.team254.lib.trajectory.TrajectoryGenerator.Config;
import com.team254.lib.trajectory.TrajectoryGenerator.Strategy;
import com.team254.lib.trajectory.Waypoint;
import com.team319.trajectory.BoTHPath;
import com.team319.trajectory.BoTHPathGenerator;
import com.team319.trajectory.SrxTrajectoryImporter;
import com.team319.ui.Plotter;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BoTHPlanner extends Application {

	private static final BorderPane root = new BorderPane();
	private static final Plotter plotter = new Plotter();
	private static final ListView<BoTHPath> pathList = new ListView<>();
	private static final ListView<Waypoint> waypointList = new ListView<>();
	private static Config config = getConfig();
	
	private static ObservableList<BoTHPath> paths = FXCollections.observableArrayList();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("BoTH Planner");
		setupMenu();
		setupLists();
		setupPlotter();
		root.setBottom(getPathEditor(null));

		primaryStage.setResizable(false);
		primaryStage.setScene(new Scene(root, 1000, 550));
		primaryStage.show();
	}
	
	private void setupMenu() {
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(getFileMenu());
		root.setTop(menuBar);
	}
	
	private Menu getFileMenu() {
		Menu file = new Menu("File");
		MenuItem export = new MenuItem("Export Paths");
		export.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				for (BoTHPath path : pathList.getItems()) {
					BoTHPathGenerator.exportPath("Paths", config, path);
				}
			}
		});
		file.getItems().addAll(export);
		return file;
	}
	
	private void setupLists() {
		HBox lists = new HBox();
		lists.getChildren().addAll(getPathList(), getWaypointList());
		root.setLeft(lists);
	}

	private Node getPathList() {
		loadPaths();
		Button newPathButton = new Button("New Path");
		newPathButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				root.setBottom(getPathEditor(null));
				pathList.getSelectionModel().clearSelection();
				waypointList.getItems().clear();
				waypointList.refresh();
				plotter.clearChart();
			}
		});
		pathList.setItems(paths);
		pathList.getSelectionModel().selectedItemProperty().addListener(new PathSelectionHandler());

		BorderPane pathBox = new BorderPane();
		pathBox.setCenter(pathList);
		pathBox.setBottom(newPathButton);
		newPathButton.prefWidthProperty().bind(pathBox.widthProperty());

		return pathBox;
	}

	private Node getWaypointList() {
		Button newWaypointButton = new Button("New Waypoint");
		newWaypointButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				root.setBottom(getWaypointEditor(null));
				waypointList.getSelectionModel().clearSelection();
			}
		});
		waypointList.getSelectionModel().selectedItemProperty().addListener(new WaypointSelectionHandler());
		BorderPane waypointBox = new BorderPane();
		waypointBox.setCenter(waypointList);
		waypointBox.setBottom(newWaypointButton);
		newWaypointButton.prefWidthProperty().bind(waypointBox.widthProperty());

		return waypointBox;
	}

	private void setupPlotter() {
		root.getStylesheets().add(new Plotter().getClass().getResource("Plotter.css").toExternalForm());
		root.setRight(plotter.getChart());
	}

	private Node getPathEditor(BoTHPath path) {
		Label pathNameLabel = new Label();
		pathNameLabel.setText("Path Name: ");
		TextField pathName = new TextField();
		if (path != null) {
			pathName.setText(path.getName());
		} else {
			pathName.setText("");
		}
		
		Label pathVelocityLabel = new Label();
		pathVelocityLabel.setText("Goal Velocity: ");
		TextField pathVelocity = new TextField();
		if (path != null) {
			pathVelocity.setText(Double.toString(path.getTargetVelocity()));
		} else {
			pathVelocity.setText("");
		}
		
		CheckBox direction = new CheckBox("Reversed ");
		if (path != null) {
			direction.setSelected(path.isReversed());
		} else {
			direction.setSelected(false);
		}
		
		
		ObservableList<Strategy> options = FXCollections.observableArrayList(
				Strategy.AUTOMATIC,
				Strategy.S_CURVE,
				Strategy.TRAPEZOIDAL,
				Strategy.STEP
				);
		ComboBox<Strategy> strategy = new ComboBox<>(options);
		if (path != null) {
			strategy.getSelectionModel().select(path.getStrategy());
		} else {
			strategy.getSelectionModel().selectFirst();
		}

		Button save = new Button("Save");
		save.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (path == null) {
					BoTHPath newPath = new BoTHPath();
					newPath.setTargetVelocity(Double.valueOf(pathVelocity.getText()));
					newPath.setReversed(direction.isSelected());
					newPath.setName(pathName.getText());
					newPath.setStrategy(strategy.getValue());
					paths.add(newPath);
					pathList.getSelectionModel().select(newPath);
				} else {
					path.setName(pathName.getText());
					path.setTargetVelocity(Double.valueOf(pathVelocity.getText()));
					path.setReversed(direction.isSelected());
					path.setStrategy(strategy.getValue());
					pathList.refresh();
				}
				plotter.plotPath(config, pathList.getSelectionModel().getSelectedItem());
			}
		});

		FlowPane editor = new FlowPane();
		FlowPane.setMargin(pathNameLabel, new Insets(5));
		FlowPane.setMargin(pathName, new Insets(5));
		FlowPane.setMargin(pathVelocityLabel, new Insets(5));
		FlowPane.setMargin(pathVelocity, new Insets(5));
		FlowPane.setMargin(direction, new Insets(5));
		FlowPane.setMargin(save, new Insets(5));
		editor.setPadding(new Insets(5));
		editor.getChildren().addAll(pathNameLabel, pathName, pathVelocityLabel, pathVelocity, direction, strategy, save);
		return editor;
	}

	private Node getWaypointEditor(Waypoint waypoint) {
		Label xLabel = new Label();
		xLabel.setText("X: ");
		TextField x = new TextField();
		if (waypoint != null) {
			x.setText("" + waypoint.getX());
		}

		Label yLabel = new Label();
		yLabel.setText("Y: ");
		TextField y = new TextField();
		if (waypoint != null) {
			y.setText("" + waypoint.getY());
		}

		Label thetaLabel = new Label();
		thetaLabel.setText("Theta: ");
		TextField theta = new TextField();
		if (waypoint != null) {
			theta.setText("" + Math.toDegrees(waypoint.getTheta()));
		}

		Button save = new Button("Save");
		save.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (waypoint == null) {
					pathList.getSelectionModel().getSelectedItem().getWaypoints().add(
							new Waypoint(Double.valueOf(x.getText()), 
									Double.valueOf(y.getText()), 
									Math.toRadians(Double.valueOf(theta.getText()))));
					waypointList.setItems(FXCollections.observableArrayList(pathList.getSelectionModel().getSelectedItem().getWaypoints()));
					
				} else {
					waypoint.setX(Double.valueOf(x.getText()));
					waypoint.setY(Double.valueOf(y.getText()));
					waypoint.setTheta(Math.toRadians(Double.valueOf(theta.getText())));
				}
				waypointList.refresh();
				plotter.plotPath(config, pathList.getSelectionModel().getSelectedItem());
			}
		});

		FlowPane editor = new FlowPane();
		FlowPane.setMargin(x, new Insets(5));
		FlowPane.setMargin(y, new Insets(5));
		FlowPane.setMargin(theta, new Insets(5));
		editor.setPadding(new Insets(5));
		editor.getChildren().addAll(xLabel, x, yLabel, y, thetaLabel, theta, save);
		return editor;
	}
	
	private static Config getConfig() {
		Properties prop = new Properties();
		InputStream input = null;
		Config config = new Config();
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);

			config.setWheelBase(Double.valueOf(prop.getProperty("wheelBase", "30")));
			config.setWheelDiameter(Double.valueOf(prop.getProperty("wheelDiameter", "48")));
			config.setMaxVelocity(Double.valueOf(prop.getProperty("maxVelocity", "48")));
			config.setMaxAcceleration(Double.valueOf(prop.getProperty("maxAcceleration", "60")));
			config.setMaxJerk(Double.valueOf(prop.getProperty("maxJerk", "50")));
			config.setDt(Double.valueOf(prop.getProperty("dt", "0.01")));
		} catch (IOException ex) { 
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) { }
			}
		}
		return config;
	}

	private class PathSelectionHandler implements ChangeListener<BoTHPath> {

		public void changed(ObservableValue<? extends BoTHPath> observable, BoTHPath oldValue, BoTHPath newValue) {
			root.setBottom(getPathEditor(newValue));
			plotter.clearChart();
			if (newValue == null || newValue.getWaypoints().isEmpty()) {
				return;
			}
			waypointList.setItems(FXCollections.observableArrayList(newValue.getWaypoints()));
			plotter.plotPath(config, newValue);
		}
	}

	private class WaypointSelectionHandler implements ChangeListener<Waypoint> {

		@Override
		public void changed(ObservableValue<? extends Waypoint> observable, Waypoint oldValue, Waypoint newValue) {
			root.setBottom(getWaypointEditor(newValue));
		}
	}
	
	private void loadPaths() {
		File folder = new File("Paths/");
		File[] files = folder.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				paths.addAll(SrxTrajectoryImporter.importSrxTrajectory(file.getName()).getPaths());
			} 
		}
	}

//	private ObservableList<BoTHPath> generatePaths() {
//		double robot_length = 33.5;    	//   Max length 40 inches
//		double robot_width = 36.0;		// Max width 36 inches
//
//		// Center wall to Center Gear Lift (Robot Facing Forwards)
//		BoTHPath centerGear = new BoTHPath("Center");
//		centerGear.addWaypoint(new Waypoint(0, 0, 0));
//		centerGear.addWaypoint(new Waypoint(110.0 - robot_length, 0, 0));
//
//		//  Distance in feet.
//		double forward = 148 - robot_length;         
//		double left_right = 76 - (robot_width/2);
//
//		//  Robot Facing Forward
//		BoTHPath blueBoilerGear = new BoTHPath("BlueBoilerGear");
//		blueBoilerGear.addWaypoint(new Waypoint(0, 0, 0));
//		blueBoilerGear.addWaypoint(new Waypoint(forward, -left_right, Math.toRadians(-60)));	
//
//		BoTHPath redLoaderGear = new BoTHPath("RedLoaderGear");
//		redLoaderGear.addWaypoint(new Waypoint(0, 0, 0));
//		redLoaderGear.addWaypoint(new Waypoint(forward, -left_right, Math.toRadians(-60)));	
//
//		BoTHPath blueLoaderGear = new BoTHPath("BlueLoaderGear");
//		blueLoaderGear.addWaypoint(new Waypoint(0, 0, 0));
//		blueLoaderGear.addWaypoint(new Waypoint(forward, left_right, Math.toRadians(60)));	
//
//		return FXCollections.observableArrayList (
//				centerGear, 
//				blueBoilerGear, 
//				redLoaderGear, 
//				blueLoaderGear);
//	}
}
