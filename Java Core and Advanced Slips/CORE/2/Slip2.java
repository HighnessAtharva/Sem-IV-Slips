
import java.util.*;
import java.io.*;

class Slip2{
    public static void main(String args[]) throws IOException {
        String str[] = new String[5];
        String temp;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the name of 5 cities ");
        for (int i = 0; i < 5; i++) {
            str[i] = sr.next();
           
        }
        sr.close();
        System.out.println("After sorting the order is: ");
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (str[j].compareTo(str[i]) > 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++)
            System.out.println(str[i]);
    }
}