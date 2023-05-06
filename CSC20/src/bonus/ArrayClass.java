/** Name: Miguelito Jean
 * Class : CSC205
 */
package bonus;


public class ArrayClass {
	private int items[];
	private int count;

	public ArrayClass(int length) {
		items = new int[length];

	}
	public void print() {
		for(int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	public void insert(int item) {
		items[count] = item;
		count++;
		if(items.length == count) {
			int  myItems[] = new int[count * 2];
			for(int i = 0; i < count; i++)
				myItems[i] = items[i];
			items = myItems;
		}
	}
	public void removeItems(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		for(int i = index; i < count; i++)
			items[i] = items[i + 1];
		count--;
	}
	public int myIndexOf(int itemIndex) {
		for(int i = 0; i < count; i++)
			if(items[i] == itemIndex)
				
		return i;
		return -1;
		
	}

	
}
