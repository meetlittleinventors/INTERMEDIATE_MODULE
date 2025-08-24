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

    boolean isPassing() {
        return grade.equals("A") || grade.equals("B");
    }
}

public class HomeHard {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student();                       // default
        students[1] = new Student("Amit", 20, "A");       // parameterized
        students[2] = new Student("Neha", 19, "B");       // parameterized
        students[3] = new Student("Riya", 18, "C");       // parameterized

        int passingCount = 0;
        for (Student s : students) {
            s.display();
            if (s.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Number of passing students: " + passingCount);
    }
}
