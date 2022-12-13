package board;

import java.util.ArrayList;

public class Post {
	
	private String postTitle;	//게시글 제목
	private String content;
	private int postId;			//게시글 아이디
	private User user;			//게시글 작성자
	private ArrayList<Comment> commentList = new ArrayList<Comment>();		// 게시글에 남긴 댓글 목록
	
	public Post() {}
	
	public Post(int postId, String postTitle) {		//글 id, 작성자
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public ArrayList<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(ArrayList<Comment> commentList) {
		this.commentList = commentList;
	}
	
	
}
