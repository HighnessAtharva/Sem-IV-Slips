// Write an application in Java using Awt to display 4 X 4 squares on the screen. One of the block will be active with black color. All other blocks should be filled with blue color. Provide command buttons as follows to move the active cell. The active cell should be changed only if it is within the boundary of the squares otherwise give the beep.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Slip16 extends JFrame implements ActionListener {
    JButton moveBtns[] = new JButton[4];
    JPanel gridPanels[] = new JPanel[16];
    String icons[] = { "Left", "Up", "Right", "Down" };
    int cnt = 1;

    public Slip16() {
        setLayout(new GridLayout(5, 4));
        for (int i = 0; i < 16; i++) {
            gridPanels[i] = new JPanel();
            add(gridPanels[i]);
            gridPanels[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            gridPanels[i].setBackground(Color.blue);
        }
        gridPanels[0].setBackground(Color.black);
        for (int i = 0; i < 4; i++) {
            moveBtns[i] = new JButton(icons[i]);
            add(moveBtns[i]);
            moveBtns[i].addActionListener(this);
        }
        setSize(300, 300);
        setVisible(true);
        setTitle("Grid Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        gridPanels[cnt - 1].setBackground(Color.blue);
        if (btn == moveBtns[0]) {
            if (cnt % 4 != 1)
                cnt--;
        }
        if (btn == moveBtns[1]) {
            if (cnt > 4)
                cnt = cnt - 4;
        }
        if (btn == moveBtns[2]) {
            if (cnt % 4 != 0)
                cnt++;
        }
        if (btn == moveBtns[3]) {
            if (cnt < 13)
                cnt = cnt + 4;
        }
        gridPanels[cnt - 1].setBackground(Color.black);
    }

    public static void main(String args[]) {
        new Slip16().show();
    }
}