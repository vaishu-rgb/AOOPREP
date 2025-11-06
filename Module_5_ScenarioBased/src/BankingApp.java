import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Account {
    final String accountId;
    final String holderName;
    private double balance;

    Account(String accountId, String holderName) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class Bank {
    private final Map<String, Account> accounts = new HashMap<>();

    void createAccount(String accountId, String holderName) {
        if (accounts.containsKey(accountId)) throw new IllegalArgumentException("Account already exists");
        accounts.put(accountId, new Account(accountId, holderName));
    }

    Account getAccount(String accountId) {
        return accounts.get(accountId);
    }

    void deposit(String accountId, double amount) {
        Account acc = getAccount(accountId);
        if (acc == null) throw new IllegalArgumentException("Account not found");
        acc.deposit(amount);
    }

    void withdraw(String accountId, double amount) {
        Account acc = getAccount(accountId);
        if (acc == null) throw new IllegalArgumentException("Account not found");
        acc.withdraw(amount);
    }

    double checkBalance(String accountId) {
        Account acc = getAccount(accountId);
        if (acc == null) throw new IllegalArgumentException("Account not found");
        return acc.getBalance();
    }
}

class BankingAppTest {
    Bank bank;

    @BeforeEach
    void setup() {
        bank = new Bank();
        bank.createAccount("A001", "Vaishnavi");
    }

    @Test
    void testCreateAccount() {
        bank.createAccount("A002", "Ravi");
        assertNotNull(bank.getAccount("A002"));
        assertEquals("Ravi", bank.getAccount("A002").holderName);
    }

    @Test
    void testDeposit() {
        bank.deposit("A001", 500);
        assertEquals(500, bank.checkBalance("A001"));
    }

    @Test
    void testWithdraw() {
        bank.deposit("A001", 1000);
        bank.withdraw("A001", 400);
        assertEquals(600, bank.checkBalance("A001"));
    }

    @Test
    void testWithdrawInsufficientFunds() {
        bank.deposit("A001", 300);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> bank.withdraw("A001", 500));
        assertEquals("Insufficient funds", ex.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> bank.deposit("A001", -100));
        assertEquals("Deposit must be positive", ex.getMessage());
    }

    @Test
    void testNegativeWithdrawal() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> bank.withdraw("A001", -50));
        assertEquals("Withdrawal must be positive", ex.getMessage());
    }

    @Test
    void testCheckBalance() {
        bank.deposit("A001", 200);
        assertEquals(200, bank.checkBalance("A001"));
    }
}