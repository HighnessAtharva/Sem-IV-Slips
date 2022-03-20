// Write a java Program to accept n nos through the command line and store all the prime nos and perfect nos into the different arrays and display both the arrays.

public class Slip26 {
    public static void main(String args[]) {
        int[] prime = new int[100];
        int[] perfect = new int[100];
        boolean flag = false;
        int primecnt = 0, percnt = 0;
        for (int num = 0; num < args.length; num++) {
            int n = Integer.parseInt(args[num]);
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    perfect[percnt] = n;
                    percnt = percnt + 1;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[primecnt] = n;
                primecnt = primecnt + 1;
            }
            flag = false;
        }
        System.out.println("Prime No:-");
        for (int i = 0; i < primecnt; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("Perfect No:-");
        for (int i = 0; i < percnt; i++) {
            System.out.println(perfect[i]);
        }
    }
}