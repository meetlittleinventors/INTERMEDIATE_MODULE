class Account {
    String accountHolder;
    int balance;
    
    // Constructor
    Account(String name, int initialBalance) {
        accountHolder = name;
        balance = initialBalance;
        System.out.println("Account created for " + name + " with balance " + balance);
    }
    
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
    
    void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn " + amount + ". New balance: " + balance);
    }
}

public class Medium1 {
    public static void main(String[] args) {
        Account a1 = new Account("Amit", 1000);
        a1.deposit(500);
        a1.withdraw(200);
    }
}
