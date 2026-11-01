// Файл Character.java
public abstract class Character {
    protected final String name;
    private static int count = 0;

    public Character(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() { return count; }

    public abstract int power();

    public String describe() {
        return name + " power=" + power();
    }

    public final String getName() { return name; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + name + ")";
    }
}
