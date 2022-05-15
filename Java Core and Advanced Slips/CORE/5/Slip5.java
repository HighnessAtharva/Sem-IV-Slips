//Define a class student with attributes rollno and name. Define default and parameterised constructor. Override the toString()method. Keep the count of Objects created. Create objects using parameterised constructor and Display the objects count after each object is created.

import java.io.*;

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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of students");
        n = Integer.parseInt(br.readLine());
        Student ob[] = new Student[n];
        for (i = 0; i < n; i++) {
            System.out.println("enter roll no");
            rno = Integer.parseInt(br.readLine());
            System.out.println("enter name");
            name = br.readLine();
            ob[i] = new Student(rno, name);
        }
        System.out.println("Students are : ");
        for (i = 0; i < n; i++) {
            System.out.println(ob[i].toString());
        }
   
    }
}
