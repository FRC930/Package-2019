package com.team930.frc2019.subsystems.drive;

import com.team930.frc2019.subsystems.*;

public abstract class Drive extends Subsystem {

    protected double leftStick = 0;
    protected double rightStick = 0;
    private double deadband = 0;

    public Drive() {
        this.leftStick = 0;
        this.rightStick = 0;
        this.deadband = 0;
    }

    public Drive(double deadband, double leftStick, double rightStick) {
        this.deadband = deadband;
        this.leftStick = leftStick;
        this.rightStick = rightStick;
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