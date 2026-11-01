// файл TaskCondition.java
@FunctionalInterface
public interface TaskCondition {
    boolean test(Task t);
}
