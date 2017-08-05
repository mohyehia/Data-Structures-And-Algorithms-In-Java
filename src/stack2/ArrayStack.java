package stack2;

import java.util.Arrays;

public class ArrayStack<E> {
	private static int capacity = 1;
	private E[] data;
	private int top = -1;
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		data = (E[]) new Object[capacity];
	}
	public ArrayStack() {
		this(capacity);
	}
	public int size(){
		return top + 1;
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public void push(E e){
		if(size() == data.length) resize();
		data[++top] = e;
	}
	public E peek(){
		return isEmpty() ? null : data[top];
	}
	public E pop(){
		if(isEmpty()) return null;
		E e = data[top];
		data[top] = null;
		top--;
		return e;
	}
	public void resize(){
		E[] temp = data;
		capacity *= 2;
		data = Arrays.copyOf(temp, capacity);
	}
}
