/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity2excep;



import java.util.InputMismatchException;
import java.util.Scanner;


public class Activity2 {

	public static void main(String[] args) {

		Fraction sampleFraction = new Fraction(8,3);
		
		Scanner scan = new Scanner(System.in);
		
       
       try
       {
		System.out.print ("Enter the numerator:  ");
		sampleFraction.setNumerator(scan.nextInt());		
		System.out.print ("Enter the denominator:  ");
		sampleFraction.setDenominator(scan.nextInt());
       
		
		
       
		System.out.println ("The fraction " + sampleFraction.getNumerator() + "/" +
				sampleFraction.getDenominator() + " is equal to " + sampleFraction.toMixedNumber());
       }
       
       catch(ArithmeticException e)
       {
    	   System.err.println("Error, division by zero is impossible.");
       }
       
       
       catch(InputMismatchException e)
       {
    	  
    	  
    	   System.err.println("Error, you did not enter a number.");
       }
       
       catch(Exception e)
       {
    	   System.err.println("Unknown error");
       }
       
		scan.close();

	}
	
}