package BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        setInterestRate(interestRate);
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= getBalance() * 2;
    }

    @Override
    public String calculateLoanEligibility() {
        return "Eligible up to " + (getBalance() * 2);
    }
}
