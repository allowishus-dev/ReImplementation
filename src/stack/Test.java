package stack;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Stack<String> stack = new Stack<String>();
		stack.push("First");
		stack.push("Node2");
		stack.push("Node3");
		stack.push("Node4");
		stack.push("Node5");
		stack.push("Last");
		
		assertEquals("Peek fail!", "Last", stack.peek());
		
		stack.pop();
		assertEquals("Peek fail!", "Node5", stack.pop());
	}

}
