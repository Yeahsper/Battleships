package json;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import main.Board;

public class ConvertJson {
	//--Variables--
	private static HttpURLConnection connection;
	
	//--Methods--
	
	/**
	 * Converts a board-class to a JSON and returns it as a string.
	 * setPrettyPrinting formats it so it reads vertically instead of horizontally
	 * @param board
	 * @return
	 */
	public String toJson(Board board) {
		String gson = new GsonBuilder().setPrettyPrinting().create().toJson(board);
		return gson;
	}
		
	/**
	 * Connects to the URL, deserializes the JSON back to a Board-object.
	 * @return
	 * @throws IOException
	 */
	public Board fromJson() throws IOException{
		Gson gson = new Gson();
		StringBuffer stringBuffer= new StringBuffer();
		URL url= new URL("http://localhost:8080/battleship");
		connection = (HttpURLConnection)url.openConnection();

		connection.setRequestMethod("GET");
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(5000);

		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while ((inputLine = br.readLine()) != null) 
			stringBuffer.append(inputLine + "\n");
		br.close();
//		System.out.println(svar.toString());
		String convertedStringBuffer = stringBuffer.toString();

		Board board = gson.fromJson(convertedStringBuffer, Board.class);
		return board;
	}

}
