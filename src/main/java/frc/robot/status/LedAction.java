/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.status;

import edu.wpi.first.wpilibj.AddressableLEDBuffer;

public class LedAction extends Action {

    // How many times to run, less than 0 will run forever.
    protected int intervalCount = 1;

    // How long to delay intervals.
    protected double intervalTime = 0.0;

    // Default color.
    protected int red = 255;
    protected int green = 255;
    protected int blue = 255;
    protected int brightness = 127;

    // Background color
    int backRed = 0;
    int backGreen = 0;
    int backBlue = 0;
    int backBrightness = 0;

    // Buffer this action uses for sending to the LEDs.
    protected AddressableLEDBuffer buffer = new AddressableLEDBuffer(Status.ADDRESSABLE_LED_COUNT);

    public LedAction() {
        // Initialize the buffer to black.
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, 0, 0, 0);
        }
    }

    // Invoke with a specific color.
    public LedAction(int red, int green, int blue, int brightness) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.brightness = brightness;
    }

    public void setBackground(int red, int green, int blue, int brightness) {
        this.backRed = red;
        this.backGreen = green;
        this.backBlue = blue;
        this.backBrightness = brightness;
    }

    public void setIntervalTime(double intervalTime) {
        this.intervalTime = intervalTime;
    }

    public void setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
    }

    // Implementations should override the updateBuffer method.
    // This will be invoked every intervalTime seconds and only needs to
    // alter the buffer. The outer run() method will handle the intervalTime,
    // intervalCount, and set/sending the buffer to the LEDs.
    protected void updateBuffer() {

        double br = brightness / 255.0;
        int r = (int) (red * br);
        int g = (int) (green * br);
        int b = (int) (blue * br);

        // Set the entire buffer (string of leds) to the same color.
        for (var i = 0; i < buffer.getLength(); i++) {
            buffer.setRGB(i, r, g, b);
        }
    }

    @Override
    public boolean isFinished() {
        // If the intervalCount is greater than 0 or less than zero
        // we're not finished. The run() method will decrement if greater
        // and never finish if less than (a repeating pattern).
        if (intervalCount == 0) {
            return true;
        }
        return false;
    }

    // Require by the parent Action class.
    // This is invoked by the running thread until isFinished returns true.
    @Override
    public void run() {

        // Update the buffer.
        updateBuffer();

        // Send the buffer to the leds.
        Status.getStatus().setLedData(buffer);

        // Only decrement the intervalCount if it's over 0.
        // Otherwise it may overflow backwords and cause problems.
        if (intervalCount > 0) {
            --intervalCount;
        }
    }
}
