package com.team930.frc2019.subsystems.drive;

public class ArcadeDrive extends Drive {

    public ArcadeDrive(double deadband) {
        super(deadband);
    }

    public void init() {

    }

    public void run() {

        double throttle = Math.pow(super.leftStick, 3);
        double turn = -1 * Math.pow(super.rightStick, 3);

        if ((Math.abs(throttle) < 0.00124)) {
            throttle = 0;
        }
        if ((Math.abs(turn) < 0.00124)) {
            turn = 0;
        }

        runAt((throttle + turn), -(throttle - turn));
        
    }

    public void runAt(double leftSpeed, double rightSpeed) {
        // left.set(leftSpeed);
        // right.set(rightSpeed);
    }

}