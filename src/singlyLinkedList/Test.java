package singlyLinkedList;
public class Test {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		linkedList.addLast(3);
		linkedList.addLast(4);
		linkedList.removeFirst();
		System.out.println(linkedList.size());
		linkedList.print();
	}
}
