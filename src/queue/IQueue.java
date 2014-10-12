package queue;

public interface IQueue<T> {
	
	T getLastInQueue();
	
	void createQueue(Integer length);
	//Creates an empty queue.

	boolean isEmpty();//:boolean
	//Determines whether the queue is empty.

	void enqueue(T newItem);
	//adds NewItem at the back of a queue

	T dequeue();
	//retrieves and removes the front of a queue-the item that was added first.

	void dequeueAll();
	//removes all items

	T peek();
	//Retrieves the front of a queue. The queue is unchanged. (It does not remove the item from the queue).
}
