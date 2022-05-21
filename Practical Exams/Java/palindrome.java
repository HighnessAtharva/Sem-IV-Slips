// Write a Java program to print palindrome numbers from 1 to 200.   
public class Slip33 {
    static void palindrome(int start, int end) {
        for (int i = start; i <= end; i++) {
            int n = i;
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum = sum*10 + rem;
                n=n/10;
            }

            if (i == sum)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(1 + " to " + 200 + " palindrome numbers are");
        palindrome(1, 200);
    }
}