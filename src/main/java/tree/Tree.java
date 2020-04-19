package tree;
public class Tree<E extends Comparable<E>> {
	Node<E> root;
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
	/*
	add new value at its proper position
	time complexity => O(log(N))
	 */
	public void add(E e){
		Node<E> node = new Node<>(e);
		if(root == null) root = node;
		else add(root, node);
	}
	//helper method to add new node
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
	/*
	return the minimum value of tree
	time complexity => O(log(N))
	 */
	public E getMin(){
		return getMin(root);
	}
	private E getMin(Node<E> node){
		if(isEmpty()) return null;
		Node<E> curr = node;
		while(curr.getLeft() != null) curr = curr.getLeft();
		return curr.getVal();
	}
	/*
	return the maximum value of tree
	time complexity => O(log(N))
	 */
	public E getMax(){
		return getMax(root);
	}
	private E getMax(Node<E> node){
		if(isEmpty()) return null;
		Node<E> curr = node;
		while(curr.getRight() != null) curr = curr.getRight();
		return curr.getVal();
	}
	/*
	check if a certain value exists in the tree
	time complexity => O(log(N))
	 */
	public boolean contains(E e){
		Node<E> curr = root;
		int comp;
		while(curr != null){
			comp = curr.getVal().compareTo(e);
			if(comp > 0) curr = curr.getLeft();
			else if(comp < 0) curr = curr.getRight();
			else return true;
		}
		return false;
	}
	/*
	remove a value from the tree
	time complexity => O(log(N))
	 */
	public Node<E> remove(E e){
		return remove(root, e);
	}
	private Node<E> remove(Node<E> root, E e){
		if(root == null) return null;
		int comp = root.getVal().compareTo(e);
		if(comp > 0)
			root.setLeft(remove(root.getLeft(), e));
		else if(comp < 0)
			root.setRight(remove(root.getRight(), e));
		else{
			if(root.getLeft() != null && root.getRight() != null){
				root.setVal(getMin(root.getRight()));
				remove(root.getRight(), root.getVal());
			}else if(root.getLeft() != null)
				root = root.getLeft();
			else if(root.getRight() != null)
				root = root.getRight();
			else root = null;
		}
		size--;
		return root;
	}
	/*
	PreOrder Traversal
	time complexity => O(N)
	 */
	public void preOrder(){
		preOrder(root);
	}
	//helper method for the preOrder traversal
	private void preOrder(Node<E> node){
		if(node != null){
			node.visit();
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	/*
	PostOrder Traversal
	time complexity => O(N)
	 */
	public void postOrder(){
		postOrder(root);
	}
	//helper method for the postOrder traversal
	private void postOrder(Node<E> node){
		if(node != null){
			postOrder(node.getLeft());
			postOrder(node.getRight());
			node.visit();
		}
	}
	/*
	InOrder Traversal
	time complexity => O(N)
	 */
	public void inOrder(){
		inOrder(root);
	}
	//helper method for the inOrder traversal
	private void inOrder(Node<E> node){
		if(node != null){
			inOrder(node.getLeft());
			node.visit();
			inOrder(node.getRight());
		}
	}
}
