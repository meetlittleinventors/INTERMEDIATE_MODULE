class Greeter {
    void sayHello() {
        System.out.println("Hello!");
    }

    void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}

public class GreeterDemo {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.sayHello();
        g.sayGoodbye();
    }
}
