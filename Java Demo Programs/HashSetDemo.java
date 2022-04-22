import java.util.*;

class HashSetDemo
{
	public static void main(String args[])
	{
		//HashSet<String>hs=new HashSet<Sring>();
		Set<String>hs=new HashSet<String>();
		
		hs.add("D");
		hs.add("B");
		hs.add("B");
		hs.add("D");
		hs.add(null);
		hs.add("K");
		hs.add("A");
		System.out.println(hs);
		
		
	}
}