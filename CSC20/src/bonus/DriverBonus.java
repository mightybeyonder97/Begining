/** Name: Miguelito Jean
 * Class : CSC205
 */
package bonus;

/**
 * @author migue
 *
 */
public class DriverBonus {

	public static void main(String[] args) {
		ArrayClass number = new ArrayClass(3);
		
		number.insert(4);
		number.insert(5);
		number.insert(21);
		number.insert(99);
		
		number.print();
		System.out.println("----------");
		System.out.println(number.myIndexOf(21));

	}

}
