class Example {
    void display() {
        System.out.println("Non-static method");
    }
}

public class Main {
    public static void main(String[] args) {
        // Trying to call without object
        // display();  ❌ ERROR
    }
}
