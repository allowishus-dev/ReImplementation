package search_tree_generics;

public class SearchTreeNode<T> implements Comparable {
	int key;
	T t;
	
	SearchTreeNode<T> left;
	SearchTreeNode<T> right;
	
	public SearchTreeNode(T t, int key) {
		this.t = t;
		this.key = key;
	}

	@Override
	public int compareTo(Object o) {
		
		if ((int) o < this.key) {
			return -1;
		}
		else if ((int) o > this.key) {
			return 1;
		}
		return 0;
	}
}