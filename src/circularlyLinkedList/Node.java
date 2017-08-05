package circularlyLinkedList;
public class Node<E>{
	private E data;
	public Node<E> next;
	public Node(E e){
		data = e;
		next = null;
	}
	public E getData(){
		return data;
	}
}