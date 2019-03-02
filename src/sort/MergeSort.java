package sort;

import java.util.Arrays;

/**
 * 
 * @author mohammed
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
		int l = 0, r = 0;
		for(int i = 0; i < sortedArray.length; i++) {
			if(l < left.length && r < right.length) {
				if(left[l] < right[r])
					sortedArray[i] = left[l++];
				else sortedArray[i] = right[r++];
			}else {
				if(l == left.length) 
					sortedArray[i] = right[r++];
				else if(r == right.length)
					sortedArray[i] = left[l++];
			}
		}
		return sortedArray;
	}
}
