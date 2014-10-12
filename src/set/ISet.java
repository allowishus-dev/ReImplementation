package set;

public interface ISet<T> {
	
	boolean isEmpty();
	int size();
	boolean contains(T item);
	MySet<T> union(MySet<T> otherSet);
	MySet<T> intersection(MySet<T> otherSet);
	void removeAll();
	T get(int index);
	void add(T item);
	MySet<T> thisNotTheOther(MySet<T> otherSet);
}
