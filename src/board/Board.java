package board;

import java.util.ArrayList;

public class Board {
	
	private static Board board = null;
	
	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Post> postList = new ArrayList<Post>();
	
	private Board() {}
	
	public static Board getInstance() {
		if(board == null) {
			board = new Board();
		}
		return board;
		
	}

	public static Board getBoard() {
		return board;
	}

	public static void setBoard(Board board) {
		Board.board = board;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}
	
	
	
}	
