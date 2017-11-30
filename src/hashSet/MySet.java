package hashSet;

import java.util.Iterator;

public interface MySet<E> extends Iterable<E> {
	/**
	 * 
	 * @return number of entries in this map
	 */
	int size();
	/**
	 * 
	 * @return true if this map doesn't contain any entries
	 */
	boolean isEmpty();
	/**
	 * Remove all elements from this set
	 */
	void clear();
	/**
	 * Return true if the element is in the set
	 * @param e
	 * @return
	 */
	boolean contains(E e);
	/**
	 * Add an element to the set
	 * @param e
	 * @return
	 */
	boolean add(E e);
	/**
	 * Remove the element from the set
	 * @param e
	 * @return
	 */
	boolean remove(E e);
	/**
	 * Return an iterator for the elements in this set
	 */
	Iterator<E> iterator();
}
