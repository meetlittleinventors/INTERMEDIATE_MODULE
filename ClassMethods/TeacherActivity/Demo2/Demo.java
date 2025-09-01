class Demo {
    // Instance method
    void display() {
        System.out.println("This is an Instance Method");
    }

    // Static method
    static void show() {
        System.out.println("This is a Static Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();   // Calling instance method
        Demo.show();   // Calling static method
    }
}
