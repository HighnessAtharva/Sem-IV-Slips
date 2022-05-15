// Write a java program that displays the number of characters,lines & words from a file.

// NOTE:- Use the CMD to pass the arguments. 
import java.io.*;

class Slip18 {
    public static void main(String args[]) throws Exception {
        int ccnt = 0, lcnt = 1, wcnt = 0, c;
        FileReader fr = new FileReader(args[0]);
        while ((c = fr.read()) != -1) {
            //character count will be increased obviously
            ccnt++;
            //asicii value of space is 32  and ascll value of new line is 13
            if (c == 32 || c == 13)
                wcnt++;
            if (c == 13)
                lcnt++;
        }
        fr.close();
        System.out.println("Number of Characters are:" + ccnt);
        System.out.println("Number of Words are:" + wcnt);
        System.out.println("Number of Lines:" + lcnt);
    }
}