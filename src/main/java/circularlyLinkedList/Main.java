package circularlyLinkedList;
public class Main {
	public static void main(String[] args) {
		CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
		System.out.println(list.size());
		list.addLast("Mohammed");
		list.addLast("Ahmed");
		list.removeFirst();
		list.print();
		System.out.println(list.size());
	}
}
