package sort;
/**
 * time complexity => O(nlog(n))
 * space complexity => O(1)
 * @author mohammed
 *
 */
public class QuickSort {
	static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	private static void quickSort(int[] a, int left, int right) {
		if(left >= right) return;
		int pivot = a[(left + right) / 2];
		int index = partition(a, left, right, pivot);
		quickSort(a, left, index - 1);
		quickSort(a, index, right);
	}

	private static int partition(int[] a, int left, int right, int pivot) {
		while(left <= right) {
			while(a[left] < pivot) left++;
			while(a[right] > pivot) right--;
			if(left <= right) {
				swap(a, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = {10, 9, 6, 8, 5, 7, 1, 2, 4, 3};
		quickSort(a);
		for(int i : a) System.out.println(i);
	}
	
}
