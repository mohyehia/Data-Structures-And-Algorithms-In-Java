package deque;
public class Main {
	public static void main(String[] args) {
		Deque<Integer> deque = new Deque<>();
		deque.addFirst(5);
		deque.addFirst(8);
		deque.addLast(10);
		deque.addFirst(1);
		deque.addLast(6);
		System.out.println("Size => " + deque.size());
		System.out.println(deque.first());
		System.out.println(deque.last());
		deque.removeLast();
		System.out.println(deque.last());
		deque.printAll();
	}
}
