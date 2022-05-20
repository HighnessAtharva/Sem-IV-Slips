
// Create a calculator with functionality in an Applet.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Slip6" height=500 width=500></applet>*/
public class Slip6 extends Applet implements ActionListener {
    String str = " ";
    int v1, v2, result;
    TextField t1;
    Button b[] = new Button[10];
    Button add, sub, mul, div, clear, mod, equals;
    char choice;

    public void init() {
        Color k = new Color(120, 89, 90);
        setBackground(k);
        t1 = new TextField(10);
        GridLayout g1 = new GridLayout(4, 5);
        setLayout(g1);

        
        add = new Button("add");
        sub = new Button("sub");
        mul = new Button("mul");
        div = new Button("div");
        mod = new Button("mod");
        clear = new Button("clear");
        equals = new Button("equals");
        t1.addActionListener(this);
        add(t1);
        for (int i = 0; i < 10; i++) {
            b[i] = new Button("" + i);
        }
        for (int i = 0; i < 10; i++) {
            add(b[i]);
        }
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(equals);
        for (int i = 0; i < 10; i++) {
            b[i].addActionListener(this);
        }
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        equals.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);
        if (Character.isDigit(ch))
            t1.setText(t1.getText() + str);
        else {
            if (str.equals("add")) {
                v1 = Integer.parseInt(t1.getText());
                choice = '+';
                t1.setText("");
            } else if (str.equals("sub")) {
                v1 = Integer.parseInt(t1.getText());
                choice = '-';
                t1.setText("");
            }
            if (str.equals("mul")) {
                v1 = Integer.parseInt(t1.getText());
                choice = '*';
                t1.setText("");
            }
            if (str.equals("div")) {
                v1 = Integer.parseInt(t1.getText());
                choice = '/';
                t1.setText("");
            }
            if (str.equals("mod")) {
                v1 = Integer.parseInt(t1.getText());
                choice = '%';
                t1.setText("");
            }
            if (str.equals("clear")) {
                t1.setText("");
            }
            if (str.equals("equals")) {
                v2 = Integer.parseInt(t1.getText());
                switch (choice) {
                    case '+':
                        result = v1 + v2;
                        break;
                    case '-':
                        result = v1 - v2;
                        break;
                    case '*':
                        result = v1 * v2;
                        break;
                    case '/':
                        result = v1 / v2;
                        break;
                    case '%':
                        result = v1 % v2;
                        break;
                }
                t1.setText("" + result);
            }
        }
    }
}