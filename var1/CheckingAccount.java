// Файл CheckingAccount.java
public class CheckingAccount extends Account {   // ДАНО
    public CheckingAccount(String owner) { super(owner); }
    @Override public double interestRate() { return 0.5; }
}
