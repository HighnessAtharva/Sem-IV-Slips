/*Q10b write an applet apllication in java for smiley face. void drawOval(int top,int left,int width,int height) void fillOval
(int top,int left,int width,int height)
void drawArc(int top,int left,int width,int height,int star angle,int sweep angle)->Arc is drawn from start angle throught the
angular distance specified by sweep angle.Zero Degree is horizontal at3o,clockposition, the arc is drawn counterclockwise if sweep angle 
is positive , andclockwise is sweep angle is negative*/
import java.awt.*;
import java.applet.*;

class Smiley extends Applet
{
	public void paint(Graphics g)
	{
		/*<applet code="Smiley" width=500 height=500></applet>*/
		
		g.drawOval(50,50,150,150);//big oval
		g.drawOval(15,95,35,35);//left ear
		g.drawOval(200,100,35,35);//right ear
		g.drawLine(125,100,125,140);//nose line
		g.drawOval(80,100,20,20);//left eye
		g.fillOval(85,100,10,10);//left fill
		g.fillOval(150,100,10,10);//right fill
		g.drawOval(145,100,20,20);//right eye
		g.drawArc(90,100,70,80,0,-175);//mouth
		
	}
}