package BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }


}
