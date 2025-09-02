class BankAccount {
    void deposit() {
        System.out.println("Depositing money into bank account");
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        System.out.println("Interest added to Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    void overdraft() {
        System.out.println("Overdraft facility in Current Account");
    }
}

public class Test {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        sa.deposit();
        sa.addInterest();

        ca.deposit();
        ca.overdraft();
    }
}
