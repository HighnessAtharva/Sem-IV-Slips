// Write a java program to read n students names from user, store them into linkedlist collection. Display the 	names in ascending order.	
import java.util.*;
public class Slip34 {
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
        sc.close();

        Collections.sort(ll);
        System.out.println("Sorted list of Students is: ");
        Iterator <String> iterator= ll.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        

    }
}