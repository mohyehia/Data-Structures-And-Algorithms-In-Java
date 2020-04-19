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

	/*
	Time Complexity => O(1)
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/*
	TomeComplexity => O(1)
	 */
	@Override
	public E first() {
		return isEmpty() ? null : head.val;
	}

	/*
	TomeComplexity => O(1)
	 */
	@Override
	public E last() {
		return isEmpty() ? null : tail.val;
	}

	/*
	TomeComplexity => O(1)
	 */
	@Override
	public void addFirst(E val) {
		head = new Node<>(val, head);
		if(isEmpty()) tail = head;
		size++;
	}

	/*
	TomeComplexity => O(1)
	 */
	@Override
	public void addLast(E val) {
		Node<E> node = new Node<>(val, null);
		if(isEmpty()) head = node;
		else tail.next = node;
		tail = node;
		size++;
	}

	/*
	TomeComplexity => O(1)
	 */
	@Override
	public E removeFirst() {
		if(isEmpty()) return null;
		E data = head.val;
		head = head.next;
		size--;
		if(isEmpty()) tail = null;
		return data;
	}

	/*
	TomeComplexity => O(n), where n is the size of the list
	 */
	@Override
	public void print() {
		Node<E> current = head;
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
}
