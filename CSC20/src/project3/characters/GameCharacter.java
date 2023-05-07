/** Name: Miguelito Jean
 * Class : CSC205
 */
package project3.characters;


public abstract class GameCharacter {
	
	//Tlelaxu
	protected String cName;
	protected int strength;
	protected int speed;
	protected int health;
	
	public GameCharacter() {
		cName = "no name";
		strength = 0;
		speed = 0;
		health = 0;
	}
	
	public  GameCharacter(String name, int cstrength,int cspeed,int chealth) {
		this.cName = name;
		this.strength = cstrength;
		this.speed = cspeed;
		this.health = chealth;
	}
	public  int attact() {
		return strength;
	}
	public void hit(int points) {
		health = health- points;
	}
	public boolean isAlive() {
		if (health > 0) {
			
			return true;
		}
		else {
			
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
