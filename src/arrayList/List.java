package arrayList;
import java.util.Iterator;
public interface List<E> {
	/** Returns the number of elements in this list. */
	int size();
	/** Returns whether the list is empty. */
	boolean isEmpty();
	/** Returns (but does not remove) the element at index i. */
	E get(int i) throws IndexOutOfBoundsException;
	/** Replaces the element at index i with e, and returns the replaced element. */
	E set(int i, E e) throws IndexOutOfBoundsException;
	/** Inserts element e at the end of the list. */
	void add(E e);
	/** Inserts element e to be at index i, shifting all subsequent elements later. */
	void add(int i, E e) throws IndexOutOfBoundsException;
	/** Removes and returns the last inserted element to the list. */
	E remove();
	/** Removes and returns the element at index i, shifting subsequent elements earlier. */
	E remove(int i) throws IndexOutOfBoundsException;
	/** Returns an iterator of the elements in the list. */
	Iterator<E> iterator();
}