package json;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import generateboard.Board;

public class ConvertJson {
	
	private static HttpURLConnection connection;
	private static StringBuffer svar= new StringBuffer();
	private Gson gson = new Gson();
	
	public String toJson(Board board) {
		String gson2 = new GsonBuilder().setPrettyPrinting().create().toJson(board);
		return gson2;
	}
		
	
	public Board fromJson() throws IOException{
		URL url= new URL("http://localhost:8080/battleship");
		connection = (HttpURLConnection)url.openConnection();

		connection.setRequestMethod("GET");
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(5000);

		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) 
			svar.append(inputLine + "\n");

		in.close();
//		System.out.println(svar.toString());
		String temp = svar.toString();

		Gson gson = new Gson();
		
		Board board = gson.fromJson(temp, Board.class);
		return board;
	}

}
