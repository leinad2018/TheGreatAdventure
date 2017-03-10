package unitSystems;

import utilitySystems.AttributeValue;
import utilitySystems.OutputConfigured;

public interface IUnit extends OutputConfigured {
	/**
	 * The priority of the unit is used to determine order for taking damage<br>
	 * 1 is the lowest priority(take damage first)
	 * @return The priority of the unit
	 */
	public int getPriority();
	/**
	 * 
	 * @return the health of the unit
	 */
	public int getHealth();
	/**
	 * Does damage to the Unit
	 * @param damage the amount of damage to do
	 * @return true if unit should die false otherwise
	 * @throws IllegalArgumentException if damage is larger than unit health
	 */
	public boolean takeDamage(int damage);
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
	/**
	 * Gets any attributes that modify the entire squad not just the single unit
	 * @return A squad attribute from this unit 
	 */
	public AttributeValue getAttribute();
	/**
	 * Heals the unit's health by heal amount
	 * @param healAmount the amount of health to heal
	 * @return the leftover heal after the unit has reached full health. Will not be negative.
	 */
	public int healUnit(int healAmount);
}
