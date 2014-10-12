package queue;

public class Queue<T> implements IQueue<T> {
	private T[] queue;
	private Integer firstInQueue;
	private Integer lastInQueue;
	private Integer length;
	
	@Override
	public T getLastInQueue() {
		return queue[lastInQueue];
	}

	@Override
	public void createQueue(Integer newLength) {
		firstInQueue = 0; 
		lastInQueue = 0;
		length = newLength;
		queue = (T[]) new Object[length];
	}

	@Override
	public boolean isEmpty() {
		return queue !=null && queue[firstInQueue] == null;
	}

	@Override
	public void enqueue(T newItem) {
		if (isEmpty()) {
			queue[lastInQueue] = newItem;
		}
		else if ((firstInQueue <= lastInQueue && lastInQueue + 1 < length)) {
			lastInQueue++;
			queue[lastInQueue] = newItem;
		}
		else if (lastInQueue + 1 < firstInQueue) {
			lastInQueue++;
			queue[lastInQueue] = newItem;
		}
		else if (lastInQueue + 1 == length && firstInQueue > 0) {
			lastInQueue = 0;
			queue[lastInQueue] = newItem;
		}
		else if ((lastInQueue + 1 == length && firstInQueue == 0) || lastInQueue + 1 == firstInQueue) {
			System.out.println("Queue full for now");
		}
	}

	@Override
	public T dequeue() {
		if (isEmpty() || queue[firstInQueue] == null) {
			System.out.println("Empty queue");
			return null;
		}
		
		T t = queue[firstInQueue];
		queue[firstInQueue] = null;
		
		if (firstInQueue + 1 == length) {
			firstInQueue = 0;
		}
		else if (firstInQueue != lastInQueue){
			firstInQueue++;
		}
			
		return t;
	}

	@Override
	public void dequeueAll() {
		createQueue(10);		
	}

	@Override
	public T peek() {
		if (isEmpty() || queue[firstInQueue] == null) {
			System.out.println("Empty queue");
			return null;
		}
		return queue[firstInQueue];
	}
}
