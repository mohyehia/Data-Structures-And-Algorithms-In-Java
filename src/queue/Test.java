package queue;
public class Test {
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayQueue<>();
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
	}
}
