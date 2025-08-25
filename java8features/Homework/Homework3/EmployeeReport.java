import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeReport {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Amit", 50000),
            new Employee("Neha", 75000),
            new Employee("Rohit", 62000),
            new Employee("Priya", 80000),
            new Employee("Karan", 45000)
        );

        // Filter employees earning > 60000 and sort descending
        List<Employee> highEarners = employees.stream()
                                              .filter(e -> e.salary > 60000)
                                              .sorted((e1, e2) -> e2.salary - e1.salary)
                                              .collect(Collectors.toList());

        System.out.println("High earners:");
        highEarners.forEach(e -> System.out.println(e.name + " - " + e.salary));

        // Highest earner
        if (!highEarners.isEmpty()) {
            System.out.println("\nHighest Earner: " + highEarners.get(0).name);
        }
    }
}
