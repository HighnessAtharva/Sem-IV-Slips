// Write a Java program to design a screen using Awt that will take a user name and password. If the user name and password are not same, raise an Exception with appropriate message. User can have 3 login chances only. Use clear button to clear the TextFields.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InvalidPasswordException extends Exception {
}

public class Slip17 extends JFrame implements ActionListener {
    JLabel name, pass;
    JTextField nameText;
    JPasswordField passText;
    JButton login, end;
    static int attempt = 0;

    public Slip17() {
        name = new JLabel("Name:", JLabel.RIGHT);
        pass = new JLabel("Password:", JLabel.RIGHT);

        nameText = new JTextField(20);
        passText = new JPasswordField(20);

        login = new JButton("Login");
        end = new JButton("END");

        login.addActionListener(this);
        end.addActionListener(this);

        setLayout(new GridLayout(3, 2));
        add(name);
        add(nameText);
        add(pass);
        add(passText);
        add(login);
        add(end);

        setTitle("Login Check");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == end) {
            System.exit(0);
        }
        if (btn == login) {
            try {
                String user = nameText.getText();
                String pass = new String(passText.getPassword());
                if (user.compareTo(pass) == 0) {
                    JOptionPane.showMessageDialog(null, "LoginSuccessfull", "Login", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    throw new InvalidPasswordException();
                }
            } catch (Exception e) {
                attempt++;
                JOptionPane.showMessageDialog(null, "LoginFailed.", "Login", JOptionPane.ERROR_MESSAGE);
                nameText.setText("");
                passText.setText("");
                nameText.requestFocus();
                if (attempt == 3) {
                    JOptionPane.showMessageDialog(null, "3 attempt over", "Login", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String args[]) {
        new Slip17();
    }
}
