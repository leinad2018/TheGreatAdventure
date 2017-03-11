package utilitySystems;

import squadSystems.SquadBase;

/**
 * A class that is used to return a pair of teams and is primarily used for combat
 * @author Daniel
 *
 */
public class TwoTeams {
	private SquadBase attacker;
	private SquadBase defender;
	
	public TwoTeams(SquadBase team1, SquadBase team2){
		this.attacker = team1;
		this.defender = team2;
	}
	/**
	 * Sets a new attacker if there is not one already
	 * @param newAttacker
	 * @return if the attacker was set
	 */
	public boolean setAttacker(SquadBase newAttacker){
		 if(attacker == null){
			 attacker = newAttacker;
			 return true;
		 }
		 return false;
	}
	/**
	 * Sets a new defender if there is not one already
	 * @param newDefender
	 * @return if the attacker was set
	 */
	public boolean setDefender(SquadBase newDefender){
		 if(defender == null){
			 defender = newDefender;
			 return true;
		 }
		 return false;
	}
	
	public SquadBase getAttacker(){
		return attacker;
	}
	
	public SquadBase getDefender(){
		return defender;
	}
}
