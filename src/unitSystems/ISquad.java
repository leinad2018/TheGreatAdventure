package unitSystems;

import java.awt.Point;
import java.util.List;

/**
 * ISquad objects are the objects that hold all units in the board. These are very important for future updates such as landscape bonus and building bonus. It also makes moving units much more efficient.
 * @author Daniel
 *
 */
public interface ISquad {
	/**
	 * Gets how many members are in this squad
	 * @return the size of the squad
	 */
	public int size();
	/**
	 * Adds the inputed units to the squad
	 * @param toAdd the units to add
	 * @return false if the addition was successful
	 */
	public boolean addUnits(List<IUnit> toAdd);
	public boolean addUnits(IUnit toAdd);
	/**
	 * Removes units from the squad based on the toString() of each unit
	 * @param toRemove the units to remove
	 * @return false if the removal was successful
	 */
	public boolean removeUnits(List<IUnit> toRemove);
	/**
	 * Does damage to the squad and kills units if their health hits 0
	 * @param damage the amount of damage to do to the squad
	 */
	public void doDamageToSquad(int damage);
	/**
	 * get all units in this squad
	 * @return units in squad
	 */
	public List<IUnit> getUnits();
	/**
	 * Adds the attack of all units in the squad
	 * @return the total attack power
	 */
	public int getTotalAttack();
	/**
	 * Adds the defense of all units in the squad
	 * @return the total defense power
	 */
	public int getTotalDefense();
	
	public Point getPosition();
	/**
	 * sets the new position of the squad
	 * @param newPosition the position to move to
	 * @return false if the position was set
	 */
	public boolean setPosition(Point newPosition);
}
