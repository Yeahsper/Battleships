package main;

public class Board {

	int rows, columns;
	public char[][] board = new char[10][10];

	public void fillBoard() {
		for (rows = 0; rows < 10 ; rows++) {
			for (columns = 0; columns < 10; columns++) {
				board[rows][columns] = '0';
			}
		}
	}

	public void placeShip(int posX, int posY, int size, Placement placement) {
		boolean success = true;

		if(placement == Placement.HORIZONTAL) {
			for(int i = posY; i < posY+size; i++) {

				if(board[i][posY-1] == 'x') {
					System.out.println("Can't place down the ship ");
					success = false;
					break;
				}//if
			}//for

			if(success) {
				System.out.println("Got space");
				for(int i = 0; i < size; i++) {
					board[posX-1][posY-1+i] = 'x';
					success = false;
				}//for
			}//success
		}//if

		if(placement == Placement.VERTICAL) {
			for(int i = posX; i < posX+size; i++) {

				if(board[posX-1][i] == 'x') {
					System.out.println("Can't place down the ship ");
					success = false;
					break;
				}//if
			}//for
			if(success) {
				System.out.println("Got space");
				for(int i = 0; i < size; i++) {
					board[posX-1+i][posY-1] = 'x';
					success = false;
				}//for
			}//if-success
		}//if-vertical
	}

	public void printBoard() {
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print(board[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}
