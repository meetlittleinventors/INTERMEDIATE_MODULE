import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class EmployeeSalaryTracker {
    static Scanner sc = new Scanner(System.in);
    static String fileName = "employees.txt";

    public static void addEmployee() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + "," + name + "," + salary + "\n");
            System.out.println("Employee added successfully!\n");
        } catch (IOException e) {
            System.out.println("Error saving employee!");
        }
    }

    public static void displayEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nEmployee Details:");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("ID: " + data[0] + " | Name: " + data[1] + " | Salary: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("Error loading employee data!");
        }
    }

    public static void calculateTotalPayroll() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            double total = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                total += Double.parseDouble(data[2]);
            }
            System.out.println("\nTotal Monthly Payroll: " + total);
        } catch (IOException e) {
            System.out.println("Error calculating payroll!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Calculate Total Payroll");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addEmployee();
                case 2 -> displayEmployees();
                case 3 -> calculateTotalPayroll();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
