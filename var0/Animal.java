// Файл Animal.java
// abstract: нельзя создать new Animal(...)
public abstract class Animal {
    protected final String name;      // final: имя не меняется после конструктора

    private static int count = 0;     // static: общий счётчик для всех животных

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() { return count; }  // static: пример

    public abstract String sound();   // abstract: подкласс ОБЯЗАН реализовать

    // обычный метод — использует sound() полиморфно
    public String describe() {
        return name + " says " + sound();
    }

    public final String getName() {   // final: нельзя override
        return name;
    }

    @Override
    public String toString() {        // Object: переопределили toString
        return getClass().getSimpleName() + "(" + name + ")";
    }
}
