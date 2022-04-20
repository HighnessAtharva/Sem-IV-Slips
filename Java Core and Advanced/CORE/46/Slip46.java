import java.util.*;

public class Slip46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern to print (1 OR 2)");
        int n = sc.nextInt();
        sc.close();
        System.out.println("----------");
        if (n == 1) {
            int i, j, num;

            for (i = 0; i < 4; i++) // outer loop for rows
            {
                num = 1;
                for (j = 0; j <= i; j++) // inner loop for rows
                {
                    // printing num with a space
                    System.out.print(num + " ");

                    // incrementing value of num
                    num++;
                }

                // ending line after each row
                System.out.println();
            }

        }
        if (n == 2) {
            int i, j, num;

            for (i = 3; i >= 0; i--) // outer loop for rows
            {
                num = 1;
                for (j = 0; j <= i; j++) // inner loop for rows
                {
                    // printing num with a space
                    System.out.print(num + " ");

                    // incrementing value of num
                    num++;
                }

                // ending line after each row
                System.out.println();
            }
        }
    }
}