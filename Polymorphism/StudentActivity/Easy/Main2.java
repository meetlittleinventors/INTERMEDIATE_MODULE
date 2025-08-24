class Greeter {
    void greet() { System.out.println("Hello!"); }
    void greet(String name) { System.out.println("Hello, " + name + "!"); }
}

public class Main2 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();
        g.greet("Neha");
    }
}
