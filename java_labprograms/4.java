// AccountDemo.java

// Abstract class Account
abstract class Account {
    protected String accountHolder;
    protected double balance;

    // Constructor
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method to be implemented by subclasses
    abstract void calculateInterest();

    // Common method
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// SavingsAccount class extending Account
class SavingsAccount extends Account {
    private double interestRate = 5.0; // in percentage

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Savings Account Interest: ₹" + interest);
    }
}

// CurrentAccount class extending Account
class CurrentAccount extends Account {
    private double serviceCharge = 200; // flat monthly service fee

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account. Service charge applied: ₹" + serviceCharge);
        balance -= serviceCharge;
    }
}

// Main Class demonstrating Polymorphism
public class AccountDemo {
    public static void main(String[] args) {
        // Using polymorphism: parent reference, child objects
        Account acc1 = new SavingsAccount("Gaurav Sharma", 20000);
        Account acc2 = new CurrentAccount("Ravi Kumar", 30000);

        System.out.println("=== Savings Account Details ===");
        acc1.displayAccountDetails();
        acc1.calculateInterest();

        System.out.println("\n=== Current Account Details ===");
        acc2.displayAc
