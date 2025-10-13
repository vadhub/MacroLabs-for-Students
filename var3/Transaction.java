
class Transaction {
    private String id;
    private String description;
    private double amount;
    private String date;
    private String category;

    public Transaction(String description, double amount, String category) {
        this.id = "trans_" + System.currentTimeMillis();
        this.description = description;
        this.amount = amount;
        this.date = java.time.LocalDate.now().toString();
        this.category = category;
    }

    public double getAmount() { return amount; }

    public void onDraw() {
        String type = amount < 0 ? "Expense" : "Income";
        System.out.println("Drawing transaction: " + description + " - " + Math.abs(amount) + " (" + type + ")");
    }

    @Override
    public String toString() {
        return "Transaction{description='" + description + "', amount=" + amount + ", category='" + category + "'}";
    }
}
