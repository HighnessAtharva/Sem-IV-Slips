
// Write a java program to accept a number from the user, if number is zero then  throw user defined Exception Number is 0 otherwise calculate the sum of first and last digit of a given number (Use static keyword).
import java.util.*;

class ZeroException extends Exception {
    ZeroException() {
        super("Number is 0");
    }
}

class Slip19 {
    static int n;

    public static void main(String args[]) {
    
        try {
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter a number to get its sum");
            n = sr.nextInt();
            sr.close();
            if (n == 0) {
                throw new ZeroException();
            } else {
                if (n<9){
                    System.out.println("Sum of first and last digit is: " +n);
                }else{
                int sum=0;
                String num=String.valueOf(n); //convert number to string
                char first= num.charAt(0); //get first digit
                char last= num.charAt(num.length()-1); //get last digit

                //add first and last digit [Char -> String -> Integer]
                sum=Integer.parseInt(String.valueOf(first))+Integer.parseInt(String.valueOf(last)); 
                System.out.println("Sum of first and last digit is: " +sum);
                }
            }
        } catch (ZeroException e) {
            System.out.println(e);
        }
    }
}
