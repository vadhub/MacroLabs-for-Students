package Todo;

public class ScreenRecipes {
    private int size;
    private float dpi;
    Recipe[] recipes;
    private String currentCategory;
    private int cookingTimeFilter;
    private boolean showFavoritesOnly;
    private String difficultyLevel;

    public ScreenRecipes(int size, float dpi, Recipe[] recipes, String currentCategory,
                        int cookingTimeFilter, boolean showFavoritesOnly, String difficultyLevel) {
        this.size = size;
        this.dpi = dpi;
        this.recipes = recipes;
        this.currentCategory = currentCategory;
        this.cookingTimeFilter = cookingTimeFilter;
        this.showFavoritesOnly = showFavoritesOnly;
        this.difficultyLevel = difficultyLevel;
    }

    public static class Builder {
        private int size;
        private float dpi;
        private Recipe[] recipes;
        private String currentCategory;
        private int cookingTimeFilter;
        private boolean showFavoritesOnly;
        private String difficultyLevel;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setDpi(float dpi) {
            this.dpi = dpi;
            return this;
        }

        public Builder setRecipes(Recipe[] recipes) {
            this.recipes = recipes;
            return this;
        }

        public Builder setCurrentCategory(String currentCategory) {
            this.currentCategory = currentCategory;
            return this;
        }

        public Builder setCookingTimeFilter(int cookingTimeFilter) {
            this.cookingTimeFilter = cookingTimeFilter;
            return this;
        }

        public Builder setShowFavoritesOnly(boolean showFavoritesOnly) {
            this.showFavoritesOnly = showFavoritesOnly;
            return this;
        }

        public Builder setDifficultyLevel(String difficultyLevel) {
            this.difficultyLevel = difficultyLevel;
            return this;
        }

        public ScreenRecipes build() {
            return new ScreenRecipes(size, dpi, recipes, currentCategory, cookingTimeFilter, showFavoritesOnly, difficultyLevel);
        }
    }

    public View onCreateView() {
        System.out.println("ScreenRecipes.onCreateView() called");
        return new View();
    }

    public void onViewCreated(View v) {
        System.out.println("ScreenRecipes.onViewCreated() called");
        if (v != null) {
            v.onDraw();
            System.out.println("Setting up Recipes view. Category: " + currentCategory);
        }
    }

    public void onCreateOptionsMenu() {
        System.out.println("ScreenRecipes.onCreateOptionsMenu() called");
        System.out.println("Difficulty: " + difficultyLevel + ", Max cooking time: " + cookingTimeFilter + "min");
    }

    public void addRecipe(String name, String[] ingredients, String instructions) {
        System.out.println("Adding new recipe: " + name);
        // Логика добавления рецепта
    }

    public void toggleFavorite(Recipe recipe) {
        recipe.toggleFavorite();
        System.out.println("Recipe " + (recipe.isFavorite() ? "added to" : "removed from") + " favorites: " + recipe.getName());
    }

    public void showAllRecipes() {
        System.out.println("\n=== Recipes in " + currentCategory + " ===");
        System.out.println("Difficulty: " + difficultyLevel + ", Max time: " + cookingTimeFilter + "min");
        if (recipes != null) {
            for (Recipe recipe : recipes) {
                if ((!showFavoritesOnly || recipe.isFavorite()) && 
                    recipe.getCookingTime() <= cookingTimeFilter) {
                    System.out.println(recipe);
                    recipe.onDraw();
                }
            }
        } else {
            System.out.println("No recipes available");
        }
    }

    public void onDestroy() {
        recipes = null;
        currentCategory = null;
        difficultyLevel = null;
        System.out.println("ScreenRecipes destroyed");
    }

    public void changeCategory(String newCategory) {
        this.currentCategory = newCategory;
        System.out.println("Category changed to: " + newCategory);
    }

    public void setCookingTimeFilter(int maxTime) {
        this.cookingTimeFilter = maxTime;
        System.out.println("Cooking time filter set to: " + maxTime + " minutes");
    }

    public void toggleFavoritesView() {
        showFavoritesOnly = !showFavoritesOnly;
        System.out.println("Show favorites only: " + showFavoritesOnly);
    }
}
