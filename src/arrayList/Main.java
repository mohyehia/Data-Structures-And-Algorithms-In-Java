package arrayList;
import java.util.Iterator;
public class Main {
	// Test the ArrayList class
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.size());
		int a = list.remove();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("Removed element: " + a);
		System.out.println(list.size());
	}
}
