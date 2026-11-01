// Файл Arena.java
import java.util.ArrayList;
import java.util.List;

public class Arena {
    public static void main(String[] args) {
        List<Character> party = new ArrayList<>();
        party.add(new Warrior("Conan"));
        party.add(new Mage("Merlin"));
        party.add(new Warrior("Achilles"));

        // TODO 2: посчитать, сколько воинов в party (instanceof)
        int warriors = 0;
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        System.out.println("warriors=" + warriors);   // 2

        // TODO 3: вывести describe() у каждого — полиморфизм
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        // ожидается:
        // Conan power=100 (warrior)
        // Merlin power=80
        // Achilles power=100 (warrior)
    }
}
