package sort;

import heaps.MinHeap;

public class HeapSort {
	public static void main(String[] args) {
		int[] a = {5, 3, 10, 8, 7, 6, 1};
		heapSort(a);
		for(int i : a) System.out.print(i + " ");
	}
	static void heapSort(int[] a) {
		MinHeap heap = new MinHeap();
		for(int i = 0; i < a.length; i++)
			heap.add(a[i]);
		for(int i = 0; i < a.length; i++)
			a[i] = heap.poll();
	}
}
