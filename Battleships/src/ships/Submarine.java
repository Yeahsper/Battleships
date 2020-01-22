package ships;

import main.Placement;

public class Submarine implements IShip {

	
	private int posX;
	private int posY;
	private int size = 3;
	private ShipType type = ShipType.SUBMARINE;
	private Placement placement;
	

	
	public Submarine() {
		
	}

	public Submarine(int posX, int posY, Placement placement) {
		this.posX = posX;
		this.posY = posY;
		this.placement = placement;
	}


	@Override
	public int getPosX() {
		return posX;
	}

	@Override
	public int getPosY() {
		return posY;
	}

	@Override
	public ShipType getShipType() {
		return type;
	}
	
	@Override
	public int getSize() {
		return size;
	}
	

	@Override
	public Placement getPlacement() {
		return placement;
	}
}