package board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private String postTitle;	//게시글 제목
	private String content;		//게시글 내용
	private int postId;			//게시글 아이디
	private User user;			//게시글 작성자
	private Date postTime = new Date();
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	private ArrayList<Comment> commentList = new ArrayList<Comment>();		// 게시글에 남긴 댓글 목록
	
	public Post() {}
	
	public Post(int postId, String postTitle, String content) {		//글 id, 작성자
		this.postId = postId;
		this.content = content;
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
