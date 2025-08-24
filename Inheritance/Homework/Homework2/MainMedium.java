class Employee {
    String name;
    double salary;

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Intern extends Employee {
    int duration; // in months

    void showDuration() {
        System.out.println("Internship Duration: " + duration + " months");
    }
}

public class MainMedium {
    public static void main(String[] args) {
        Intern i = new Intern();
        i.name = "Riya";
        i.salary = 15000;
        i.duration = 6;
        i.display();
        i.showDuration();
    }
}
