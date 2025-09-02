abstract class Bank {
    abstract void interestRate();
    void bankName() {
        System.out.println("Bank Name: Reserve Bank of India");
    }
}

class SBI extends Bank {
    void interestRate() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

class HDFC extends Bank {
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        b1.bankName();
        b1.interestRate();
        b2.bankName();
        b2.interestRate();
    }
}
