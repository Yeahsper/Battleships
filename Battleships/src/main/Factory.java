package main;

import ships.Battleship;
import ships.Carrier;
import ships.Destroyer;
import ships.IShip;
import ships.ShipType;
import ships.Submarine;

public class Factory {

	public static IShip createShip(ShipType ship, int posX, int posY, Placement placement) {
		if(ShipType.CARRIER == ship) {
			return new Carrier(posX, posY, placement);
		}else if (ShipType.BATTLESHIP == ship) {
			return new Battleship(posX, posY, placement);
		}else if (ShipType.SUBMARINE == ship) {
			return new Submarine(posX, posY, placement);
		}else if(ShipType.DESTROYER == ship) {
			return new Destroyer(posX, posY, placement);
		}else
			return null;
	}
}
