package doublyLinkedList;
public class Test {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new MyLinkedList<>();
		list.addFirst(5);
		list.addFirst(6);
		list.addLast(10);
		list.removeFirst();
		System.out.println("Size = " + list.size());
		System.out.println("Printing elements ......");
		list.print();
	}
}
