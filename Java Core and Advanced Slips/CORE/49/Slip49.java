import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip49 extends JFrame
{ JLabel lbl;
     JButton morning,evening;
     Slip49()
     {
      
    
          morning = new JButton("Good Morning");
          evening = new JButton ("Good Evening");
         
          lbl = new JLabel ("");
          setLayout (new GridLayout(4,1));
          setSize (400,200);
          add(morning);
          add(evening);
    
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