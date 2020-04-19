package bits;
public class Main {
	public static void main(String[] args) {
		int a = 15; // 0000 1111
		int b = 27; // 0001 1011
		//And Operator => &
		int and = a & b;
		System.out.println(and);
		//Or Operator => |
		int or = a | b;
		System.out.println(or);
		//XOr Operator => ^
		int xor = a ^ b;
		System.out.println(xor);
		//OneComplement Operator => ~
		int onceA = ~ a;
		int onceB = ~ b;
		System.out.println(onceA + " " + onceB);
		//Shift Left Operator => (<<)
		int leftShift = a << 2;
		System.out.println(leftShift);
		//Shift Right Operator => (>>)
		int rightShift = a >> 2;
		System.out.println(rightShift);
		//Right Shift Zero fill operator => (>>>)
		int shiftZero = a >>> 2;
		System.out.println(shiftZero);
		//Negation Operator => -
		System.out.println(-b);
	}
}
