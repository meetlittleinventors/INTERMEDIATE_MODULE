public class MediumQ1 {
    public static void main(String[] args) {
        try {
            System.out.println("Program starts...");
            Thread.sleep(2000);  // risky line (checked exception)
            System.out.println("Program ends after 2 seconds");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}
