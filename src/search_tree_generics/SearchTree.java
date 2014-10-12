package search_tree_generics;

public class SearchTree<T> {
	SearchTreeNode<T> overallRoot;
	
	public boolean contains(int value) {
		return contains(overallRoot, value);		
	}
	
	private boolean contains(SearchTreeNode node, int value) {
		if (node == null) {
//			System.out.println(value + " : Isn't in tree!");
			return false;
		}
		if (node.key == value) {
			return true;
		}
		else {
			// hvis mindre left hvis højere right
			if (value < node.key) {
				return contains(node.left, value);
			}
			else if (value > node.key) {
				return contains(node.right, value);
			}
			else {
				// kommer aldrig her til
				System.out.println(value + " : Isn't in tree!!!!!!!");
				return false;
			}
		}
	}
	
	public void add(T t, int key) {
		// add first node in tree via other add method
		overallRoot = add(overallRoot, t, key);
	}
	
	private SearchTreeNode<T> add(SearchTreeNode node, T t, int key) {
		if (node == null) {
			node = new SearchTreeNode(t, key);
		}
		else {
			// hvis mindre left hvis højere right
			if (node.compareTo(key) < 0) {
				if (node.left == null) {
					node.left = new SearchTreeNode(t, key);
					return node;
				}
				else {
					add(node.left, t, key);
					return node;
				}
			}
			else if (node.compareTo(key) > 0) {
				if (node.right == null) {
					node.right = new SearchTreeNode(t, key);
					return node;
				}
				else {
					add(node.right, t, key);
					return node;
				}
			}
			else {
				// shouldn't run unless you're a dumbass!
				System.out.println(t.toString() + " : Already exists!");
			}
		}
		
		return node;
	}
	
	public void delete(int value) {
		overallRoot = delete(overallRoot, value);
	}
	
	private SearchTreeNode delete(SearchTreeNode node, int value) {
		if (node == null) {
			System.out.println(value + " : Isn't in tree!");
		}
		else if (node.key == value) {
//			System.out.println(node.key + " : Found it!");
			
			if (node.left == null && node.right == null) {
				// leaf node
				node = null;
			}
			else if (node.left != null && node.right == null) {
				// et barn (left)
				SearchTreeNode tempNode = node.left;
				node = tempNode;
			}
			else if (node.left == null && node.right != null) {
				// et barn (right)
				SearchTreeNode tempNode = node.right;
				node = tempNode;
			}
			else {
				// 2 børn
				SearchTreeNode<T> n = getLeft(node.right);
				int tempKey = n.key;
				T tempT = n.t; 
				delete(tempKey);
				node.key = tempKey;
				node.t = tempT;
			}			
		}
		else {
			// hvis mindre left hvis højere right
			if (value < node.key) {
				node.left = delete(node.left, value);
			}
			else if (value > node.key) {
				node.right = delete(node.right, value);
			}
		}
		
		return node;
	}
	
	private SearchTreeNode getLeft(SearchTreeNode node) {
		if (node.left != null) {
			node = getLeft(node.left);
		}
		
		return node;		
	}

}
