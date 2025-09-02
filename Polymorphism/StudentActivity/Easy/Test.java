class Greeting {
    void sayHello() {
        System.out.println("Hello, World!");
    }
    void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class Test {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.sayHello();
        g.sayHello("Amit");
    }
}
