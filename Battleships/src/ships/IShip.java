package ships;

import main.Placement;

public interface IShip {
	
	public int getPosX();
	public int getPosY();
	public int getSize();
	public ShipType getShipType();
	public Placement getPlacement();
}
