/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project1;

/**
 * @author migue
 *
 */


public class Project1Driver {
	public static void main(String[] args) {
		Point p1 = new Point(2,4);
		Point p2 = new Point(-1, 8);
		Point p3 = new Point(0,1);
		Point p4 = new Point();
		Point distance = new Point();
		
		
		System.out.println("Point 1: " + p1);         
		System.out.println("Point 2: " + p2);
		System.out.print("Distance between " + p1 + " and " + 
				p2 + ": ");
		distance.distanceOfTwoPoints(2, 4, -1, 8);
		
		
		p1.shiftX(4);
		p2.shiftY(-2); 
		
		System.out.println("\nAfter shift:");
		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.print("Distance between " + p1 + " and " + 
				p2 + ": ");
		distance.distanceOfTwoPoints(6, 4, -1, 6);
		
		System.out.println("\nRotate test:");
		System.out.println("Before rotate: Point 3: " + p3);
		p3.rotate(Math.PI / 2);
		System.out.println(" After rotate: Point 3: " + p3);
		
		
		System.out.println("\nSwapping:");
		System.out.println("Swapping p1: " + p1.toString());
		
		System.out.print(" After swapping p1: ");
		p1.swap();
		
		System.out.println("\nSetting new values for a given point:");
		p4.setValue(-9, 5);
		System.out.println("The values for p4 are: " + p4);
		
		
		
		
		
		
	}

}
