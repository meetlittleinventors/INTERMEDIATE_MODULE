interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        Animal a2 = new Cat();
        a2.sound();
    }
}
