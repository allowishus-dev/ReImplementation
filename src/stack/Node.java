package stack;

public class Node<T> {
	private T inObject;
	private Node<T> nextNode;
	
	public Node(T t) {
		setInObject(t);
	}

	public T getInObject() {
		return inObject;
	}

	public void setInObject(T inObject) {
		this.inObject = inObject;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}