package doublyLinkedList;
public class DoublyLinkedList<E> {
	//Node Class
	private static class Node<E>{
		private E element;
		private Node<E> next, prev;
		//First Constructor
		public Node(E e){
			element = e;
			next = prev = null;
		}
		//Second Constructor
		public Node(E e, Node<E> prev, Node<E> next){
			element = e;
			this.prev = prev;
			this.next = next;
		}
		public E getElement(){
			return element;
		}
	}
	//LinkedList Properties & Methods
	Node<E> head, tail;
	private int size = 0;
	//Constructor
	public DoublyLinkedList(){
		head = new Node<>(null);
		tail = new Node<>(null, head, null);
		head.next = tail;
	}
	//return the size of list
	public int size(){
		return size;
	}
	//check if list is empty
	public boolean isEmpty(){
		return size == 0;
	}
	//return first element without removing it
	public E first(){
		return isEmpty() ? null : head.next.getElement();
	}
	//return last element without removing it
	public E last(){
		return isEmpty() ? null : tail.prev.getElement();
	}
	//add element at first
	public void addFirst(E e){
		addBetween(e, head, head.next);
	}
	//add element at the end
	public void addLast(E e){
		addBetween(e, tail.prev, tail);
	}
	//remove the first element & return it
	public E removeFirst(){
		return isEmpty() ? null : remove(head.next);
	}
	//remove the last element & return it
	public E removeLast(){
		return isEmpty() ? null : remove(tail.prev);
	}
	//private helper methods
	//add element
	private void addBetween(E e, Node<E> prev, Node<E> next){
		Node<E> node = new Node<>(e, prev, next);
		prev.next = node;
		next.prev = node;
		size++;
	}
	//remove element & return it
	private E remove(Node<E> node){
		node.prev.next = node.next;
		node.next.prev = node.prev;
		size--;
		return node.getElement();
	}
	//print all elements
	public void print(){
		if(isEmpty()) return;
		Node<E> curr = head;
		while(true){
			curr = curr.next;
			System.out.println(curr.getElement());
			if(curr.next == tail) break;
		}
	}
	//test the LinkedList
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.addLast(5);
		list.addFirst(10);
		list.addLast(15);
		list.print();
		System.out.println(list.size);
	}
}