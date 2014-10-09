package binary_tree;

import static org.junit.Assert.*;

public class Test {

//	@org.junit.Test
//	public void test_unbalanced() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node3);
//		node2.attachRight(node4);
//		node4.attachLeft(node5);
//		node4.attachRight(node6);
//		node3.attachLeft(node9);
//		node3.attachRight(node8);
//		node6.attachRight(node10);
//		
////		node1.printTreePreorder();
////		node1.printTreePostorder();
////		node1.printTreeInorder();
////		System.out.println(node1.countNotes());
////		System.out.println(node1.countHeight());
//		assertEquals("Balanced scenario 1 fail!", false, node1.isBalanced());
//	}
	
//	@org.junit.Test
//	public void test_balanced() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node3);
//		node2.attachRight(node4);
//		node7.attachLeft(node5);
//		node7.attachRight(node6);
////		node3.attachLeft(node9);
////		node3.attachRight(node8);
////		node6.attachRight(node10);
//		
////		node1.printTreePreorder();
////		node1.printTreePostorder();
////		node1.printTreeInorder();
////		System.out.println(node1.countNotes());
////		System.out.println(node1.countHeight());
//		assertEquals("Balanced scenario 2 fail!", true, node1.isBalanced());
//	}
	
//	@org.junit.Test
//	public void test_unbalanced2() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node3);
//		node7.attachLeft(node4);
//		node7.attachRight(node6);
//		/*
//		 1,0
//		 0,0
//		 ---
//		 1,1
//		 0,0
//		 0,0		 
//		*/
//		assertEquals("Balanced scenario 3 fail!", false, node1.isBalanced());
//	}
//	
//	@org.junit.Test
//	public void test_balanced3() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachRight(node4);
//		node7.attachLeft(node5);
//		/*
//		 0,1
//		 0,0
//		 ---
//		 1,0
//		 0,0
//		 */
//		assertEquals("Balanced scenario 4 fail!", true, node1.isBalanced());
//	}
//	
//	@org.junit.Test
//	public void test_balanced4() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node4);
//		node7.attachRight(node5);
//		/*
//		 1,0
//		 0,0
//		 ---
//		 0,1
//		 0,0
//		 */
//		assertEquals("Balanced scenario 5 fail!", true, node1.isBalanced());
//	}
//	
//	@org.junit.Test
//	public void test_unbalanced3() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachRight(node4);
//		node7.attachRight(node5);
//		/*
//		 0,1
//		 0,0
//		 ---
//		 0,1
//		 0,0
//		 */
//		assertEquals("Balanced scenario 6 fail!", false, node1.isBalanced());
//	}
//	
//	@org.junit.Test
//	public void test_unbalanced4() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node4);
//		node7.attachLeft(node5);
//		/*
//		 1,0
//		 0,0
//		 ---
//		 1,0
//		 0,0
//		 */
//		assertEquals("Balanced scenario 7 fail!", false, node1.isBalanced());
//	}
//	
//	@org.junit.Test
//	public void test_balanced5() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node4);
//		node2.attachRight(node6);
//		node7.attachLeft(node8);
//		node7.attachRight(node5);
//		/*
//		 1,1
//		 1,1
//		 ---
//		 1,1
//		 1,1		 
//		 */
//		
//		assertEquals("Balanced scenario 8 fail!", true, node1.isBalanced());
//	}
	
//	@org.junit.Test
//	public void test_unbalanced5() {
//		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
//		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
//		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
//		TreeNode<Integer> node11 = new TreeNode<Integer>(110);
//		
//		node1.attachLeft(node2);
//		node1.attachRight(node7);
//		node2.attachLeft(node3);
//		node2.attachRight(node4);
//		node7.attachLeft(node5);
//		node7.attachRight(node6);
//		node3.attachLeft(node8);
//		node3.attachRight(node9);
//		node5.attachLeft(node10);
//		node5.attachRight(node11);
//		/*
//		 1,1
//		 1,1
//		 ---
//		 1,1
//		 1,1		 
//		 */
//		
//		assertEquals("Balanced scenario 9 fail!", false, node1.isBalanced());
//	}
	
	@org.junit.Test
	public void test_unbalanced6() {
		TreeNode<Integer> node1 = new TreeNode<Integer>(60);
		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
		TreeNode<Integer> node3 = new TreeNode<Integer>(10);
		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
		TreeNode<Integer> node5 = new TreeNode<Integer>(30);
		TreeNode<Integer> node6 = new TreeNode<Integer>(50);
		TreeNode<Integer> node7 = new TreeNode<Integer>(70);
		TreeNode<Integer> node8 = new TreeNode<Integer>(80);
		TreeNode<Integer> node9 = new TreeNode<Integer>(90);
		TreeNode<Integer> node10 = new TreeNode<Integer>(100);
		TreeNode<Integer> node11 = new TreeNode<Integer>(110);
		
		node1.attachLeft(node2);
		node1.attachRight(node7);
		node2.attachLeft(node3);
		node2.attachRight(node4);
		node7.attachLeft(node5);
		node7.attachRight(node6);
		node3.attachLeft(node8);
		node3.attachRight(node9);
		node6.attachLeft(node10);
		node6.attachRight(node11);
		/*
		 1,1
		 1,1
		 ---
		 1,1
		 1,1		 
		 */
		
		assertEquals("Balanced scenario 10 fail!", true, node1.isBalanced());
	}
	
	
}
