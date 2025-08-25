abstract class Bank {
    abstract double rateOfInterest();
}

class SBI extends Bank {
    double rateOfInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double rateOfInterest() {
        return 7.2;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println("SBI ROI: " + b1.rateOfInterest() + "%");

        Bank b2 = new HDFC();
        System.out.println("HDFC ROI: " + b2.rateOfInterest() + "%");
    }
}
