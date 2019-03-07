package doublyLinkedList;
public interface DoublyLinkedList<E> {
	/**
	 * get the number of elements in list
	 * @return the number of elements in list
	 */
	int size();
	/**
	 * check if list has zero elements or not
	 * @return true if list has zero elements & false otherwise
	 */
	boolean isEmpty();
	/**
	 * return the first element in the list
	 * @return head data if the list is not empty & null otherwise
	 */
	E first();
	/**
	 * return the last element in the list
	 * @return tail data if the list is not empty & null otherwise
	 */
	E last();
	/**
	 * add new element as a head for the list
	 * @param data that will be added at the beginning of list
	 */
	void addFirst(E data);
	/**
	 * add new element as a tail for the list
	 * @param data that will be added at the end of list
	 */
	void addLast(E data);
	/**
	 * return the first element & remove it from the list
	 * @return the first element (element after the head)
	 */
	E removeFirst();
	/**
	 * return the last element & remove it from the list
	 * @return the last element (element before tha tail)
	 */
	E removeLast();
	/**
	 * print the elements of the list
	 */
	void print();
}
