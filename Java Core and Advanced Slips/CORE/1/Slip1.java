// Write a java program to read the charactersfrom a file, if a character is alphabet then reverse its case, if not thendisplay its category on the Screen. (whether it is Digit or Space).

import java.io.*;

class Slip1 {
    public static void main(String a[]) throws Exception {
        //use BufferedReader to accept input from the user (InputStreamReader(System.in))
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name ");
        //br.readLine() method to accept input with spaces
        String f1 = br.readLine();
        //make a FileReader object to read file. Use the fr.read() method to read the file
        FileReader fr = new FileReader(f1);
        //initally use int to get character from file, check if end of file is not reached and then typecast it to a character and thusly, print characters one by to the screen
        int ch;
        while ((ch = fr.read()) != -1) {
            char c = (char) ch;
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                System.out.print(c);
            } else if (Character.isDigit(c)) {
                System.out.println(c + "Digit");
            } else if (Character.isWhitespace(c))
                System.out.println(c + "Space");
            else
                System.out.println(c);
        }
        fr.close();
    }
}