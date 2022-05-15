// Write a java program to design a following GUI (Use Swing).

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Slip8 extends JFrame implements ActionListener {
    Label l1, l2, l3, l4, l5, l6;
    TextField t1, t2, t3;
    TextArea t;
    Panel p, p1, p2, p3;
    ButtonGroup bg;
    JRadioButton m, f;
    JCheckBox c1, c2, c3;
    Button b1, b2;

    Slip8() {
        p = new Panel();
        p1 = new Panel();
        l1 = new Label("First Name ");
        l2 = new Label("last Name ");
        l3 = new Label("Address ");
        l4 = new Label("mobile No ");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t = new TextArea(2, 10);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t);
        p.add(l4);
        p.add(t3);
        p.setLayout(new GridLayout(4, 2));
        add(p);
        l5 = new Label("Gender ");
        m = new JRadioButton("male");
        f = new JRadioButton("female");
        bg = new ButtonGroup();
        bg.add(m);
        bg.add(f);
        p1.add(l5);
        p1.add(m);
        p1.add(f);
        p1.setLayout(new GridLayout(1, 3));
        p2 = new Panel();
        l6 = new Label("Your Interests ");
        c1 = new JCheckBox("Computer");
        c2 = new JCheckBox("Sports");
        c3 = new JCheckBox("Music");
        p2.add(l6);
        p2.add(c1);
        p2.add(c2);
        p2.add(c3);
        p2.setLayout(new GridLayout(1, 4));
        p3 = new Panel();
        b1 = new Button("submit");
        b2 = new Button("clear");
        p3.add(b1);
        p3.add(b2);
        add(p);
        add(p1);
        add(p2);
        add(p3);
        setSize(300, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText("");
        t1.setText("");
        t2.setText("");
        t3.setText("");

        // textfield.setText(null); //or use this
    }

    public static void main(String a[]) {
        new Slip8();
    }
}