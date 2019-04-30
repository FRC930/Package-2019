package com.team930.frc2019.subsystems.drive;

public class ArcadeDrive extends Drive {

    private double throttle = 0;
    private double turn = 0;

    public ArcadeDrive() {
        super();
    }

    public ArcadeDrive(double deadband, double throttle, double turn) {
        super(deadband, throttle, turn);
    }

    public void init() {

    }

    public void run() {

        throttle = Math.pow(throttle, 3);
        turn = -1 * Math.pow(turn, 3);

        if ((Math.abs(throttle) < super.getDeadband())) {
            throttle = 0;
        }
        if ((Math.abs(turn) < super.getDeadband())) {
            turn = 0;
        }

        runAt((throttle + turn), -(throttle - turn));
        
    }

    public void runAt(double leftSpeed, double rightSpeed) {
        // left.set(leftSpeed);
        // right.set(rightSpeed);
    }

}