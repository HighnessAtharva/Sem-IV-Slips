import java.awt.*;  
import java.awt.event.*;  
public class delete extends Frame implements MouseListener{  
    Label l;  
    delete(){  
        //addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        Button b=new Button("Click me Retard");
        b.setBounds(20, 100, 40, 90);
        add(b);
        b.addMouseListener(this);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e){  
                dispose();  
            }  
        });
    }  

    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
   
public static void main(String[] args) {  
    delete d= new delete();  
}
}

