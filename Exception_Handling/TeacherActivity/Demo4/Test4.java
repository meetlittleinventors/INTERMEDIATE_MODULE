public class Test4 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an Arithmetic Exception");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
