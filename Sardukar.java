/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;

/**
 * @author migue
 *
 */
public class Sardukar extends GameCharacter {

	
	public Sardukar() {
		
	}

	
	public Sardukar(String name, int cstrength, int cspeed, int chealth) {
		super(name, cstrength, cspeed, chealth);
		
	}
	public  int attact() {
		int sAttact = strength + speed;
		System.out.println("   " + cName + " stab with a blade thrust: " + sAttact + " points");
		return sAttact;
	}
	public void hit(int points) {
		health = health- points;
		
		if (health < 0) {
			health = 0;
			System.out.println("   I have failed the emperor");
		}
		else {
			System.out.println("   " + cName + " " + "is wounded!");
			System.out.println("   This is a mere scratch for a Sardukar.");
		}
		System.out.println("   " + cName + " current health: " + health);
	}
	public boolean isAlive() {
		if (health > 0) {
			System.out.println("   I am alive to only serve the emperor");
			return true;
		}
		else {
			System.out.println("   Impossible, my blade has failed me ");
			System.out.println("   " + cName + " is dead");
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


