package visualSystems;

import java.awt.Point;
import java.util.List;

import squadSystems.SquadBase;
import tileSystems.Tile;
//Need to make into a singleton 
public class BoardDisplay {
	private Tile[][] board;
	private static int size;
	private static BoardDisplay gameBoard;
	
	public static BoardDisplay getInstance(){
		if(gameBoard == null){
			gameBoard = new BoardDisplay(10, null);
		}
		return gameBoard;
	}
	
	public static BoardDisplay getInstance(int size, List<SquadBase> squadsIn){
		if(gameBoard == null){
			gameBoard = new BoardDisplay(size, squadsIn);
		}
		return gameBoard;
	}
	
	private BoardDisplay(int size, List<SquadBase> squadsIn){
		BoardDisplay.size = size;
		board = new Tile[size][size];
		for(int x = 0; x < size; x++){
			for(int y = 0; y < size; y++){
				board[x][y] = new Tile();
			}
		}
		for(int i = 0; i < squadsIn.size(); i++){
			Point tempPos = squadsIn.get(i).getPosition();
			board[(int)tempPos.getX()][(int)tempPos.getY()].setDefender(squadsIn.get(i));
		}
	}
	
	public Tile[][] getBoard(){
		return board;
	}
	
	public static int getSize(){
		return size;
	}
	
	public void printBoard(){
		for(int y = 0; y < size; y++){
			for(int x = 0; x < size; x++){
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
	}
}
