package heaps;

import java.util.Arrays;

public class MaxHeap {
	private int capacity = 8;
	private int size = 0;
	int[] data = new int[capacity];
	
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
	
	private int leftChild(int index) {
		return data[getLeftChildIndex(index)];
	}
	private int rightChild(int index) {
		return data[getRightChildIndex(index)];
	}
	private int parent(int index) {
		return data[getParentIndex(index)];
	}
	
	//get number of elements of heap
	public int size() {
		return size;
	}
	
	//check if heap has no elements
	public boolean isEmpty() {
		return size == 0;
	}
	
	private void swap(int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private void ensureExtraCapacity() {
		if(size == capacity) {
			capacity *= 2;
			data = Arrays.copyOf(data, capacity);
		}
	}
	
	//add new element to the heap
	public void add(int value) {
		ensureExtraCapacity();
		data[size] = value;
		size++;
		heapifyUp(); //shift elements up
	}
	
	//return the root element (minimum element)
	public int peek() {
		if(size == 0) throw new IllegalStateException();
		return data[0];
	}
	
	//return and remove the root
	public int poll() {
		if(size == 0) throw new IllegalStateException();
		int value = data[0];
		data[0] = data[size - 1];
		size--;
		heapifyDown(); //shift elements down
		return value;
	}
	
	private void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && parent(index) < data[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	
	private void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int greaterChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index) > leftChild(index))
				greaterChildIndex = getRightChildIndex(index);
			if(data[index] > data[greaterChildIndex]) break;
			else swap(index, greaterChildIndex);
			index = greaterChildIndex;
		}
	}
	
	public void print() {
		for(int i = 0; i < size; i++)
			System.out.print(data[i] + " ");
	}
}
