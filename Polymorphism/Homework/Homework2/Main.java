class Employee {
    void calculateSalary() {
        System.out.println("Basic salary calculated");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager salary calculated");
    }
}

class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer salary calculated");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager();
        Employee d = new Developer();

        e.calculateSalary(); // Output: Basic salary calculated
        m.calculateSalary(); // Output: Manager salary calculated
        d.calculateSalary(); // Output: Developer salary calculated
    }
}
