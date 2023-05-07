/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;

/**
 * @author migue
 *
 */
public class Tlelaxu extends GameCharacter {

	/**
	 * 
	 */
	public Tlelaxu() {
		// TODO Auto-generated constructor stub
	}

	public Tlelaxu(String name, int cstrength, int cspeed,int chealth) {
		super (name, cstrength , cspeed, chealth);
	}
	public  int attact() {
		int tAttact = strength + speed;
		System.out.println("   " + cName + " slash with his daggers: " + tAttact + " points");
		return tAttact;
	}
	public void hit(int points) {
		health = health- points;
		if (health < 0) {
			health = 0;
			System.out.println("You dirty Powindah");
		}
		else {
			System.out.println("   " + cName + " " + "is wounded!");
		
		}
		System.out.println("   " + cName + " current health: "+ health);
	}
	public boolean isAlive() {
		if (health > 0) {
			System.out.println("   The Prophet is with me");
			return true;
		}
		else {
			System.out.println("   " + cName + " I shall be back from the tank");
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
