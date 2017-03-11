package gameEngine;

import java.awt.Point;

import tileSystems.Tile;
import visualSystems.BoardDisplay;

/**
 * System for selecting a unit from a Squad/Tile
 * @author Daniel
 *
 */
public class UnitSelection {
	
	public static Tile requestTile(Point position){
		return BoardDisplay.getInstance().getBoard() [(int)position.getX()][(int)position.getY()];
	}
}
