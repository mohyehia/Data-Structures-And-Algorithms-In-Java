package queue;
import java.util.Arrays;
//implement queue using an array to store data
public class ArrayQueue<E> implements Queue<E>{
	private static int capacity = 1;
	private E[] data;
	private int front = 0, size = 0;
	public ArrayQueue() {
		this(capacity);
	}
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		data = (E[]) new Object[capacity];
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(E e) {
		if(size == data.length) resize();
		int index = (front + size) % data.length;
		data[index] = e;
		size++;
	}

	@Override
	public E first() {
		return isEmpty() ? null : data[front];
	}

	@Override
	public E dequeue() {
		if(isEmpty()) return null;
		E e = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size--;
		return e;
	}
	
	private void resize() {
		E[] temp = data;
		capacity *= 2;
		data = Arrays.copyOf(temp, capacity);
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayQueue<>();
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