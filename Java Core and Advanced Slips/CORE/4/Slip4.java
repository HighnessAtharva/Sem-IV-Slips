// Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and  MOUSE_CLICK and display the position of the Mouse_Click in a TextField.

import java.awt.*;
import java.awt.event.*;

class Slip4 extends Frame {
    TextField statusBar;

    Slip4() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                statusBar.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                statusBar.setText("Entered at (" + e.getX() + "," + e.getY() + ")");
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                statusBar.setText("Mouse Pressed");
                repaint();
            }
            
            public void mouseReleased(MouseEvent e) {
                statusBar.setText("Mouse Released");
                repaint();
            }
        });
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(275, 300);
        setTitle("Mouse Click Position");
        statusBar = new TextField(20);
        add(statusBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Slip4();
    }
}