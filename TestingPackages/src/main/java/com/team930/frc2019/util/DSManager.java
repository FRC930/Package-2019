package com.team930.frc2019.util;

import edu.wpi.first.wpilibj.Joystick;

public class DSManager {

	private static DSManager instance;

    // Driver controller
    private Joystick driver = new Joystick(DSManagerConstants.DRIVER_CONTROLLER_ID);
    // CoDriver controller
    private Joystick coDriver = new Joystick(DSManagerConstants.CODRIVER_CONTROLLER_ID);

	// Joysticks -------------------------------------------------------------[
		// Left Y Joystick Axis
		public double getDriverLeftYAxis() {
			return driver.getRawAxis(DSManagerConstants.DRIVER_AXIS_LEFT_Y);
		}
		public double getCoDriverLeftYAxis() {
			return coDriver.getRawAxis(DSManagerConstants.CODRIVER_AXIS_LEFT_Y);
		}

		// Left X Joystick Axis
		public double getDriverLeftXAxis() {
			return driver.getRawAxis(DSManagerConstants.DRIVER_AXIS_LEFT_X);
		}
		public double getCoDriverLeftXAxis() {
			return coDriver.getRawAxis(DSManagerConstants.CODRIVER_AXIS_LEFT_X);
		}

		// Right Y Joystick Axis
		public double getDriverRightYAxis() {
			return driver.getRawAxis(DSManagerConstants.DRIVER_AXIS_RIGHT_Y);
		}
		public double getCoDriverRightYAxis() {
			return coDriver.getRawAxis(DSManagerConstants.CODRIVER_AXIS_RIGHT_Y);
		}

		// Right X Joystick Axis
		public double getDriverRightXAxis() {
			return driver.getRawAxis(DSManagerConstants.DRIVER_AXIS_RIGHT_X);
		}
		public double getCoDriverRightXAxis() {
			return coDriver.getRawAxis(DSManagerConstants.CODRIVER_AXIS_RIGHT_X);
		}
	// Joysticks -------------------------------------------------------------]

	// Triggers --------------------------------------------------------------[
		// Left Trigger
		public double getDriverLeftTrigger() {
			return driver.getRawAxis(DSManagerConstants.DRIVER_AXIS_LT);
		}
		public double getCoDriverLeftTrigger() {
			return coDriver.getRawAxis(DSManagerConstants.CODRIVER_AXIS_LT);
		}

		// Right Trigger
		public double getDriverRightTrigger() {
			return driver.getRawAxis(DSManagerConstants.DRIVER_AXIS_RT);
		}
		public double getCoDriverRightTrigger() {
			return coDriver.getRawAxis(DSManagerConstants.CODRIVER_AXIS_RT);
		}
	// Triggers --------------------------------------------------------------]
	
	// Buttons ---------------------------------------------------------------[
		// Button A
		public boolean getDriverButtonA() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_A);
		}
		public boolean getCoDriverButtonA() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_A);
		}

		// Button B
		public boolean getDriverButtonB() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_B);
		}
		public boolean getCoDriverButtonB() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_B);
		}

		// Button X
		public boolean getDriverButtonX() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_X);
		}
		public boolean getCoDriverButtonX() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_X);
		}

		// Button Y
		public boolean getDriverButtonY() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_Y);
		}
		public boolean getCoDriverButtonY() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_Y);
		}

		// Button LB
		public boolean getDriverButtonLB() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_LB);
		}
		public boolean getCoDriverButtonLB() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_LB);
		}

		// Button RB
		public boolean getDriverButtonRB() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_RB);
		}
		public boolean getCoDriverButtonRB() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_RB);
		}

		// Button BACK
		public boolean getDriverButtonBack() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_BACK);
		}
		public boolean getCoDriverButtonBack() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_BACK);
		}

		// Button START
		public boolean getDriverButtonStart() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_START);
		}
		public boolean getCoDriverButtonStart() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_START);
		}

		// Button Left Joystick
		public boolean getDriverButtonLeftStick() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_LEFT_STICK);
		}
		public boolean getCoDriverButtonLeftStick() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_LEFT_STICK);
		}

		// Button Right Joystick
		public boolean getDriverButtonRightStick() {
			return driver.getRawButton(DSManagerConstants.DRIVER_BUTTON_RIGHT_STICK);
		}
		public boolean getCoDriverButtonRightStick() {
			return coDriver.getRawButton(DSManagerConstants.CODRIVER_BUTTON_RIGHT_STICK);
		}
	// Buttons ---------------------------------------------------------------]

	public static DSManager getInstance() {
        if (instance == null) {
             instance = new DSManager();
        }
        return instance;
    }

    public class DSManagerConstants {
    // DRIVER Controller Values-----------------------------[ 
        private static final int DRIVER_CONTROLLER_ID = 0;

		private static final int DRIVER_BUTTON_A = 1;
		private static final int DRIVER_BUTTON_B = 2;
		private static final int DRIVER_BUTTON_X = 3;
		private static final int DRIVER_BUTTON_Y = 4;
		private static final int DRIVER_BUTTON_LB = 5;
		private static final int DRIVER_BUTTON_RB = 6;
		private static final int DRIVER_BUTTON_BACK = 7;
		private static final int DRIVER_BUTTON_START = 8;
		private static final int DRIVER_BUTTON_LEFT_STICK = 9;
		private static final int DRIVER_BUTTON_RIGHT_STICK = 10;

		private static final int DRIVER_AXIS_LEFT_X = 0;
		private static final int DRIVER_AXIS_LEFT_Y = 1;
		private static final int DRIVER_AXIS_RIGHT_X = 4;
		private static final int DRIVER_AXIS_RIGHT_Y = 5;
		private static final int DRIVER_AXIS_LT = 2;
		private static final int DRIVER_AXIS_RT = 3;
		
		private static final double TRIGGER_PRESSED_VALUE_THRESHOLD = 0.4;
	// DRIVER Controller Values-----------------------------]

	// CoDRIVER Controller Values---------------------------[
		private static final int CODRIVER_CONTROLLER_ID = 1;

		private static final int CODRIVER_BUTTON_A = 1;
		private static final int CODRIVER_BUTTON_B = 2;
		private static final int CODRIVER_BUTTON_X = 3;
		private static final int CODRIVER_BUTTON_Y = 4;
		private static final int CODRIVER_BUTTON_LB = 5;
		private static final int CODRIVER_BUTTON_RB = 6;
		private static final int CODRIVER_BUTTON_BACK = 7;
		private static final int CODRIVER_BUTTON_START = 8;
		private static final int CODRIVER_BUTTON_LEFT_STICK = 9;
		private static final int CODRIVER_BUTTON_RIGHT_STICK = 10;

		private static final int CODRIVER_AXIS_LEFT_X = 0;
		private static final int CODRIVER_AXIS_LEFT_Y = 1;
		private static final int CODRIVER_AXIS_RIGHT_X = 4;
		private static final int CODRIVER_AXIS_RIGHT_Y = 5;
		private static final int CODRIVER_AXIS_LT = 2;
        private static final int CODRIVER_AXIS_RT = 3;
    // CoDRIVER Controller Values---------------------------]
    }

}