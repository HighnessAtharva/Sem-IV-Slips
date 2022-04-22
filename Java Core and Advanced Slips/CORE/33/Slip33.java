// Write a Java program to print palindrome numbers from 1 to 200.   
public class Slip33 {

    public static void main(String[] args) {
        System.out.println(1 + " to " + 200 + " palindrome numbers are");
        for (int i = 1; i <= 200; i++) {
            int num1 = i;
            int num2 = 0;
            while (num1 != 0) {
                int rem = num1 % 10;
                num1 /= 10;
                num2 = num2 * 10 + rem;
            }

            if (i == num2)
                System.out.print(i + " ");
        }
    }
}