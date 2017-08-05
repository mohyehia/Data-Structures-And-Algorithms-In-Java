package doublyLinkedList;
public class MyLinkedList<E> {
	public Link<E> head;
	private int size;
	public MyLinkedList(){
		this.head = null;
		this.size = 0;
	}
	//get the size of the LinkedList
	public int size(){
		return this.size;
	}
	//check if the LinkedList is empty
	public boolean isEmpty(){
		return head == null;
	}
	//add new element at the beginning of the LinkedList
	public void addFront(E data){
		if(isEmpty()) head = new Link<>(data);
		else {
			Link<E> newLink = new Link<>(null, data, head);
			head.prev = newLink;
			head = newLink;
		}
		size++;
	}
	//add new element at the end of the LinkedList
	public void addRear(E data){
		if(isEmpty()) head = new Link<E>(data);
		else{
			Link<E> cur = head;
			while(cur.next != null){
				cur = cur.next;
			}
			Link<E> newLink = new Link<E>(cur, data, null);
			cur.next = newLink;
		}
		size++;
	}
	//add new element at a certain index
	public void add(E data, int index){
		if(isEmpty()) return;
		if(index < 0 || index > size) return;
		Link<E> cur = head;
		int i = 1;
		while(i < index){
			cur = cur.next;
			i++;
		}
		if(cur.prev == null){
			Link<E> newLink = new Link<>(null, data, cur);
			cur.prev = newLink;
			head = newLink;
		}else{
			Link<E> newLink = new Link<>(cur.prev, data, cur);
			cur.prev.next = newLink;
			cur.prev = newLink;
		}
		size++;
	}
	//remove elements from the beginning of the LinkedList
	public void removeFront(){
		if(isEmpty()) return;
		if(head.next == null){
			head = null;
			return;
		}else{
			head = head.next;
			head.prev = null;
		}
		size--;
	}
	//remove elements from the end of the LinkedList
	public void removeRear(){
		if(isEmpty()) return;
		if(head.next == null){
			head = null;
			return;
		}else{
			Link<E> cur = head;
			while(cur.next.next != null){
				cur = cur.next;
			}
			cur.next = null;
		}
		size--;
	}
	//remove element from a certain position
	public void remove(int index){
		if(isEmpty()) return;
		if(index < 1 || index > size) return;
		Link<E> cur = head;
		int i = 1;
		while(i < index){
			cur = cur.next;
			i++;
		}
		if(cur.next == null){
			cur.prev.next = null;
		}else if(cur.prev == null){
			cur = cur.next;
			cur.prev = null;
			head = cur;
		}else{
			cur.prev.next = cur.next;
			cur.next.prev = cur.prev;
		}
		size--;
	}
	//print all elements of the LinkedList
	public void printAll(){
		if(isEmpty()) return;
		Link<E> cur = head;
		while(cur != null){
			System.out.println(cur.getData());
			cur = cur.next;
		}
	}
}
