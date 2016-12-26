package combatSystems;

import unitSystems.ISquad;
import utilitySystems.TwoTeams;

public class Combat {
	public static TwoTeams battle(TwoTeams teams) {
		ISquad attack = teams.getAttacker();
		ISquad defense = teams.getDefender();
		attack.doDamageToSquad(defense.getTotalDefense());
		defense.doDamageToSquad(attack.getTotalAttack());
		
		return teams;
	}
}
