import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip47 extends JFrame implements KeyListener{
  private JLabel LblPrmpt = new JLabel("Press keys as Desired Below:");
  private JLabel LblOutPt = new JLabel("");
  private JTextField Txt = new JTextField(10);

  public Slip47() {
    setTitle("Java Example of Key Event");
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3,1));
    add(LblPrmpt);
    add(Txt);
    add(LblOutPt);
    // addKeyListener(this);
    Txt.addKeyListener(this);
    setSize(300, 300);
    setVisible(true);
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        dispose();
      }
    });
  }

  //must implement all the 3 methods since they are abstract
  public void keyPressed(KeyEvent e) {
    LblOutPt.setText("Key Pressed:" + e.getKeyChar());
  }

  //must implement all the 3 methods since they are abstract
  public void keyReleased(KeyEvent e) {
    LblOutPt.setText("Key Released:" + e.getKeyChar());
  }

  //must implement all the 3 methods since they are abstract
  public void keyTyped(KeyEvent e) {
    LblOutPt.setText("Key Typed:" + e.getKeyChar());
  }

  public static void main(String[] ar) {
    Slip47 Frm = new Slip47();
  
  }
}