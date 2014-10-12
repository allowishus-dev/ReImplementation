package stack;

public class Stack<T> implements IStack<T>{
	private Node<T> rootNode;
	
	@Override
	public boolean isEmpty() {
		if (rootNode == null) return true;
		return false;
	}

	@Override
	public void popAll() {
		// deletes stack
		
	}

	@Override
	public void push(T t) throws StackException {
		if (isEmpty()) {
			rootNode = new Node(t);
		}
		else {
			Node n = push(t, rootNode);
			
			System.out.println(n.getInObject());
		}
	}
	
	private Node push(T t, Node n) {
		if (n == null) {
			n.setInObject(t);
			return n;
		}
		else {
			n = push(t, n.getNextNode());
		}
		
		return n;		
	}

	@Override
	public T pop() throws StackException {
		// read from front of stack and deletes
		return null;
	}

	@Override
	public T peek() throws StackException {
		// read from front of stack
		return null;
	}
}
