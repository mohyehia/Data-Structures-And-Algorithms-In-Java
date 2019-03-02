package singlyLinkedList;
public class Node<E> {
	E data;
	Node<E> next;
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	public E getData() {
		return data;
	}
}
