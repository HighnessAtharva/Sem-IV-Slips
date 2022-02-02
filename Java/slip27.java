import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class slip27 extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b;
Connection cn;
Statement st;
ResultSet rs;
public Ass1()
{
setLayout(null);
l1=new Label(“Eno”);
l2=new Label(“EName”);
l3=new Label(“Salary”);
t1=new TextField();
t2=new TextField();
t3=new TextField();
b=new Button(“Save”);
l1.setBounds(50,50,100,30);
t1.setBounds(160,50,100,30);
l2.setBounds(50,90,100,30);
t2.setBounds(160,90,100,30);
l3.setBounds(50,130,100,30);
t3.setBounds(160,130,100,30);
b.setBounds(50,170,100,30);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b);
b.addActionListener(this);
setSize(500,500);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
public void actionPerformed(ActionEvent oe)
{
String str=oe.getActionCommand();
if(str.equals(“Save”))
{
try
{
Class.forName(“sun.jdbc.odbc.JdbcOdbcDriver”);
cn=DriverManager.getConnection(“jdbc:odbc:Ass”,””,””);
st =cn.createStatement();
int en=Integer.parseInt(t1.getText());
String enn=t2.getText();
int sal=Integer.parseInt(t3.getText());
String strr=”insert into emp values(” + en + ” ,'” + enn + “‘,” + sal + “)”;
int k=st.executeUpdate(strr);
if(k>0)
{

JOptionPane.showMessageDialog(null,”Record Is Added”);
}
}
catch(Exception er)
{
System.out.println(“Error”);
}
}
}
public static void main(String args[])
{
new Ass1().show();
}
}