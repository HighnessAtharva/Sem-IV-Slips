// Write a java program to display “Hello Java” with settings Font- Georgia, foreground color- Red, background color – Blue on the Frame.
import java.awt.*;

class Slip7 extends Frame {
    Slip7() {
        Label l = new Label("Hello java");
        Font f = new Font("Georgia", Font.BOLD, 40);
        l.setFont(f);
        setForeground(Color.red);
        setBackground(Color.blue);
        add(l);
        setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String arg[]) {
        new Slip7();
    }
}