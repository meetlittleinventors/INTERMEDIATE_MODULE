class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Person created");
    }

    void introduce() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String n, int a, String s) {
        super(n, a); // Call parent constructor
        subject = s;
    }

    void showSubject() {
        System.out.println("Teaches: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String n, int a, String g) {
        super(n, a); // Call parent constructor
        grade = g;
    }

    void showGrade() {
        System.out.println("Grade: " + grade);
    }
}

public class MainSchool {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Math");
        t.introduce();
        t.showSubject();

        Student s = new Student("Riya", 16, "A");
        s.introduce();
        s.showGrade();
    }
}
