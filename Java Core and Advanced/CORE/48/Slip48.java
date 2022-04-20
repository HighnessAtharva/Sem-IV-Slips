import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Slip48 extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1, jt2, jt3, lbl;


    Slip48() {

        jt1 = new JTextField("Item Name");
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField("Item Price");
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        
        jt3 = new JTextField("Item Quantity");
        jt3.setBounds(90, 110, 150, 30);
        add(jt3);

        lbl = new JTextField("Total Cost :");
        lbl.setBounds(90, 200, 150, 30);
        add(lbl);

        jb1 = new JButton("Calculate");
        jb1.setBounds(90, 140, 100, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt2.getText());
        int b = Integer.parseInt(jt3.getText());
        int c = 0;

        if (e.getSource().equals(jb1)) {
            c = a * b;
            lbl.setText(String.valueOf(c) + " is the total price");
        }
    }

    public static void main(String args[]) {
        Slip48 t = new Slip48();
    }
}