/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity6;

import java.util.Iterator;

public class LinkedListTeam<T> implements Team<T> {
	
	LinkedList<T> myList;
	
	public LinkedListTeam () {
		
		myList = new LinkedList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		
		return myList.iterator();
	}

	@Override
	public void add(T item) {
		myList.addToFront(item);
	
		
	}

	@Override
	public boolean isEmpty() {
		
		return myList.isEmpty();
	}

	@Override
	public int size() {
		
		return myList.size();
	}
	@Override
	public String toString(){
		return ("  " + myList);
	}

}
