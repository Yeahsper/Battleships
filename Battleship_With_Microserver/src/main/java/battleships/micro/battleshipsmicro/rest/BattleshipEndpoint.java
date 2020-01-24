package battleships.micro.battleshipsmicro.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import json.ConvertJson;
import main.Board;
import main.Factory;
import ships.IShip;
import ships.ShipType;

//Path sets where this is, for example localhost:8080@Path
@Path("/battleship")
public class BattleshipEndpoint {

    @GET
    @Produces("text/json")
    public Response doGet() {
		Board board = new Board();
		ConvertJson convertJson = new ConvertJson();
		board.initBoard();
		System.out.println();
		
		//Create ships and place them on the board
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
		
		//Convert the board to JSON format
		String temp = convertJson.toJson(board);
    	
    	//Return the string and show it on the website
        return Response.ok(temp).build();
    }
}
