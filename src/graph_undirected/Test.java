package graph_undirected;
import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		// Arrange
		Graph<String> g = new Graph<String>();
		
		String bob = "bob";
		String joe = "joe";
		String pete = "pete";
		String jane = "jane";
		String jill = "jill";
		String jeff = "jeff";
		String jenny = "jenny";
		String john = "john";
		String jasper = "jasper";
		String janet = "janet";
		String joan = "joan"; 
		String jack = "jack";
		String mark = "mark";
		String lenny = "lenny";
		
		Edge<String> e1 = new Edge<String>(bob, jeff, 3);
		Edge<String> e2 = new Edge<String>(bob, joe, 1);
		Edge<String> e3 = new Edge<String>(bob, jane, 2);
		Edge<String> e4 = new Edge<String>(joe, jane, 2);
		Edge<String> e5 = new Edge<String>(jill, jane, 1);
		Edge<String> e6 = new Edge<String>(joe, pete, 3);
		Edge<String> e7 = new Edge<String>(pete, john, 1);
		Edge<String> e8 = new Edge<String>(pete, jenny, 1);
		Edge<String> e9 = new Edge<String>(jenny, john, 2);		
		Edge<String> e10 = new Edge<String>(jenny, joan, 2);
		Edge<String> e11 = new Edge<String>(jill, jack, 1);
		Edge<String> e12 = new Edge<String>(jill, lenny, 2);
		Edge<String> e13 = new Edge<String>(jack, mark, 3);
		Edge<String> e14 = new Edge<String>(lenny, mark, 2);
		Edge<String> e15 = new Edge<String>(jasper, janet, 1);
		
		// Act
		g.addEdge(e1);
		g.addEdge(e2);
		g.addEdge(e3);		
		g.addEdge(e4);
		g.addEdge(e5);
		g.addEdge(e6);
		g.addEdge(e7);
		g.addEdge(e8);
		g.addEdge(e9);
		g.addEdge(e10);
		g.addEdge(e11);
		g.addEdge(e12);
		g.addEdge(e13);
		g.addEdge(e14);
		g.addEdge(e15);
		
		// Assert
		assertEquals(true, g.edgeExists(bob, joe));
		assertEquals(false, g.edgeExists(jill, joe));
		assertEquals(false, g.edgeExists(jane, pete));		
		assertEquals(true, g.edgeExists(jane, jill));
		assertEquals(false, g.edgeExists(jane, jasper));
		assertEquals(true, g.edgeExists(jasper, janet));
		assertEquals(false, g.edgeExists(jasper, jane));
		
		g.traverseBreadthFirst(bob);
//		g.traverseDepthFirst(bob);
	}
}
