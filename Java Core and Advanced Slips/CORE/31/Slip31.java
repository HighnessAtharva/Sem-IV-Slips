// Krishnamurthy number

import java.util.Scanner;

class Slip31 {
    static int fact(int number) {
        int factorial=1;
        for(int i=1;i<=number;i++){    
            factorial =factorial*i;    
        } 
        return factorial;   
    }

    static boolean checkNumber(int number) {
        int sum = 0;
        int n = number;
        int rem;
        while (n >0) {
            rem= fact(n%10);
            sum = sum + rem;
            n = n / 10;
        }

        if (sum == number) return true;
        else return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        n = sc.nextInt();
        sc.close();
        if (checkNumber(n)==true)
            System.out.println(n + " is a krishnamurthy number");
        else
            System.out.println(n + "is not a krishnamurthy number");
    }
}