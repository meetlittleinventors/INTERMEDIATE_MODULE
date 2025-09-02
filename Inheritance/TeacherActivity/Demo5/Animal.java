class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}
class Dog extends Animal {
    Dog() {
        super(); // calling parent constructor
        System.out.println("Dog created");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
