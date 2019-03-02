package singlyLinkedList;
public class MyLinkedList<E> implements SinglyLinkedList<E> {

	private Node<E> head, tail;
	private int size;
	
	public MyLinkedList() {
		head = tail = null;
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E first() {
		return isEmpty() ? null : head.getData();
	}

	@Override
	public E last() {
		return isEmpty() ? null : tail.getData();
	}

	@Override
	public void addFirst(E data) {
		Node<E> node = new Node<>(data, head);
		head = node;
		if(isEmpty()) tail = head;
		size++;
	}

	@Override
	public void addLast(E data) {
		Node<E> node = new Node<E>(data, null);
		if(isEmpty()) head = node;
		else tail.next = node;
		tail = node;
		size++;
	}

	@Override
	public E removeFirst() {
		if(isEmpty()) return null;
		E data = head.getData();
		head = head.next;
		size--;
		if(isEmpty()) tail = null;
		return data;
	}

	@Override
	public void print() {
		Node<E> current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
}
