package tree;
public class Node<E> {
	private E val;
	private Node<E> left, right;
	public Node(E e) {
		left = right = null;
		val = e;
	}
	public E getVal() {
		return val;
	}
	public void setVal(E val) {
		this.val = val;
	}
	public Node<E> getLeft() {
		return left;
	}
	public void setLeft(Node<E> left) {
		this.left = left;
	}
	public Node<E> getRight() {
		return right;
	}
	public void setRight(Node<E> right) {
		this.right = right;
	}
	public void visit() {
		System.out.print(this.getVal() + " ");
	}
}
