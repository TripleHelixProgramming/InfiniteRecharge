
package frc.robot.telescope.commands;

import com.team2363.logger.HelixEvents;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.telescope.Telescope;
import frc.robot.telescope.Telescope.TelescopeState;

public class StowTelescope extends Command {

  private Telescope myTelescope = null;

  public StowTelescope() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    myTelescope = Telescope.getTelescope();
    requires(Telescope.getTelescope());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    HelixEvents.getInstance().addEvent("TELESCOPE", "Starting StowTelescope");
    myTelescope.stow();
    myTelescope.setState(TelescopeState.TRANSITION);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false; // never finishes
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    HelixEvents.getInstance().addEvent("TELESCOPE", "StowTelescope interrupted");
    myTelescope.setState(TelescopeState.STOWED);
  }
}