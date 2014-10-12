package queue;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test_non_circular() {
		// Arrange
		Queue<String> q = new Queue<String>();
		q.createQueue(10);
		
		// Act
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");		
		
		// Assert
		assertEquals("dequeue fail! 1", "A", q.dequeue());
		assertEquals("dequeue fail! 2", "B", q.dequeue());
		assertEquals("dequeue fail! 3", "C", q.dequeue());
		assertEquals("dequeue fail! 4", "D", q.dequeue());
	}

	@org.junit.Test
	public void test_non_circular_maxed() {
		// Arrange
		Queue<String> q = new Queue<String>();
		q.createQueue(10);
		
		// Act
		q.enqueue("1"); // 1
		q.enqueue("2"); // 2 
		q.enqueue("3"); // 3
		q.enqueue("4"); // 4
		q.enqueue("5"); // 5
		q.enqueue("6"); // 6
		q.enqueue("7"); // 7
		q.enqueue("8"); // 8
		q.enqueue("9"); // 9
		q.enqueue("10"); // 10
		q.enqueue("11"); // full
		
		// Assert
		assertEquals("getLast fail! 1", "10", q.getLastInQueue());
	}
	    
	@org.junit.Test
	public void test_circular_maxed() {
		// Arrange
		Queue<String> q = new Queue<String>();
		q.createQueue(10);
		
		// Act
		q.enqueue("1"); // 1
		q.enqueue("2"); // 2 
		q.enqueue("3"); // 3
		q.enqueue("4"); // 4
		q.enqueue("5"); // 5
		q.enqueue("6"); // 6
		q.enqueue("7"); // 7
		q.enqueue("8"); // 8
		q.enqueue("9"); // 9
		q.enqueue("10"); // 10
		
		q.dequeue(); // 1 = null
		q.dequeue(); // 2 = null
		q.dequeue(); // 3 = null
		q.dequeue(); // 4 = null
		assertEquals("dequeue fail! 5", "5", q.dequeue()); // 5 = null
		q.enqueue("11"); // 1
		q.enqueue("12"); // 2
		q.enqueue("13"); // 3
		q.enqueue("14"); // 4
		q.enqueue("15"); // 5
		q.enqueue("16"); // full
		assertEquals("getLast fail! 2", "15", q.getLastInQueue()); // 15		
	}
	
	@org.junit.Test
	public void test_circular_empty() {
		// Arrange
		Queue<String> q = new Queue<String>();
		q.createQueue(10);
		
		// Act
		q.enqueue("1"); // 1
		q.enqueue("2"); // 2 
		q.enqueue("3"); // 3
		q.enqueue("4"); // 4
		q.enqueue("5"); // 5
		q.enqueue("6"); // 6
		q.enqueue("7"); // 7
		q.enqueue("8"); // 8
		q.enqueue("9"); // 9
		q.enqueue("10"); // 10
		
		q.dequeue(); // 1 = null
		q.dequeue(); // 2 = null
		q.dequeue(); // 3 = null
		q.dequeue(); // 4 = null
		assertEquals("dequeue fail! 6", "5", q.dequeue()); // 5 = null
		q.enqueue("11"); // 11
		q.enqueue("12"); // 12
		q.enqueue("13"); // 13
		q.enqueue("14"); // 14
		
		q.dequeue(); // 6 = null
		q.dequeue(); // 7 = null
		q.dequeue(); // 8 = null
		q.dequeue(); // 9 = null
		q.dequeue(); // 10 = null
		q.dequeue(); // 11 = null
		q.dequeue(); // 12 = null
		q.dequeue(); // 13 = null
		assertEquals("peek fail! 1", q.peek(), q.getLastInQueue()); // is 14 = 14
		q.dequeue(); // 14 = null
		assertEquals("empty fail! 1", null, q.dequeue()); // null
		assertEquals("empty fail! 2", true, q.isEmpty());
		
	}
}
