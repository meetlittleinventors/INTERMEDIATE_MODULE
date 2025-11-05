import java.io.*;
import java.util.*;

public class TemperatureTracker {
    static final String FILE_NAME = "history.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Temperature Tracker ---");
            System.out.println("1. Convert Temperature");
            System.out.println("2. View History");
            System.out.println("3. Clear History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> convertTemperature(sc);
                    case 2 -> viewHistory();
                    case 3 -> clearHistory();
                    case 4 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    static void convertTemperature(Scanner sc) {
        try {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = Double.parseDouble(sc.nextLine());

            System.out.print("Convert to (F for Fahrenheit / K for Kelvin): ");
            String type = sc.nextLine().trim().toUpperCase();

            double result;
            String record;

            if (type.equals("F")) {
                result = (celsius * 9 / 5) + 32;
                record = celsius + " C = " + result + " F";
            } else if (type.equals("K")) {
                result = celsius + 273.15;
                record = celsius + " C = " + result + " K";
            } else {
                System.out.println("Invalid conversion type!");
                return;
            }

            System.out.println("Converted: " + record);
            saveRecord(record);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        }
    }

    static void saveRecord(String record) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(record + "\n");
        } catch (IOException e) {
            System.out.println("Error saving history!");
        }
    }

    static void viewHistory() {
        System.out.println("\n--- Conversion History ---");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean empty = true;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                empty = false;
            }
            if (empty) System.out.println("(No history found)");
        } catch (FileNotFoundException e) {
            System.out.println("(No history file found)");
        } catch (IOException e) {
            System.out.println("Error reading history!");
        }
    }

    static void clearHistory() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            bw.write(""); // clear file content
            System.out.println("History cleared successfully!");
        } catch (IOException e) {
            System.out.println("Error clearing history!");
        }
    }
}
