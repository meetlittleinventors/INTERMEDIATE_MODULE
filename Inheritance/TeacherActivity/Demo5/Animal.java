// Hybrid Inheritance Example
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

interface Pet {
    void beFriendly();
}

class Dog extends Animal implements Pet {
    public void beFriendly() {
        System.out.println("Dog is friendly.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.beFriendly();
    }
}
