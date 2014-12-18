package graph_undirected;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
// undirected weighted graph

public class Graph<T> {
	
	HashMap<T, HashMap<T, Integer>> graph = new HashMap<T, HashMap<T, Integer>>();
	Traverse<T> s = new Traverse<T>(this);
	
	public void traverseBreadthFirst(T startVertex) {
		s.traverseBreadthFirst(startVertex);
	}
	
	public void traverseDepthFirst(T startVertex) {
		s.traverseDepthFirst(startVertex);
	}
	
	public void addEdge(Edge<T> edge) {
		T fromVertex = edge.fromVertex;
		T toVertex = edge.toVertex;
		Integer weight = edge.weight;
		addEdge(fromVertex, toVertex, weight);		
	}
	
	private void addEdge(T fromVertex, T toVertex, Integer weight) {
		HashMap<T, Integer> fromMap;
		HashMap<T, Integer> toMap;
		
		if (graph.containsKey(fromVertex)) {
			fromMap = graph.get(fromVertex);
		}
		else {
			fromMap = new HashMap<T, Integer>();
			graph.put(fromVertex, fromMap);
		}
		
		if (graph.containsKey(toVertex)) {
			toMap = graph.get(toVertex);	
		}
		else {
			toMap = new HashMap<T, Integer>(); 
			graph.put(toVertex, toMap);
		}
		
		if (!fromMap.containsKey(toVertex)) {
			fromMap.put(toVertex, weight);			
		}
		
		if (!toMap.containsKey(fromVertex)) {
			toMap.put(fromVertex, weight);			
		}
	}

	public boolean edgeExists(T fromVertex, T toVertex) {
		
		return graph.containsKey(fromVertex) && graph.get(fromVertex).containsKey(toVertex) && graph.containsKey(toVertex) && graph.get(toVertex).containsKey(fromVertex);
		
	}	
}

class Traverse<T> {
	private Graph<T> g;
	private ArrayList<T> visited = new ArrayList<T>();
	
	public Traverse(Graph g) {
		this.g = g;
	}
	
	public void traverseDepthFirst(T startVertex) {
		// add startVertex til visited
		visited.add(startVertex);
		
		// giver alle hashmap gemt under currentVertex		
		Iterator<Entry<T, Integer>> allHashMaps = g.graph.get(startVertex).entrySet().iterator();
		
		System.out.println("\nLooking in the hashmap under " + startVertex);
		
		T type = null;
		
		while (allHashMaps.hasNext()) {
			Entry<T, Integer> actualHashMap = allHashMaps.next();
			
			type = actualHashMap.getKey();
			
			iterateDepthFirst(type);		
			
		}	
	}
	
	private T iterateDepthFirst(T currentVertex) {
		
		System.out.println("  Looking at " + currentVertex + " ...");
		
		if (!visited.contains(currentVertex)) {
			
			Iterator<Entry<T, Integer>> allHashMaps = g.graph.get(currentVertex).entrySet().iterator();
			
			System.out.println("\nLooking in the hashmap under " + currentVertex);
			
			T type = null;
			
			while (allHashMaps.hasNext()) {
				Entry<T, Integer> actualHashMap = allHashMaps.next();
				
				type = actualHashMap.getKey();
				visited.add(currentVertex);
				iterateDepthFirst(type);				
			}
		}
		else {
			System.out.println("   * " + currentVertex + " has been visited");
		}
		
		return currentVertex;
	}
	
	// fungere 
	public void traverseBreadthFirst(T startVertex) {
		// add startVertex til visited
		visited.add(startVertex);
		
		// giver alle hashmap gemt under currentVertex		
		Iterator<Entry<T, Integer>> allHashMaps = g.graph.get(startVertex).entrySet().iterator();
		
		System.out.println("\nLooking in the hashmap under " + startVertex);
		
		T type = null;
		
		while (allHashMaps.hasNext()) {
			Entry<T, Integer> actualHashMap = allHashMaps.next();
			
			type = actualHashMap.getKey();
			
			iterateBreadthFirst(type);
		}		
	}
	
