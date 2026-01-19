package BankAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV001", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK001", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD001", 10000, 12, 5.0);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixedDeposit.displayAccountType();
    }
}
