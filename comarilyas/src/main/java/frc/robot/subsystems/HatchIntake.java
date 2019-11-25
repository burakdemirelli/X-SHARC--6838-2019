/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class HatchIntake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  DoubleSolenoid hatchIntake = new DoubleSolenoid(RobotMap.hatchForwardPort, RobotMap.hatchReversePort);

  public void hatchGrab(){
    hatchIntake.set(DoubleSolenoid.Value.kReverse);

  }

  public void hatchRelease(){
    hatchIntake.set(DoubleSolenoid.Value.kForward);

  }

  public void hatchReset(){
    hatchIntake.set(DoubleSolenoid.Value.kOff);
  }
}
