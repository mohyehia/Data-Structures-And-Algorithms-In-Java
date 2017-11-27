package heaps;
public class Main {
	public static void main(String[] args) {
		
		Heap<Integer> heap = new Heap<>();
		heap.add(17);
		heap.add(20);
		heap.add(10);
		heap.add(25);
		heap.add(15);
		System.out.println(heap.peek());
		heap.print();
	}
}
