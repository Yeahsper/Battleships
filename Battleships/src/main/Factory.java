package main;

import ships.Battleship;
import ships.Carrier;
import ships.Destroyer;
import ships.IShip;
import ships.ShipType;
import ships.Submarine;

public class Factory {

	public static IShip createShip(ShipType ship) {
		if(ship == ShipType.CARRIER) {
			return new Carrier();
		}else if(ship == ShipType.BATTLESHIP) {
			return new Battleship();
		}else if(ship == ShipType.SUBMARINE) {
			return new Submarine();
		}else if(ship == ShipType.DESTROYER) {
			return new Destroyer();
		}else
			return null;
	}
}
