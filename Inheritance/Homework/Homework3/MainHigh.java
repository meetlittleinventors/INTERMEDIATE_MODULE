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

public class MainHigh {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.accountNumber = "S101";
        s1.deposit(5000);
        s1.withdraw(2000);

        CurrentAccount c1 = new CurrentAccount();
        c1.accountNumber = "C202";
        c1.deposit(10000);
        c1.overdraft(5000);
    }
}
