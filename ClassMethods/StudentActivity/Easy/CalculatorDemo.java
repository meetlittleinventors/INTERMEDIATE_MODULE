class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 10);
    }
}
