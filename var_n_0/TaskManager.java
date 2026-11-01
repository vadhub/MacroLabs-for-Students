// файл TaskManager.java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    public void add(Task t) { tasks.add(t); }

    // ДАНО — это работает, не трогать
    public List<Task> getAll() {
        return new ArrayList<>(tasks);
    }

    // TODO: вернуть новый список из тех задач, для которых condition.test(t) == true
    public List<Task> filter(TaskCondition condition) {
        List<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            // ▼ ВАШ КОД ЗДЕСЬ

            // ▲ КОНЕЦ
            result.add(t);
        }
        return result;
    }

    // TODO 2 (цикл): посчитать, сколько задач подходит
    public int count(TaskCondition condition) {
        int count = 0;
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        return count;
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.add(new Task("lab",   false));
        tm.add(new Task("book",  true));
        tm.add(new Task("sleep", false));
        tm.add(new Task("read",  true));

        // должно вывести: [lab, sleep]
        System.out.println(tm.filter(t -> !t.isDone()));
        // должно вывести: 2
        System.out.println(tm.count(t -> !t.isDone()));
        // должно вывести: 2
        System.out.println(tm.count(t -> t.isDone()));
    }
}
