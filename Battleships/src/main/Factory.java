package main;

import ships.Battleship;
import ships.Carrier;
import ships.Destroyer;
import ships.IShip;
import ships.ShipType;
import ships.Submarine;

public class Factory {

	public static IShip createShip(ShipType ship) {
		if(ShipType.CARRIER == ship) {
			return new Carrier();
		}else if (ShipType.BATTLESHIP == ship) {
			return new Battleship();
		}else if (ShipType.SUBMARINE == ship) {
			return new Submarine();
		}else if(ShipType.DESTROYER == ship) {
			return new Destroyer();
		}else
			return null;
	}
}
