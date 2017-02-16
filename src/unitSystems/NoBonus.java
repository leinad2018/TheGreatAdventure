package unitSystems;

import java.awt.Point;
import java.util.List;

import visualSystems.BoardDisplay;

public class NoBonus implements ISquad {
	private List<IUnit> members;
	private Point position;

	public NoBonus(List<IUnit> units, Point position){
		members = units;
		this.position = position;
	}
	
	@Override
	public int size(){
		return members.size();
	}
	
	@Override
	public boolean addUnits(List<IUnit> toAdd) {
		return !members.addAll(toAdd);
	}

	@Override
	public boolean addUnits(IUnit toAdd) {
		return !members.add(toAdd);
	}

	//implement here
	@Override
	public boolean removeUnits(List<IUnit> toRemove) {
		return true;
	}
	
	@Override
	public void doDamageToSquad(int damage){
		int damageToDo = damage;
		while(members.size() > 0 && damageToDo > 0){
			int temp = members.get(0).getHealth();
			if(members.get(0).doDamage(Math.min(temp,damageToDo))){
				members.remove(0);
			}
			damageToDo-= Math.min(temp,damageToDo);
		}
	}

	@Override
	public List<IUnit> getUnits() {
		return members;
	}

	@Override
	public int getTotalAttack(){
		int attackPow = 0;
		for (int attackUnit = 0; attackUnit < members.size(); attackUnit++) {
			attackPow += members.get(attackUnit).getAttackStrength();
		}
		return attackPow;
	}
	
	@Override
	public int getTotalDefense(){
		int defensePow = 0;
		for (int defenseUnit = 0; defenseUnit < members.size(); defenseUnit++) {
			defensePow += members.get(defenseUnit).getDefenseStrength();
		}
		return defensePow;
	}
	
	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public boolean setPosition(Point newPosition) {
		int boardSize = BoardDisplay.getSize();
		if(newPosition.getX() < boardSize && newPosition.getY() < boardSize){
			this.position = newPosition;
			return false;
		}
		return true;
	}

}
