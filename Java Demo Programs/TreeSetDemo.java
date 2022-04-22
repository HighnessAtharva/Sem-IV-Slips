/*Q.15 Write a java program to enter elements in a TreeSet and print it*/
import java.util.*;
public class TreeSetDemo
{
	public static void main(String args[])
	{
		//Create a tree set
		TreeSet<String> ts= new TreeSet<String>();
		//Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("e");
		ts.add("F");
		ts.add("D");
		ts.add("65");
		System.out.println(ts);
		ts.add("B");//no duplicxate values allowed
		//ts.add(null);//null values not allowed
		ts.add(" ");//ASCII value of space=32
		System.out.println(ts);
		
	}
}