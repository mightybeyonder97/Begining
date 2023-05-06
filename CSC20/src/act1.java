/** Name: Miguelito Jean
 * Class : CSC205
 */

/**
 * @author migue
 *
 */
import java.util.Scanner;
public class act1 {

	private static final char I = 0;

	/**
	 * @param args
	 */
	//public final static int LENGTH = 10;
	public static void main(String[] args) {
	 
		int arr[] = new int [10];
		Scanner scan = new Scanner(System.in);
		//int k = 0;
		String [] zero = {"I", "IV", "V", "X", "L", "C", "D", "M"};
		char one  = 'I';
		char five = 'V';
		//char four = 'IV';
		String s = "(}";
		int num = 0;
		String v  = "()";
		int count=0;
		System.out.println(v.charAt(0));
		System.out.println(s.charAt(0)); 
		if (s.charAt(0)== one) {
			num = 1;
		}
		System.out.println(num);
		System.out.println("String length: " + s.length());
		for(int i = 0; i<1;i++) {
			char a = s.charAt(s.length()-1);
		count++;
			System.out.print(count +":["+a + "] ,");
			
			
		}
		System.out.print("\n");
		System.out.println(num);
		System.out.println("Choose a number less than 10 please: ");

		
	//	int i = 0;
	
	/*	    for(int ii = 0; ii<arr.length; ii++) {
		    	
		       arr[ii] = scan.nextInt();
		      
		    
		}
		    for(int k= 0; k <arr.length; k++) {
		    	if(k % 2 == 0) {
		    	System.out.print("["+arr[k]+"],");
		    }
		    } */
		
		}

	

}
