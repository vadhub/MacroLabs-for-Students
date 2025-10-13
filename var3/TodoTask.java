package Todo;

class TodoTask {
    private String id;
    private String title;
    private String description;
    private boolean completed;
    private String priority;

    public TodoTask(String title, String description, String priority) {
        this.id = "task_" + System.currentTimeMillis();
        this.title = title;
        this.description = description;
        this.completed = false;
        this.priority = priority;
    }

    public void complete() {
        this.completed = true;
    }

    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }

    public void onDraw() {
        System.out.println("Drawing task: " + title + " [" + priority + "] - " + (completed ? "✓" : "○"));
    }

    @Override
    public String toString() {
        return "TodoTask{title='" + title + "', completed=" + completed + ", priority='" + priority + "'}";
    }
}