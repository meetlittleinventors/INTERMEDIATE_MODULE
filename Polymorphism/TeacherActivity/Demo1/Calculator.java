class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of Integers: " + c.add(5, 10));
        System.out.println("Sum of Doubles: " + c.add(5.5, 4.5));
    }
}
