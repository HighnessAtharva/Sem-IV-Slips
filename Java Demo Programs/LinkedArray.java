/*Q15a Write a java program to read n student names from user and store them into linkedlist collection. Display the names in 
ascending order*/
import java.util.*;
import java.util.Scanner;
class LinkedArray
{
	public static void main(String args[]) throws Exception
	{
		int i,n;
		String m;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no of Students ");
			n=sc.nextInt();
			LinkedList<String> li= new LinkedList<String>();
			for(i=0;i<n;i++)
			{
				m=sc.next();
				li.add(m);
			}
			sc.close();
			TreeSet<String> ts= new TreeSet<String>(li);
			System.out.println(ts);
		}
	}
}