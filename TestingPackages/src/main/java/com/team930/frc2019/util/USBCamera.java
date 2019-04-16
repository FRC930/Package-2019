package com.team930.frc2019.util;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;

public class USBCamera {

    private int ID;
    private int width;
    private int height;
    private int fps;

    public USBCamera(int id, int width, int height, int fps) {
        this.ID = id;
        this.width = width;
        this.height = height;
        this.fps = fps;
    }

    public void startCapture() {

        // Creates a thread which runs concurrently with the program
        new Thread(() -> {

          // Instantiate the USB cameras and begin capturing their video streams
          UsbCamera camera = CameraServer.getInstance().startAutomaticCapture(ID);
    
          // Set the camera's resolution and FPS
          camera.setResolution(width, height);
          camera.setFPS(fps);

        }).start();

    }

    public void setResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setFPS(int fps) {
        this.fps = fps;
    }

}