// Write a package for Games in Java, which have two classes Indoor and Outdoor.Use a function display () to generate the list of players for the specific games. (Use Parameterized constructor, finalize() method and Array Of Objects)
import games.*;

public class Slip20 {
    public static void main(String args[]) {
        Indoor In[] = new Indoor[3];
        In[0] = new Indoor("Amit");
        In[1] = new Indoor("Aniket");
        In[2] = new Indoor("Archana");
        System.out.println("Indoor Players...");
        for (int i = 0; i < In.length; i++)
            In[i].display();
        System.out.println("Outdoor Players...");
        Outdoor Out[] = new Outdoor[3];
        Out[0] = new Outdoor("Anil");
        Out[1] = new Outdoor("Ameya");
        Out[2] = new Outdoor("Ajay");
        for (int i = 0; i < Out.length; i++)
            Out[i].display();
    }
}
