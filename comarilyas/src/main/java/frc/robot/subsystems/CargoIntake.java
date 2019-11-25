/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.driver2PreciseMovement;

/**
 * Add your docs here.
 */
public class CargoIntake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new driver2PreciseMovement());
  }

  Victor intakeMotor = new Victor(RobotMap.intakeMotorPort);


  public void intakeIn(){
    intakeMotor.set(RobotMap.intakeInValue);
  }
  public void intakeOut(){
    intakeMotor.set(RobotMap.intakeOutValue);
  }
  public void intakePrecise(double preciseValue){
    intakeMotor.set(preciseValue*RobotMap.preciseIntakeValue);
  }

  public void intakeStop(){
    intakeMotor.set(0);
  }
  


}
