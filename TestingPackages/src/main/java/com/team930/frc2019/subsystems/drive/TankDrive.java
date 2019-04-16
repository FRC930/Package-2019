package com.team930.frc2019.subsystems.drive;

public class TankDrive extends Drive {

    public TankDrive(double deadband) {
        super(deadband);
    }

    public void init() {

    }

    public void run() {

        double leftThrottle = -1 * Math.pow(super.leftStick, 3);
        double rightThrottle = -1 * Math.pow(super.rightStick, 3);

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