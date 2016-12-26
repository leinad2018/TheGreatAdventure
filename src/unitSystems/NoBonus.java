package unitSystems;

import java.awt.Point;
import java.util.List;

public class NoBonus implements ISquad {
	private List<IUnit> members;
	private Point position;

	@Override
	public boolean addUnits(List<IUnit> toAdd) {
		return !members.addAll(toAdd);
	}

	@Override
	public boolean addUnits(IUnit toAdd) {
		return !members.add(toAdd);
	}

	@Override
	public boolean removeUnits(List<IUnit> toRemove) {
		
		return false;
	}

	@Override
	public List<IUnit> getUnits() {
		return members;
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public boolean setPosition(Point newPosition) {
		// TODO Auto-generated method stub
		return false;
	}

}
