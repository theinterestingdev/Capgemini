package BankingSystem;

abstract class BankAccount {
    private final String accountNumber;
    private String holderName;
    private double balance;

    protected BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        setHolderName(holderName);
        deposit(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        if (holderName != null && !holderName.isBlank()) {
            this.holderName = holderName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();

    public void showAccount() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
