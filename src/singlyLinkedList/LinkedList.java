package singlyLinkedList;
public class LinkedList<E>{
	Node<E> tail;
	private int size;
	public LinkedList() {
		tail = null;
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public E first(){
		return isEmpty() ? null : tail.next.getData();
	}
	public E last(){
		return isEmpty() ? null : tail.getData();
	}
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
	public void addLast(E e){
		addFirst(e);
		tail = tail.next;
	}
	public E removeFirst(){
		if(isEmpty()) return null;
		E e = tail.next.getData();
		if(tail.next == tail) tail = null;
		else tail.next = tail.next.next;
		size--;
		return e;
	}
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