package queue;
public interface Queue<E> {
	/**
	 * Returns the number of elements of the queue.
	 */
	int size();
	/**
	 * Tests whether the queue is empty or not.
	 * @return true if empty, otherwise false
	 */
	boolean isEmpty();
	/**
	 * Inserts new element at the rear of the queue
	 * @param e the element to be inserted
	 */
	void enqueue(E e);
	/**
	 * Returns but not removes the first element inserted in the queue
	 */
	E first();
	/**
	 * Returns and removing the first element inserted in the queue
	 */
	E dequeue();
}
