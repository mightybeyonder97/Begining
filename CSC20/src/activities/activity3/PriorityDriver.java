/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity3;


public class PriorityDriver {

	
	public static void main(String[] args) {
		
		Task myPriority1 = new Task(0, " Watch Dune");
		Task myPriority2 = new Task(0, "Play Destiny2");
		Task myPriority3 = new Task(0, "Buy flowers for your partner");
		
		myPriority3.setPriority(1);
		System.out.println(myPriority3);

		myPriority1.setPriority(2);
		System.out.println(myPriority1);
		
		myPriority2.setPriority(8);
		System.out.println(myPriority2);
		
		

	}

}
