package tree2;
public class Tree<E extends Comparable<E>>{
	private Node<E> root;
	private int size;
	public Tree() {
		root = null;
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return root == null;
	}
	//add new node to the tree
	public void add(E e){
		Node<E> node = new Node<>(e);
		if(root == null) root = node;
		else add(root, node);
	}
	private void add(Node<E> root, Node<E> node){
		int comp = root.getVal().compareTo(node.getVal());
		if(comp > 0){
			if(root.getLeft() == null){
				root.setLeft(node);
				return;
			}else add(root.getLeft(), node);
		}else if(comp < 0){
			if(root.getRight() == null){
				root.setRight(node);
				return;
			}else add(root.getRight(), node);
		}
		size++;
	}
	//return the minimum element of the tree
	public E getMin(){
		return getMin(root);
	}
	private E getMin(Node<E> node){
		if(root == null) return null;
		Node<E> curr = node;
		while(curr.getLeft() != null) curr = curr.getLeft();
		return curr.getVal();
	}
	//return the maximum element of the tree
	public E getMax(){
		return getMax(root);
	}
	private E getMax(Node<E> node){
		if(root == null) return null;
		Node<E> curr = node;
		while(curr.getRight() != null) curr = curr.getRight();
		return curr.getVal();
	}
	//search for an element in the tree
	public boolean contains(E e){
		Node<E> curr = root;
		int comp = 0;
		while(curr != null){
			comp = curr.getVal().compareTo(e);
			if(comp > 0) curr = curr.getLeft();
			else if(comp < 0) curr = curr.getRight();
			else return true;
		}
		return false;
	}
	//postOrder traversal
	public void postOrder(){
		postOrder(root);
	}
	private void postOrder(Node<E> node){
		if(node != null){
			postOrder(node.getLeft());
			postOrder(node.getRight());
			node.visit();
		}
	}
	//preOrder traversal
	public void preOrder(){
		preOrder(root);
	}
	private void preOrder(Node<E> node){
		if(node != null){
			node.visit();
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	//inOrder traversal
	public void inOrder(){
		inOrder(root);
	}
	private void inOrder(Node<E> node){
		if(node != null){
			inOrder(node.getLeft());
			node.visit();
			inOrder(node.getRight());
		}
	}
}