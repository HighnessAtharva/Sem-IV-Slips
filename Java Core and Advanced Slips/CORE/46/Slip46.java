import java.util.*;

public class Slip46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern to print (1 OR 2)");
        int n = sc.nextInt();
        sc.close();
        System.out.println("----------");
        if (n == 1) {
            int i, j;

            for (i = 1; i <= 4; i++) {
                for (j = 1; j <= i; j++){
                    System.out.print(j + " ");   
                }
                System.out.println();
            }
            for (i = 4; i >= 1; i--) {
                for (j = 1; j <= i; j++){
                    System.out.print(j + " ");   
                }
                System.out.println();
            }
            
        }
        if (n == 2) {
            int i, j;

            for (i = 4; i >= 0; i--){
                for (j = 1; j <= i; j++) 
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            for (i = 1; i <=4; i++){
                for (j = 1; j <= i; j++) 
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}