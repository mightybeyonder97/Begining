/** Name: Miguelito Jean
 * Class : CSC205
 */
package activity5teams;

import project3.characters.Sardukar;
import project3.characters.Mentat;
import project3.characters.Fremen;
import project3.characters.BeneGeserit;
import project3.characters.GameCharacter;


public class Activity5 {

	public static void main(String[] args) {
		
		Team<GameCharacter> myFighters1 = new ArrayListTeam<GameCharacter>();
		Team<GameCharacter> myFighters2 = new ArrayListTeam<GameCharacter>();
		
		myFighters1.add(new Fremen("Muad'Dib" ,15, 20, 300));
		myFighters1.add(new BeneGeserit("Miles Teg", 30, 100, 300));
		myFighters1.add(new Mentat("Duncan Idaho", 25, 50, 300));
		myFighters1.add(new Mentat("Thuffir", 10, 10,300));
		myFighters1.add(new Sardukar("Farad'In", 15, 10, 300));
		
		myFighters2.add(new Fremen("Jamis", 10 , 15, 300));
		myFighters2.add(new BeneGeserit("Murbella", 15, 70, 300));
		myFighters2.add(new Mentat("Piter", 5 , 5, 300));
		myFighters2.add(new Mentat("Thuffir Ghola", 5, 10,300));
		myFighters2.add(new Sardukar("Shadam", 15,15,300));
		
		
		int fighter1TotalAttack = 0;
		int fighter2TotalAttack = 0;
		
		System.out.println("\nTeam 1: " + myFighters1);
		for(GameCharacter c: myFighters1) {
			fighter1TotalAttack = fighter1TotalAttack + c.attact();
			
		}
		System.out.println("The total number of my first team is : " + fighter1TotalAttack);
		
		System.out.println();
		
		System.out.println("\nTeam 2: " + myFighters2);
		
		for(GameCharacter c: myFighters2) {
			fighter2TotalAttack = fighter2TotalAttack + c.attact();
			
		}
		System.out.println("The total number of my second team is : " + fighter2TotalAttack);
		
		System.out.println();
		
		if(fighter1TotalAttack > fighter2TotalAttack) {
			System.out.println("Total attack of both teams: " + fighter1TotalAttack + " vs " + fighter2TotalAttack);
			System.out.println("Team 1 has more damage output, therefore they win.");
		}
		else if (fighter1TotalAttack < fighter2TotalAttack) {
			System.out.println("Total attack of both teams: " + fighter1TotalAttack + "vs" + fighter2TotalAttack);
			System.out.println("Team 2 has more damage output, therefore they win.");
		}

	}

}

	
