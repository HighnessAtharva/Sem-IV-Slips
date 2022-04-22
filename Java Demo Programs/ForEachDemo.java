//For-Each instead of iterator
import java.util.*;
class ForEachDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		//add values
		al.add(4);
		al.add(9);
		al.add(3);
		System.out.println(al);
		
		//for loop to display
		System.out.println("Original Contents");
		for(int v:al)
		System.out.print(v+", ");
		System.out.println();
		int sum=0;
		for(int v:al)
			sum+=v;
		System.out.println("Sum is "+sum);
	}
}