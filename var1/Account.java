// Файл Account.java
// abstract: нельзя new Account(...)
public abstract class Account {
    protected final String owner;        // final: владелец не меняется
    private static int count = 0;        // static: общий счётчик

    public Account(String owner) {
        this.owner = owner;
        count++;
    }

    public static int getCount() { return count; }

    public abstract double interestRate();   // abstract: подкласс ОБЯЗАН

    public String info() {
        return owner + " rate=" + interestRate();
    }

    public final String getOwner() { return owner; }  // final: нельзя override

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + owner + ")";
    }
}
