package queue;
import java.util.LinkedList;
public class LinkedQueue<E> implements Queue<E> {
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
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedQueue<>();
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
	}
}
