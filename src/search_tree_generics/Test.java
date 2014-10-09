package search_tree_generics;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		SearchTree tree = new SearchTree();
		tree.add("Joe", 50);
		tree.add("Jeff", 20);
		tree.add("Julie", 10);
		tree.add("Jason", 40);
		tree.add("Jenny", 30);
		tree.add("Jasper", 50);
		tree.add("Jane", 70);
	}

}
