class Printer {
    void print(int a) { System.out.println("Integer: "+a); }
    void print(String s) { System.out.println("String: "+s); }
}
public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(5);
        p.print("Hello");
    }
}
