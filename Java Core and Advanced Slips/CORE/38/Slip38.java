import java.util.Scanner;

public class Slip38    
{    
    public static void main(String[] args) {    
        System.out.println("Enter a string");
        
        Scanner sc= new Scanner(System.in);
        String string = sc.nextLine().toLowerCase();
        sc.close();

        String rev = new StringBuffer(string).reverse().toString();    
        // USE compareTo not ==!!!!!
        if(string.compareTo(rev)==0)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}   