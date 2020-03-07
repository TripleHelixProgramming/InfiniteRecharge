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
        if (m_camera.isTargetFound()) { // Hunt for a target
            final double angleToTarget = m_camera.getRotationalDegreesToTarget();
            if (TOLERANCE < Math.abs(angleToTarget)) { 
                // Spawn a TurnToAngle to turn to the target
                final double headingToTarget = m_drivetrain.getHeading() + angleToTarget; 
                Scheduler.getInstance().add(new TurnToAngle(headingToTarget));
            }
            m_camera.setDriverMode(); // Turn the targeting lights off
            m_targetAcquired = true;
        }
    }

    @Override
    protected boolean isFinished() {
        return m_targetAcquired;
    }
}