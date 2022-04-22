// Write a Java program to design a screen using Awt that will create four text fields. First for the text, second for what to find and third for replace. Display result in the fourth text field. Also display the count of total no. of Replacements made. The button clear to clear the text boxes.

import javax.swing.*;
import java.awt.*;

public class NewJFrame extends JFrame {

    JTextField jTextField1;
    JTextField jTextField2;
    JTextField jTextField3;
    JTextField jTextField4;

    public NewJFrame() {
        JLabel jLabel1 = new JLabel(" Find And Replace ");
        JLabel jLabel2 = new JLabel("Enter Text ");
        jTextField1 = new JTextField(10);
        JLabel jLabel3 = new JLabel("Text to Find ");
        jTextField2 = new JTextField(10);
        JLabel jLabel4 = new JLabel("Text to Replace ");
        jTextField3 = new JTextField(10);
        JLabel jLabel5 = new JLabel("No Of. Occurance");
        jTextField4 = new JTextField(10);
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Replace");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Container contentPane = getContentPane();
        JPanel p = new JPanel();
        p.add(jLabel1);
        p.add(jLabel2);
        p.add(jTextField1);
        p.add(jLabel3);
        p.add(jTextField2);
        p.add(jLabel4);
        p.add(jTextField3);
        p.add(jLabel5);
        p.add(jTextField4);
        p.add(jButton1);
        p.add(jButton2);
        p.add(jButton3);
        contentPane.add(p);
    }

    void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
    }

    void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int cnt = 0;
        String Str1 = jTextField1.getText();
        int len = (jTextField2.getText()).length();
        for (int i = 0; i < Str1.length() - (len - 1); i++) {
            String substr = Str1.substring(i, i + len);
            jTextField4.setText(" " + cnt);
            if (substr.equals(jTextField2.getText())) {
                cnt++;
            }
        }
        jTextField4.setText(" " + cnt);
    }

    void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String str = jTextField1.getText();
        String nstr = str.replace(jTextField2.getText(), jTextField3.getText());
        jTextField4.setText(nstr);

    }
    public static void main(String args[]) {
        NewJFrame nf = new NewJFrame();
        nf.setVisible(true);
        nf.setSize(250, 200);
        nf.setResizable(false);
    }
}


    
