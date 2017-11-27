package deque;
public interface DequeAPI<E> {
	int size();
	boolean isEmpty();
	void addFirst(E e);
	void addLast(E e);
	E first();
	E last();
	E removeFirst();
	E removeLast();
	void printAll();
}
