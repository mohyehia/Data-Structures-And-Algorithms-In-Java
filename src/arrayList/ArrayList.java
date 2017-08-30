package arrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E>{
	private static int capacity = 1;
	private int size = 0;
	private E[] data;
	public ArrayList(int capacity) {
		this.capacity = capacity;
		data = (E[]) new Object[capacity];
	}
	public ArrayList() {
		this(capacity);
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	@Override
	public void add(E e) {
		if(size == data.length) resize();
		data[size++] = e;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size + 1);
		if(size == data.length) resize();
		for(int j = size - 1; j >= i; j--)
			data[j + 1] = data[j];
		data[i] = e;
		size++;
	}

	@Override
	public E remove() {
		if(isEmpty()) return null;
		E temp = data[size - 1];
		data[size - 1] = null;
		size--;
		return temp;
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for(int j = i; j < size - 1; j++)
			data[j] = data[j + 1];
		data[size - 1] = null;
		size--;
		return temp;
	}

	@Override
	public Iterator<E> iterator() {
		return new ArrayIterator();
	}
	
	//private helper methods
	private void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if(i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index " + i);
	}
	private void resize() {
		E[] temp = data;
		capacity *= 2;
		data = Arrays.copyOf(temp, capacity);
	}
	
	//Iterator class
	class ArrayIterator implements Iterator<E>{
		private int j = 0;
		@Override
		public boolean hasNext() {
			return j < size;
		}

		@Override
		public E next() throws NoSuchElementException {
			if(j == size)
				throw new NoSuchElementException("No next element");
			return data[j++];
		}
		
	}
}