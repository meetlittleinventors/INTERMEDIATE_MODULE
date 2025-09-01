class Example {
    void display() {
        System.out.println("Non-static method");
    }
}

public class Main {
    public static void main(String[] args) {
        // display();  ❌ ERROR – cannot call without object
    }
}
