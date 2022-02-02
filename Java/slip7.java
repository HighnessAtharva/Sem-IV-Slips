import java.awt.*;
class slip7 extends Frame
{
      Label l;
      slip7()
      {
            l=new Label("Hello java");
            l.setFont(new Font("Georgia",Font.BOLD,14));
            l.setForeground(Color.RED);
            add(l);
            setBackground(Color.BLUE);
            setSize(300,300);
            setLayout(new FlowLayout()); 
            setVisible(true);
           
      }
      public static void main(String a[])
      {
            new slip7();
      }
}