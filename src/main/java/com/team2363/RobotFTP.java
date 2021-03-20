package com.team2363;

import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import com.team319.trajectory.RobotConfig;

public class RobotFTP {
    private String server;
    private int port;
    private String user;
    private String pass;
    private FTPClient ftp;

    public static void transferPaths() {
        RobotFTP ftp = new RobotFTP(RobotConfig.teamNumber);
        ftp.login();
        ftp.sendFile(new File(RobotConfig.pathsDirectory, "paths/Test.csv"), new File("/paths/Test.csv"));
    }
    public RobotFTP(int teamNumber) {
        server = getRobotServer(teamNumber);
        port = 21;
        user = "lvuser";
        pass = "";
        ftp = new FTPClient();
    }

    public void login() {
        System.out.println("Logging into " + server);
        try {
            ftp.connect(server, port);
            ftp.login(user, pass);
            ftp.enterLocalPassiveMode();
            ftp.setFileType(FTP.ASCII_FILE_TYPE);
        } catch (Exception e) {
            System.out.println("Error connecting to robot: " + e);
        }
    }

    public void sendFile(File clientFile, File robotFile) {
        System.out.println("Attempting to send file " + clientFile + " to " + robotFile + " at " + server);
        try {
            File deployDirectory = new File("/home/" + user + "/deploy/");
            robotFile = new File(deployDirectory.getPath(), robotFile.getPath());
            InputStream uploadFileStream = new FileInputStream(clientFile);
            boolean done = ftp.storeFile(robotFile.getPath(), uploadFileStream);
            uploadFileStream.close();
            if (done) {
                System.out.println("The first file is uploaded successfully.");
            }
        } catch (Exception e) {

        }
    }

    public static String getRobotServer(int teamNumber) {
        if (teamNumber > 25599) {
            System.out.println("Team number of " + teamNumber + " is too high for FTP. Please change it to something less than 25600.");
            teamNumber = 25599;
        }
        String server = "" + Math.abs(teamNumber); // just in case this is somehow negative.
        while (server.length() < 4) {
            server = "0" + server;
        }
        return new StringBuilder()
        .append("10." + server.substring(0, server.length() - 2))
        .append("." + server.substring(server.length() - 2))
        .append(".2")
        .toString();
    }
}