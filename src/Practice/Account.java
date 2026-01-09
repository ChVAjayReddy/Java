package Practice;
class Account {
    private double balance;  // data hidden

    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}
