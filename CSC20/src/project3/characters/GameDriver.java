/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;

import java.util.Random;

public class GameDriver {

	
	public static void main(String[] args) {
		
		
		int round = 1;
		int fight = 1;
		
		
		GameCharacter myFighters[] = {
				new Fremen("Muad' Dib" , 15 ,20, 300),
				new Sardukar("Shadam", 15,15,300),
				new BeneGeserit("Miles Teg", 30, 100, 300),
				new Mentat("Duncan Idaho" , 25, 50, 300),
				new Tlelaxu("Whaf", 5,15,200)
		};
		   Random randNum = new Random();                                                 
		
			 for (int i =0; i < fight ; i++ ) {
				 i = (int)(Math.random() * myFighters.length);
				 myFighters[i] = myFighters[i];
				 
				 for(int l = 0; l <fight ; l++) {
					 myFighters[l] = myFighters[(randNum.nextInt(myFighters.length -1) + 1)];
					 
					
				 
				 
			System.out.println("   \nRound " + round +" " + myFighters[i] + "   vs   " + myFighters[l]);
			
			while(myFighters[i].health > 0 && myFighters[l].health > 0 ) {
				round++;
				
			myFighters[i].hit(myFighters[l].attact());
			myFighters[l].hit(myFighters[i].attact());
			
			System.out.println("   \nRound " + round +" " + myFighters[i] + "   vs   " + myFighters[l]);
			
			if (myFighters[i].health ==0) {
				myFighters[i].isAlive();
				System.out.println(myFighters[l].cName + " is victorious.");
			}
			else if (myFighters[l].health == 0) {
				myFighters[l].isAlive();
				System.out.println(myFighters[i].cName + " is victorious.");
			}
			}
			 }
			 }
		
		
	}
}



