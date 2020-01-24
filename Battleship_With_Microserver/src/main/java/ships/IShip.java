package ships;

import generateboard.Direction;

public interface IShip {
	
	public int getPosX();
	public int getPosY();
	public int getSize();
	public ShipType getShipType();
	public Direction getDirection();
}
