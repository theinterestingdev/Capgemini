public class BankAccount {

    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder,String accountNumber,double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private void depositMoney(int amount)
    {
        balance += amount;
        System.out.println("Deposit Successfull of Amount : "+amount);
        System.out.println("Remaining Balance : "+balance);
    }

    private void withdrawMoney(int amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Withdrawal Successfull of Amount : "+amount);
            System.out.println("Remaining Balance : "+balance);
        }
    }

    private void currentBalance()
    {
        System.out.println("Account Balance : "+balance);
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Kartik","9184931489343",20000);

        bankAccount.depositMoney(1000);
        bankAccount.withdrawMoney(2000);
        bankAccount.currentBalance();


    }

}
