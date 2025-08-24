class Teacher {
    String name;
    String subject;
    int experience;
}

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Anita";
        t1.subject = "Math";
        t1.experience = 10;

        Teacher t2 = new Teacher();
        t2.name = "Rajesh";
        t2.subject = "Science";
        t2.experience = 15;

        System.out.println(t1.name + " teaches " + t1.subject + " with " + t1.experience + " years experience");
        System.out.println(t2.name + " teaches " + t2.subject + " with " + t2.experience + " years experience");

        if (t1.experience > t2.experience) {
            System.out.println(t1.name + " has more experience.");
        } else {
            System.out.println(t2.name + " has more experience.");
        }
    }
}
