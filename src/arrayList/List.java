package arrayList;
import java.util.Iterator;
public interface List<E> {
	int size();
	boolean isEmpty();
	E get(int i) throws IndexOutOfBoundsException;
	E set(int i, E e) throws IndexOutOfBoundsException;
	void add(E e);
	void add(int i, E e) throws IndexOutOfBoundsException;
	E remove();
	E remove(int i) throws IndexOutOfBoundsException;
	Iterator<E> iterator();
}