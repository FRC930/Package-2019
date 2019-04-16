package com.team930.frc2019.subsystems.drive;

import com.team930.frc2019.subsystems.*;

public abstract class Drive extends Subsystem {

    protected double leftStick;
    protected double rightStick;
    private double deadband;

    public Drive(double deadband) {
        this.deadband = deadband;
    }

    public void init() {

    }

    public abstract void run();

    public abstract void runAt(double leftSpeed, double rightSpeed);

    public void setLeftStick(double left) {
        leftStick = left;
    }

    public void setRightStick(double right) {
        rightStick = right;
    }

    public void setDeadband(double deadband) {
        this.deadband = deadband;
    }

    public double getDeadband() {
        return deadband;
    }

}