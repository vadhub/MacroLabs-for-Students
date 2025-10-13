
public class Post {
	private String id;
    private String content;
    private int likes;
    private boolean isLiked;
    
    public Post(String content) {
        this.id = "post_" + System.currentTimeMillis();
        this.content = content;
        this.likes = 0;
        this.isLiked = false;
    }
    
    public String getId() { return id; }
    public String getContent() { return content; }
    public int getLikes() { return likes; }
    public boolean isLiked() { return isLiked; }
    
    public void like() {
        if (!isLiked) {
            likes++;
            isLiked = true;
        }
    }
    
    public void unlike() {
        if (isLiked) {
            likes--;
            isLiked = false;
        }
    }
    
    @Override
    public String toString() {
        return "Post{id='" + id + "', content='" + content + "', likes=" + likes + "}";
    }
    
	void onDraw() {
		System.out.println("Draw post");
	}
}
