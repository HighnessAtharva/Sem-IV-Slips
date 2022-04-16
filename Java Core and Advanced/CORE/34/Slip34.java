
import java.util.*;
 
// Main class
public class Slip34 {
 
    // Main driver method
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Student");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name of student " + (i+1));
            String s = sc.next();
            ll.add(s);
        }
        Collections.sort(ll);
        sc.close();
    
        System.out.println("Sorted list of Students is: " + ll);

    }
}