import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip47 extends JFrame implements KeyListener{
  private JLabel LblPrmpt = new JLabel("Press keys as Desired Below:");
  private JLabel LblOutPt = new JLabel("Key Typed is:");
  private JTextField Txt = new JTextField(10);

  public Slip47() {
    setTitle("Java Example of Key Event");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(LblPrmpt, BorderLayout.NORTH);
    add(Txt, BorderLayout.CENTER);
    add(LblOutPt, BorderLayout.SOUTH);
    // addKeyListener(this);
    Txt.addKeyListener(this);
    setSize(300, 300);
    setVisible(true);
  }
 

  public void keyTyped(KeyEvent e) {
    char s = e.getKeyChar();
    LblOutPt.setText("Last key Pressed:" + s);
  }

  public void keyPressed(KeyEvent e) {
  }

  public void keyReleased(KeyEvent e) {
  }

  public static void main(String[] ar) {
    Slip47 Frm = new Slip47();
    // final int WIDTH = 250;
    // final int HEIGHT = 100;
 
  }
}