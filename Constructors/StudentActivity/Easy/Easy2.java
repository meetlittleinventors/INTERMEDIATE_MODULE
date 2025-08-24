class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Easy2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        System.out.println("Sum: " + c.add(5, 10)); // Output: Sum: 15
        System.out.println("Sum: " + c.add(20, 10)); // Output: Sum: 30
    }
}
