package com.team319.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

import com.google.common.base.Strings;
import com.team319.io.ConfigExporter;
import com.team319.io.ConfigImporter;
import com.team319.io.PathExporter;
import com.team319.io.PathImporter;
import com.team319.io.TrajectoryExporter;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.RobotConfig;

public class BobTrajectoryApp extends JFrame {

    public static void main(String... args) {
        new BobTrajectoryApp();
    }

    private static final long serialVersionUID = 1L;

    FieldTabs tabs = new FieldTabs();
    // JPanel buttons = new JPanel();
    JMenu fileMenu = new JMenu("File");
    JMenu pathMenu = new JMenu("Path");

    public BobTrajectoryApp() {
        Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
        setIconImage(icon);
        importPaths();
        ConfigImporter.importConfig(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - 755 / 2, dim.height / 2 - 730 / 2);
        setTitle("BobTrajectory");
        setVisible(true);
        addWindowListener(new SaveHandler());
        setLayout(new BorderLayout());
        setupTabPanel();
        setResizable(false);
        setBackground(new Color(50, 50, 50));
        setupMenuBar();
        pack();
    }

    private void setupMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // Creating File menu
        // JMenu filMenu = new JMenu("File");
        JMenuItem mItem1 = new JMenuItem("Open...");
        JMenuItem mItem2 = new JMenuItem("Save As...");
        mItem2.setEnabled(false);

        // Adding menu items to the menu
        fileMenu.add(mItem1);
        fileMenu.add(mItem2);

        // Add ActionListeners
        mItem1.addActionListener(new OpenPath());
        mItem2.addActionListener(new SavePath());

        // Creating Path menu
        // JMenu pathMenu = new JMenu("Path");
        JMenuItem mItem3 = new JMenuItem("Add...");
        JMenuItem mItem4 = new JMenuItem("Delete");
        mItem4.setEnabled(false);
        JMenuItem mItem5 = new JMenuItem("Configuration...");
        JMenuItem mItem6 = new JMenuItem("Field Background...");
        mItem6.setEnabled(false);

        // Adding menu items to the menu
        pathMenu.add(mItem3);
        pathMenu.add(mItem4);
        pathMenu.add(mItem5);
        pathMenu.add(mItem6);

        // Add ActionListeners
        mItem3.addActionListener(new CreateNewPath());
        mItem4.addActionListener(new DeletePath());
        mItem5.addActionListener(new OpenConfiguration());
        mItem6.addActionListener(new OpenFieldImage());

        // Adding our menu to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(pathMenu);

