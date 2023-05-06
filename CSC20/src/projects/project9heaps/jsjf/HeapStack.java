package projects.project9heaps.jsjf;

import projects.project6stackqueue.jsjf.LinearNode;
import projects.project9heaps.jsjf.exceptions.EmptyCollectionException;

public class HeapStack<T> implements StackADT<T> {
	
	LinkedHeap<T> stairCase;
	
	public HeapStack() {
		super();
		stairCase = new LinkedHeap<T>();
	}
	@Override
	public void push(T element) {
		stairCase.addElement(element);
		
	}

	@Override
	public T pop() {
		if (isEmpty())
			throw new EmptyCollectionException("LinkedHeap");

		T popElement =  stairCase.lastNode.getElement();
		HeapNode<T> result = stairCase.lastNode;

		
		while ((result != stairCase.root) && (result.getParent().getLeft() == result))
			result = result.getParent();

		if (result != stairCase.root)
			result = (HeapNode<T>)result.getParent().getLeft();

		while (result.getRight() != null)
			result = (HeapNode<T>)result.getRight();

		
		if (stairCase.size() == 1)
		{
			stairCase.root = null;
			stairCase.lastNode = null;
		}
		else
		{
			// Get the new last node
			
			
			// Check which child the old last node is & set to null
			if (stairCase.lastNode.getParent().getLeft() == stairCase.lastNode)
				stairCase.lastNode.getParent().setLeft(null);
			else
				stairCase.lastNode.getParent().setRight(null);

			
			stairCase.lastNode = result;
			
		} 
		
		return  popElement;
		
	}
	

	@Override
	public T peek() {
		
		return stairCase.findMin();
	}

	@Override
	public boolean isEmpty() {
		
		return stairCase.isEmpty();
	}

	@Override
	public int size() {
		
		return stairCase.size();
	}
	
	
}
