/** Name: Miguelito Jean
 * Class : CSC205
 */
package activity5teams;




public interface Team<T> extends Iterable<T> {
	public void add(T item);
	public boolean isEmpty();
	public int size();
}
