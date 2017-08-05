package circularlyLinkedList;
public class CircularlyLinkedList<E> {
	private Node<E> tail;
	private int size;
	public CircularlyLinkedList(){
		tail = null;
		size = 0;
	}
	//return the size of list
	public int size(){
		return size;
	}
	//check if list is empty
	public boolean isEmpty(){
		return size == 0;
	}
	//return the first element
	public E first(){
		return isEmpty() ? null : tail.next.getData();
	}
	//return the last element
	public E last(){
		return isEmpty() ? null : tail.getData();
	}
	//rotate => move the first element to the end
	public void rotate(){
		if(tail != null) tail = tail.next;
	}
	//add new node at first
	public void addFirst(E e){
		if(isEmpty()){
			tail = new Node<>(e);
			tail.next = tail;
		}else{
			Node<E> node = new Node<>(e);
			node.next = tail.next;
			tail.next = node;
		}
		size++;
	}
	//add new node at last
	public void addLast(E e){
		addFirst(e);
		tail = tail.next;
	}
	//remove the first element & return its data
	public E removeFirst(){
		if(isEmpty()) return null;
		E e = tail.next.getData();
		if(tail.next == tail) tail = null;
		else tail.next = tail.next.next;
		size--;
		return e;
	}
	//print all elements
	public void print(){
		if(isEmpty()) return;
		Node<E> curr = tail;
		while(true){
			curr = curr.next;
			System.out.println(curr.getData());
			if(curr == tail) break;
		}
	}
}