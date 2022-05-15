// Email Validation @ symbol and User Defined Exception

import java.util.*;

class InvalidEmailID extends Exception{
    InvalidEmailID(String email) {
     super ("Invalid Email ID Entered. @ missing in "+email) ;
    }
 }

class Slip32 {
    public static void main(String[] args) throws InvalidEmailID {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter Email: ");
        String email = sc.nextLine(); // reads string
        sc.close();
        if (email.contains("@")) {
            System.out.println("\nValid Email ID entered!");
        } else {
            throw new InvalidEmailID(email);
        }
        }
    }
