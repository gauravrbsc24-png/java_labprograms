// ===============================================
// Lab Session 6: Exception Handling (Built-in + Custom)
// Topic: Custom Exception - LowBalanceException
// Author: Gaurav (RV University)
// ===============================================

// Custom Exception Class
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Banking Class
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Withdraw method that may throw custom exception
    public void withdraw(double amount) throws LowBalanceException {
        System.out.println("\nProcessing withdrawal of ₹" + amount + "...");
        if (amount > balance) {
            throw new LowBalanceException("❌ Insufficient balance! Withdrawal amount exceeds available balance.");
        } else if (balance - amount < 1000) {
            throw new LowBalanceException("⚠️ Low Balance Alert! Minimum ₹1000 must remain in the account.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful! Remaining balance: ₹" + balance);
        }
    }

    // Method to display current account info
    public void display() {
        System.out.println("\n=== Account Details ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main Class
public class BankTransaction {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Gaurav Sharma", 5000);

        acc1.display();

        try {
            // Try a valid withdrawal
            acc1.withdraw(2000);

            // Try an invalid withdrawal (will throw custom exception)
            acc1.withdraw(4500);
        } 
        catch (LowBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        } 
        finally {
            System.out.println("\n✅ Transaction process completed (finally block executed).");
        }

        // Final account details
        acc1.display();
    }
}
