/**
 * The "Aim" set of commands continuously track the target found by the camera.
 * This can be very useful if the robot is in motion and/or the target is in motion.
 * Unfortunately, it also increases the chances that the camera will lose the target 
 * or that it will pick up a different target (e.g. a light) and go awry.
 * 
 * This class finds the angle to the target at the beginning, and then turns to that
 * angle, ignoring any further input from the camera. This allows the driver to ensure
 * that the target the camera is focused on is the correct target, or in an auto to point
 * the robot very close to the right directionw maximizing the chances that the camera will
 * pick up the correct target.
 * 
 */

package frc.robot.drivetrain.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.drivetrain.Camera;
import frc.robot.drivetrain.Drivetrain;

public class TurnToTarget extends Command {

    private static final double TOLERANCE = 1.0;
    private final Drivetrain m_drivetrain;
    private final Camera m_camera;

    private boolean m_targetAcquired = false;
    
    public TurnToTarget() {
        m_drivetrain = Drivetrain.getDrivetrain();
        requires(m_drivetrain);
        m_camera = m_drivetrain.getFrontCamera();
    }

    protected void initialize() {
        m_camera.setDockingMode(); // Turn the targeting lights on
    }

    protected void execute() {
        // There could be a timing issue here with the light JUST being turned on.
        // May need some sort of delay to give the camera time to acquire a target.
        final double angleToTarget = m_camera.getRotationalDegreesToTarget();
        if (TOLERANCE < Math.abs(angleToTarget)) {
            final double headingToTarget = m_drivetrain.getHeading() + angleToTarget; 
            Scheduler.getInstance().add(new TurnToAngle(headingToTarget));
            m_targetAcquired = true;
        } else if (0.0 != angleToTarget) { // Angle to target being exactly zero indicates no target acquired
            m_targetAcquired = true;
        }
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return m_targetAcquired;
    }
}