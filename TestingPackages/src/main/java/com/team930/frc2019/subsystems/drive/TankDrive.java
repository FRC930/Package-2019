package com.team930.frc2019.subsystems.drive;

public class TankDrive extends Drive {

    private double leftThrottle = 0;
    private double rightThrottle = 0;

    public TankDrive(double deadband, double leftThrottle, double rightThrottle) {
        super(deadband, leftThrottle, rightThrottle);
    }

    public void init() {

    }

    public void run() {

        double leftThrottle = -1 * Math.pow(this.leftThrottle, 3);
        double rightThrottle = -1 * Math.pow(this.rightThrottle, 3);

        if ((Math.abs(leftThrottle) < super.getDeadband())) {
            leftThrottle = 0;
        }
        if ((Math.abs(rightThrottle) < super.getDeadband())) {
            rightThrottle = 0;
        }

        runAt(leftThrottle, rightThrottle);
        
    }

    public void runAt(double leftSpeed, double rightSpeed) {
        // left.set(leftSpeed);
        // right.set(rightSpeed);
    }

}