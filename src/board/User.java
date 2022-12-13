package board;

import java.util.ArrayList;

public class User {
	private int userId;		//유저 아이디
	private int userPw;
	private String nickName;	//닉네임
	private ArrayList<Post> postList = new ArrayList<Post>();	//유저 작성글 목록
	
	public User() {}
	
	public User(int userId, String nickName) {
		this.userId = userId;
		this.nickName = nickName;
	}
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserPw() {
		return userPw;
	}


	public void setUserPw(int userPw) {
		this.userPw = userPw;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}
	
}
