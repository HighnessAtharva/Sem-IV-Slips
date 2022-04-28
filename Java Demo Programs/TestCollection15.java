 //TreeMap class
import java.util.*;
class TestCollection15
{
	public static void main(String args[])
	{
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(100,"Amit");
		hm.put(102,"Ravi");
		hm.put(101,"Vijay");
		hm.put(103,"Rahul");
		//hm.put(null,"Anil");
		hm.put(105,null);
		hm.put(106,null);
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}