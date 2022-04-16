// Write a java program to display “Hello Java” with settings Font- Georgia, foreground color- Red, background color – Blue on the Frame.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


class Slip7 extends Frame {
    Slip7() {
        Label lblmsg = new Label("Hello java");
        Font f = new Font("Georgia", Font.PLAIN, 40);
        lblmsg.setFont(f);
        lblmsg.setAlignment(Label.CENTER);
        setBackground(Color.blue);
        setForeground(Color.red);
        add(lblmsg);
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new MyWindowAdapter());
    }

    public static void main(String arg[]) {
        Slip7 s = new Slip7();
    
class MyWindowApapter extends WindowAdapter {
    MyWindowApapter(Slip7 s){
        this.s=s;
    }
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
}}