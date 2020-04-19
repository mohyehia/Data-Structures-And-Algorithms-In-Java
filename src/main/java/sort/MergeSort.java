package sort;

import java.util.Arrays;

/**
 * 
 * time complexity => O(nlog(n))
 * space complexity => O(n)
 *
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] a = {2, 5, 3, 1, 8, 6, 4, 0};
		a = mergeSort(a);
		for (int i : a) System.out.println(i);
	}
	
	//divide array method
	static int[] mergeSort(int[] a) {
		int len = a.length;
		if(len <= 1) return a;
		int mid = len / 2;
		int[] left = Arrays.copyOfRange(a, 0, mid);
		int[] right = Arrays.copyOfRange(a, mid, len);
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}
	
	//merge the arrays elements in a sorted way
	private static int[] merge(int[] left, int[] right) {
		int[] sortedArray = new int[left.length + right.length];
		int lIndex = 0, rIndex = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			if(lIndex < left.length && rIndex < right.length) {
				if(left[lIndex] < right[rIndex])
					sortedArray[i] = left[lIndex++];
				else sortedArray[i] = right[rIndex++];
			}else {
				if(lIndex == left.length)
					sortedArray[i] = right[rIndex++];
				else if(rIndex == right.length)
					sortedArray[i] = left[lIndex++];
			}
		}
		return sortedArray;
	}
}
