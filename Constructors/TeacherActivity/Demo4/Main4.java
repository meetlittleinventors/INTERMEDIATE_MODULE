class Student {
    String name;
    int age;
    String grade;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        grade = "Not assigned";
        System.out.println("Student object created!");
    }

    // Parameterized constructor
    Student(String n, int a, String g) {
        name = n;
        age = a;
        grade = g;
        System.out.println("Created " + name + " (" + age + ", Grade " + grade + ")");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Student s1 = new Student();               // Output: Student object created!
        Student s2 = new Student("Amit", 20, "A"); // Output: Created Amit (20, Grade A)
        Student s3 = new Student("Neha", 19, "B"); // Output: Created Neha (19, Grade B)
    }
}
