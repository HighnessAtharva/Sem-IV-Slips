// Write a java program to read n Students names from user, store them into the
// Array List collection. The program should not allow duplicate names. Display the  names in Ascending order.

import java.util.*;

public class Slip28 {
    public static void main(String args[]) throws Exception {
        Scanner sc= new Scanner(System.in);
        ArrayList <String>a = new ArrayList<String>();
        System.out.println("\nEnter number of Students : ");
        int n = sc.nextInt();
        System.out.println("\nEnter name : ");
        for (int i = 1; i <= n; i++) {
            a.add(sc.next());
        }
        sc.close();
     
        TreeSet <String>tr = new TreeSet<String>(a);
        System.out.println("Sorted name of the students are are : " + tr);
    }
}