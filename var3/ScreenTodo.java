public class ScreenTodo {
    private int size;
    private float dpi;
    TodoTask[] tasks;
    private String filter;
    private boolean showCompleted;
    private int tasksCreated;
    private String currentCategory;

    public ScreenTodo(int size, float dpi, TodoTask[] tasks, String filter, 
                     boolean showCompleted, int tasksCreated, String currentCategory) {
        this.size = size;
        this.dpi = dpi;
        this.tasks = tasks;
        this.filter = filter;
        this.showCompleted = showCompleted;
        this.tasksCreated = tasksCreated;
        this.currentCategory = currentCategory;
    }

    public static class Builder {
        private int size;
        private float dpi;
        private TodoTask[] tasks;
        private String filter;
        private boolean showCompleted;
        private int tasksCreated;
        private String currentCategory;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setDpi(float dpi) {
            this.dpi = dpi;
            return this;
        }

        public Builder setTasks(TodoTask[] tasks) {
            this.tasks = tasks;
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setShowCompleted(boolean showCompleted) {
            this.showCompleted = showCompleted;
            return this;
        }

        public Builder setTasksCreated(int tasksCreated) {
            this.tasksCreated = tasksCreated;
            return this;
        }

        public Builder setCurrentCategory(String currentCategory) {
            this.currentCategory = currentCategory;
            return this;
        }

        public ScreenTodo build() {
            return new ScreenTodo(size, dpi, tasks, filter, showCompleted, tasksCreated, currentCategory);
        }
    }

    public View onCreateView() {
        System.out.println("ScreenTodo.onCreateView() called");
        return new View();
    }

    public void onViewCreated(View v) {
        System.out.println("ScreenTodo.onViewCreated() called");
        if (v != null) {
            v.onDraw();
            System.out.println("Setting up Todo view with category: " + currentCategory);
        }
    }

    public void onCreateOptionsMenu() {
        System.out.println("ScreenTodo.onCreateOptionsMenu() called");
        System.out.println("Filter: " + filter + ", Show Completed: " + showCompleted);
    }

    public void addTask(String title, String description) {
        System.out.println("Adding new task: " + title);
        tasksCreated++;
    }

    public void completeTask(TodoTask task) {
        task.complete();
        System.out.println("Task completed: " + task.getTitle());
    }

    public void deleteTask(TodoTask task) {
        System.out.println("Deleting task: " + task.getTitle());
    }

    public void showAllTasks() {
        System.out.println("\n=== Tasks in " + currentCategory + " ===");
        System.out.println("Filter: " + filter + ", Total created: " + tasksCreated);
        if (tasks != null) {
            for (TodoTask task : tasks) {
                if (showCompleted || !task.isCompleted()) {
                    System.out.println(task);
                    task.onDraw();
                }
            }
        } else {
            System.out.println("No tasks available");
        }
    }

    public void onDestroy() {
        tasks = null;
        filter = null;
        currentCategory = null;
        System.out.println("ScreenTodo destroyed");
    }

    public void changeFilter(String newFilter) {
        this.filter = newFilter;
        System.out.println("Filter changed to: " + newFilter);
    }

    public void toggleShowCompleted() {
        showCompleted = !showCompleted;
        System.out.println("Show completed: " + showCompleted);
    }

    public void changeCategory(String newCategory) {
        this.currentCategory = newCategory;
        System.out.println("Category changed to: " + newCategory);
    }

    public void clearCompleted() {
        System.out.println("Clearing all completed tasks");
    }
}
