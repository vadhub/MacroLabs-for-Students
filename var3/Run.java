// Genereted by GPT
public class Run {

	public static void main(String[] args) {
        // Создаем экземпляры через Builder
        ScreenTodo screenTodo = new ScreenTodo.Builder()
                .setTasks(new TodoTask[] {
                    new TodoTask("Buy groceries", "Milk, Eggs, Bread", "High"),
                    new TodoTask("Finish project", "Complete OOP assignment", "Medium"),
                    new TodoTask("Call dentist", "Schedule appointment", "Low")
                })
                .setCurrentCategory("Personal")
                .setFilter("All")
                .setShowCompleted(false)
                .setTasksCreated(15)
                .setSize(1080)
                .setDpi(420.0f)
                .build();

        ScreenFinance screenFinance = new ScreenFinance.Builder()
                .setTransactions(new Transaction[] {
                    new Transaction("Grocery shopping", -45.50, "Food"),
                    new Transaction("Salary", 2500.00, "Income"),
                    new Transaction("Electricity bill", -80.25, "Utilities")
                })
                .setBalance(1540.75)
                .setMonthlyBudget(2000.00)
                .setCurrency("USD")
                .setShowExpensesOnly(false)
                .setSize(1200)
                .setDpi(380.0f)
                .build();

        ScreenRecipes screenRecipes = new ScreenRecipes.Builder()
                .setRecipes(new Recipe[] {
                    new Recipe("Pasta Carbonara", new String[]{"Pasta", "Eggs", "Bacon", "Cheese"}, "Cook pasta, mix with eggs and bacon", 30, "Medium"),
                    new Recipe("Vegetable Salad", new String[]{"Lettuce", "Tomato", "Cucumber", "Olive oil"}, "Chop vegetables and mix", 15, "Easy"),
                    new Recipe("Chocolate Cake", new String[]{"Flour", "Sugar", "Cocoa", "Eggs", "Butter"}, "Mix ingredients and bake", 60, "Hard")
                })
                .setCurrentCategory("Italian")
                .setCookingTimeFilter(45)
                .setDifficultyLevel("Medium")
                .setShowFavoritesOnly(false)
                .setSize(1024)
                .setDpi(360.0f)
                .build();

        System.out.println("=== Starting New Screens Lifecycle ===");

        // Тестируем ScreenTodo
        System.out.println("\n--- ScreenTodo Methods ---");
        screenTodo.onViewCreated(screenTodo.onCreateView());
        screenTodo.onCreateOptionsMenu();
        screenTodo.showAllTasks();
        screenTodo.addTask("Learn Java", "Study inheritance and polymorphism");
        screenTodo.completeTask(screenTodo.tasks[0]);
        screenTodo.changeFilter("Active");
        screenTodo.toggleShowCompleted();
        screenTodo.changeCategory("Work");
        screenTodo.onDestroy();

        // Тестируем ScreenFinance
        System.out.println("\n--- ScreenFinance Methods ---");
        screenFinance.onViewCreated(screenFinance.onCreateView());
        screenFinance.onCreateOptionsMenu();
        screenFinance.showAllTransactions();
        screenFinance.addTransaction("Restaurant dinner", -65.80, "expense");
        screenFinance.setMonthlyBudget(1800.00);
        screenFinance.toggleExpensesView();
        screenFinance.generateReport();
        screenFinance.onDestroy();

        // Тестируем ScreenRecipes
        System.out.println("\n--- ScreenRecipes Methods ---");
        screenRecipes.onViewCreated(screenRecipes.onCreateView());
        screenRecipes.onCreateOptionsMenu();
        screenRecipes.showAllRecipes();
        screenRecipes.addRecipe("Omelette", new String[]{"Eggs", "Milk", "Salt", "Pepper"}, "Beat eggs and cook in pan");
        screenRecipes.toggleFavorite(screenRecipes.recipes[0]);
        screenRecipes.changeCategory("Breakfast");
        screenRecipes.setCookingTimeFilter(30);
        screenRecipes.toggleFavoritesView();
        screenRecipes.onDestroy();

        System.out.println("\n=== All New Screens Lifecycle Completed ===");
	}

}
