import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip49 extends JFrame
{ 
     
     JButton morning = new JButton("Good Morning");
     JButton evening = new JButton ("Good Evening");
     JLabel lbl = new JLabel ("");
     
     Slip49()
     {   
          setLayout (new GridLayout(3,1));
          setSize (400,200);
          add(morning); //row 1
          add(evening); //row 1
          add(lbl);
          setVisible(true);

          //setDefaultCloseOperation(JFrame.EXIT_NO_CLOSE);
          ButtonHandler bh = new ButtonHandler();
          // morning.addActionListener(bh);
          morning.addActionListener(bh);
          evening.addActionListener(bh);
       
     }
     class ButtonHandler implements ActionListener
     {
          public void actionPerformed(ActionEvent ae)
          {
               if (ae.getSource()==morning)
               {
                    lbl.setText("Good Morning is pressed");
               }
               if (ae.getSource()==evening)
               {
                    lbl.setText("Good Evening is pressed");
               }
          }
     }
     public static void main(String args[])
     {
          new Slip49();
     }
}