abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;
    PartTimeEmployee(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }
    double calculateSalary() {
        return hours * rate;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Amit", 30000);
        Employee e2 = new PartTimeEmployee("Riya", 40, 200);
        System.out.println(e1.name + " Salary: ₹" + e1.calculateSalary());
        System.out.println(e2.name + " Salary: ₹" + e2.calculateSalary());
    }
}
