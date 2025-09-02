class Employee {
    private double salary = 30000;  // encapsulated field

    // getter
    public double getSalary() {
        return salary;
    }

    // setter with restricted access
    public void setSalary(double newSalary, String role) {
        if (role.equals("HR")) {
            salary = newSalary;
            System.out.println("HR updated salary to: " + salary);
        } else {
            System.out.println("Unauthorized user → Cannot change salary");
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Initial Salary: " + e.getSalary());
        e.setSalary(40000, "HR");       // allowed
        e.setSalary(50000, "Employee"); // denied
    }
}
