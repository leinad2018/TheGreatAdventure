package visualSystems;

import java.awt.Point;
import java.util.List;

import unitSystems.ISquad;
//Need to make into a singleton 
public class BoardDisplay {
	private char[][] board;
	private static int size;
	private List<ISquad> squads;
	public BoardDisplay(int size, List<ISquad> squadsIn){
		BoardDisplay.size = size;
		squads = squadsIn;
		board = new char[size][size];
		for(int x = 0; x < size; x++){
			for(int y = 0; y < size; y++){
				board[x][y] = 'G';
			}
		}
		for(int i = 0; i < squads.size(); i++){
			Point tempPos = squads.get(i).getPosition();
			board[(int)tempPos.getX()][(int)tempPos.getY()] = 'S';
		}
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
