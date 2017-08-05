package sort;

//Best Case => O(n)
//Worst Case => O(n^2) when the elements in reverse order => [3, 2, 1]

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
		insertionSort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}
	static void insertionSort(int[] a){
		int len = a.length;
		for(int i = 1; i < len; i++){
			for(int j = i; j > 0; j--){
				if(a[j - 1] > a[j]) swap(a, j, j - 1);
			}
		}
	}
	static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
