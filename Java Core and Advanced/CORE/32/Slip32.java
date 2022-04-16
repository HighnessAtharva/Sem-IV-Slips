import java.util.*;

class InvalidEmailID extends Exception{
    String str1;

    InvalidEmailID(String str2) {
     str1=str2;
    }
    public String toString(){ 
     return ("Invalid Email ID Entered. @ missing in "+str1) ;
    }
 }

class Slip32 {
    public static void main(String[] args) throws InvalidEmailID {
        try{
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter Email: ");
        String str = sc.nextLine(); // reads string
        System.out.print("You have entered: " + str + "\n");
        sc.close();
        if (str.contains("@")) {
            System.out.println("\nValid Email ID");
        } else {
            throw new InvalidEmailID(str);
        }
        }
        catch(InvalidEmailID e){
            System.out.println(e);
        }
        

    }
}