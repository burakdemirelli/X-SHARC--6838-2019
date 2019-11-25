/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new PreciseLiftCommand());
  } 

  Victor liftMotor = new Victor(RobotMap.elevatorMotorPort);
  DoubleSolenoid liftBrake = new DoubleSolenoid(RobotMap.brakeSolenoidFirstPort, RobotMap.brakeSolenoidSecondPort);
  DoubleSolenoid intakeUpDown = new DoubleSolenoid(RobotMap.intakeUpSoloneidPort, RobotMap.intakeDownSoloneidPort);

  public void liftUp(){
    liftBrake.set(DoubleSolenoid.Value.kForward);
    liftMotor.set(RobotMap.elevUpMotorValue);
  }
  public void liftDown(){
    liftBrake.set(DoubleSolenoid.Value.kForward);
    liftMotor.set(RobotMap.elevDownMotorValue);
  }

  public void liftPrecise(double preciseLift){
    liftBrake.set(DoubleSolenoid.Value.kForward);
    liftMotor.set(preciseLift*0.9);

  }
  
  public void intakeUp(){
    intakeUpDown.set(DoubleSolenoid.Value.kForward);

  }

  public void intakeDown(){
    intakeUpDown.set(DoubleSolenoid.Value.kReverse);
  }

  public void liftStop(){
    liftMotor.set(0);
    liftBrake.set(DoubleSolenoid.Value.kReverse);
  }

  public void liftReset(){
    liftBrake.set(DoubleSolenoid.Value.kOff);
  }
  
  public void intakeUpDownReset(){
    intakeUpDown.set(DoubleSolenoid.Value.kOff);
  }
  
}
