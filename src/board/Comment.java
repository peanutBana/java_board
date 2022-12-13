package board;

public class Comment {
	private int commentId;
	private Post post;
	private String content;
	
	public Comment() {}
	
	public Comment(int commentId, Post post, String content) {
		this.commentId = commentId;
		this.post = post;
		this.content = content;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}

