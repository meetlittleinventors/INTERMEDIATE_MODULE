class Animal {
    void makeSound() { System.out.println("Some generic sound"); }
}
class Dog extends Animal {
    void makeSound() { System.out.println("Bark"); }
}
class Cat extends Animal {
    void makeSound() { System.out.println("Meow"); }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();
    }
}
