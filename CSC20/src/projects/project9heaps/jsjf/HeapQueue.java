package projects.project9heaps.jsjf;

import projects.project9heaps.jsjf.exceptions.EmptyCollectionException;

public class HeapQueue<T> implements QueueADT<T> {
	LinkedHeap<T> tarnished;
	public HeapQueue() {
		super();
		tarnished = new LinkedHeap<T>();
	}
	@Override
	public void enqueue(T element) {
		tarnished.addElement(element);
		
	}

	@Override
	public T dequeue() {
		
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		
		
		return tarnished.removeMin();
	}

	@Override
	public T first() {
		
		return tarnished.findMin();
	}

	@Override
	public boolean isEmpty() {
		
		return tarnished.isEmpty();
	}

	@Override
	public int size() {
		
		return tarnished.size();
	}
	
}
