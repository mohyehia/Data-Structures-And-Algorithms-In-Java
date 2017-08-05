package tree;
public class Main {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>();
		tree.add(40);
		tree.add(20);
		tree.add(10);
		tree.add(30);
		tree.add(60);
		tree.add(50);
		tree.add(70);
		tree.add(5);
		tree.add(13);
		tree.add(55);
//		tree.remove(0);
//		tree.remove(1);
//		tree.remove(10);
		System.out.println(tree.getMin());
		System.out.println("size => " + tree.size());
		System.out.println(tree.getMax());
		//tree.preOrder();
		System.out.println(tree.contains(50));
		tree.inOrder();
		tree.remove(40);
		System.out.println();
		System.out.println("size => " + tree.size());
		tree.inOrder();
		//tree.postOrder();
		//System.out.println(tree.isEmpty());
	}
}
