class Greeter {
    void greet(String name) {
        System.out.println("Hello " + name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet("Amit");  // Output: Hello Amit
        g.greet("Neha");  // Output: Hello Neha
    }
}
