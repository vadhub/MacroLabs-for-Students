
public class View {
	private String id;

	public View() {
		this.id = "view_" + System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "View{id='" + id + "'}";
	}
	
	void onDraw() {
		System.out.println("Draw view");
	}
}
