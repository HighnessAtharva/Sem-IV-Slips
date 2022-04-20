import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip45 extends JFrame
{
     JButton yes,no,maybe;
     JLabel lbl;
     Slip45()
     {
          yes = new JButton("YES");
          no = new JButton ("NO");
          maybe = new JButton ("MAYBE");
          lbl = new JLabel ("");
          setLayout (new GridLayout(4,1));
          setSize (400,200);
          add(yes);
          add(no);
          add(maybe);
          add(lbl);
          setVisible(true);

          //setDefaultCloseOperation(JFrame.EXIT_NO_CLOSE);
          ButtonHandler bh = new ButtonHandler();
          yes.addActionListener(bh);
          yes.addActionListener(bh);
          no.addActionListener(bh);
          maybe.addActionListener(bh);
     }
     class ButtonHandler implements ActionListener
     {
          public void actionPerformed(ActionEvent ae)
          {
               if (ae.getSource()==yes)
               {
                    lbl.setText("Button Yes is pressed");
               }
               if (ae.getSource()==no)
               {
                    lbl.setText("Button No is pressed");
               }
               if (ae.getSource()==maybe)
               {
                    lbl.setText("Button Maybe is pressed");
                    
               }
          }
     }
     public static void main(String args[])
     {
          new Slip45();
     }
}