/*Q9a Write a java program to read n Student names from user,store them into the ArrayList collection
The program should not allow duplicate names. Display the names in ascending order*/
import java.util.*;
import java.util.Scanner;
class ArrayStudent
{
	public static void main(String srgs[])
	{
		int i,n;
		String m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Students ");
		n=sc.nextInt();
		ArrayList<String> al=new ArrayList<String>();
		//LinkedList<String> li=new LinkedList<String>();
		for(i=0;i<n;i++)
		{
			m=sc.next();
			//al,add(m);
			al.add(m);
		}
		TreeSet<String> ts=new TreeSet<String>(al);
		//TreeSet<String> ts=new TreeSet<String>(li);
		System.out.println(ts);
	}
}