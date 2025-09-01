class Test {
    void greet() {
        System.out.println("Hello");
    }
    static void welcome() {
        System.out.println("Welcome");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.greet();
        Test.welcome();
    }
}
