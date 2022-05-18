import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Slip48 extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1, jt2, jt3, lbl;
    JLabel j1, j2, j3, j4;
    Slip48() {

        j1=new JLabel("Item Name");
        j1.setBounds(50, 50, 100, 30);
        jt1 = new JTextField(10);
        jt1.setBounds(150, 50, 150, 30);
        add(j1);
        add(jt1);

        j2=new JLabel("Item Price");
        j2.setBounds(50, 80, 100, 30);
        jt2 = new JTextField(10);
        jt2.setBounds(150, 80, 150, 30);
        add(j2);
        add(jt2);

        j3=new JLabel("Item Quantity");
        j3.setBounds(50, 110, 100, 30);
        jt3 = new JTextField(10);
        jt3.setBounds(150, 110, 150, 30);
        add(j3);
        add(jt3);

        j4=new JLabel("Total Cost");
        j4.setBounds(50, 200, 100, 30);
        lbl = new JTextField(10);
        lbl.setBounds(150, 200, 150, 30);
        add(j4);
        add(lbl);

        jb1 = new JButton("Calculate");
        jb1.setBounds(150, 140, 100, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt2.getText());
        int b = Integer.parseInt(jt3.getText());
        int c = 0;

        if (e.getSource()==(jb1)) {
            c = a * b;
            lbl.setText(c + " is the total price");
        }
    }

    public static void main(String args[]) {
        Slip48 t = new Slip48();
    }
}