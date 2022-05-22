// Email Validation @ symbol and User Defined Exception

import java.util.*;

class InvalidEmailID extends Exception {
    InvalidEmailID(String email) {
        super("Invalid Email ID Entered. @ missing in " + email);
    }
}
// in all exception handling programs use try catch blocks. Throw the exception
// is the try block, catch the same exception in the catch block and you will
// get a non-messy non-cluttered terminal output even when exception occurs.
// Cleanest way to handle. Never attempt exception handling programs without
// wrapping risky and error prone statements in the try block Atharva. Remember!

class Slip32 {
    public static void main(String[] args) throws InvalidEmailID {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter Email: ");
        String email = sc.nextLine(); // reads string
        sc.close();
        try {
            if (email.contains("@")) {
                System.out.println("\nValid Email ID entered!");
            } else {
                throw new InvalidEmailID(email);
            }
        } 
        catch (InvalidEmailID e) {
            System.out.println(e);
        }

    }
}
