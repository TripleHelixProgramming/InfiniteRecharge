/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.drivetrain.commands;

import static frc.robot.drivetrain.Drivetrain.CommandUnits.PERCENT_FULLSPEED;

import com.team2363.commands.HelixDrive;
import com.team2363.utilities.RollingAverager;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.drivetrain.Drivetrain;
import frc.robot.oi.OI;

public class TestDrive extends HelixDrive {

  double deadZone = 0.05;

  private final RollingAverager throttle = new RollingAverager(7);

  public TestDrive() {
    requires(Drivetrain.getDrivetrain());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    super.initialize();
    for (int i = 0; i < 7; i++) {
        throttle.getNewAverage(0);
    }
  }

  @Override
  protected double getThrottle() {
      double newThrottle = Math.sin(Math.PI/2 * OI.getOI().getThrottle());
      double newTurn = Math.sin(Math.PI/2 * OI.getOI().getTurn());
      if (Math.abs(newThrottle) < deadZone) {
          return 0;
      }
      return -1 * newThrottle;
  }

  @Override
  protected double getTurn() {
      double newThrottle = Math.sin(Math.PI/2 * OI.getOI().getThrottle());
      double newTurn = Math.sin(Math.PI/2 * OI.getOI().getTurn());
      if (Math.abs(newTurn) < deadZone) {
          return 0;
      }
      return newTurn * 0.5;
  }

  @Override
  protected void useOutputs(final double left, final double right) {
      Drivetrain.getDrivetrain().setSetpoint(PERCENT_FULLSPEED, left, right);
  }
}
