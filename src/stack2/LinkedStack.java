package stack2;
import java.util.LinkedList;
public class LinkedStack<E> {
	private LinkedList<E> list;
	public LinkedStack() {
		list = new LinkedList<>();
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public void push(E e){
		list.addFirst(e);
	}
	public E peek(){
		return list.getFirst();
	}
	public E pop(){
		return list.removeFirst();
	}
}
