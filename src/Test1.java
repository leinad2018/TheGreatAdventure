import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import combatSystems.Combat;
import squadSystems.NoBonus;
import squadSystems.SquadBase;
import unitSystems.IUnit;
import unitSystems.UnitBase;
import utilitySystems.TwoTeams;
import visualSystems.BoardDisplay;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<IUnit> team1 = new ArrayList<IUnit>(100);
		ArrayList<IUnit> team2 = new ArrayList<IUnit>(100);
		for(int i = 0; i < 11; i++){
			team1.add(new UnitBase());
		}
		for(int i = 0; i < 1; i++){
			team2.add(new UnitBase());
		}
		SquadBase team1s = new NoBonus(team1,new Point(0,0));
		SquadBase team2s = new NoBonus(team2,new Point(1,9));
		List<SquadBase> tempList = new ArrayList<>();
		tempList.add(team2s);
		tempList.add(team1s);
		BoardDisplay board = BoardDisplay.getInstance(10,tempList);
		board.printBoard();
		Combat.battle(new TwoTeams(team1s,team2s));
	}
}
