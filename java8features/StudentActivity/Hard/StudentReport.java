import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentReport {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Rahul", 78),
            new Student("Neha", 92),
            new Student("Amit", 55),
            new Student("Priya", 85),
            new Student("Karan", 40)
        );

        // Filter pass students
        List<Student> passed = students.stream()
                                       .filter(s -> s.marks >= 50)
                                       .sorted((s1, s2) -> s2.marks - s1.marks)
                                       .collect(Collectors.toList());

        System.out.println("Passed Students:");
        passed.forEach(s -> System.out.println(s.name + " - " + s.marks));

        // Topper
        if (!passed.isEmpty()) {
            System.out.println("\nTopper: " + passed.get(0).name);
        }
    }
}
