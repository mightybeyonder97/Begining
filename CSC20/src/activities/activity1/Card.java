/** Name: Miguelito Jean
 * Class : CSC205
 */
package activities.activity1;

import java.util.Random;

/**
 * @author migue
 *
 */
public class Card {
	private final static  String faceValueNames[]= {"A","Jack","Queen", "King"};
	private final static int faceValueNumbers[] = {2,3,4,5,6,7,8,9,10};
	private final static String suitsNames[] = {"Hearts", "Spades", "Diamonds", "Clubs"};
	
	
	public   Card() {
		super();

	}
	
	
	public void namesOfCards() {
		
		for(int i = 0;i<faceValueNames.length;i++ ) {
		 i = (int)(Math.random() * faceValueNames.length);
		faceValueNames[i] = faceValueNames[i];
		
		
		
		for(int l = 0; i<suitsNames.length;i++) {
			i = (int)(Math.random() * suitsNames.length);
			suitsNames[i] = suitsNames[i];
			System.out.println(faceValueNames[i] + " " + suitsNames[i]);
			
		}
	}
	
			
			for (int k = 0; k< faceValueNumbers.length;k++) {
				k =  (int)(Math.random() * faceValueNumbers.length);
				faceValueNumbers[k] = faceValueNumbers[k];
				
				
				for(int j = 0; j<suitsNames.length;j++) {
					j = (int)(Math.random() * suitsNames.length);
					suitsNames[j] = suitsNames[j];
					System.out.println(faceValueNumbers[k] + " " + suitsNames[j]);
			}
		}
	}
		
	
	
	
	
	public String toString() {
		return ("Your Cards are");
	}
  
}
