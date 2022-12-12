package board;

import java.util.ArrayList;

public class Post {
	
	private String postTitle;
	private int postId;
	private ArrayList<User> userList = new ArrayList<User>();
	 
	
	public Post(int postId, String postTitle) {
		this.postId = postId;
		this.postTitle = postTitle;
	}
	
	public void write(User user) {
		userList.add(user);
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}


}
