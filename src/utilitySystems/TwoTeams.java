package utilitySystems;

import unitSystems.IUnit;

/**
 * A class that is used to return a pair of teams and is primarily used for combat
 * @author Daniel
 *
 */
public class TwoTeams {
	public IUnit[] team1;
	public IUnit[] team2;
	
	public TwoTeams(IUnit[] team1, IUnit[] team2){
		this.team1 = team1;
		this.team2 = team2;
	}
}
