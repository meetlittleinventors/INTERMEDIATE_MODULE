class BankAccount {
    void calculateInterest() {
        System.out.println("Generic interest calculated");
    }
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest for savings account calculated");
    }
}

class FixedDepositAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest for fixed deposit account calculated");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = {new SavingsAccount(), new FixedDepositAccount()};

        for (BankAccount account : accounts) {
            account.calculateInterest();
        }
        // Output:
        // Interest for savings account calculated
        // Interest for fixed deposit account calculated
    }
}
