package search;
//Best Case => O(1)
//Worst Case => O(log(n))
public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {3, 5, 8, 10, 12, 14, 15, 16, 23, 26};
		System.out.println(iterativeBinarySearch(a, 16));
		System.out.println(recursiveBinarySearch(a, 27));
	}
	
	//iterative binary search
	static int iterativeBinarySearch(int[] a, int target) {
		int left = 0, right = a.length - 1, mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(target == a[mid]) return mid;
			else if(target < a[mid]) right = mid - 1;
			else left = mid + 1;
		}
		return -1;
	}
	
	//recursive binary search
	static int recursiveBinarySearch(int[] a, int target) {
		return recursiveBinarySearch(a, 0, a.length - 1, target);
	}
	
	private static int recursiveBinarySearch(int[] a, int left, int right, int target) {
		int mid;
		if(left <= right) {
			mid = (left + right) / 2;
			if(target == a[mid]) return mid;
			else if(target < a[mid])
				return recursiveBinarySearch(a, left, mid - 1, target);
			else
				return recursiveBinarySearch(a, mid + 1, right, target);
		}
		return -1;
	}
}
