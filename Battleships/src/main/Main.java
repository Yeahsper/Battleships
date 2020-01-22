package main;

import ships.IShip;
import ships.ShipType;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		board.fillBoard();
		System.out.println();
		
		IShip boat3 = Factory.createShip(ShipType.SUBMARINE, 2, 2, Placement.VERTICAL);
		board.placeShip(boat3.getPosX(), boat3.getPosY(), boat3.getSize(), boat3.getPlacement());
		
		IShip boat2 = Factory.createShip(ShipType.BATTLESHIP, 2, 2, Placement.HORIZONTAL);
		board.placeShip(boat2.getPosX(), boat2.getPosY(),boat2.getSize(), boat2.getPlacement());
		

		
		board.printBoard();
	}
}
