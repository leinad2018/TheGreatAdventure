import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import combatSystems.Combat;
import display.BoardDisplay;
import unitSystems.ISquad;
import unitSystems.IUnit;
import unitSystems.NoBonus;
import unitSystems.TestUnit;
import utilitySystems.TwoTeams;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<IUnit> team1 = new ArrayList<IUnit>(100);
		ArrayList<IUnit> team2 = new ArrayList<IUnit>(100);
		for(int i = 0; i < 11; i++){
			team1.add(new TestUnit());
		}
		for(int i = 0; i < 1; i++){
			team2.add(new TestUnit());
		}
		ISquad team1s = new NoBonus(team1,new Point(0,0));
		ISquad team2s = new NoBonus(team2,new Point(1,9));
		List<ISquad> tempList = new ArrayList<>();
		tempList.add(team2s);
		tempList.add(team1s);
		BoardDisplay board = new BoardDisplay(10,tempList);
		board.printBoard();
		Combat.battle(new TwoTeams(team1s,team2s));
	}
}
