public class Test1 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;   // risky line
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
