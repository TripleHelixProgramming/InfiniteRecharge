package frc.robot.command_groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.drivetrain.commands.StopDrivetrain;
import frc.robot.drivetrain.commands.TurnToAngle;
import frc.robot.drivetrain.commands.TurnToAnglePU;
import frc.robot.drivetrain.commands.TurnToTarget;
import frc.robot.magazine.Magazine.BallHandlingState;
import frc.robot.magazine.commands.ResetBallCount;
import frc.robot.shooter.Position;
import frc.robot.shooter.commands.SpinShooterUp;
import frc.robot.shooter.commands.StopShooter;

public class AimAndShootCG extends CommandGroup {

    public AimAndShootCG() {
        addSequential(new TurnToAngle(10.0), 5.0);
        addSequential(new StopDrivetrain(), 0.1);
        // addSequential(new SpinShooterUp(Position.UNKNOWN));
        // Once shooter is at expected rpms, then start the magazine to 
        // feed bals in.
        // addSequential(new SetBallHandlingCG(BallHandlingState.SHOOT), 4.0);
        // Stop the shooter
        //addSequential(new StopShooter());
    }
}