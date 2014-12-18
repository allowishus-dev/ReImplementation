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
		rootNode = null;
		
	}

	@Override
	public void push(T t) throws StackException {
		if (isEmpty()) {
			rootNode = new Node<T>(t);
		}
		else {
			Node<T> n = push(t, rootNode);			
		}
	}
	
	private Node<T> push(T t, Node<T> n) {
		if (n.getNextNode() == null) {
			n.setNextNode(new Node<T>(t));
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
		if (isEmpty()) {
			// stack is empty
			System.out.println("tom!");
			return null;
		}
		else if (rootNode.getNextNode()==null) {
			// if stack only contains rootNode
			T t = rootNode.getInObject();
			rootNode = null;
			return t;
		}
		
		// get last in line through recursion
		Node<T> n = peekPopRecursion(rootNode);
		T t = n.getInObject();
		n = null;
		return t; 	
	}

	@Override
	public T peek() throws StackException {
		if (isEmpty()) {
			// stack is empty
			System.out.println("tom!");
			return null;
		}
		else if (rootNode.getNextNode()==null) {
			// if stack only contains rootNode
			return rootNode.getInObject();
		}
		
		// get last in line through recursion
		return peekPopRecursion(rootNode).getInObject(); 
	}

	// recursion method for getting last node
	private Node<T> peekPopRecursion(Node<T> n){
		if (n.getNextNode() != null) {
			n = peekPopRecursion(n.getNextNode());
		}
		
		return n;		
	}
}
