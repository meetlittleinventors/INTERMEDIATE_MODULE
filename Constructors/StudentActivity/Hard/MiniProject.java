class Student {
    String name;
    int age;
    String grade;
    
    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        grade = "Not assigned";
    }
    
    // Parameterized constructor
    Student(String n, int a, String g) {
        name = n;
        age = a;
        grade = g;
    }
    
    void display() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class MiniProject {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Amit", 20, "A");
        Student s3 = new Student("Neha", 19, "B");
        Student s4 = new Student("Riya", 18, "A");
        
        s1.display(); // Output: Student: Unknown, Age: 0, Grade: Not assigned
        s2.display(); // Output: Student: Amit, Age: 20, Grade: A
        s3.display(); // Output: Student: Neha, Age: 19, Grade: B
        s4.display(); // Output: Student: Riya, Age: 18, Grade: A
    }
}
