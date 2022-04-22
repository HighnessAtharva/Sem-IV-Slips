// Write a java program to accept n employee names from user, store them into the
// LinkedList class and display them by using.
// a. Iterator Interface
// b. ListIterator Interface

import java.util.*;
import java.io.*;

public class Slip29 {
    public static void main(String args[]) throws Exception {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList <String>li = new LinkedList<String>();
        System.out.println("\nEnter number of Employee : ");
        n = Integer.parseInt(br.readLine());
        System.out.println("\nEnter name : ");
        for (int i = 1; i <= n; i++) {
            li.add(br.readLine());
        }
        System.out.println("\nLink List Content (Iterator Interface) : ");
        Iterator <String> it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nReverse order : (ListIterator Interface) ");
        ListIterator <String> lt = li.listIterator();
        while (lt.hasNext()) {
            lt.next();
        }
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
    }
}