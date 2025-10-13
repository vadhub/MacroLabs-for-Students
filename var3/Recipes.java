package Todo;

class Recipe {
    private String id;
    private String name;
    private String[] ingredients;
    private String instructions;
    private int cookingTime;
    private boolean isFavorite;
    private String difficulty;

    public Recipe(String name, String[] ingredients, String instructions, int cookingTime, String difficulty) {
        this.id = "recipe_" + System.currentTimeMillis();
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingTime = cookingTime;
        this.isFavorite = false;
        this.difficulty = difficulty;
    }

    public String getName() { return name; }
    public int getCookingTime() { return cookingTime; }
    public boolean isFavorite() { return isFavorite; }

    public void toggleFavorite() {
        this.isFavorite = !this.isFavorite;
    }

    public void onDraw() {
        System.out.println("Drawing recipe: " + name + " [" + difficulty + "] - " + cookingTime + "min " + (isFavorite ? "★" : "☆"));
    }

    @Override
    public String toString() {
        return "Recipe{name='" + name + "', time=" + cookingTime + "min, difficulty='" + difficulty + "', favorite=" + isFavorite + "}";
    }
}