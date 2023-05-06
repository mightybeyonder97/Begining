/** Name: Miguelito Jean
 * Class : CSC205
 */
package exercises;


import java.util.Arrays;
import java.util.List;
import projects.project4.csc205.Recursion;

public class RecursionExcerciseDriver {

	public static void main(String[] args) {
		List<Integer> testValues = Arrays.asList(1, 5, 10, 20);
		
		System.out.println("Recursion Exercise Tests:");

		System.out.println("func1:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: " + Recursion.func1(ii) + "   ");
		}
		System.out.println("\n");

		System.out.println("func2:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: " + Recursion.func2(ii) + "   ");
		}
		System.out.println("\n");

		System.out.println("func3:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: " + Recursion.func3(ii) + "   ");
		}
		System.out.println("\n");

		System.out.println("Tribonacci:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: " + Recursion.tribonacci(ii) + "   ");
		}
		System.out.println("\n");
		
		
		System.out.println("add(x,y) testing:");
		System.out.println("[1 + 1] = " + Recursion.add(1, 1));
		System.out.println("[3 + 2] = " + Recursion.add(3, 2));
		System.out.println("[7 + 8] = " + Recursion.add(7, 8));
		System.out.println("");
		

		System.out.println("printDownFrom:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: ");
			Recursion.printDownFrom(ii);
			System.out.println();
		}
		System.out.println("");

		System.out.println("printUpTo:");
		for (Integer ii : testValues) {
			System.out.print("[" + ii + "]: ");
			Recursion.printUpTo(ii);
			System.out.println();
		}
		System.out.println("");

		// Test Euclid's GCD algorithm 
		System.out.println("GCD:");
		System.out.print("[96 & 60] " + Recursion.gcd(96, 60) + "    ");
		System.out.print("[30 & 10] " + Recursion.gcd(30, 10) + "    ");
		System.out.println("[96 & 120] " + Recursion.gcd(96, 120) + "    ");
		System.out.println();

		// Test palindrome
		System.out.println("Palindrome:");
		System.out.println("abcd = " + Recursion.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("abccba = " + Recursion.isPalindrome("abccba"));
		System.out.println("aabcbaa = " + Recursion.isPalindrome("aabcbaa"));
		System.out.println();
		
		// Test collatz()
		System.out.println("Collatz:");
		testValues = Arrays.asList(1, 5, 19);
		for(Integer ii : testValues) {
			System.out.print("[" + ii + "] : ");
			Recursion.collatz(ii);
		} 

	}
}
