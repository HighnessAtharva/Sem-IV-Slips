
//Q.4a Write a java program to display “Hello Java” with settings Font- Georgia, Foreground color- Red, background color – Blue on the Frame (Use Label)
import java.awt.*;
import java.awt.event.*;

public class HelloFont extends Frame {
	Label lblmsg;
	Font f;

	HelloFont() {
		lblmsg = new Label("Hello Java");
		f = new Font("Georgia", Font.PLAIN, 32);
		setFont(f);
		add(lblmsg);
		lblmsg.setAlignment(Label.CENTER);
		setBackground(Color.BLUE);
		setForeground(Color.RED);
		setVisible(true);
		setSize(500, 500);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		HelloFont hf = new HelloFont();
	}
}
