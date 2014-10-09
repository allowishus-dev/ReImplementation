package search_tree;

public class SearchTree {
	SearchTreeNode overallRoot;
	
	public SearchTree() {

	}
	
	public boolean contains(int value) {
		return contains(overallRoot, value);		
	}
	
	private boolean contains(SearchTreeNode node, int value) {
		if (node == null) {
//			System.out.println(value + " : Isn't in tree!");
			return false;
		}
		if (node.value == value) {
			return true;
		}
		else {
			// hvis mindre left hvis højere right
			if (value < node.value) {
				return contains(node.left, value);
			}
			else if (value > node.value) {
				return contains(node.right, value);
			}
			else {
				// kommer aldrig her til
				System.out.println(value + " : Isn't in tree!!!!!!!");
				return false;
			}
		}
	}
	
	public void add(int value) {
		// add first node in tree via other add method
		overallRoot = add(overallRoot, value);
	}
	
	private SearchTreeNode add(SearchTreeNode node, int value) {
		if (node == null) {
			node = new SearchTreeNode(value);
		}
		else {
			// hvis mindre left hvis højere right
			if (value < node.value) {
				if (node.left == null) {
					node.left = new SearchTreeNode(value);
					return node;
				}
				else {
					add(node.left, value);
					return node;
				}
			}
			else if (value > node.value) {
				if (node.right == null) {
					node.right = new SearchTreeNode(value);
					return node;
				}
				else {
					add(node.right, value);
					return node;
				}
			}
			else {
				// shouldn't run unless you're a dumbass!
				System.out.println(value + " : Already exists!");
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
		else if (node.value == value) {
//			System.out.println(node.value + " : Found it!");
			
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
				int i = getLeft(node.right).value;
				delete(i);
				node.value = i;
			}
			
		}
		else {
			// hvis mindre left hvis højere right
			if (value < node.value) {
				node.left = delete(node.left, value);
			}
			else if (value > node.value) {
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