        // Adding my menu bar to the frame by calling setMenuBar() method
        this.setJMenuBar(menuBar);

    }

    private void setupTabPanel() {
        getContentPane().setBackground(new Color(50, 50, 50));
        /*
         * Use Menus instead of buttons. NewPathButton newPathButton = new
         * NewPathButton(); newPathButton.addActionListener(new CreateNewPath());
         * 
         * DeletePathButton deletePathButton = new DeletePathButton();
         * deletePathButton.addActionListener(new DeletePath());
         * 
         * ConfigurationButton configurationButton = new ConfigurationButton();
         * configurationButton.addActionListener(new OpenConfiguration());
         * 
         * SaveButton saveButton = new SaveButton(); saveButton.addActionListener(new
         * SavePath()); saveButton.setEnabled(false);
         * 
         * OpenButton openButton = new OpenButton(); openButton.addActionListener(new
         * OpenPath());
         * 
         * buttons.setBackground(new Color(50, 50, 50));
         * buttons.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
         * buttons.add(newPathButton); buttons.add(deletePathButton);
         * buttons.add(configurationButton); buttons.add(saveButton);
         * buttons.add(openButton);
         * 
         * add(buttons, BorderLayout.SOUTH);
         */
        add(tabs);
    }

    private void importPaths() {
        for (Plotter path : PathImporter.importPaths()) {
            tabs.addTab(path.getPathName(), path);
        }
    }

    private void importPaths(File file) {
        for (Plotter path : PathImporter.importPaths(file)) {
            tabs.addTab(path.getPathName(), path);
        }
    }

    private void exportPaths() {
        List<BobPath> paths = new ArrayList<>();
        for (Component tab : tabs.getComponents()) {
            if (!(tab instanceof Plotter)) {
                continue;
            }
            paths.add(((Plotter) tab).getPath());
        }
        PathExporter.exportPaths(paths);
        TrajectoryExporter.exportTrajectory(paths);
    }

    private void exportPath(BobPath path, File file) {
        PathExporter.exportPath(path, file);
        TrajectoryExporter.exportTrajectory(path, file);
    }

    private void enableSaveButton(boolean state) {
        /*
         * Component c = buttons.getComponent(3); // If there's a better way to get a
         * particular button, like find by name, that'd be better if (c instanceof
         * SaveButton) { c.setEnabled(true); }
         */

        Component m = fileMenu.getItem(1);
        m.setEnabled(state);
        m = pathMenu.getItem(1);
        m.setEnabled(state);
        m = pathMenu.getItem(3);
        m.setEnabled(state);
    }

    private class CreateNewPath implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = JOptionPane.showInputDialog(BobTrajectoryApp.this, "New path name: ", "New Path",
                    JOptionPane.PLAIN_MESSAGE);
            if (Strings.isNullOrEmpty(name)) {
                return;
            }

            enableSaveButton(true);
            Plotter newPath = new Plotter(name);
            tabs.addTab(newPath.getPathName(), newPath);
            tabs.repaint();
            pack();
        }
    }

    private class DeletePath implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this path?", "Delete Path",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE) != JOptionPane.YES_OPTION) {
                return;
            }
            tabs.remove(tabs.getSelectedComponent());

            if (0 == tabs.getTabCount()) {
                enableSaveButton(false);
            }
            pack();
        }
    }

    private class OpenConfiguration implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ConfigurationPanel configuration = new ConfigurationPanel();
            int result = JOptionPane.showConfirmDialog(null, configuration, "Configuration",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                updateConfig(configuration);
                tabs.repaint();
            }
        }
    }

    private class SavePath implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setAcceptAllFileFilterUsed(false);
            int saveResult = fc.showSaveDialog(null);
            if (JFileChooser.APPROVE_OPTION == saveResult) {
                Component c = tabs.getSelectedComponent();
                if (c instanceof Plotter) {
                    BobPath path = ((Plotter) c).getPath();
                    /*
                     * The FileChooser SaveDialog is a bit wonky. If you create a folder, you are
                     * placed in the folder, but the selected file remains the parent folder. So if
                     * you use the selected file, you'll end up creating a new folder inside the
                     * folder you just created!
                     * 
                     * Get around this by doing some finagling. IF the selected file's name is the
                     * same as its grandparent, then assume the user created a new folder and the
                     * selected file points to the folder the new folder was created in. *whew*
                     */
                    File file = fc.getSelectedFile();
                    if (!file.exists()) {
                        if (file.getParentFile().getParentFile().getName().equals(file.getName())) {
                            file = file.getParentFile();
                        }
                    }
                    exportPath(path, file);
                    ConfigExporter.exportConfig(file);
                }
            }
        }
    }

    private class OpenPath implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser();
            int openResult = fc.showOpenDialog(null);
            if (JFileChooser.APPROVE_OPTION == openResult) {
                importPaths(fc.getSelectedFile());
                ConfigImporter.importConfig(fc.getSelectedFile().getParentFile()); // Get the directory the Path file is
                                                                                   // in
                enableSaveButton(true);
                tabs.repaint();
                pack();
            }
        }
    }

    private class OpenFieldImage implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser();
            int openResult = fc.showOpenDialog(null);
            if (JFileChooser.APPROVE_OPTION == openResult) {
                File imageFile = fc.getSelectedFile();
                Component currentTab = tabs.getSelectedComponent();
                if (currentTab instanceof Plotter) {
                    System.out.println(imageFile.getName());
                    ((Plotter) currentTab).setFieldImage(imageFile);
                }
                tabs.repaint();
                pack();
            }
        }
    }

    private void updateConfig(ConfigurationPanel configuration) {
        RobotConfig.length = configuration.getRobotLength();
        RobotConfig.width = configuration.getRobotWidth();
        RobotConfig.wheelBase = configuration.getWheelBase();
        RobotConfig.maxAcceleration = configuration.getMaxAcceleration();
        RobotConfig.maxVelocity = configuration.getMaxVelocity();
        RobotConfig.exportType = configuration.getExportType();
    }

    private class SaveHandler implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
            if (JOptionPane.showConfirmDialog(null, "Do you want to save the paths and config?", "Save",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.YES_OPTION) {
                exportPaths();
                ConfigExporter.exportConfig();
            }
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    }
}