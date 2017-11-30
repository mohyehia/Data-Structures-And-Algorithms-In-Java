package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet<E> implements MySet<E> {
	private int capacity = 4, size = 0;
	private float loadFactorThreshold = 0.75f;
	private LinkedList<E>[] data;
	public MyHashSet() {
		data = new LinkedList[capacity];
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
	public void clear() {
		removeElements();
	}

	@Override
	public boolean contains(E e) {
		int index = hash(e.hashCode());
		if(data[index] != null) {
			for(E element : data[index])
				if(element.equals(e)) return true;
		}
		return false;
	}

	@Override
	public boolean add(E e) {
		if(contains(e)) return false;
		ensureExtraCapacity();
		int index = hash(e.hashCode());
		if(data[index] == null)
			data[index] = new LinkedList<>();
		data[index].add(e);
		size++;
		return true;
	}

	@Override
	public boolean remove(E e) {
		if(!contains(e)) return false;
		int index = hash(e.hashCode());
		if(data[index] != null) {
			for(E element : data[index]) {
				if(element.equals(e)) {
					data[index].remove(e);
					break;
				}
			}
		}
		size--;
		return true;
	}

	@Override
	public Iterator<E> iterator() {
		return new HashSetIterator(this);
	}
	
	@Override
	public String toString() {
		ArrayList<E> list = new ArrayList<>();
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < list.size() - 1; i++)
			builder.append(list.get(i) + ", ");
		if(list.size() == 0) builder.append("]");
		else builder.append(list.get(list.size() - 1) + "]");
		return builder.toString();
	}
	
	//Iterator class
	private class HashSetIterator implements Iterator<E>{
		private ArrayList<E> list;
		private int current = 0;
		private MyHashSet<E> set;
		
		public HashSetIterator(MyHashSet<E> set) {
			this.set = set;
			list = setToList();
		}
		@Override
		public boolean hasNext() {
			if(current < list.size()) return true;
			return false;
		}

		@Override
		public E next() {
			return list.get(current++);
		}
		
		public void remove() {
			set.remove(list.get(current));
			list.remove(current);
		}
		
	}
	
	//helper methods
	
	private void ensureExtraCapacity() {
		if(size >= capacity * loadFactorThreshold) {
			capacity <<= 1;
			data = Arrays.copyOf(data, capacity);
		}
	}
	
	private void removeElements() {
		for(int i = 0; i < capacity; i++)
			if(data[i] != null) data[i].clear();
		size = 0;
	}
	
	private int hash(int hashCode) {
		return supplementalHash(hashCode) & (capacity - 1);
	}

	private int supplementalHash(int hashCode) {
		hashCode ^= (hashCode >>> 20) ^ (hashCode >>> 12);
		return hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
	}
	
	private ArrayList<E> setToList(){
		ArrayList<E> list = new ArrayList<>();
		for(int i = 0; i < capacity; i++) {
			if(data[i] != null) {
				for(E e : data[i]) list.add(e);
			}
		}
		return list;
	}
	
}
