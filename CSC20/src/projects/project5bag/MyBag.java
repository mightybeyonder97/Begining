/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project5bag;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBag<T> implements Bag<T> {
List <T> myFighters;
	
	public MyBag() {
		super();
		myFighters = new ArrayList<T>();
		
	}
	@Override
	public Iterator<T> iterator() {
		return myFighters.iterator();
	}

	@Override
	public boolean isEmpty() {
		return myFighters.isEmpty();
	}

	@Override
	public int size() {
		return myFighters.size();
	}

	@Override
	public void add(T item) {
		myFighters.add(item);
	}
	@Override
	public String toString() {
		return ("  " +  myFighters   );
	}

}
