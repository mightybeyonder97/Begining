/** Name: Miguelito Jean
 * Class : CSC205
 */

/**
 * @author migue
 *
 */
import java.util.Scanner;
public class prog240 {

	public static void main(String[] args) {
		
		int myArray [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int nums[] = {2,4,5,6};
		Scanner scan  = new Scanner(System.in);
		int index1=0;
		int index2 = 0;
		int tar = 10;
		System.out.println("printing nums[0]: "+ nums[nums.length-1]);
		for(int i =0; i< nums.length-1; i++ ) {
			
				System.out.print("["+nums[i]+"]");
				
			}
			
		
		System.out.print("\n");
		System.out.print("First element of the array: ");
		System.out.println(myArray[0]);
		
		System.out.print("Adding even numbers up to 15 : ");
		
		for(int i = 1; i < myArray.length; i++) {
			if (i % 2 == 0 && i < 15-1) {
			System.out.print(prog240.addTwo(i) + " ,");
			
			}
		}
		System.out.println();
		System.out.print("All element of the array after the first one: ");
		for(int i = 1; i < myArray.length; i++) {
			
			
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Sum of two numbers:");
		
		System.out.println(prog240.returnSum(60, 4));
		
		System.out.println("Enter your change : ");
		int coin = scan.nextInt();
		System.out.println("Here is your change : ");
		prog240.makeChange(coin);
	}
	public static int addTwo (int n) {
		
		
		int x  = (n + 2);
		
		return x;
	}
	public static int returnSum (int x,int y) {
		int sum;
		sum = x + y;
		
		return sum;
	}
	public static void makeChange (int c) {
		int change = c/2;
		int quarters = change / 25;
		int nickels = (change-30) / 5;
		int dimes = (change-20) / 10;
		System.out.println("nickels: " + nickels);
		System.out.println("dimes: " + dimes );
		System.out.println("quarters: " + quarters);
		
		
		
	}
	 public boolean isValid(String s) {
	        char one = ')';
	        char two = ']';
	            char three = '}';
	       for(int i = 0; i < s.length();i++) {
	           char a = s.charAt(i);
	           char b = s.charAt(i+1);
	           if(b== one || b==two ||b==three) {
	            return true;
	        }
	       else {
	           return false;
	       }
	 
	}
		return false;

	}
}
