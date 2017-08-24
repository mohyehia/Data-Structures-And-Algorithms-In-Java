package stack;
import java.util.LinkedList;
//implementing stack using linkedlist to store data
public class LinkedStack<E> implements Stack<E> {
	private LinkedList<E> list;
	public LinkedStack() {
		list = new LinkedList<>();
	}
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public int size() {
		return list.size();
	}
	@Override
	public void push(E e) {
		list.addFirst(e);
	}
	@Override
	public E peek() {
		return list.getFirst();
	}
	@Override
	public E pop() {
		return list.removeFirst();
	}
}