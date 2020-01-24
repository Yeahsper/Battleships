package ships;

import main.Direction;

public class Submarine implements IShip {

	//--Variables--
	private int posX;
	private int posY;
	private int size = 3;
	private ShipType type = ShipType.SUBMARINE;
	private Direction direction;
	
	//--Constructors--
	public Submarine() {
		
	}

	public Submarine(int posX, int posY, Direction direction) {
		this.posX = posX;
		this.posY = posY;
		this.direction = direction;
	}

	//--Getters & Setters--
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
