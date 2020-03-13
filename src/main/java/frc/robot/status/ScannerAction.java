/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.status;

public class ScannerAction extends LedAction {

    // State
    private int leadingIndex = 0;
    private boolean forward = true;
    private double chaseFactor = 0.10;

    // Default runs forever.
    public ScannerAction() {
        super();

        // Run forever, 10ms
        intervalCount = -1;
        intervalTime = 0.010;
    }

    public ScannerAction(int red, int green, int blue, int brightness) {
        super(red, green, blue, brightness);

        // Run forever, 10ms
        intervalCount = -1;
        intervalTime = 0.010;
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

                if (forward) {
                    if ((i < leadingIndex) && (i > leadingIndex - chaseCount)) {
                        d = leadingIndex - i;
                    }
                } else {
                    if ((i > leadingIndex) && (i < leadingIndex + chaseCount)) {
                        d = i - leadingIndex;
                    }
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

        if (forward == true) {
            ++leadingIndex;
            if (leadingIndex == buffer.getLength()) {
                forward = false;
                --leadingIndex;
            }
        } else {
            --leadingIndex;
            if (leadingIndex < 0) {
                leadingIndex = 0;
                forward = true;
            }
        }
    }
}
