package queue;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E>{
	private LinkedList<E> list;
	public LinkedQueue() {
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
	public void enqueue(E e) {
		list.addLast(e);
	}

	@Override
	public E first() {
		return list.getFirst();
	}

	@Override
	public E dequeue() {
		return list.removeFirst();
	}
	
}
