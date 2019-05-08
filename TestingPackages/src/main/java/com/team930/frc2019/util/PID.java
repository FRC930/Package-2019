package com.team930.frc2019.util;

public class PID {

    private double kP;
    private double kI;
    private double kD;
    private double dT;

    private double integral;
    private double derivative;
    private double prevError;

    public PID() {
        this.kP = 0;
        this.kI = 0;
        this.kD = 0;
        this.dT = 0;
        this.integral = 0;
        this.derivative = 0;
        this.prevError = 0;
    }

    public PID(double kP, double kI, double kD, double dT) {
        this.kP = kP;
        this.kI = kI;
        this.kD = kD;
        this.dT = dT;
        this.integral = 0;
        this.derivative = 0;
        this.prevError = 0;
    }

    public void setKp(double kP) {
        this.kP = kP;
    }
    public void setKi(double kI) {
        this.kI = kI;
    }
    public void setKd(double kD) {
        this.kD = kD;
    }
    public void setDt(double dT) {
        this.dT = dT;
    }

    public double calculate(double setpoint, double measuredValue) {
        double output = 0;

        double error = setpoint - measuredValue;
        integral = integral + error * dT;
        derivative = (error - prevError) / dT;
        output = kP * error + kI * integral + kD * derivative;
        prevError = error;
        
        return output;
    }
}