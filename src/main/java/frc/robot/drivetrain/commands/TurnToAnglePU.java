package frc.robot.drivetrain.commands;

import edu.wpi.first.wpilibj.command.PIDCommand;
import frc.robot.drivetrain.Drivetrain;
import static frc.robot.drivetrain.Drivetrain.CommandUnits.PERCENT_FULLSPEED;

import com.team2363.logger.HelixEvents;

/**
 *
 */
public class TurnToAnglePU extends PIDCommand {

    public TurnToAnglePU(double angle) {
    	// super(0.04, 0.003, 0.002);
    	super(0.027, 0.0, 0.0);
        requires(Drivetrain.getDrivetrain());
        
 //     getPIDController().setToleranceBuffer(10);
        getPIDController().setInputRange(-180, 180);
        getPIDController().setAbsoluteTolerance(1);
        getPIDController().setContinuous(true);
        getPIDController().setOutputRange(-.3, .3);
        
        setSetpoint(angle);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	HelixEvents.getInstance().addEvent("DRIVETRAIN", "Starting to turn to angle");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return getPIDController().onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    	HelixEvents.getInstance().addEvent("DRIVETRAIN", "Finished turning to angle");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    @Override
	protected double returnPIDInput() {
		return Drivetrain.getDrivetrain().getHeading();
	}

	@Override
	protected void usePIDOutput(double output) {
        // Drivetrain.getDrivetrain().tankDrive(-output, output);
        Drivetrain.getDrivetrain().setSetpoint(PERCENT_FULLSPEED, -output, output);
	}
}