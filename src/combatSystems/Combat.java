package combatSystems;

import unitSystems.SquadBase;
import utilitySystems.TwoTeams;

public class Combat {
	public static TwoTeams battle(TwoTeams teams) {
		SquadBase attack = teams.getAttacker();
		SquadBase defense = teams.getDefender();
		attack.doDamageToSquad(defense.getTotalDefense());
		defense.doDamageToSquad(attack.getTotalAttack());
		
		return teams;
	}
}
