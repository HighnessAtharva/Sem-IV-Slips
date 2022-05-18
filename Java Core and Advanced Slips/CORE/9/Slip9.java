// Write a java program to display the contents of a file in reverse order.

import java.io.*;
import java.util.Scanner;

public class Slip9 {
    public static void main(String args[]) throws Exception, IOException {
        Scanner sc = new Scanner(new File("dummy.txt")).useDelimiter("\\z");
        String contents = sc.next(); 
        //sc.nextLine() will also work
        contents = new StringBuffer(contents).reverse().toString();
        System.out.println("Reversed Contents of the File:" + contents);
    }
}
