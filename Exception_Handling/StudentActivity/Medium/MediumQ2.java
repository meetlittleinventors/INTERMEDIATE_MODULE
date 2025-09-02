public class MediumQ2 {
    public static void main(String[] args) {
        try {
            int num = 20 / 0;  // risky line
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Closing resources in finally block");
        }
    }
}
