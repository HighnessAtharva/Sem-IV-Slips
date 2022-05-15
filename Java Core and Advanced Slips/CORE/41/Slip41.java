// Write an AWT application that contains a frame and two buttons “RED” and “BLUE”. On clicking the button give respective colour to the frame	

import java.awt.*;
import java.awt.event.*;

public class Slip41 extends Frame implements ActionListener {
    Button btnRed, btnBlue;

    Slip41() {
        super("AWT Buttons");
        
        btnRed = new Button("Red");
        btnBlue = new Button("Blue");

        btnRed.setBounds(25, 50, 250, 30);
        btnBlue.setBounds(25, 100, 250, 30);
        
        add(btnRed);
        add(btnBlue);

        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);
        setSize(300, 160);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRed) {
            setBackground(Color.RED);
        } else if (e.getSource() == btnBlue) {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new Slip41();
    }

}