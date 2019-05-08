package com.team930.frc2019.subsystems;

import com.team930.frc2019.subsystems.drive.*;
import com.team930.frc2019.util.DSManager;

public class TeleopHandler implements Subsystem {

    private static TeleopHandler instance;

    private ArcadeDrive mDrive = ArcadeDrive.getInstance();
    private DSManager mDS = DSManager.getInstance();

    private double driverLeftYStick;
    private double driverRightXStick;


    public void init() {

    }

    public void run() {

        // Drive ----------------------------------------------------[
            driverLeftYStick = mDS.getDriverLeftYAxis();
            driverRightXStick = mDS.getDriverRightXAxis();

            mDrive.setLeftStick(driverLeftYStick);
            mDrive.setRightStick(driverRightXStick);

            mDrive.run();
        // Drive ----------------------------------------------------]

    }

    public static TeleopHandler getInstance() {
        if (instance == null) {
             instance = new TeleopHandler();
        }
        return instance;
    }
    
}