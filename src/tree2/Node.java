package tree2;
public class Node<E>{
	private E val;
	private Node<E> left, right;
	public Node(E e) {
		val = e;
	}
	public E getVal(){
		return val;
	}
	public void setVal(E e){
		val = e;
	}
	public Node<E> getLeft(){
		return left;
	}
	public void setLeft(Node<E> node){
		left = node;
	}
	public Node<E> getRight(){
		return right;
	}
	public void setRight(Node<E> node){
		right = node;
	}
	public void visit(){
		System.out.print(this.val + " ");
	}
}