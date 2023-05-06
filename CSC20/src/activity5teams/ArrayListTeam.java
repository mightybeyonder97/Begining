/** Name: Miguelito Jean
 * Class : CSC205
 */
package activity5teams;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTeam<T> implements Team<T> {
	
	List <T> myTeams;
	
	public ArrayListTeam() {
		super();
		myTeams = new ArrayList<T>();
		
	}

	@Override
	public Iterator<T> iterator() {
		return myTeams.iterator();
	}

	@Override
	public boolean isEmpty() {
		return myTeams.isEmpty();
	}

	@Override
	public int size() {
		
		return myTeams.size();
	}

	@Override
	public void add(T item) {
		myTeams.add(item);
	}

	@Override
	public String toString() {
		return ("  " +  myTeams   );
	}
}