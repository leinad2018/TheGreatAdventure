package squadSystems;

import java.awt.Point;
import java.util.List;

import unitSystems.IUnit;
import visualSystems.BoardDisplay;

public class SquadBase {
	private List<IUnit> members;
	private Point position;
	// TODO decide default move speed value
	protected int moveSpeed;

	/**
	 * Extend this class to create custom squads that have unique modifiers
	 * 
	 * @param units
	 *            the units in this squad
	 * @param pos
	 *            the position of this squad
	 */
	public SquadBase(List<IUnit> units, Point pos) {
		members = units;
		position = pos;
		moveSpeed = 1;
	}

	/**
	 * Gets the amount of units in this squad
	 * 
	 * @return number of units
	 */
	public int size() {
		return members.size();
	}

	/**
	 * Adds a List of units to the squad
	 * 
	 * @param toAdd
	 *            the units to add
	 * @return true if the addition was successful
	 */
	public boolean addUnits(List<IUnit> toAdd) {
		return members.addAll(toAdd);
	}

	/**
	 * Adds a single unit to the squad
	 * 
	 * @param toAdd
	 *            the unit to add
	 * @return true if the unit was added
	 */
	public boolean addUnits(IUnit toAdd) {
		return members.add(toAdd);
	}

	// TODO implement here
	public boolean removeUnits(List<IUnit> toRemove) {
		return true;
	}

	/**
	 * Gets a list of all units in this squad
	 * 
	 * @return the units in the squad
	 */
	public List<IUnit> getUnits() {
		return members;
	}

	/**
	 * Gets the position of the squad
	 * 
	 * @return the position as a Point
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * Sets a new position for the squad<br>
	 * Preconditions: newPosition is within the range of the moveSpeed of this
	 * squad and is in the board<br>
	 * PostConditions: Sets the position otherwise does nothing<br>
	 * 
	 * @param newPosition
	 *            the position to move to
	 * @return true if the position was set
	 */
	public boolean setPosition(Point newPosition) {
		int boardSize = BoardDisplay.getSize();
		if (Math.abs(position.getX() - newPosition.getX())
				+ Math.abs(position.getY() - newPosition.getY()) > moveSpeed) {
			return false;
		}
		if (newPosition.getX() < boardSize && newPosition.getY() < boardSize) {
			this.position = newPosition;
			return true;
		}
		return false;
	}
	/**
	 * Gets the total attack power of the squad
	 * @return total attack power
	 */
	public int getTotalAttack() {
		int attackPow = 0;
		for (int attackUnit = 0; attackUnit < members.size(); attackUnit++) {
			attackPow += members.get(attackUnit).getAttackStrength();
		}
		return attackPow;
	}
	/**
	 * Gets the total defense power of the squad
	 * @return total defense power
	 */
	public int getTotalDefense() {
		int defensePow = 0;
		for (int defenseUnit = 0; defenseUnit < members.size(); defenseUnit++) {
			defensePow += members.get(defenseUnit).getDefenseStrength();
		}
		return defensePow;
	}
	/**
	 * Does the specified amount of damage to the squad truncating left over damage<br>
	 * Preconditions: damage must be a positive number<br>
	 * Postconditions: damage is done TODO in order of unit priority then from lowest to highest health<br>
	 * @param damage The amount of damage to deal
	 */
	//TODO priority may be done by sorting the list internally and not through this method
	public void doDamageToSquad(int damage) {
		int damageToDo = damage;
		while (members.size() > 0 && damageToDo > 0) {
			int unitHealth = members.get(0).getHealth();
			if (members.get(0).takeDamage(Math.min(unitHealth, damageToDo))) {
				members.remove(0);
			}
			damageToDo -= Math.min(unitHealth, damageToDo);
		}
	}
	/**
	 * Gets the movement speed of the squad
	 * @return moveSpeed
	 */
	public int getMoveSpeed() {
		return moveSpeed;
	}
}
