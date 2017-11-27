package sort;

//Best Case => O(n^2)
//Worst Case => O(n^2)

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {5, 8, 4, 1, 9, 12, 15, 3, 6};
		selectionSort(a);
		for(int i : a){
			System.out.println(i);
		}
	}
	static void selectionSort(int[] a) {
		int min = 0, len = a.length;
		for(int i = 0; i < len - 1; i++) {
			min = i;
			for(int j = i + 1; j < len; j++)
				if(a[min] > a[j]) min = j;
			swap(a, i, min);
		}
	}
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
