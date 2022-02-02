import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 
public class slip9{ 
    public static void main(String args[])throws Exception,IOException {

    Scanner scanner=new Scanner(new File("INPUTSLIP9.txt")).useDelimiter("1\\z"); 
    String contents=scanner.next(); 
    contents=new StringBuffer(contents).reverse().toString();
    System.out.println("Reversed String:"+contents);
    FileWriter fstream=new FileWriter("OUTPUTSLIP9.txt");
    BufferedWriter out=new BufferedWriter(fstream);
    out.write(contents); 
    out.close(); 
}}