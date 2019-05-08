package com.team930.frc2019;

import edu.wpi.first.wpilibj.TimedRobot;
import com.team930.frc2019.subsystems.*;
import com.team930.frc2019.subsystems.drive.*;
import com.team930.frc2019.util.*;

public class Robot extends TimedRobot {

    private ArcadeDrive mDrive = ArcadeDrive.getInstance();
    private TeleopHandler mTeleopHandler = TeleopHandler.getInstance();

    @Override
    public void robotInit() {

        mDrive.init();

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopInit() {

        mTeleopHandler.init();

    }

    @Override
    public void teleopPeriodic() {

        mTeleopHandler.run();

    }

    @Override
    public void testPeriodic() {

    }
}