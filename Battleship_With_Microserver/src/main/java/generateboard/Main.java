package generateboard;

import java.io.IOException;

import json.ConvertJson;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		ConvertJson convertJson = new ConvertJson();
		try {
		board = convertJson.fromJson();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		board.printBoard();
	}
}
