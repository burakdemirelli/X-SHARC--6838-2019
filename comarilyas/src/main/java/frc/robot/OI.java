/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.CargoInCommand;
import frc.robot.commands.CargoOutCommand;
import frc.robot.commands.ChangeSpeedCommand;
import frc.robot.commands.HatchGrabCommand;
import frc.robot.commands.HatchReleaseCommand;
import frc.robot.commands.LiftDownCommand;
import frc.robot.commands.LiftUpCommand;
import frc.robot.commands.intakeDownCommand;
import frc.robot.commands.intakeUpCommand;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.

  Joystick driver1 = new Joystick(RobotMap.driver1JoystickPort);
  Joystick driver2 = new Joystick(RobotMap.driver2JoystickPort);

  Button intakeUpButton = new JoystickButton(driver2, RobotMap.intakeUpButtonValue),
    intakeDownButton = new JoystickButton(driver2, RobotMap.intakeDownButtonValue),
    elevatorUpButton = new JoystickButton(driver2, RobotMap.elevatorUpButtonValue),
    elevatorDownButton = new JoystickButton(driver2, RobotMap.elevatorDownButtonValue),
    intakeInButton = new JoystickButton(driver2, RobotMap.intakeInButtonValue),
    intakeOutButton = new JoystickButton(driver2, RobotMap.intakeOutButtonValue),
    hatchInButton = new JoystickButton(driver2, RobotMap.hatchInButtonValue),
    hatchOutButton = new JoystickButton(driver2, RobotMap.hatchOutButtonValue),
    
    slowDriveButton = new JoystickButton(driver1, RobotMap.slowDriveButtonValue),
    autoInitButton = new JoystickButton(driver1, RobotMap.autoInitButtonValue);

 
  public double getJoystickAxis(int port){
    return driver1.getRawAxis(port);
  }

  public double getDriver2JoystickAxis(int port){
    return driver2.getRawAxis(port);
  }

  public boolean getAxisValue(int axis){
    double axisValue = driver2.getRawAxis(axis);
    if (Math.abs(axisValue)>0.25){
      return true;
    }
    else{
      return false;
    } 

  }

  public boolean returnButtonState(int button){
    return driver2.getRawButtonReleased(button);
  }

  public boolean returnDriver1ButtonState(int button){
    return driver1.getRawButtonReleased(button);
  }


  public OI(){
    intakeInButton.whenPressed(new CargoInCommand());
    intakeOutButton.whenPressed(new CargoOutCommand()); 
    elevatorUpButton.whenPressed(new LiftUpCommand());
    elevatorDownButton.whenPressed(new LiftDownCommand());
    //look into if you should use when pressed or while pressed.
    hatchInButton.whenPressed(new HatchGrabCommand());
    hatchOutButton.whenPressed(new HatchReleaseCommand());

    slowDriveButton.whenPressed(new ChangeSpeedCommand(0.4));

    intakeUpButton.whenPressed(new intakeUpCommand());
    intakeDownButton.whenPressed(new intakeDownCommand());
  }


  //Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button 
  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:P

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}

