package set;

public class MySet<T> implements ISet<T> {
	private T[] set = (T[])new Object[10];
	public int pointer = 0;

	@Override
	public boolean isEmpty() {
		return set[0]==null;
	}

	@Override
	public int size() {
		
		return pointer;
	}

	@Override
	public void add(T item) {
		if (!this.contains(item)) {
			set[this.pointer] = item;
			this.pointer++;
		}
	}

	@Override
	public boolean contains(T item) {
		for (int i=0;i<this.pointer;i++) {
			if (set[i] == item) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void removeAll() {
		set = (T[])new Object[10];
		pointer = 0;
	}

	@Override
	public MySet<T> union(MySet<T> otherSet) {
		MySet<T> unionSet = new MySet<T>();
		for (int i=0;i<this.pointer;i++) {
			unionSet.add(set[i]); 
		}

		for (int i=0;i<otherSet.size();i++) {
			T t = otherSet.get(i);
			if (t != null) unionSet.add(t);			
		}		
		
		return unionSet;
	}

	@Override
	public MySet<T> intersection(MySet<T> otherSet) {
		MySet<T> foundSet = new MySet<T>();
		
		for (int i=0;i<this.pointer;i++) {
			if (otherSet.contains(set[i])) {
				foundSet.add(set[i]);
			}
		}
		
		return foundSet;
	}

	@Override
	public MySet<T> thisNotTheOther(MySet<T> otherSet) {
		MySet<T> foundSet = new MySet<T>();
		
		for (int i=0;i<this.pointer;i++) {
			if (!otherSet.contains(set[i])) {
				foundSet.add(set[i]);
			}
		}

		return foundSet;
	}

	@Override
	public T get(int index) {
		return set[index];
	
	}
	
	public void print() {
		for (int i=0;i<this.pointer;i++) {
			System.out.println(set[i]);
		}
	}
	
}
