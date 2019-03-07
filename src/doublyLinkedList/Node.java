package doublyLinkedList;
public class Node<E> {
	private E data;
	Node<E> next, prev;
	public Node(E data) {
		this.data = data;
		next = prev = null;
	}
	public Node(E data, Node<E> prev, Node<E> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	public E getData() {
		return data;
	}
}
