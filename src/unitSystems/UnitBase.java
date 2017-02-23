package unitSystems;

public class UnitBase implements IUnit {
	protected final static int STARTHEALTH = 1;
	protected final static int ATTACKPOW = 1;
	protected final static int DEFENSEPOW = 1;
	protected final static int PRIORITY = 3;
	protected int health;

	/**
	 * This is the most basic unit and can be extended for easy implementation<br>
	 * Units do not have to extend however as this is just for convenience.
	 */
	public UnitBase(){
		health = STARTHEALTH;
	}
	
	public int getPriority(){
		return PRIORITY;
	}
	
	public int getHealth() {
		return health;
	}

	public boolean takeDamage(int damage) {
		if(damage > health){
			throw new IllegalArgumentException("damage is higher than unit health");
		}
		health -= damage;
		if(health == 0){
			return true;
		}
		return false;
	}

	public int getAttackStrength() {
		return ATTACKPOW;
	}

	public int getDefenseStrength() {
		return DEFENSEPOW;
	}
	
	public String toString(){
		return "UnitBase: Attack="+ATTACKPOW+" Defense="+DEFENSEPOW+" Health="+health;
	}
}
