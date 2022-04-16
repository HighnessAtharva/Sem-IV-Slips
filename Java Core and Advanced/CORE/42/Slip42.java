import java.util.Scanner;

// 42. Write a Java program to accept a number from the user and find the square root of the same									public class SquareRoot2 {
 public class Slip42 {
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to get square root:");
        int a=sc.nextInt();
        sc.close();
        System.out.println("Square root of "+a+" is " +Math.sqrt(a)+ "\nAlternate Method "+ Math.pow(a, 0.5));
                
         

    } 
         
}