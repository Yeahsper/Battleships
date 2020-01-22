package main;

import ships.IShip;
import ships.ShipType;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		board.fillBoard();
		System.out.println();
		IShip carrier = Factory.createShip(ShipType.CARRIER);		//Size 5, C
		board.placeShip(carrier.getShipType());

		IShip battleship = Factory.createShip(ShipType.BATTLESHIP);	//size 4, B
		board.placeShip(battleship.getShipType());

		IShip submarine1 = Factory.createShip(ShipType.SUBMARINE);		//size 3, S
		board.placeShip(submarine1.getShipType());

		IShip submarine2 = Factory.createShip(ShipType.SUBMARINE);		//size 3, S
		board.placeShip(submarine2.getShipType());

		IShip destroyer1 = Factory.createShip(ShipType.DESTROYER);		//Size 2, D
		board.placeShip(destroyer1.getShipType());

		IShip destroyer2 = Factory.createShip(ShipType.DESTROYER);		//Size 2, D
		board.placeShip(destroyer2.getShipType());

		System.out.println();
		board.printBoard();
	}
}
