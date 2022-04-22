import java.util.*;
class ArrayListDemo1
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(1);
		al.add(3);
		System.out.println(al);
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}