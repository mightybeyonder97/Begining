package projects.project6stackqueue.jsjf;

import projects.project6stackqueue.jsjf.exceptions.*;

public class LinkedStack<T> implements StackADT<T>
{
	private int count;  
	private LinearNode<T> top; 

	
	public LinkedStack()
	{
		count = 0;
		top = null;
	}

	
	public void push(T element)
	{
		LinearNode<T> temp = new LinearNode<T>(element);

		temp.setNext(top);
		top = temp;
		count++;
	}

	
	public T pop() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		T result = top.getElement();
		top = top.getNext();
		count--;

		return result;
	}

	
	public T peek() throws EmptyCollectionException
	{
		if (isEmpty()) {
			throw new EmptyCollectionException("stack");
		}
		T skTop = top.getElement();
		top = top.getNext();
		
		
		return skTop;  
	}

	
	public boolean isEmpty()
	{
		if (top == null) {
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
		LinearNode<T> now = top;
		while (now != null) {
			first+= now.getElement() + " ";
			now = now.getNext();
		}
		
		return first + " " ;
	}
}
