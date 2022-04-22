import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> li=new LinkedList<String>();
		
		//Adding elements
		li.add("D");
		li.add("S");
		li.add("T");
		li.add("M");
		li.add("I");
		li.addFirst("Z");
		li.addLast("S");
		li.add(1,"N");
		
		System.out.println("Contents of nlist are: "+li);
		//Remove elements from linked list
		
		li.remove("M");
		li.remove(3);
		//elements after removal
		System.out.println("Contents of list are "+li);
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println("Contents of list are : "+li);
		
		//get and set a value
		String val=li.get(2);
		System.out.println("Val is "+val);
		li.set(2,"G");
		System.out.println("Contents of list are : "+li);
		
		int x=li.indexOf("D"):
		System.out.println("The podition of D is "+ x)
		System.out.println("The contents of list are "+ li);
		
		

	}
}