package battleships.micro.battleshipsmicro.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import generateboard.Board;
import generateboard.Factory;
import json.ConvertJson;
import ships.IShip;
import ships.ShipType;


@Path("/battleship")
public class BattleshipEndpoint {

    @GET
    @Produces("text/json")
    public Response doGet() {
		Board board = new Board();
		ConvertJson convertJson = new ConvertJson();
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
		
		String temp = convertJson.toJson(board);
    	
    	
        return Response.ok(temp).build();
    }
}
