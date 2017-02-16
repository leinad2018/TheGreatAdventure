package tileSystems;

import unitSystems.SquadBase;

public class TileInfo {
	public SquadBase squad;
	private TileType tileType;
	
	public boolean hasSquad(){
		return squad==null;
	}
}
