import java.io.*;
import java.util.*;

public class ExpenseManager {
    static final String FILE = "expenses.txt";
    static ArrayList<String[]> expenses = new ArrayList<>();

    public static void main(String[] args) {
        loadExpenses();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Expense Manager ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Total by Category");
            System.out.println("4. Highest Expense");
            System.out.println("5. Export Summary & Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> addExpense(sc);
                    case 2 -> viewExpenses();
                    case 3 -> totalByCategory();
                    case 4 -> highestExpense();
                    case 5 -> exportSummary();
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number!");
            }
        }
    }

    static void loadExpenses() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) expenses.add(parts);
            }
        } catch (IOException e) {
            System.out.println("(No previous expenses found)");
        }
    }

    static void addExpense(Scanner sc) {
        try {
            System.out.print("Enter item name: ");
            String item = sc.nextLine().trim();
            System.out.print("Enter amount: ");
            double amt = Double.parseDouble(sc.nextLine());
            System.out.print("Enter category: ");
            String cat = sc.nextLine().trim();
            expenses.add(new String[]{item, String.valueOf(amt), cat});
            System.out.println("Expense added!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount!");
        }
    }

    static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found!");
            return;
        }
        System.out.println("\nItem\tAmount\tCategory");
        for (String[] e : expenses)
            System.out.println(e[0] + "\t" + e[1] + "\t" + e[2]);
    }

    static void totalByCategory() {
        Map<String, Double> totals = new HashMap<>();
        for (String[] e : expenses)
            totals.put(e[2], totals.getOrDefault(e[2], 0.0) + Double.parseDouble(e[1]));

        System.out.println("\n--- Total by Category ---");
        for (String c : totals.keySet())
            System.out.println(c + ": " + totals.get(c));
    }

    static void highestExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded!");
            return;
        }
        String[] high = expenses.get(0);
        for (String[] e : expenses)
            if (Double.parseDouble(e[1]) > Double.parseDouble(high[1])) high = e;
        System.out.println("Highest Expense: " + high[0] + " - " + high[1]);
    }

    static void exportSummary() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("summary.txt"))) {
            bw.write("Expense Summary Report\n");
            bw.write("======================\n");
            for (String[] e : expenses)
                bw.write(e[0] + " | " + e[1] + " | " + e[2] + "\n");
            System.out.println("Summary exported to summary.txt");
        } catch (IOException e) {
            System.out.println("Error writing summary!");
        }
    }
}
