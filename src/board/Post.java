package board;

import java.util.ArrayList;

public class Post {
	
	private int postId;
	private String postTitle;
	private ArrayList<Comment> commentList = new ArrayList<Comment>(); 
	
	public Post(int postId, String postTitle) {
		this.postId = postId;
		this.postTitle = postTitle;
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

	public ArrayList<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(ArrayList<Comment> commentList) {
		this.commentList = commentList;
	}
	
	


}
