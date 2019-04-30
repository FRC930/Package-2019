package com.team930.frc2019.util;

public class TimeDelay {

    private double delayTime = 0;
    private boolean timerStarted = false;
    private double startTime = 0;

    // Initializing time delay as zero
    public TimeDelay() {
        delayTime = 0;
    }

    // Creating time delay object with sec = delay in seconds
    public TimeDelay(double sec) {
        delayTime = sec;
    }

    // Setting the time in seconds to delay
    public void setDelay(double sec) {
        delayTime = sec;
    }

    /**
     * Gets Timer.get() as parameter
     * Returns true if time delay has passed
     * Returns false otherwise
     */
    public boolean execute(double time){
		if(!timerStarted){
			startTime = time;
			timerStarted = true;
		}
		if(time >= startTime + delayTime){
			timerStarted = false;
			return true;
		}
		else
			return false;
		
	}

}