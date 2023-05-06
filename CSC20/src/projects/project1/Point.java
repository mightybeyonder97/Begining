/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project1;


public class Point {
	private double x,y;
	
	public  Point() {
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double valOfX, double valOfY) {
		x = valOfX;
		y = valOfY;
	}
	public void setValue(double xInput, double yInput) {
		x = xInput;
		y = yInput;
	}
    
    public double getInputX() {
    	return x;
    }
    public double getIputY() {
    	return y;
    }
    public void shiftX(double xVal) {
    	x = x + xVal;
    }
    public void shiftY(double yVal) {
    	y = y + yVal;
    }
    
    public void swap() {
    	 double tempVal = 0.0;
         tempVal = y;
         y = x;
         x = tempVal;
         
         
         System.out.print("(" + x + "," + y + ")" );  
         System.out.println();
         
         
    }
    public double distanceOfTwoPoints(double x1, double y1, double x2, double y2) {
    	double distance;
    	distance = Math.sqrt( Math.pow(x2 - x1, 2)  + Math.pow(y2 - y1, 2));
    	
    	System.out.println(distance);
    	return distance;
    }
    
    public void rotate(double d) {
    	double tempX;
    	tempX = x * (Math.cos(d)) - y * (Math.sin(d));
    	y =   tempX* (Math.sin(d)) - y * (Math.cos(d));
    	
    
    
    }
    public String toString() {
    	return ("(" + x + ", " + y + ")");
    }

	
    }

