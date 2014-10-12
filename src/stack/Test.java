package stack;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Stack stack = new Stack();
		stack.push("First");
		stack.push("Node");
		stack.push("Node");
		stack.push("Node");
		stack.push("Node");
		stack.push("Last");
	}

}
