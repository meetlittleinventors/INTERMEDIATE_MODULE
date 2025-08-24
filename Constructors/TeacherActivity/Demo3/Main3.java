class Demo {
    // Static method
    static void staticGreet() {
        System.out.println("Static method called without object");
    }

    // Non-static method
    void instanceGreet() {
        System.out.println("Instance method called via object");
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Call static method
        Demo.staticGreet();  // Output: Static method called without object

        // Call non-static method
        Demo d = new Demo();
        d.instanceGreet();   // Output: Instance method called via object
    }
}
