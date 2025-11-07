import java.util.*;

class Student {
    String id;
    String name;
    double marks1, marks2, marks3;
    double total, average;
    char grade;

    Student(String id, String name, double m1, double m2, double m3) {
        this.id = id;
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        calculate();
    }

    void calculate() {
        total = marks1 + marks2 + marks3;
        average = total / 3.0;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Total: " + total + ", Avg: " + average + ", Grade: " + grade);
    }
}

public class StudentGradeManager {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== Student Grade Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Show Top Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    showTopStudent();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Add new student
    public static void addStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks in Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter Marks in Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter Marks in Subject 3: ");
        double m3 = sc.nextDouble();

        students.add(new Student(id, name, m1, m2, m3));
        System.out.println("✅ Student added successfully!");
    }

    // Display all students
    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student s : students) {
                s.display();
            }
        }
    }

    // Show top student based on average
    public static void showTopStudent() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
            return;
        }

        Student top = students.get(0);
        for (Student s : students) {
            if (s.average > top.average) {
                top = s;
            }
        }

        System.out.println("\n🏆 Top Student:");
        top.display();
    }
}
