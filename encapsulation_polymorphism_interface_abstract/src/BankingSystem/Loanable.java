package BankingSystem;

public interface Loanable {
    boolean applyForLoan(double amount);
    String calculateLoanEligibility();
}