	private T iterateBreadthFirst(T currentVertex) {
		
		System.out.println("  Looking at " + currentVertex + " ...");
		
		if (!visited.contains(currentVertex)) {
			
			Iterator<Entry<T, Integer>> allHashMaps = g.graph.get(currentVertex).entrySet().iterator();
			
			System.out.println("\nLooking in the hashmap under " + currentVertex);
			
			T type = null;
			
			while (allHashMaps.hasNext()) {
				Entry<T, Integer> actualHashMap = allHashMaps.next();
				
				type = actualHashMap.getKey();
				visited.add(currentVertex);
				iterateBreadthFirst(type);				
			}
		}
		else {
			System.out.println("   * " + currentVertex + " has been visited");
		}
		
		return currentVertex;	
	}
	
//	public void traverseBreadthFirst(T startVertex) {
//	
//		// add startVertex til visited
//		visited.add(startVertex);
//		
//		// løbe entryset for startVertex igennem
//		iterateBreadthFirst(startVertex);		
//	}
//	
//	private T iterateBreadthFirst(T currentVertex) {
//		T firstInSet = null;
//	
//		if (g.graph.get(currentVertex) != null) {
//			// giver alle hashmap gemt under currentVertex		
//			Iterator<Entry<T, Integer>> allHashMaps = g.graph.get(currentVertex).entrySet().iterator();
//			
//			System.out.println("\nLooking in the hashmap under " + currentVertex);
//			
//			boolean first=true;
//			
//			while (allHashMaps.hasNext()) {
//				Entry<T, Integer> actualHashMap = allHashMaps.next();
//				
//				T type = actualHashMap.getKey();
//				
//				System.out.println("  Looking at " + type + " ...");
//				
//				if (!visited.contains(type)) {
//					
//					System.out.println("   * " + type + " has not been looked at before");
//					
//					if (first) {
//						System.out.println("   * " + type + " is first in the set");
//	
//						// gem første T i settet					
//						firstInSet = type;
//						first = false;
//					}
//					
//					System.out.println("   * adding " + type + " to visited list");
//					visited.add(type);
//					
//				}
//			}
//			
//			iterateBreadthFirst(firstInSet);
//		}
//		else {
//			iterateBreadthFirst(currentVertex);
//		}
//		return firstInSet;
//	}
//	
//	public void traverseDepthFirst(T startVertex) {
//		// add startVertex til visited
//		visited.add(startVertex);
//		
//		// løbe entryset for startVertex igennem
//		iterateDepthFirst(startVertex);		
//	}
//
//	private T iterateDepthFirst(T currentVertex) {
//	
//		T firstInSet = null;
//	
//		// er hashmappet tomt
//		if (g.graph.get(currentVertex) != null) {
//			
//			// giver alle hashmap gemt under currentVertex		
//			Iterator<Entry<T, Integer>> allHashMaps = g.graph.get(currentVertex).entrySet().iterator();
//			
//			System.out.println("\nLooking in the hashmap under " + currentVertex);
//			
//			boolean first=true;
//			
//			while (allHashMaps.hasNext()) {
//				Entry<T, Integer> actualHashMap = allHashMaps.next();
//				
//				T type = actualHashMap.getKey();
//				
////				
////				System.out.println("  Looking at " + type + " ...");
////				
////				if (!visited.contains(type)) {
////					
////					System.out.println("   * " + type + " has not been looked at before");
////					
////					if (first) {
////						System.out.println("   * " + type + " is first in the set");
////	
////						// gem første T i settet					
////						firstInSet = type;
////						first = false;
////					}
////					
////					System.out.println("   * adding " + type + " to visited list");
////					visited.add(type);
////					
////				}
//			}
//			
//		}
////		else {
////			iterateDepthFirst(currentVertex);
////		}
//		return firstInSet;
//	}
}

class Edge<T> {
	T fromVertex;
	T toVertex;
	Integer weight;
	
	public Edge(T fromVertex, T toVertex, Integer weight) {
		this.fromVertex = fromVertex;
		this.toVertex = toVertex;
		this.weight = weight;
	}	
}
