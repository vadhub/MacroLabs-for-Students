
public class ScreenMain {
	private int size;
	private float dpi;
	private Post[] posts;
	private int countOfLikes;
	private boolean isLiked;
	private int currentPostIndex;

	public ScreenMain(int size, float dpi, Post[] posts, int countOfLikes, boolean isLiked) {
		super();
		this.size = size;
		this.dpi = dpi;
		this.posts = posts;
		this.countOfLikes = countOfLikes;
		this.isLiked = isLiked;
	}

	public static class Builder {
		private int size;
		private float dpi;
		private Post[] posts;
		private int countOfLikes;
		private boolean isLiked;

		public Builder setSize(int size) {
			this.size = size;
			return this;
		}

		public Builder setCountOfLikes(int countOfLikes) {
			this.countOfLikes = countOfLikes;
			return this;
		}

		public Builder setPosts(Post[] posts) {
			this.posts = posts;
			return this;
		}

		public Builder setLiked(boolean isLiked) {
			this.isLiked = isLiked;
			return this;
		}

		public Builder setDpi(float dpi) {
			this.dpi = dpi;
			return this;
		}

		public ScreenMain build() {
			return new ScreenMain(size, dpi, posts, countOfLikes, isLiked);
		}
	}

	public View onCreateView() {
		return new View();
	}

	public void onLike(Post post) {
		post.like();
	}

	public void unlike(Post post) {
		post.unlike();
	}

	public void onViewCreated(View v) {
		System.out.println("ScreenMain.onViewCreated() called with: " + v);

		if (v != null) {
			v.onDraw();
			System.out.println("Setting up view with ID: " + v.getId());
		}

	}
	
	public void onDestroy() {
		posts = null;
		countOfLikes = 0;
		currentPostIndex = 0;
		dpi = 0;
		size = 0;
		System.out.println("Finish");
	}
	
	public void onCreateOptionsMenu() {
		System.out.println("ScreenMain.onCreateOptionsMenu() called");
		System.out.println("Creating options menu for screen size: " + size + ", DPI: " + dpi);
	}

	public void showAllPosts() {
		System.out.println("\n=== All Posts ===");
		if (posts != null) {
			for (Post post : posts) {
				System.out.println(post);
				post.onDraw();
			}
		} else {
			System.out.println("No posts available");
		}
	}
	
	public Post getCurrentPost() {
		return posts[currentPostIndex];
	}
	
	public void scrollUp() {
		if (currentPostIndex > 0) {
			currentPostIndex--;
		}
	}
	
	public void scrollDown() {
		if (currentPostIndex <= posts.length) {
			currentPostIndex++;
		}
	}

	private void createSettingsDialog() {
		System.out.println("ScreenMain.createSettingsDialog() called");
		SettingsDialog dialog = new SettingsDialog();
		dialog.show();
	}
}
