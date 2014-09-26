package Set;
import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		// Arrange
		MySet<String> set1 = new MySet<>();
		MySet<String> set2 = new MySet<>();
		
		set1.add("1");
		set1.add("2");
		set1.add("3");
		set1.add("4");
		
		set2.add("2");
		set2.add("4");
		set2.add("6");
		set2.add("7");
		
		
		// Act
		MySet<String> unionSet = set1.union(set2);
//		System.out.println("----union of sets------------");		
//		unionSet.print();
		
		MySet<String> intersectSet = set1.intersection(set2);
//		System.out.println("----intersection of sets------------");		
//		intersectSet.print();
		
		MySet<String> thisNotTheOtherSet = set1.thisNotTheOther(set2);		
//		System.out.println("----only left of sets------------");		
//		leftJoinSet.print();
		
		// Assert
		assertEquals("Contains fail! 1", false, set1.contains("6"));
		assertEquals("Contains fail! 2", true, set1.contains("1"));
		assertEquals("Contains fail! 3", false, set2.contains("3"));
		assertEquals("Contains fail! 4", true, set2.contains("2"));

		assertEquals("Size fail! 1", 4, set1.size());
		assertEquals("Size fail! 2", 4, set1.size());
		assertEquals("Size fail! 3", 6, unionSet.size());
		assertEquals("Size fail! 4", 2, intersectSet.size());
		assertEquals("Size fail! 5", 2, thisNotTheOtherSet.size());
		
		assertEquals("Union fail!", "7", unionSet.get(5));
		
		assertEquals("Intersect fail! 1", "2", intersectSet.get(0));
		assertEquals("Intersect fail! 2", "4", intersectSet.get(1));
		
		assertEquals("ThisNotTheOther fail! 1", "1", thisNotTheOtherSet.get(0));
		assertEquals("ThisNotTheOther fail! 2", "3", thisNotTheOtherSet.get(1));
	}
}
