class Student {
    String name;
    int age;
    String grade;

    // Default constructor
    Student() {
        System.out.println("Default constructor");
    }

    // Name-only constructor
    Student(String n) {
        name = n;
        System.out.println("Name-only: " + name);
    }

    // Full parameterized constructor
    Student(String n, int a, String g) {
        name = n;
        age = a;
        grade = g;
        System.out.println("Created " + name + " (" + age + ", Grade " + grade + ")");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s1 = new Student();                   // Output: Default constructor
        Student s2 = new Student("Riya");             // Output: Name-only: Riya
        Student s3 = new Student("Amit", 20, "A");    // Output: Created Amit (20, Grade A)
    }
}
