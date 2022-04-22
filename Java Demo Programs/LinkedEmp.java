/*Q10.a Write a java program to accept n employee names from user, store them into the LinkedList class and display
them by using 
a.iterator interface
b.Listiteratot Interface (reverse order)*/
import java.util.*;
import java.util.Scanner;
class LinkedEmp
{
	public static void main(String args[])
	{
		LinkedList<String> li=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of employees ");
		int i,n;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			li.add(sc.next());
		}
		//display by Iterator Interface
		System.out.println();
		
		Iterator<String> itr=li.iterator();
		while(itr.hasNext())
		{
			String ele = itr.next();
			System.out.println(ele);
			
		}
		//display by ListIterator interface
		System.out.println();
		
		ListIterator<String> litr=li.listIterator();
		while(litr.hasNext())
		{
			String ele=litr.next();
			System.out.println(ele);
		}
		System.out.println();
		
		//In reverse order
		while(litr.hasPrevious())
		{
			String element=litr.previous();
			System.out.println(element+" ");
		}
	}
}