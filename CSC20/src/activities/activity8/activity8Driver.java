/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity8;


public class activity8Driver {

	
	public static void main(String[] args) {
		
		Integer [] a = new Integer [3000];
		Integer [] myArray = {0 , 15, 30, 32, 38, 57, 65, 73, 88, 95, 112, 200, 600, 1000};
		Integer  result;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i*2;
		}
		for(Integer array: myArray ) {
			result = Searching.interpolationSearch(a, array);
			System.out.println("Result for the search " + array + " : " + result + "  : Counter: " + Searching.getCounter());
		}
		

	}

}
