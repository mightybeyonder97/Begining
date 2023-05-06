/** Name: Miguelito Jean
 * Class : CSC205
 */
package projects.project5bag;

import project3.characters.Sardukar;
import project3.characters.Mentat;
import project3.characters.Fremen;

import java.util.Iterator;

import project3.characters.BeneGeserit;
import project3.characters.GameCharacter;


	public class Project5 {

		public static void main(String[] args) {
            BagTeam<GameCharacter> team1 = new BagTeam<GameCharacter>();
            BagTeam<GameCharacter> team2 = new BagTeam<GameCharacter>();
           
            
            int round = 0;
            int team1Health = 0;
            int team2Health = 0;
 			
            team1.add(new Fremen("Muad'Dib" ,15, 20, 300));
            team1.add(new BeneGeserit("Miles Teg", 30, 100, 300));
    		team1.add(new Mentat("Duncan Idaho", 25, 50, 300));
    		team1.add(new Mentat("Thuffir", 10, 10,300));
    		team1.add(new Sardukar("Farad'In", 15, 10, 300));
    		
            team2.add(new Mentat("Piter", 5 , 5, 300));
            team2.add(new Fremen("Jamis", 10 , 15, 300));
    		team2.add(new BeneGeserit("Murbella", 15, 70, 300));
    		team2.add(new Mentat("Thuffir Ghola", 5, 10,300));
    		team2.add(new Sardukar("Shadam", 15,15,300));
            
           
            for (GameCharacter c: team1) {
            	for (GameCharacter t: team2) {
            		
            		team1Health += c.getHealth();
            		team2Health += t.getHealth();
             		
            		while (c.getHealth() > 0 && t.getHealth() > 0) {
            			
            			Iterator<GameCharacter> itr1 = team1.iterator();
                		Iterator<GameCharacter> itr2 = team2.iterator();
                		System.out.println("   \nRound " + round +" " + c + "   vs   " + t);
                		while (itr1.hasNext() && itr2.hasNext()) {
                			System.out.print("[ " + itr1.next() + " ]   ");
                			
                			System.out.print("  [ " + itr2.next() + " ] ");
                			
                		System.out.println();
                		}
            		round++;
            		c.hit(t.attact());
            		t.hit(c.attact());
            		
            		System.out.println("   \nRound " + round +" " + c + "   vs   " + t);
            		

            		if (c.getHealth() == 0) {
        				c.isAlive();
        				System.out.println(t.getName() + " is victorious.");
        				
        			}
            		
        			else if (t.getHealth() == 0) {
        				t.isAlive();
        				team2.isEmpty();
        				System.out.println(c.getName() + " is victorious.");
        			
        			}
            		
            		
            		}
            		
            }
            }
            if (team1Health > 0) {
    			System.out.println("Team 1 wins");
    			System.out.println("[ " + team1 + "]");
    		}
    		else {
    			System.out.println("Team 2 wins");
    			System.out.println("[ " + team2 + "]");
    		}
		}

	}

