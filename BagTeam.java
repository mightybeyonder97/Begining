/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project5bag;

import java.util.Iterator;


public class BagTeam<T> implements Team<T> {
	 MyBag<T> myTeam;
	
	 
	 public BagTeam() {
		 myTeam = new MyBag<T>();
	 }
	@Override
	public Iterator<T> iterator() {
		
		return myTeam.iterator();
	}

	@Override
	public void add(T item) {
		myTeam.add(item);
		
	}

	@Override
	public boolean isEmpty() {
		
		return myTeam.isEmpty();
	}

	@Override
	public int size() {
		
		return myTeam.size();
	}
	@Override
	public String toString() {
		return ("  " +  myTeam   );
	}


}
