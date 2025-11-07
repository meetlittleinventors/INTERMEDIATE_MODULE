import java.io.*;
import java.util.*;

class Employee {
    String id;
    String name;
    String designation;
    double salary;

    Employee(String id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + designation + "," + salary;
    }
}

public class EmployeePayrollSystem {

    static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== Employee Payroll System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Total Payroll");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    totalPayroll();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Add Employee
    public static void addEmployee(Scanner sc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, designation, salary);
            bw.write(emp.toString());
            bw.newLine();

            System.out.println("✅ Employee added successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }

    // Display Employees
    public static void displayEmployees() {
        List<Employee> employees = loadEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
        } else {
            System.out.println("\n--- Employee Records ---");
            for (Employee e : employees) {
                System.out.println("ID: " + e.id + ", Name: " + e.name +
                        ", Designation: " + e.designation + ", Salary: " + e.salary);
            }
        }
    }

    // Total Payroll
    public static void totalPayroll() {
        List<Employee> employees = loadEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employee records to calculate payroll.");
        } else {
            double total = 0;
            for (Employee e : employees) {
                total += e.salary;
            }
            System.out.println("\n💰 Total Payroll: " + total);
        }
    }

    // Load Employees from file
    public static List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    employees.add(new Employee(
                            parts[0], parts[1], parts[2], Double.parseDouble(parts[3])));
                } else {
                    System.out.println("Error loading employee data!");
                    return new ArrayList<>();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error loading employee data!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
        return employees;
    }
}
