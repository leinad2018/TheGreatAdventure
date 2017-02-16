package tileSystems;

import unitSystems.ISquad;

public class TileInfo {
	public ISquad squad;
	private TileType tileType;
	
	public boolean hasSquad(){
		return squad==null;
	}
}
