package deque;
public interface DequeAPI<E> {
	/**
	 * count the number of elements in list
	 * @return the number of elements in the list
	 */
	int size();
	/**
	 * check if list has zero elements or not
	 * @return true if list has zero elements & false otherwise
	 */
	boolean isEmpty();
	/**
	 * add new element at the top of the list
	 * @param data that will be added at the beginning of list
	 */
	void addFirst(E e);
	/**
	 * add new element at the end of the list
	 * @param data that will be added at the end of list
	 */
	void addLast(E e);
	/**
	 * return the first element in the list
	 * @return the first element if the list is not empty & null otherwise
	 */
	E first();
	/**
	 * return the last element in the list
	 * @return the last element if the list is not empty & null otherwise
	 */
	E last();
	/**
	 * return the first element & remove it from the list
	 * @return the first element of the list
	 */
	E removeFirst();
	/**
	 * return the last element & remove it from the list
	 * @return the last element of the list
	 */
	E removeLast();
	/**
	 * print the elements of the list
	 */
	void printAll();
}
