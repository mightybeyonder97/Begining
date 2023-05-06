/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;

/**
 * @author migue
 *
 */
public class BeneGeserit extends GameCharacter {

	
	public BeneGeserit() {
		
	}

		public BeneGeserit(String name, int cstrength, int cspeed, int chealth) {
		super(name, cstrength, cspeed, chealth);
		
	}
		public  int attact() {
			int bAttact = strength + speed;
			System.out.println("   " + cName + " activate his super speed and deals a fatal blow: " + bAttact + " points");
			return bAttact;
		}
		public void hit(int points) {
			health = health - points;
			if(health < 0 ) {
				health = 0;
				System.out.println("I serverd the sisterhood well");
			}
			else {
				System.out.println("   " + cName + " " + "is wounded!");
			System.out.println("   Nice hit, better luck next time.");
			}
			System.out.println("   " + cName + " current health: " + health);
		}
		public boolean isAlive() {
			if (health > 0) {
				System.out.println("   I have been through worst");
				return true;
			}
			else {
				System.out.println("   That was a glorious battle.");
				System.out.println("   " + cName + " has perished");
				return false;
			}
		}
		public String getName() {
			return this.cName;
		
		}
		public int getStrength() {
			return this.strength;
		}
		public int getSpeed() {
			return this.speed;
		}
	    public int getHealth() {
	    	return this.health;
	    }
	    
	    public String toString() {
	    	return(cName + ": " + "Strength: " + strength + "/" + strength + " " + "Speed: " + speed + "/" + speed + " " + "Health: " + health + "/" + health);
	    }
	}


