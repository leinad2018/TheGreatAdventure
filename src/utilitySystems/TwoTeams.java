package utilitySystems;

import squadSystems.SquadBase;

/**
 * A class that is used to return a pair of teams and is primarily used for combat
 * @author Daniel
 *
 */
public class TwoTeams {
	private SquadBase team1;
	private SquadBase team2;
	
	public TwoTeams(SquadBase team1, SquadBase team2){
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public SquadBase getAttacker(){
		return team1;
	}
	
	public SquadBase getDefender(){
		return team2;
	}
}
