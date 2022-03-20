// Write a java program to copy the contents of one file into the another file, while copying change the case of alphabets and replace all the digits by ‘*’ in target file .

import java.util.*;
import java.io.*;

class Slip13 {
    public static void main(String a[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name to copy");
        String f1 = br.readLine();
        System.out.println("Enter destination file");
        String f2 = br.readLine();
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        int ch;
        while ((ch = fr.read()) != -1) {
            char ch1 = (char) ch;
            if (Character.isUpperCase(ch1)) {
                ch1 = Character.toLowerCase(ch1);
                fw.write(ch1);
            } else if (Character.isLowerCase(ch1)) {
                ch1 = Character.toUpperCase(ch1);
                fw.write(ch1);
            } else if (Character.isDigit(ch1)) {
                ch1 = '*';
                fw.write(ch1);
            } else if (Character.isSpace(ch1)) {
                fw.write(ch1);
            }
        }
        fr.close();
        fw.close();
    }
}