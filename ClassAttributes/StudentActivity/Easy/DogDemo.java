class Dog {
    String name;
    int age;
}

public class DogDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 3;

        Dog d2 = new Dog();
        d2.name = "Bruno";
        d2.age = 5;

        System.out.println(d1.name + " is " + d1.age + " years old");
        System.out.println(d2.name + " is " + d2.age + " years old");
    }
}
