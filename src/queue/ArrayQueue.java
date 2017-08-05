package queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
	private E[] data;
	private static int capacity = 1;
	private int front = 0, sz = 0;
	public ArrayQueue() {
		this(capacity);
	}
	public ArrayQueue(int c){
		data = (E[]) new Object[c];
	}
	@Override
	public int size() {
		return sz;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void enqueue(E e) {
		if(size() == data.length) grow();
		int index = (front + size()) % data.length;
		data[index] = e;
		sz++;
	}

	@Override
	public E first() {
		if(isEmpty()) return null;
		return data[front];
	}

	@Override
	public E dequeue() {
		if(isEmpty()) return null;
		E e = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		sz--;
		return e;
	}
	private void grow(){
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
