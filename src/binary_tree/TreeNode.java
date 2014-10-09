/*
Skriv en ADT som et binært træ med referencer (ikke array).

Create methods for the following.
-- Print tree in preorder
-- Print tree in inorder
-- Print tree in postorder
-- Count number of nodes in the tree.
-- Return the height of the tree
-- Return if it is balanced. (true / false)

Note: Use recursion. Send in a Node<T> as a parameter.

Write a test where you create a tree using TreeNode objects
 */

package binary_tree;

import java.awt.Point;
import java.util.ArrayList;

public class TreeNode<T> {
	TreeNode<T> left;
	TreeNode<T> right;
	T name;
	
	public TreeNode(T t) {
		name = t;
	}
	
	public void attachLeft(TreeNode<T> newNode) {
		if (left == null) {
			left = newNode;
		}
		else {
			System.out.println("Left already added");
		}
	}
	
	public void attachRight(TreeNode<T> newNode) {
		if (right == null) {
			right = newNode;
		}
		else {
			System.out.println("Left already added");
		}

	}
	
	public void printTreePreorder() {
		if (left == null) {
			System.out.println(name);
			return;
		}
		else {
			System.out.println(name);
			left.printTreePreorder();
			right.printTreePreorder();
		}
	}
	
	public void printTreePostorder() {
		if (left == null) {
			System.out.println(name);
			return;
		}
		else {
			left.printTreePostorder();
			right.printTreePostorder();
			System.out.println(name);
		}
	}
	
	public void printTreeInorder() {
		if (left == null) {
			System.out.println(name);
			return;
		}
		else {
			left.printTreeInorder();
			System.out.println(name);
			right.printTreeInorder();			
		}
	}
	
	public int countNotes() {
		return countNotes(0);		
	}
	
	protected int countNotes(int count) {
		if (left != null) {
			count = left.countNotes(count);
		}
		
		if(right != null) {
			count = right.countNotes(count);
		}
		
		count++;
		
		return count;
	}
	
	public int countHeight() {
		return countHeight(0);
	}
	
	protected int countHeight(int count) {
		if (left != null && right == null) {
			count = left.countHeight(count);
		}		
		else if(right != null && left == null) {
			count = right.countHeight(count);
		}
		else if (left != null && right != null) {
			int leftCount = left.countHeight(count);
			int rightCount = right.countHeight(count);
			
			if (leftCount >= rightCount ) {
				count = leftCount;
			}
			else {
				count = rightCount;
			}
		}
		
		count++;
		
		return count;
	}
	
	protected ArrayList<Point> calcBalanced(ArrayList<Point> p) {
		if (p==null) p = new ArrayList<Point>();
		
		if (left != null && right != null) {
			p.add(new Point(1,1));
			p = left.calcBalanced(p);
			p = right.calcBalanced(p);
		}
		else if(right != null && left == null) {
			p.add(new Point(0,1));
			p = right.calcBalanced(p);
		}
		else if (left != null && right == null) {
			p.add(new Point(1,0));
			p = left.calcBalanced(p);
		}		
		else if (left == null && right == null) {
			p.add(new Point(0,0));
		}
		
		return p;
	}
	
	public boolean isBalanced() {
		ArrayList<Point> leftP = new ArrayList<Point>();
		ArrayList<Point> rightP = new ArrayList<Point>();
		
		if (left.countHeight() == right.countHeight()) { // hvis de er lige høje
			leftP = left.calcBalanced(null);
			rightP = right.calcBalanced(null);
			
			for (Point p : leftP) {
				System.out.println(p.x + " : " + p.y);
			}
			
			System.out.println("----");
			
			for (Point p : rightP) {
				System.out.println(p.x + " : " + p.y);
			}
			System.out.println("----\n----");
			boolean b = true;
			
			for (int i=0; i < leftP.size();i++) {	
				if (!(leftP.get(i).x == rightP.get(i).y && leftP.get(i).y == rightP.get(i).x)) {
					b = false;
				}
			}
			return b;
		}
		
		// hvis der er forskellig højde
		return false;
	}
}
