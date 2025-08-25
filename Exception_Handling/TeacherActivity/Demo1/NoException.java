public class NoException {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;   // safe
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
