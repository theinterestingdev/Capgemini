package BankAccount;

public class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    private double fixedInterestRate;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths, double fixedInterestRate) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
        this.fixedInterestRate = fixedInterestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("=== Fixed Deposit Account ===");
        super.displayAccountType();
        System.out.println("Tenure: " + tenureMonths + " months");
        System.out.println("Fixed Interest Rate: " + fixedInterestRate + "%");
    }


}
