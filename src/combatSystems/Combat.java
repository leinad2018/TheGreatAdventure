package combatSystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unitSystems.IUnit;
import utilitySystems.TwoTeams;

public class Combat {
	public static TwoTeams battle(TwoTeams teams) {
		ArrayList<IUnit> attack = (ArrayList<IUnit>)teams.team1;
		int attackPow = 0;
		for (int attackUnit = 0; attackUnit < attack.size(); attackUnit++) {
			attackPow += attack.get(attackUnit).getAttackStrength();
		}
		ArrayList<IUnit> defense = (ArrayList<IUnit>)teams.team2;
		int defensePow = 0;
		for (int defenseUnit = 0; defenseUnit < defense.size(); defenseUnit++) {
			defensePow += defense.get(defenseUnit).getDefenseStrength();
		}
		teams.team1 = determineDeaths(attack,defensePow);
		teams.team2 = determineDeaths(defense,attackPow);
		
		return teams;
	}
	
	private static ArrayList<IUnit> determineDeaths(ArrayList<IUnit> units, int damage){
		System.out.println(units);
		int damageToDo = damage;
		while(units.size() > 0 && damageToDo > 0){
			int temp = units.get(0).getHealth();
			if(units.get(0).doDamage(Math.min(temp,damageToDo))){
				units.remove(0);
			}
			damageToDo-= Math.min(temp,damageToDo);
		}
		System.out.println(units);
		return units;
	}
}
