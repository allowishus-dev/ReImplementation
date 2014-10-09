package search_tree;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test_delete_leaf() {
		SearchTree tree = new SearchTree();
		tree.add(60);
		tree.add(20);
		tree.add(10);
		tree.add(40);
		tree.add(30);
		tree.add(50);
		tree.add(70);
		
		assertEquals("Fail!", true, tree.contains(50));
		tree.delete(50);
		assertEquals("Fail!", false, tree.contains(50));
	}
	
	@org.junit.Test
	public void test_delete_one_left_child() {
		SearchTree tree = new SearchTree();
		tree.add(60);
		tree.add(20);
		tree.add(10);
		tree.add(40);
		tree.add(30);
		tree.add(50);
		tree.add(70);
		
		assertEquals("Fail!", true, tree.contains(50));
		tree.delete(50);
		assertEquals("Fail!", false, tree.contains(50));
		
		assertEquals("Fail!", true, tree.contains(40));
		tree.delete(40);
		assertEquals("Fail!", false, tree.contains(40));
		assertEquals("Fail!", true, tree.contains(30));
	}	
	
	@org.junit.Test
	public void test_delete_one_right_child() {
		SearchTree tree = new SearchTree();
		tree.add(60);
		tree.add(20);
		tree.add(10);
		tree.add(40);
		tree.add(30);
		tree.add(50);
		tree.add(70);
		
		assertEquals("Fail!", true, tree.contains(30));
		tree.delete(30);
		assertEquals("Fail!", false, tree.contains(30));
		
		assertEquals("Fail!", true, tree.contains(40));
		tree.delete(40);
		assertEquals("Fail!", false, tree.contains(40));
		assertEquals("Fail!", true, tree.contains(50));
	}
	
	@org.junit.Test
	public void test_delete_two_children() {
		SearchTree tree = new SearchTree();
		tree.add(60);
		tree.add(20);
		tree.add(10);
		tree.add(40);
		tree.add(30);
		tree.add(50);
		tree.add(70);

		assertEquals("Fail!", true, tree.contains(20));
		tree.delete(20);
		assertEquals("Fail!", false, tree.contains(20));
		assertEquals("Fail!", true, tree.contains(30));
		assertEquals("Fail!", true, tree.contains(40));
		assertEquals("Fail!", true, tree.contains(50));
	}
	
//	@org.junit.Test
//	public void test_delete_two_children_complex() {
//		SearchTree tree = new SearchTree();
//		tree.add(60);
//		tree.add(20);
//		tree.add(10);
//		tree.add(40);
//		tree.add(30);
//		tree.add(50);
//		tree.add(70);
//		
//		assertEquals("Fail!", true, tree.contains(50));
//		tree.delete(50);
//		assertEquals("Fail!", false, tree.contains(50));
//		
//		assertEquals("Fail!", true, tree.contains(40));
//		tree.delete(40);
//		assertEquals("Fail!", false, tree.contains(40));
//		assertEquals("Fail!", true, tree.contains(30));
//	}	

}
