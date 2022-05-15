// Write a java program to accept the details of ‘n’ employees (EName ,Salary) from the user, store them into the Hashtable and displays the Employee Names havin maximum Salary.

import java.util.*;
import java.io.*;

public class Slip3 {
    public static void main(String args[]) throws Exception {
        int n, sal = 0;
        String name = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<String, Integer> h = new Hashtable<String, Integer>();
        System.out.println("\nEnter number of Employee : ");
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter name");
            name = br.readLine();
            System.out.println("\nEnter Salary : ");
            sal = Integer.parseInt(br.readLine());
            h.put(name, sal);
        }
        System.out.println("\nEntered Info is:");
        for (Map.Entry<String, Integer> m : h.entrySet()) {
            String name1 = (String) m.getKey();
            Integer sal1 = (Integer) m.getValue();
            System.out.println("\nName : " + name1 + "\tSalary : " + sal1);
        }

        int max = 0; // to store the max salary
        String str = ""; // to store name of the employee with max salary

        for (Map.Entry<String, Integer> m : h.entrySet()) {
            String name1 = (String) m.getKey();
            Integer sal1 = (Integer) m.getValue();
            if (sal1 > max) {
                max = sal1;
                str = name1;
            }
        }
        System.out.println(str + " has maximum salary of " + max);
    }
}
