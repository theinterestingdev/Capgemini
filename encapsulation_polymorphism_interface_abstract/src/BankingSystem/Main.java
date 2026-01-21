package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA-1001", "Meera", 50000, 0.04));
        accounts.add(new CurrentAccount("CA-2001", "Ravi", 75000, 30000));

        for (BankAccount account : accounts) {
            account.showAccount();
            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println(loanable.calculateLoanEligibility());
                System.out.println("Loan request 40000: " + loanable.applyForLoan(40000));
            }
            System.out.println("---");
        }
    }
}
