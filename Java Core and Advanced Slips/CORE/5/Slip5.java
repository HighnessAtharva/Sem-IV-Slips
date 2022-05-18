//Define a class student with attributes rollno and name. Define default and parameterised constructor. Override the toString()method. Keep the count of Objects created. Create objects using parameterised constructor and Display the objects count after each object is created.

import java.io.*;
import java.util.*;
class Student{
    static int cnt;
    int rno;
    String nm;

    Student() {
        nm = "";
    }

    Student(int rno, String name) {
        this.rno = rno;
        this.nm = name;
        cnt++;
        System.out.println("objects created=" + cnt);
    }

    public String toString() {
        return "rno = " + this.rno + " nm = " + this.nm;
    }
}
 
class Slip5 {
    public static void main(String a[]) throws Exception {
        int n, i, rno;
        String name;
       Scanner sc= new Scanner(System.in);
        System.out.println("enter no of students");
        n =sc.nextInt();
        // Store in array of object of class Student
        Student ob[] = new Student[n];
        for (i = 0; i < n; i++) {
            System.out.println("enter roll no");
            rno =sc.nextInt();
            System.out.println("enter name");
            name = sc.next();
            ob[i] = new Student(rno, name);
        }
        sc.close();
        System.out.println("Students are : ");
        for (i = 0; i < n; i++) {
            System.out.println(ob[i].toString());
        }
        
    }
}
