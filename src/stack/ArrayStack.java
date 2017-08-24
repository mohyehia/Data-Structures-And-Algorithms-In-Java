package stack;
import java.util.Arrays;
//implementing stack using array to store data
public class ArrayStack<E> implements Stack<E> {
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
	@Override
	public boolean isEmpty() {
		return top == -1;
	}
	@Override
	public int size() {
		return top + 1;
	}
	@Override
	public void push(E e) {
		if(isEmpty()) resize();
		data[++top] = e;
	}
	@Override
	public E peek() {
		return isEmpty() ? null : data[top];
	}
	@Override
	public E pop() {
		if(isEmpty()) return null;
		E e = data[top];
		data[top] = null;
		top--;
		return e;
	}
	private void resize() {
		E[] temp = data;
		capacity *= 2;
		data = Arrays.copyOf(temp, capacity);
	}
}