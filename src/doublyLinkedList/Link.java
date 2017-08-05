package doublyLinkedList;
public class Link<E> {
	public Link<E> next, prev;
	private E data;
	public Link(E data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public Link(Link<E> prev, E data, Link<E> next){
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	public E getData(){
		return this.data;
	}
}
