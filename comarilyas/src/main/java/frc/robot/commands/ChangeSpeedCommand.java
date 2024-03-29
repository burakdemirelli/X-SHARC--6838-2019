/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.RobotMap;
import frc.robot.Robot;


public class ChangeSpeedCommand extends Command {
  public ChangeSpeedCommand(double speedControl) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    RobotMap.SpeedControllerValue = speedControl;
    
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    if (RobotMap.speedState==0){
      RobotMap.speedLimiting = RobotMap.SpeedControllerValue;
      RobotMap.speedState = 1;
    }
    else if(RobotMap.speedState == 1 ){
      RobotMap.speedLimiting = 1;
      RobotMap.speedState = 0;
    }
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.m_oi.returnDriver1ButtonState(RobotMap.slowDriveButtonValue);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
