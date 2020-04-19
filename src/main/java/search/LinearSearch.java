package search;

//Best Case => O(1)
//Worst Case => O(n)

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {5, 8, 4, 1, 9, 12, 15, 3, 6};
		System.out.println(linearSearch(a, 15));
	}
	static int linearSearch(int[] a, int num){
		for(int i = 0; i < a.length; i++){
			if(num == a[i]) return i;
		}
		return -1;
	}
}
