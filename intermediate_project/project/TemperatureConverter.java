import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        String input = sc.nextLine();

        try {
            double celsius = Double.parseDouble(input);
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + fahrenheit + " °F");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
