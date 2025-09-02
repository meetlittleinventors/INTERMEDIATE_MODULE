abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Test6 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Cow();
        a1.sound();
        a2.sound();
    }
}
