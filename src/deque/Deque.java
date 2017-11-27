package deque;

import java.util.Iterator;
import java.util.LinkedList;

public class Deque<E> implements DequeAPI<E> {
	private LinkedList<E> list;
	public Deque() {
		list = new LinkedList<>();
	}
	@Override
	public int size() {
		return list.size();
	}
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public void addFirst(E e) {
		list.addFirst(e);
	}
	@Override
	public void addLast(E e) {
		list.addLast(e);
	}
	@Override
	public E first() {
		return list.getFirst();
	}
	@Override
	public E last() {
		return list.getLast();
	}
	@Override
	public E removeFirst() {
		return list.removeFirst();
	}
	@Override
	public E removeLast() {
		return list.removeLast();
	}
	@Override
	public void printAll() {
		Iterator<E> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
