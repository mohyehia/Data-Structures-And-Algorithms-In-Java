package doublyLinkedList;
public class MyLinkedList<E> implements DoublyLinkedList<E> {

	private int size;
	private Node<E> head, tail;
	
	public MyLinkedList() {
		size = 0;
		head = new Node<E>(null);
		tail = new Node<E>(null, head, null);
		head.next = tail;
		
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
		return isEmpty() ? null : head.next.getData();
	}

	@Override
	public E last() {
		return isEmpty() ? null : tail.prev.getData();
	}

	@Override
	public void addFirst(E data) {
		addBetween(data, head, head.next);
	}

	@Override
	public void addLast(E data) {
		addBetween(data, tail.prev, tail);
	}

	@Override
	public E removeFirst() {
		return isEmpty() ? null : remove(head.next);
	}

	@Override
	public E removeLast() {
		return isEmpty() ? null : remove(tail.prev);
	}
	
	private void addBetween(E data, Node<E> prev, Node<E> next) {
		Node<E> node = new Node<E>(data, prev, next);
		prev.next = node;
		next.prev = node;
		size++;
	}
	
	private E remove(Node<E> node) {
		node.next.prev = node.prev;
		node.prev.next = node.next;
		size--;
		return node.getData();
	}

	@Override
	public void print() {
		if(isEmpty()) return;
		Node<E> curr = head;
		while(true) {
			curr = curr.next;
			System.out.println(curr.getData());
			if(curr.next == tail) break;
		}
	}
	
}
