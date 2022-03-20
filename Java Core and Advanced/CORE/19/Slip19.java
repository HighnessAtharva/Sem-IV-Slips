
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
        int rem, sum = 0;
        try {
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter a number to get its sum");
            n = sr.nextInt();
            sr.close();
            if (n == 0) {
                throw new ZeroException();
            } else {
                rem = n % 10;
                sum = sum + rem;
                if (n > 9) {
                    while (n > 0) {
                        rem = n % 10;
                        n = n / 10;
                    }
                    sum = sum + rem;
                }
                System.out.println("Sum is: " + sum);
            }
        } catch (ZeroException e) {
            System.out.println(e);
        }
    }
}
