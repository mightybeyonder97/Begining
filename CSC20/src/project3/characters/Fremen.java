/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;

/**
 * @author migue
 *
 */
public class Fremen extends GameCharacter {

	
	public Fremen() {
		// TODO Auto-generated constructor stub
	}

	
	public Fremen(String name, int cstrength, int cspeed, int chealth) {
		super(name, cstrength, cspeed, chealth);
		
	}
	public  int attact() {
		int fAttact = strength + speed;
		System.out.println("   " + cName + " slash with his crystknife: " + fAttact + " points");
		return fAttact;
	}
	public void hit(int points) {
		health = health- points;
		if (health < 0) {
			health = 0;
			System.out.println("I shall return to the desert");
		}
		else {
			System.out.println("   " + cName + " " + "is wounded!");
		System.out.println("   " + cName + " water is being wasted!");
		}
		System.out.println("   " + cName + " current health: "+ health);
	}
	public boolean isAlive() {
		if (health > 0) {
			System.out.println("   Shai Hulud is with me");
			return true;
		}
		else {
			System.out.println("   " + cName + " water belongs to the sietch");
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



