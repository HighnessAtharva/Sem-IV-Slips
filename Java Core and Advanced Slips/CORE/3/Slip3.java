// Write a java program to accept the details of ‘n’ employees (EName ,Salary) from the user, store them into the Hashtable and displays the Employee Names havin maximum Salary.

import java.util.*;
import java.io.*;

public class Slip3 {
    public static void main(String args[]) throws Exception {
        int n, sal = 0;
        String name = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable h = new Hashtable();
        System.out.println("\nEnter number of Employee : ");
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter name");
            name = br.readLine();
            System.out.println("\nEnter Salary : ");
            sal = Integer.parseInt(br.readLine());
            h.put(name, sal);
        }

        Enumeration k = h.keys(); //names
        Enumeration v = h.elements(); // sal
         // name
        System.out.println("\nEntered Info is:");
        while (k.hasMoreElements()) {
            System.out.println(k.nextElement() + " " + v.nextElement());
        }

        int max = 0; // to store the max salary
        String str = ""; // to store name of the employee with max salary
        
        // important to re-declare the k,v variables and set them to h.keys() and h.elements()
        k = h.keys();
        v = h.elements();
        while (v.hasMoreElements()) {
            sal = (Integer) v.nextElement();
            name = (String) k.nextElement();
            if (sal > max) {
                max = sal;
                str = name;
            }
        }
        System.out.println(str + " has maximum salary is " + max);
    }
}
