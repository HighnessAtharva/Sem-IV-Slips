
// TreeSet
import java.util.*;

class Slip36 {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();
		//shit gets autsorted, unique values allowed. 
		ts1.add("Shawty");
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("C");

		// System.out.println(ts1);
		Iterator<String> it = ts1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
