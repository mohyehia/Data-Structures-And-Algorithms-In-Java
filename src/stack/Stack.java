package stack;
public interface Stack<E> {
	public boolean isEmpty();
	public int size();
	public void push(E e);
	public E peek();
	public E pop();
}
