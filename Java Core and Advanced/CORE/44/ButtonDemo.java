//Slip Q.19a Write an awt program with 3 buttons, “Yes”, ”No”, “Maybe”. Display the corresponding message when clicked.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code ="ButtonDemo" width=500 height=500>
</applet>*/
public class ButtonDemo extends Applet implements ActionListener
{
	String msg="";
	Button yes,no,maybe;
	
	public void init()
	{
		yes=new Button("YES");//yes is the object here
		no=new Button("NO");
		maybe=new Button();
		maybe.setLabel("MAYBE");
		
		add(yes);
		add(no);
		add(maybe);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)//method overridden here
	{
		String str=ae.getActionCommand();
		if(str.equals("YES"))
			msg="You pressed yes";
		else if(str=="NO")
			msg="You pressed no";
		else
			msg="You pressed maybe";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,100);
	}
}