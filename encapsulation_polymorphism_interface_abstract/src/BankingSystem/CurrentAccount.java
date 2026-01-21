package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        setOverdraftLimit(overdraftLimit);
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit >= 0) {
            this.overdraftLimit = overdraftLimit;
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= overdraftLimit * 3;
    }

    @Override
    public String calculateLoanEligibility() {
        return "Eligible up to " + (overdraftLimit * 3);
    }
}
