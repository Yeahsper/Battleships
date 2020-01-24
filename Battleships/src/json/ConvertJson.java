package json;

import com.google.gson.Gson;

import main.Board;

public class ConvertJson {
	Gson json = new Gson();
	
	public void toJson(Board board) {
		String json = new Gson().toJson(board);
		System.out.println(json);

	}

}
