
import java.util.*;
import java.io.*;

class Slip2{
    public static void main(String args[]) throws IOException {
        //make a string array
        
        String temp;
        System.out.println("Enter number of cities");
        Scanner sr = new Scanner(System.in);
        int n=sr.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the name of "+ n + " cities ");
        for (int i = 0; i <n; i++) {
            str[i] = sr.next();
        }
        sr.close();
        System.out.println("After sorting the order is: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <n; j++) {
                // since we are sorting in descending order, compare the strings with indexes j and then i
                if (str[j].compareTo(str[i]) > 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(str[i]);
    }
}