/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;

  // public static int rangefinderModule = 1;

//mecanum driver1 axis
public static  int speedState = 0;
public static final int ySpeedJoystickPort = 4;
public static final int xSpeedJoystickPort = 1;
public static final int zRotationJoystickPort = 0;
public static final int intakeUpButtonValue = 8;
public static final int intakeDownButtonValue = 7;
public static final int elevatorUpButtonValue = 1;
public static final int elevatorDownButtonValue = 2;
public static final int intakeInButtonValue = 4;
public static final int intakeOutButtonValue = 3;
public static final double intakeInValue = -1;
public static final double intakeOutValue = 1;
public static final int hatchInButtonValue = 5;
public static final int hatchOutButtonValue = 6;
public static final int slowDriveButtonValue = 4;
public static final int mecanumLeftJoystickPort = 5;
public static final double preciseIntakeValue = 0.9;
public static final int autoInitButtonValue = 8;

//drivetrain victor port variables
  public static int leftFrontMotorPort = 3;
  public static int leftBackMotorPort = 2;
  public static int righFrontMotorPort = 5;
  public static int righBackMotorPort = 1;

  //limiting the speed of the bot
  public static double speedLimiting = 1;

  //elevator port
  public static int elevatorMotorPort = 0;

  //elevator up and down speed
  public static int elevUpMotorValue = 1;
  public static int elevDownMotorValue = -1;
  
  //intake motor's port
  public static int intakeMotorPort = 4;

  //brake's  ports, used as doubleSolenoid
  public static int brakeSolenoidFirstPort = 2;
  public static int brakeSolenoidSecondPort = 3;

  //hatch mechanism's ports, used as doubleSolenoid
  public static int hatchForwardPort = 0;
  public static int hatchReversePort = 1;

  //the solenoid that lets the arm down in the beginning of the match
  public static int intakeUpSoloneidPort = 4;
  public static int intakeDownSoloneidPort = 5;

  //joystick ports
  public static int driver1JoystickPort = 0;
  public static int driver2JoystickPort = 1;
  public static double SpeedControllerValue = 1;




}


