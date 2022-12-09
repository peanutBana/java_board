package board;

import java.util.ArrayList;

public class User {
	private int userId;
	private String nickName;
	private Post post;
	private ArrayList<Post> postList = new ArrayList<Post>();
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}

	public ArrayList<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(ArrayList<Comment> commentList) {
		this.commentList = commentList;
	}
	
	
	
}
