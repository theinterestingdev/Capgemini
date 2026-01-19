package BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("=== Savings Account ===");
        super.displayAccountType();
        System.out.println("Interest Rate: " + interestRate + "%");
    }


}
