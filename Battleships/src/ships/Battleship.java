package ships;

import main.Direction;

public class Battleship implements IShip {
	
	private int posX;
	private int posY;
	private int size = 4;
	private ShipType type = ShipType.BATTLESHIP;
	private Direction direction;
	

	
	public Battleship() {
		
	}

	public Battleship(int posX, int posY, Direction direction) {
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
