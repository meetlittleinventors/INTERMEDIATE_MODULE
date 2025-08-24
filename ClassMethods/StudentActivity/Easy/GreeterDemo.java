class Greeter {
    void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class GreeterDemo {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.sayHello("Amit");
        g.sayHello("Neha");
    }
}
