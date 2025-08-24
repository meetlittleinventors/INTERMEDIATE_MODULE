class Account {
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    void overdraft(double limit) {
        System.out.println("Overdraft limit: " + limit);
    }
}

public class Main5 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = "S123";
        s.deposit(5000);
        s.withdraw(2000);

        CurrentAccount c = new CurrentAccount();
        c.accountNumber = "C456";
        c.deposit(10000);
        c.overdraft(5000);
    }
}
