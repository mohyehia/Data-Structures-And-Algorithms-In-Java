package singlyLinkedList;
public class LinkedList<E> {
	private Node<E> head, tail;
	private int size;
	
	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	E first() {
		return isEmpty() ? null : head.getData();
	}
	
	E last() {
		return isEmpty() ? null : tail.getData();
	}
	
	void addFirst(E data) {
		Node<E> node = new Node<>(data, head);
		head = node;
		if(isEmpty()) tail = head;
		size++;
	}
	
	void addLast(E data) {
		Node<E> node = new Node<>(data, null);
		if(isEmpty()) head = node;
		else tail.next = node;
		tail = node;
		size++;
	}
	
	E removeFirst() {
		if(isEmpty()) return null;
		E data = head.getData();
		head = head.next;
		size--;
		if(isEmpty()) tail = null;
		return data;
	}
	
	void print() {
		Node<E> curr = head;
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.next;
		}
	}
}
