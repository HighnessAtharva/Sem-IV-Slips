// Write a java program that displays the number of characters,lines & words from a file.

// NOTE:- Use the CMD to pass the arguments. 
import java.io.*;

class Slip18 {
    public static void main(String args[]) throws Exception {
        int ccnt = 0, lcnt = 1, wcnt = 0, c;
        FileInputStream fin = new FileInputStream(args[0]);
        while ((c = fin.read()) != -1) {
            ccnt++;
            if (c == 32 || c == 13)
                wcnt++;
            if (c == 13)
                lcnt++;
        }
        fin.close();
        System.out.println("Number of Characters are:" + ccnt);
        System.out.println("Number of Words are:" + wcnt);
        System.out.println("Number of Lines:" + lcnt);
    }
}