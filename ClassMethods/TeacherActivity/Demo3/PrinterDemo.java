class Printer {
    void printMessage(String msg) {
        System.out.println(msg);
    }

    void repeatMessage(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printMessage("Java is fun!");
        p.repeatMessage("OOP", 3);
    }
}
