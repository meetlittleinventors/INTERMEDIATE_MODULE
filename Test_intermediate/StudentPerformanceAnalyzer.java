import java.io.*;
import java.util.*;

class Student {
    String name;
    int[] marks;
    double percentage;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.percentage = calculatePercentage();
    }

    double calculatePercentage() {
        int total = 0;
        for (int m : marks) total += m;
        return total / (double) marks.length;
    }

    String getGrade() {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else return "D";
    }

    public String toString() {
        return name + " - " + percentage + "% - Grade: " + getGrade();
    }
}

public class StudentPerformanceAnalyzer {
    static Scanner sc = new Scanner(System.in);
    static String fileName = "students.txt";

    public static void addStudent() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }
            sc.nextLine();
            Student s = new Student(name, marks);
            fw.write(s.name + "," + s.percentage + "," + s.getGrade() + "\n");
            System.out.println("Student added!\n");
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }

    public static void displayTopStudents() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nStudent Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading file!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1 -> addStudent();
                case 2 -> displayTopStudents();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
