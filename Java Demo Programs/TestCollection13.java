import java.util.*;
class TestCollection13
{
	public static void main(String args[])
	{
		HashMAp<Integer,String>hm= new HashMap<Integer,String>();
		hm.put(102,"Amit");
		hm.put(100,"Alhad");
		hm.put(102,"Rahul");
		hm.put(101,"Rohan");
		hm.put(103,"Rahul");
//The Map.Entry interface enables you to work with a map entry
/*The entrySet() method declared by the Map interface returns a W3t containing the map entries. Entry is the subinterface
of Map
So it is accessed by Map.Entry name. */
		/*for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}*/
		Set set=hm.entrySet();
		Iterator i=set.Iterator();
		
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			//System.out.print(me.getKey()+":");
			//System.out.println(me.getValue());
			System.out.println(me);
			
			//System.out.println(set);
			//System.out.println(hm);
		}
		
	}
}