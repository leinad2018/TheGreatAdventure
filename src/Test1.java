import java.util.ArrayList;

import combatSystems.Combat;
import unitSystems.IUnit;
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
		
		Combat.battle(new TwoTeams(team1,team2));
	}
}
