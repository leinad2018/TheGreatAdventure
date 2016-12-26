package utilitySystems;

import java.util.List;

import unitSystems.ISquad;
import unitSystems.IUnit;

/**
 * A class that is used to return a pair of teams and is primarily used for combat
 * @author Daniel
 *
 */
public class TwoTeams {
	public List<IUnit> team1;
	public List<IUnit> team2;
	
	public TwoTeams(List<IUnit> team1, List<IUnit> team2){
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public TwoTeams(ISquad team1, ISquad team2){
		this.team1 = team1.getUnits();
		this.team2 = team2.getUnits();
	}
}
