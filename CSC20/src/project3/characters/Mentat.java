/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;


public class Mentat extends GameCharacter {

	public Mentat() {
		// TODO Auto-generated constructor stub
	}

	
	public Mentat(String name, int cstrength, int cspeed, int chealth) {
		super(name, cstrength, cspeed, chealth);
		
	}
	
	public  int attact() {
		int mAttact = strength + speed;
		System.out.println("   " + cName + " unleash a fury of short sword swing: " + mAttact + " points");
		return mAttact;
	}
	public void hit(int points) {
		health = health - points;
		if(health < 0 ) {
			health = 0;
			System.out.println("   I am ready for the new journey");
		}
		else {
			System.out.println("   " + cName + " " + "is wounded!");
		System.out.println("   I have collected all your move pattern already.");
		}
		System.out.println("   " + cName + " current health: " + health);
	}
	public boolean isAlive() {
		if (health > 0) {
			System.out.println("   The mind of the mentat is always restless");
			return true;
		}
		else {
			System.out.println("   They will grow another ghola eventually");
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
