import combatSystems.Combat;
import unitSystems.IUnit;
import unitSystems.TestUnit;
import utilitySystems.TwoTeams;

public class Test1 {

	public static void main(String[] args) {
		IUnit[] team1 = new IUnit[5];
		IUnit[] team2 = new IUnit[10];
		for(int i = 0; i < team1.length; i++){
			team1[i] = new TestUnit();
		}
		for(int i = 0; i < team2.length; i++){
			team2[i] = new TestUnit();
		}
		Combat.battle(new TwoTeams(team1,team2));
	}
}
