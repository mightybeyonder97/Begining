/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project5bag;

public interface Team<T> extends Iterable<T> {
	public void add(T item);
	public boolean isEmpty();
	public int size();
}
