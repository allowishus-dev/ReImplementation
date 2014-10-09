package binary_tree;

public class Recursion {
	
	public static void main(String[] args) {
		x(5);
	}

	
	public static void x(int number) {
		if (number == 0) {
			System.out.println("\n!\n");
			return;
		}
		else {
			System.out.println(number); // counts down
			x(number-1);
			System.out.println(number); // counts up through recursion
		}
	}
}
