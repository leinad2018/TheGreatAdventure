package utilitySystems;

import unitSystems.ISquad;

/**
 * A class that is used to return a pair of teams and is primarily used for combat
 * @author Daniel
 *
 */
public class TwoTeams {
	private ISquad team1;
	private ISquad team2;
	
	public TwoTeams(ISquad team1, ISquad team2){
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public ISquad getAttacker(){
		return team1;
	}
	
	public ISquad getDefender(){
		return team2;
	}
}
