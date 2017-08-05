package doublyLinkedList;
public class Main {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.addRear("Mohammed");
		list.addRear("Ahmed");
		list.addRear("Yehia");
		list.printAll();
		System.out.println("--------------");
//		list.removeRear();
		list.remove(3);
		list.printAll();
	}
}
