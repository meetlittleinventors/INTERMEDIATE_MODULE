import java.io.*;
import java.util.*;

public class InventoryLedger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Item  2. Update Stock");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            PrintWriter pw = new PrintWriter(new FileWriter("inventory.csv", true));
            System.out.print("Enter item name: ");
            String item = sc.nextLine();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            pw.println(item + "," + qty + "," + price);
            pw.close();
        } else if (choice == 2) {
            List<String[]> rows = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(line.split(","));
            }
            br.close();

            System.out.print("Enter item name to sell: ");
            String name = sc.nextLine();
            System.out.print("Enter quantity sold: ");
            int sold = sc.nextInt();

            for (String[] row : rows) {
                if (row[0].equalsIgnoreCase(name)) {
                    int q = Integer.parseInt(row[1]);
                    q -= sold;
                    row[1] = String.valueOf(q);
                }
            }

            PrintWriter pw = new PrintWriter(new FileWriter("inventory.csv"));
            for (String[] row : rows) {
                pw.println(String.join(",", row));
            }
            pw.close();
        }
        sc.close();
        System.out.println("Operation complete.");
    }
}
