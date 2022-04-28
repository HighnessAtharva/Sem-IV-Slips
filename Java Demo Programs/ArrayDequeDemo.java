import java.util.*;

class ArrayDequeDemo
{
	public static void main(String args[])
	{
		ArrayDeque<String>ad=new ArrayDeque<String>();
		//Use arrayDeque like a stack
		ad.push("a");
		ad.push("k");
		ad.push("d");
		ad.push("g");
		ad.push("b");
		ad.push("a");
		ad.add("L");
		ad.add("A");
		
		//pop the stack
		String s;
		
		while(ad.peek()!=null)
		{
			//System.out.println(ad.pop());
			//s.ad.pop()
			s=ad.poll();
			System.out.println(s);
		}
		System.out.println(ad);
	}
}