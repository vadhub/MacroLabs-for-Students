package Todo;

public class ScreenFinance {
    private int size;
    private float dpi;
    private Transaction[] transactions;
    private double balance;
    private double monthlyBudget;
    private String currency;
    private boolean showExpensesOnly;

    public ScreenFinance(int size, float dpi, Transaction[] transactions, double balance,
                        double monthlyBudget, String currency, boolean showExpensesOnly) {
        this.size = size;
        this.dpi = dpi;
        this.transactions = transactions;
        this.balance = balance;
        this.monthlyBudget = monthlyBudget;
        this.currency = currency;
        this.showExpensesOnly = showExpensesOnly;
    }

    public static class Builder {
        private int size;
        private float dpi;
        private Transaction[] transactions;
        private double balance;
        private double monthlyBudget;
        private String currency;
        private boolean showExpensesOnly;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setDpi(float dpi) {
            this.dpi = dpi;
            return this;
        }

        public Builder setTransactions(Transaction[] transactions) {
            this.transactions = transactions;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder setMonthlyBudget(double monthlyBudget) {
            this.monthlyBudget = monthlyBudget;
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder setShowExpensesOnly(boolean showExpensesOnly) {
            this.showExpensesOnly = showExpensesOnly;
            return this;
        }

        public ScreenFinance build() {
            return new ScreenFinance(size, dpi, transactions, balance, monthlyBudget, currency, showExpensesOnly);
        }
    }

    public View onCreateView() {
        System.out.println("ScreenFinance.onCreateView() called");
        return new View();
    }

    public void onViewCreated(View v) {
        System.out.println("ScreenFinance.onViewCreated() called");
        if (v != null) {
            v.onDraw();
            System.out.println("Setting up Finance view. Balance: " + balance + currency);
        }
    }

    public void onCreateOptionsMenu() {
        System.out.println("ScreenFinance.onCreateOptionsMenu() called");
        System.out.println("Monthly Budget: " + monthlyBudget + currency);
    }

    public void addTransaction(String description, double amount, String type) {
        System.out.println("Adding transaction: " + description + " - " + amount + currency);
        if (type.equals("expense")) {
            balance -= amount;
        } else {
            balance += amount;
        }
        System.out.println("New balance: " + balance + currency);
    }

    public void setMonthlyBudget(double newBudget) {
        this.monthlyBudget = newBudget;
        System.out.println("Monthly budget set to: " + newBudget + currency);
    }

    public void showAllTransactions() {
        System.out.println("\n=== Financial Transactions ===");
        System.out.println("Balance: " + balance + currency + ", Budget: " + monthlyBudget + currency);
        if (transactions != null) {
            for (Transaction transaction : transactions) {
                if (!showExpensesOnly || transaction.getAmount() < 0) {
                    System.out.println(transaction);
                    transaction.onDraw();
                }
            }
        } else {
            System.out.println("No transactions available");
        }
    }

    public void onDestroy() {
        transactions = null;
        currency = null;
        System.out.println("ScreenFinance destroyed");
    }

    public void toggleExpensesView() {
        showExpensesOnly = !showExpensesOnly;
        System.out.println("Show expenses only: " + showExpensesOnly);
    }

    public void generateReport() {
        System.out.println("Generating financial report...");
        System.out.println("Current balance: " + balance + currency);
        System.out.println("Remaining budget: " + (monthlyBudget + balance) + currency);
    }
}