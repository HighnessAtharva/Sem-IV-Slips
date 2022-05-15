// Write a java program to display “Hello Java” with settings Font- Georgia, foreground color- Red, background color – Blue on the Frame.

import java.awt.*;
import java.awt.event.*;


class Slip7 extends Frame {
    Slip7() {
        Label lblmsg = new Label("Hello java");
        Font f = new Font("Georgia", Font.PLAIN, 50);
        lblmsg.setFont(f);
        lblmsg.setAlignment(Label.CENTER);
        setBackground(Color.blue);
        setForeground(Color.red);
        add(lblmsg);
        setLayout(new GridLayout());
        setSize(500, 500);
        setVisible(true);

        // WindowListener should be within the constructor of the AWT.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String arg[]) {
        Slip7 s = new Slip7();
}}