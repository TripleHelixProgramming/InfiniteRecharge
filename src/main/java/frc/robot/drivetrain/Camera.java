/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.drivetrain;

import static edu.wpi.first.networktables.NetworkTableInstance.getDefault;

import edu.wpi.first.wpilibj.Preferences;

public class Camera {

    private final String name;

    private double cameraAlignment;
    private double cameraHeight = 21.25; // (inches) currently the height on the programming bot
    private double bottomTargetHeight = 81; // (inches) use 81.25 for actual arena height
    private double cameraElevation = 26.5; // (degrees) currently the angle on the programming bot (was 27.75)

    public Camera(final String name) {
        this.name = name;
        this.cameraAlignment = Preferences.getInstance().getDouble(name + "-alignment", 0);
    }

    public Camera(final String name, final double cameraHeight, final double bottomTargetHeight,
            final double cameraElevation) {
        this.name = name;
        this.cameraAlignment = Preferences.getInstance().getDouble(name + "-alignment", 0);
        this.cameraHeight = cameraHeight;
        this.bottomTargetHeight = bottomTargetHeight;
        this.cameraElevation = cameraElevation;
    }

    public void setToPipeline(final int pipeline) {
        getDefault().getTable(name).getEntry("pipeline").setNumber(pipeline);
    }

    public void setDockingMode() {
        getDefault().getTable(name).getEntry("pipeline").setNumber(1);
        getDefault().getTable(name).getEntry("ledMode").setNumber(3);
        // NetworkTableInstance.getDefault().getTable(name).getEntry("pipeline").setNumber(1);
        getDefault().getTable(name).getEntry("stream").setNumber(0);
    }

    public void setDriverMode() {
        getDefault().getTable(name).getEntry("pipeline").setNumber(0);
        getDefault().getTable(name).getEntry("ledMode").setNumber(1);
        // NetworkTableInstance.getDefault().getTable(name).getEntry("pipeline").setNumber(2);
        getDefault().getTable(name).getEntry("stream").setNumber(0);
    }

    public boolean isTargetFound() {
        final double tv = getDefault().getTable(name).getEntry("tv").getDouble(0);
        return 0 != tv;
    }

    public boolean isTargetClose() {
    
        return isTargetFound() && (getVerticalDegreesToTarget() > getCameraAlignment());
    }

    public double getRotationalDegreesToTarget() {
        return getDefault().getTable(name).getEntry("tx").getDouble(Double.POSITIVE_INFINITY);
    }

    public double getHeadingToTarget() {
        return (Drivetrain.getDrivetrain().getHeading() - getRotationalDegreesToTarget()) % 180.0;
    }

    public double getVerticalDegreesToTarget() {
        return getDefault().getTable(name).getEntry("ty").getDouble(Double.POSITIVE_INFINITY);
    }

    public double getAreaOfTarget() {
        return getDefault().getTable(name).getEntry("ta").getDouble(Double.NEGATIVE_INFINITY);
    }

    public double getTargetSkew() {
        return getVerticalDegreesToTarget() / (getAreaOfTarget() - Math.abs(getRotationalDegreesToTarget() * 0.01));
    }

    /**
     * calculates ground distane from robot to target, only accurate when tx = 0 (or very close to it).
     * @return
     **/
    public double calculateDistanceToTarget() {
        return (getBottomTargetHeight() - getCameraHeight())
                / Math.tan(Math.toRadians(getCameraElevation() + getVerticalDegreesToTarget()));
    }

    // public static int determineHoodPostion() {
    // if (calculateDistanceToTarget() > 10)
    // return 1;
    // return 0;
    // }

    public double calculateRPM() {

        // double calcRPMNum = Math.pow(calculateDistanceToTarget(),2)*g;
        // double calcRPMDenFirstTerm =
        // calculateDistanceToTarget()*Math.sin(Math.toRadians(2*shooterElevation));
        // double calcRPMDenSecondTerm =
        // 2*h*Math.pow(Math.cos(Math.toRadians(shooterElevation)), 2);
        // double linearVelocity =
        // Math.sqrt((calcRPMNum)/(calcRPMDenFirstTerm-calcRPMDenSecondTerm));

        // return (int)((linearVelocity*60)/(2*Math.PI*r));
        // if (determineHoodPostion() == 1)
        // return 39.5 * (calculateDistanceToTarget() / 12) + 1987;
        // return 39.5 * (calculateDistanceToTarget() / 12) + 1987;
        // return 39.5 * (calculateDistanceToTarget() / 12.0) + 1987.0; BOT 2
        return 21.8 * (calculateDistanceToTarget() / 12.0) + 2486.4;
    }

    /**
     * Getters & Setters for member fields.
     **/
    public double getCameraElevation() {
        return cameraElevation;
    }

    public void setCameraElevation(final double cameraElevation) {
        this.cameraElevation = cameraElevation;
    }

    public double getBottomTargetHeight() {
        return bottomTargetHeight;
    }

    public void setBottomTargetHeight(final double bottomTargetHeight) {
        this.bottomTargetHeight = bottomTargetHeight;
    }

    public double getCameraHeight() {
        return cameraHeight;
    }

    public void setCameraHeight(final double cameraHeight) {
        this.cameraHeight = cameraHeight;
    }

    public double getCameraAlignment() {
        return cameraAlignment;
    }

    public void setCameraAlignment(final double cameraAlignment) {
        this.cameraAlignment = cameraAlignment;
        Preferences.getInstance().putDouble(name + "-alignment", cameraAlignment);
    }

    public static void main(final String... args) {
        final Camera camera = new Camera("x");
        System.out.println(camera.getTargetSkew());
    }
}