package unitSystems;

public class TestUnit implements IUnit {
	private final static int STARTHEALTH = 1;
	private final static int ATTACKPOW = 1;
	private final static int DEFENSEPOW = 1;
	private int health;

	public TestUnit(){
		health = STARTHEALTH;
	}
	
	public int getHealth() {
		return health;
	}

	public boolean doDamage(int damage) {
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
		return "TestUnit: Attack="+ATTACKPOW+" Defense="+DEFENSEPOW+" Health="+health;
	}
}
