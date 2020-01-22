package main;

import ships.ShipType;

public class Board {
	//--Variables--
	int rows, columns;
	public char[][] board = new char[10][10];

	//--Methods--
	
	public void placeShip(ShipType shipType) {
		boolean success = true;
		char tempChar = 'x';
		int shipSize = 0;
		Direction direction  = randomDirection();

		if(shipType == ShipType.BATTLESHIP) {
			tempChar = 'B';
			shipSize = 4;
		}
		else if(shipType == ShipType.CARRIER) {
			tempChar = 'C';
			shipSize = 5;
		}
		else if(shipType == ShipType.DESTROYER) {
			tempChar = 'D';
			shipSize = 2;
		}
		else if(shipType == ShipType.SUBMARINE) {
			tempChar = 'S';
			shipSize = 3;
		}
		
		//--Get random numbers and validate them--
		int posX = randomNumber();
		posX = validatePosition(posX, shipSize);

		int posY = randomNumber();
		posY = validatePosition(posY, shipSize);
		
		//--Try to place them on the board--
		if(direction == Direction.HORIZONTAL) {
			for(int i = 0; i < shipSize; i++) {
				if(board[posY-1][posX-1+i] != '0') {
					System.out.println("Can't place down the ship ");
					success = false;
					break;
				}
			}
			if(success) {
				System.out.println("Got space");
				for(int i = 0; i < shipSize; i++) {
					board[posY-1][posX-1+i] = tempChar;
				}
			}
		}
		
		if(direction == Direction.VERTICAL) {
			for(int i = 0; i < shipSize; i++) {
				if(board[posY-1+i][posX-1] != '0' || board[i][posX-1] != '0') {
					System.out.println("Can't place down the ship ");
					success = false;
					break;
				}					
			}
			if(success) {
				System.out.println("Got space");
				for(int i = 0; i < shipSize; i++) {
					board[posY-1+i][posX-1] = tempChar;
				}
			}
		}
		//If it didnt succeed, then run the same method with recursion
		if(!success) {
			placeShip(shipType);
			success = true;
		}
	}

	public void fillBoard() {
		for (rows = 0; rows < 10 ; rows++) {
			for (columns = 0; columns < 10; columns++) {
				board[rows][columns] = '0';
			}
		}
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

	//These are private because only this class should use them (for now)
	private int randomNumber() {
		int generatedNumber = (int) (Math.random() * 10+1);
		while(generatedNumber < 0 || generatedNumber > 9)
			generatedNumber = (int) (Math.random() * 10+1);
		return generatedNumber;
	}

	private Direction randomDirection() {
		int rng = (int)(Math.random() * 10);
		if(rng < 5)
			return Direction.VERTICAL;
		else
			return Direction.HORIZONTAL;
	}

	private int validatePosition(int pos, int shipSize) {
		if(shipSize == 5 & pos >= 6) 
			return pos = 6;
		else if(shipSize == 4 & pos >= 7)
			return pos = 7;
		else if(shipSize == 3 & pos >= 8)
			return pos = 8;
		else if(shipSize == 2 & pos >= 9)
			return pos = 9;	
		return pos;
	}
}
