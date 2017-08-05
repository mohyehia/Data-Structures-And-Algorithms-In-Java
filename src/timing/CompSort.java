package timing;
import java.util.Random;
public class CompSort {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		Random random = new Random();
		for(int i = 0; i < 100000; i++){
			arr[i] = random.nextInt(200000);
		}
		System.out.println("done");
		long startTime = System.nanoTime();
		insertionSort(arr);
		long endTime = System.nanoTime();
		double time = (endTime - startTime) / 1E9;
		System.out.println(time);
	}
	static void selectionSort(int[] arr){
		int len = arr.length;
		int min = 0;
		for(int i = 0; i < len - 1; i++){
			min = i;
			for(int j = i + 1; j < len; j++){
				if(arr[min] > arr[j]) min = j;
			}
			swap(arr, min, i);
		}
	}
	static void insertionSort(int[] arr){
		int len = arr.length;
		for(int i = 1; i < len; i++){
			for(int j = i; j > 0; j--){
				if(arr[j] < arr[j - 1]) swap(arr, j, j - 1);
			}
		}
	}
	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
