// Write a java program to accept string from user, if its length is less than 6, then throw user defined exception “Invalid String” otherwise display string in upper case. 

import java.util.Scanner;

class InvalidString extends Exception {
    InvalidString(String str) {
        super(str);
    }
}

class Slip37 {
    public static void main(String[] args) throws InvalidString {
    
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        if (str.length() < 6) {
            throw new InvalidString("Less than 6 characters");
            //once the exception is thrown, program flow breaks and the next block will not execute
        }
        System.out.println(str.toUpperCase());
    }
}

