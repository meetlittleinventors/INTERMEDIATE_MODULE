class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Amit");
        s.setAge(20);
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}
