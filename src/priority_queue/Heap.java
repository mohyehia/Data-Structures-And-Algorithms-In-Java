package priority_queue;

import java.util.Arrays;

public class Heap<E extends Comparable<E>> {
	private static int capacity = 8;
	private int size = 0;
	private E[] data;
	public Heap(int capacity) {
		this.capacity = capacity;
		data = (E[]) new Object[capacity];
	}
	public Heap() {
		this(capacity);
	}
	
	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}
	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}
	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}
	
	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}
	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}
	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}
	
	private E leftChild(int parentIndex) {
		return data[getLeftChildIndex(parentIndex)];
	}
	private E rightChild(int parentIndex) {
		return data[getRightChildIndex(parentIndex)];
	}
	private E parent(int childIndex) {
		return data[getParentIndex(childIndex)];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(E e) {
		ensureExtraCapacity();
		data[size] = e;
		size++;
		heapifyUp();
	}
	
	public E peek() {
		return size == 0 ? null : data[0];
	}
	
	public E poll() {
		if(size == 0) return null;
		E e = data[0];
		data[0] = data[size - 1];
		size--;
		heapifyDown();
		return e;
	}
	
	private void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index).compareTo(leftChild(index)) > 0)
				smallerChildIndex = getRightChildIndex(index);
			if(data[index].compareTo(data[smallerChildIndex]) <= 0) break;
			else swap(index, smallerChildIndex);
			index = smallerChildIndex;
		}
	}
	
	private void heapifyUp() {
		int index = size - 1;
		int comp = parent(index).compareTo(data[index]);
		while(hasParent(index) && comp == 1) {
			swap(index, getParentIndex(index));
			index = getParentIndex(index);
		}
	}
	
	private void swap(int i, int j) {
		E temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private void ensureExtraCapacity() {
		if(size == capacity) {
			capacity *= 2;
			data = Arrays.copyOf(data, capacity);
		}
	}
}
