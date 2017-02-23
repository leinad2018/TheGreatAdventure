package squadSystems;

import java.awt.Point;
import java.util.List;

import unitSystems.IUnit;
import visualSystems.BoardDisplay;

public class SquadBase{
	private List<IUnit> members;
	private Point position;
	
	/**
	 * Extend this class to create custom squads that have unique modifiers
	 * @param units the units in this squad
	 * @param pos the position of this squad
	 */
	public SquadBase(List<IUnit> units, Point pos){
		members = units;
		position = pos;
	}
	
	public int size(){
		return members.size();
	}
	
	public boolean addUnits(List<IUnit> toAdd) {
		return !members.addAll(toAdd);
	}

	public boolean addUnits(IUnit toAdd) {
		return !members.add(toAdd);
	}

	//TODO implement here
	public boolean removeUnits(List<IUnit> toRemove) {
		return true;
	}

	public List<IUnit> getUnits() {
		return members;
	}
	
	public Point getPosition() {
		return position;
	}

	//TODO might have to make non unlimited movement, but maybe not here
	public boolean setPosition(Point newPosition) {
		int boardSize = BoardDisplay.getSize();
		if(newPosition.getX() < boardSize && newPosition.getY() < boardSize){
			this.position = newPosition;
			return false;
		}
		return true;
	}
	
	public int getTotalAttack(){
		int attackPow = 0;
		for (int attackUnit = 0; attackUnit < members.size(); attackUnit++) {
			attackPow += members.get(attackUnit).getAttackStrength();
		}
		return attackPow;
	}
	
	public int getTotalDefense(){
		int defensePow = 0;
		for (int defenseUnit = 0; defenseUnit < members.size(); defenseUnit++) {
			defensePow += members.get(defenseUnit).getDefenseStrength();
		}
		return defensePow;
	}
	
	public void doDamageToSquad(int damage){
		int damageToDo = damage;
		while(members.size() > 0 && damageToDo > 0){
			int unitHealth = members.get(0).getHealth();
			if(members.get(0).takeDamage(Math.min(unitHealth,damageToDo))){
				members.remove(0);
			}
			damageToDo-= Math.min(unitHealth,damageToDo);
		}
	}
}
