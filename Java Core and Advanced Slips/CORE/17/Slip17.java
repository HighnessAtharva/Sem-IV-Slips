// Write a Java program to design a screen using Awt that will take a user name and password. If the user name and password are not same, raise an Exception with appropriate message. User can have 3 login chances only. Use clear button to clear the TextFields.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InvalidPasswordException extends Exception {    
    InvalidPasswordException(String s, int attempt){
        System.out.println(s + "Attempt:"+ attempt+1);
    }
}

public class Slip17 extends Frame implements ActionListener {
    Label name, pass;
    TextField nameText;
    TextField passText;
    Button login, end;
    static int attempt = 0;

    public Slip17() {
        name = new Label("Name:", Label.RIGHT);
        pass = new Label("Password:", Label.RIGHT);

        nameText = new TextField(20);
        passText = new TextField(20);

        login = new Button("LOGIN");
        end = new Button("END");

        login.addActionListener(this);
        end.addActionListener(this);

        add(name);
        add(nameText);
        add(pass);
        add(passText);
        add(login);
        add(end);

        setLayout(new GridLayout(3, 2));
        setTitle("Login Check");
        setSize(300, 300);
        setVisible(true);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == end) {
            System.exit(0);
        }
        if (ae.getSource() == login) {
            try {
                String user = nameText.getText();
                String pass = new String(passText.getText());
                if (user.compareTo(pass) == 0) {
                    JOptionPane.showMessageDialog(null, "LoginSuccessfull", "Login", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    throw new InvalidPasswordException("Wrong", attempt);
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
