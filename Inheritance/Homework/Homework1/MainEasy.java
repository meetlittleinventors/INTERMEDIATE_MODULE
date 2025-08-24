class Animal {
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Cat extends Animal {
    void purr() {
        System.out.println("Cat is purring");
    }
}

public class MainEasy {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sleep();
        c.purr();
    }
}
