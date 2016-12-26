package unitSystems;

import utilitySystems.OutputConfigured;

public interface IUnit extends OutputConfigured {
	/**
	 * 
	 * @return the health of the unit
	 */
	public int getHealth();
	/**
	 * Does damage to the Unit
	 * @param damage the amount of damage to do
	 * @return true if unit should die false otherwise
	 */
	public boolean doDamage(int damage);
	/**
	 * This is how much damage the unit should do when attacking
	 * @return the attack strength of the unit
	 */
	public int getAttackStrength();
	/**
	 * This is how much damage the unit should do when defending
	 * @return the defense strength of the unit
	 */
	public int getDefenseStrength();
}
