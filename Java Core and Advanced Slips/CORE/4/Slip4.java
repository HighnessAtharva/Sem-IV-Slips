// Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and  MOUSE_CLICK and display the position of the Mouse_Click in a TextField.

import java.awt.*;
import java.awt.event.*;


/*
mouseClicked
mouseEntered
mouseExited
mousePressed
mouseReleased
*/
class Slip4 extends Frame implements MouseListener{
    TextField statusBar;

    Slip4() {
        // start of addMouseListener
        addMouseListener(this); 
        
        statusBar = new TextField(20);
        add(statusBar);
        setLayout(new FlowLayout());
        setSize(275, 300);
        setTitle("Mouse Click Position");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });   
        }

        public void mouseClicked(MouseEvent e) {
            statusBar.setText("Clicked at (" + e.getX() + "," + e.getY() + ")");
            // call the repaint() method or this shit wont work bro. DO NOT FORGET
            repaint();
        }

        public void mouseEntered(MouseEvent e) {
            statusBar.setText("Entered at (" + e.getX() + "," + e.getY() + ")");
            // call the repaint() method or this shit wont work bro. DO NOT FORGET
            repaint();
        }

        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse Exited");
            // call the repaint() method or this shit wont work bro. DO NOT FORGET
            repaint();
        }


        public void mousePressed(MouseEvent e) {
            statusBar.setText("Mouse Pressed");
            // call the repaint() method or this shit wont work bro. DO NOT FORGET
            repaint();
        }

        public void mouseReleased(MouseEvent e) {
            statusBar.setText("Mouse Released");
            // call the repaint() method or this shit wont work bro. DO NOT FORGET
            repaint();
        }

        

    public static void main(String[] args) {
        new Slip4();
    }
}