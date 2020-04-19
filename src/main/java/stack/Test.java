package stack;
public class Test {
	public static void main(String[] args) {
		Stack<Integer> st = new ArrayStack<>();
		st.push(5);
		st.push(6);
		st.push(7);
		System.out.println(st.peek());
		System.out.println("size = " + st.size());
	}
}
