package projects.project8;

import java.util.Iterator;

public class LinkedBSTOrderedSet<T> implements OrderedSetADT<T>{

	LinkedBinarySearchTree<T> coconut;

	public LinkedBSTOrderedSet() {
		super();
		coconut = new LinkedBinarySearchTree<T>();
	}

	@Override
	public void addElement(T element) {
		if(element.equals(coconut.root)) {
			coconut.modCount++;
		}
		else
		coconut.addElement(element);
		
	}

	@Override
	public T removeElement(T targetElement) {
		
		return coconut.removeElement(targetElement);
	}

	@Override
	public T find(T targetElement) {
		
		return coconut.find(targetElement);
	}

	@Override
	public T findMin() {
		
		return coconut.findMin();
	}

	@Override
	public T findMax() {
		
		return coconut.findMax();
	}

	@Override
	public boolean contains(T targetElement) {
		
		return coconut.contains(targetElement);
	}

	@Override
	public Iterator<T> iterator() {
		
		return coconut.iterator();
	}
}
