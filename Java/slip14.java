import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class slip14 extends JFrame
{
      JPanel p = new JPanel();
      slip14()
      {     setVisible(true);
            setSize(400,400);
            setTitle("Swing Background");
             add(p);
           
            addWindowListener(new WindowAdapter()
            {
            public void windowClosing(WindowEvent e)
            {     p.setBackground(Color.RED);
                              JOptionPane.showMessageDialog(null,"Close window","Login",JOptionPane.INFORMATION_MESSAGE);
               
                  }
            });
      }
     
      public static void  main(String args[])
      {
            new slip14();
      }
}