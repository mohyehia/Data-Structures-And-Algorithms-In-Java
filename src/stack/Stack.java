package stack;
public interface Stack<E> {
	/**
	 * Returns the number of elements of the stack.
	 * @return number of elements of the stack
	 */
	int size();
	/**
	 * Tests whether the stack is empty.
	 * @return true if stack is empty, false otherwise
	 */
	boolean isEmpty();
	/**
	 * Inserts an element at the top of the stack.
	 * @param e the element to be inserted
	 */
	void push(E e);
	/**
	 * Returns the element at the top of the stack without removing it.
	 * @return top element in the stack (or null if empty)
	 */
	E peek();
	/**
	 * Removes and returns the top element of the stack.
	 * @return element removed (or null if empty)
	 */
	E pop();
}
