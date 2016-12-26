package combatSystems;

import java.util.ArrayList;
import java.util.Arrays;

import unitSystems.IUnit;
import utilitySystems.TwoTeams;

public class Combat {
	public static TwoTeams battle(TwoTeams teams) {
		IUnit[] attack = teams.team1;
		int attackPow = 0;
		for (int attackUnit = 0; attackUnit < attack.length; attackUnit++) {
			attackPow += attack[attackUnit].getAttackStrength();
		}
		IUnit[] defense = teams.team2;
		int defensePow = 0;
		for (int defenseUnit = 0; defenseUnit < defense.length; defenseUnit++) {
			defensePow += defense[defenseUnit].getDefenseStrength();
		}
		teams.team1 = determineDeaths(attack,defensePow);
		teams.team2 = determineDeaths(defense,attackPow);
		
		return teams;
	}
	
	private static IUnit[] determineDeaths(IUnit[] units, int damage){
		ArrayList<IUnit> toReturn = new ArrayList<IUnit>(Arrays.asList(units));
		System.out.println(toReturn);
		int damageToDo = damage;
		for(int i = 0; i < units.length && damageToDo > 0; i++){
			int temp = units[i].getHealth();
			if(units[i].doDamage(Math.min(temp,damageToDo))){
				toReturn.remove(0);
			}
			damageToDo-= Math.min(temp,damageToDo);
		}
		System.out.println(toReturn);
		return (IUnit[])toReturn.toArray(new IUnit[toReturn.size()]);
	}
}
