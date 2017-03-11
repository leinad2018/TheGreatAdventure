package tileSystems;

import squadSystems.SquadBase;
import utilitySystems.TwoTeams;

public class Tile {
	public TwoTeams squads;
	private TileType tileType;
	
	public Tile(){
		squads = new TwoTeams(null, null);
	}
	
	public boolean setAttacker(SquadBase squadIn){
		return squads.setAttacker(squadIn);
	}
	
	public boolean setDefender(SquadBase squadIn){
		return squads.setDefender(squadIn);
	}
	
	public boolean hasSquad(){
		return squads==null;
	}
}
