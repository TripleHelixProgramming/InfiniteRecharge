/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.status;

public class ChaseAction extends LedAction {

    // State
    private int leadingIndex = 0;
    private double chaseFactor = 0.10;

    public ChaseAction() {
        super();

        // Run forever, 10ms
        intervalCount = -1;
        intervalTime = 0.010;
    }

    public ChaseAction(int red, int green, int blue, int brightness) {
        super(red, green, blue, brightness);

        this.red = red;
        this.green = green;
        this.blue = blue;
        this.brightness = brightness;

        // Run forever, 10ms
        intervalCount = -1;
        intervalTime = 0.010;
    }

    public void setBackground(int red, int green, int blue, int brightness) {
        this.backRed = red;
        this.backGreen = green;
        this.backBlue = blue;
        this.backBrightness = brightness;
    }

    protected void updateBuffer() {

        double br = brightness / 255.0;
        int r = (int) (red * br);
        int g = (int) (green * br);
        int b = (int) (blue * br);

        double bBr = backBrightness / 255.0;
        int bRed = (int) (backRed * bBr);
        int bGreen = (int) (backGreen * bBr);
        int bBlue = (int) (backBlue * bBr);

        int chaseCount = (int) (buffer.getLength() * chaseFactor);
        
        for (var i = 0; i < buffer.getLength(); i++) {

            if (i == leadingIndex) {
                // The leading pixel.
                buffer.setRGB(i, r, g, b);
            } else {

                int d = 0;

                if ((i < leadingIndex) && (i > leadingIndex - chaseCount)) {
                    d = leadingIndex - i;
                }

                if (d != 0) {
                    int cr = (int) (r * (1 - d * chaseFactor));
                    int cg = (int) (g * (1 - d * chaseFactor));
                    int cb = (int) (b * (1 - d * chaseFactor));

                    buffer.setRGB(i, cr, cg, cb);
                } else {
                    buffer.setRGB(i, bRed, bGreen, bBlue);
                }
            }
        }

        ++leadingIndex;
        if (leadingIndex == buffer.getLength()) {
            leadingIndex = 0;
        }
    }
}
