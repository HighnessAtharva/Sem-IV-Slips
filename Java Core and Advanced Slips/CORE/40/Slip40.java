import java.util.Scanner;

// WAP in java to accept a string from the user and display each word of the string in reverse order. Ex - "Hello World" is displayed as “olleH dlroW
class Slip40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine(); //user input string 
        String[] arr = str.split(" ");//user input string, stored in array seperated on space delimiter
        StringBuffer word = new StringBuffer(); // empty stringbuffer used to feed values into
        for (int i = arr.length - 1; i >= 0; i--) {
            word.append(arr[i]).append(" "); //adding each word to the buffer in reverse order of words
        }
        System.out.println(word.reverse().toString()); //displaying the reversed buffer
        sc.close();
    }
}