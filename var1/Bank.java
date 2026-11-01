// Файл Bank.java
import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("Ivan"));
        accounts.add(new CheckingAccount("Oleg"));

        // TODO 2: сравнить два счёта с одинаковым владельцем (equals по owner)
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        // ожидается: true

        // TODO 3: вывести все счета через toString()
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        // ожидается:
        // SavingsAccount(Ivan) [savings]
        // CheckingAccount(Oleg)
    }
}
