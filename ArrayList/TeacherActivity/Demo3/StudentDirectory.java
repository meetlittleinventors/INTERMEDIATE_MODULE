import java.util.ArrayList;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " (" + grade + ")";
    }
}

public class StudentDirectory {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", "A"));
        students.add(new Student("Meera", "B"));
        students.add(new Student("Ankit", "C"));

        System.out.println("Students: " + students);

        // Update grade
        students.get(1).grade = "A";
        System.out.println("After Update: " + students);

        // Search student
        String search = "Rahul";
        for (Student s : students) {
            if (s.name.equals(search)) {
                System.out.println("Found: " + s);
            }
        }
    }
}
