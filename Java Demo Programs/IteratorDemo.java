import java.util.*;

class IteratorDemo
{
	public static void main(String args[])
	{
		//create an arraylist
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(2);
	
	for(int i:al)
	{
		System.out.println(i);
	}
}
}