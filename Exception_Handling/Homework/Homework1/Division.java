import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter denominator: ");
        int den = sc.nextInt();

        try {
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division not possible (denominator is zero).");
        }
    }
}
