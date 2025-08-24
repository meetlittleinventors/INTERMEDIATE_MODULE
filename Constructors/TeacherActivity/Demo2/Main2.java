class Calculator {
    // Corrected version: return type int
    int add(int a, int b) {
        return a + b;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.add(5, 10);  // Output: 15
        System.out.println("Sum: " + result);
    }
}
