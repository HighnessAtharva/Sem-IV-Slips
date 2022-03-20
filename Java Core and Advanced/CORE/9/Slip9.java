// Write a java program to display the contents of a file in reverse order.

import java.io.*;
import java.util.Scanner;

public class Slip9 {
    public static void main(String args[]) throws Exception, IOException {
        Scanner scanner = new Scanner(new File("dummy.txt")).useDelimiter("\\z");
        String contents = scanner.next();
        contents = new StringBuffer(contents).reverse().toString();
        System.out.println("Reversed String:" + contents);
        FileWriter fstream = new FileWriter("a.txt");
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(contents);
        out.close();
    }
}
