// Write an applet application in Java for smile face.

import java.applet.Applet;
import java.awt.*;

public class Slip30 extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 15, 200, 200);
        g.fillOval(80, 90, 30, 15);
        g.fillOval(190, 90, 30, 15);
        g.drawOval(17, 90, 30, 50);
        g.drawOval(250, 90, 30, 50);
        g.drawLine(150, 110, 150, 150);
        // g.fillOval(80,160,10,35);
        g.drawArc(100, 160, 100, 30, 170, 200);
    }
}