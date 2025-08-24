class Employee {
    private double salary;

    public void setSalary(double salary) {
        if(salary >= 0) this.salary = salary;
        else System.out.println("Invalid salary!");
    }
    public double getSalary() { return salary; }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(20000);
        e.setSalary(-500); // Invalid
        System.out.println("Salary: " + e.getSalary());
    }
}
