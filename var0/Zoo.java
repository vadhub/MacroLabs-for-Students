// Файл Zoo.java
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Tom"));

        // Полиморфизм: describe() вызывает sound() — каждый подкласс отвечает по-своему
        for (Animal a : animals) {
            System.out.println(a.describe());
        }
        // ожидается:
        // Rex says Woof
        // Tom says Meow

        System.out.println(Animal.getCount());   // 2

        // TODO 3 (одна строка): создать третьего Animal с именем "Buddy" (собаку)
        // ▼ ВАШ КОД ЗДЕСЬ
        animals.add(null);
        // ▲ КОНЕЦ

        for (Animal a : animals) {
            System.out.println(a.describe());
        }
        // ожидается: + Buddy says Woof

        System.out.println(Animal.getCount());   // 3
    }
}
