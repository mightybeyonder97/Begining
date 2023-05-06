package projects.project6stackqueue.jsjf;

import projects.project6stackqueue.jsjf.exceptions.*;


public class LinkedQueue<T> implements QueueADT<T>
{
	private int count;
	private LinearNode<T> head, tail;

	public LinkedQueue()
	{
		count = 0;
		head = tail = null;
	}

	
	public void enqueue(T element)
	{
		LinearNode<T> node = new LinearNode<T>(element);

		if (isEmpty())
			head = node;
		else
			tail.setNext(node);

		tail = node;
		count++;
	}

	
	public T dequeue() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		T result = head.getElement();
		head = head.getNext();
		count--;

		if (isEmpty())
			tail = null;

		return result;
	}

	
	public T first() throws EmptyCollectionException
	{
		if(isEmpty()) {
			throw new EmptyCollectionException("queue");
		}
			T first = head.getElement();
		head = head.getNext();
		return first; 
	}

	
	public boolean isEmpty()
	{
		if(head == null) {
		
		return true;
		}
		else
		return false;
	}

	
	public int size()
	{
		
		
		return count; 
	}

	
	public String toString()
	{
		
		String first = "-->";
		LinearNode<T> now = head;
		while (now != null) {
			first+= now.getElement() + " ";
			now = now.getNext();
		}
		return  first + " "; 
	}
}
