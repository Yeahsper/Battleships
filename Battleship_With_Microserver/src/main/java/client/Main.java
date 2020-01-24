package client;

import java.io.IOException;

import etc.Board;
import json.ConvertJson;

/**
 * This is the "client", all it should do (for now) is to connect to a microservice and 
 * get a randomized battleship board.
 * @author Jesper
 *
 */
public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		ConvertJson convertJson = new ConvertJson();
		
		try {
		board = convertJson.fromJson();
		board.printBoard();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
