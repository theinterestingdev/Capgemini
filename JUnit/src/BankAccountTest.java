import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class BankAccountTest {
    private BankAccount account;
    
    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0);
    }
    
    @Test
    void testInitialBalance() {
        assertEquals(100.0, account.getBalance());
    }
    
    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
        
        account.deposit(25.5);
        assertEquals(175.5, account.getBalance());
    }
    
    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance());
        
        account.withdraw(20.5);
        assertEquals(49.5, account.getBalance());
    }
    
    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.0));
    }
    
    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0.0));
    }
    
    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150.0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(101.0));
    }
    
    @Test
    void testMultipleTransactions() {
        account.deposit(50.0);
        account.withdraw(30.0);
        account.deposit(20.0);
        account.withdraw(10.0);
        assertEquals(130.0, account.getBalance());
    }
}
