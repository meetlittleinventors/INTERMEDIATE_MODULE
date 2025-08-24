class Greeter {
    void greet(String name) {
        System.out.println("Hello " + name + "!");
    }
}

public class Easy1 {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        Greeter g2 = new Greeter();
        
        g1.greet("Amit"); // Output: Hello Amit!
        g2.greet("Neha"); // Output: Hello Neha!
    }
}
