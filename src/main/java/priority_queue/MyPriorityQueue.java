package priority_queue;
public class MyPriorityQueue<E extends Comparable<E>> {
	Heap<E> heap = new Heap<>();
	
	//get size of the priority queue
	public int size() {
		return heap.size();
	}
	
	//check if priority queue is empty
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
	//add new element to the priority queue
	public void enqueue(E e) {
		heap.add(e);
	}
	
	//return minimum element in priority queue
	public E min() {
		return heap.peek();
	}
	
	//remove the element with the highest priority
	public E dequeue() {
		return heap.poll();
	}
}
