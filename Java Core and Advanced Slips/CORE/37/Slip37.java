// Write a java program to accept string from user, if its length is less than 6, then throw user defined exception “Invalid String” otherwise display string in upper case. 

//write bloatware code
import java.util.Scanner;

class InvalidString extends Exception {

    public InvalidString(String str) {
        System.out.println("Less than 6 characters" + str);
    }
}

class Slip37 {
    public static void main(String[] args) throws InvalidString {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if (str.length() < 6) {
            throw new InvalidString("Invalid String");
        }
        System.out.println(str.toUpperCase());
    }
}
