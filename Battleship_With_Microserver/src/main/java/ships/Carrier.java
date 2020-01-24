package ships;

import generateboard.Direction;

public class Carrier implements IShip {

	
	private int posX;
	private int posY;
	private int size = 5;
	private ShipType type = ShipType.CARRIER;
	private Direction direction;

	
	public Carrier() {
		
	}

	public Carrier(int posX, int posY, Direction direction) {
		this.posX = posX;
		this.posY = posY;
		this.direction = direction;
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
	public Direction getDirection() {
		return direction;
	}
}
