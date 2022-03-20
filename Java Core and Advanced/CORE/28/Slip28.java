// Write a java program to read n Students names from user, store them into the
// Array List collection. The program should not allow duplicate names. Display the  names in Ascending order.

import java.util.*;
import java.io.*;

public class Slip28 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList a = new ArrayList();
        System.out.println("\nEnter number of Employee : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("\nEnter name : ");
        for (int i = 1; i <= n; i++) {
            a.add(br.readLine());
        }
        TreeSet tr = new TreeSet(a);
        System.out.println("Sorted name are : " + tr);
    }
}