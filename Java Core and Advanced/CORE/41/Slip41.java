// Write an AWT application that contains a frame and two buttons “RED” and “BLUE”. On clicking the button give respective colour to the frame	

import java.awt.*;
import java.awt.event.*;

public class Slip41 extends Frame implements ActionListener {
    Button btnRed, btnBlue;

    Slip41() {
        super("AWT Buttons");
        btnRed = new Button("Red");
        btnRed.setBounds(25, 50, 250, 30);
        btnRed.addActionListener(this);
        this.add(btnRed);
        btnBlue = new Button("Blue");
        btnBlue.setBounds(25, 100, 250, 30);
        btnBlue.addActionListener(this);
        this.add(btnBlue);
        this.setSize(300, 160);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Slip41();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRed) {
            this.setBackground(Color.RED);
        } else if (e.getSource() == btnBlue) {
            this.setBackground(Color.BLUE);
        }
    }
}