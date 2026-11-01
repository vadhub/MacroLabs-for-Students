// Файл SavingsAccount.java
public class SavingsAccount extends Account {
    public SavingsAccount(String owner) { super(owner); }

    @Override public double interestRate() { return 5.0; }

    // TODO 1: переопределить toString() — вернуть super.toString() + " [savings]"
    @Override
    public String toString() {
        // ▼ ВАШ КОД ЗДЕСЬ
        return "";
        // ▲ КОНЕЦ
    }
}
