// TreeSet
import java.util.*;

class Slip36 {

	public static void main(String[] args)
	{
		Set<String> ts1 = new TreeSet<String>();
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("C");

		// System.out.println(ts1);
		Iterator<String> iterator= ts1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
