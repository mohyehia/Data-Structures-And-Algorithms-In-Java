package search;

//Best Case => O(1)
//Worst Case => O(log(n))

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {3, 5, 8, 10, 12, 14, 15, 16, 23, 26};
		//System.out.println(iterativeBinarySearch(a, 8));
		System.out.println(recursiveBinarySearch(a, 0, a.length - 1, 5));
	}
	static int iterativeBinarySearch(int[] a, int num){
		int left = 0, right = a.length - 1, mid = 0;
		while(left <= right){
			mid = (left + right) / 2;
			if(num == a[mid]) return mid;
			else if(num < a[mid]) right = mid - 1;
			else left = mid + 1;
		}
		return -1;
	}
	static int recursiveBinarySearch(int[] a, int left, int right, int num){
		int mid = 0;
		if(left <= right){
			mid = (left + right) / 2;
			if(num == a[mid]) return mid;
			else if(num < a[mid]) return recursiveBinarySearch(a, left, mid - 1, num);
			else return recursiveBinarySearch(a, mid + 1, right, num);
		}
		return -1;
	}
}
