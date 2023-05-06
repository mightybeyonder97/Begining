/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project5bag;


public interface Bag<T> extends Iterable<T> {
	public boolean isEmpty();
	public int size();
	public void add(T item);
}