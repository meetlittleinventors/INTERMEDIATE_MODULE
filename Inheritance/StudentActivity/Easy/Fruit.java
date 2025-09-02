class Fruit {
    void taste() {
        System.out.println("Fruits have different tastes");
    }
}

class Apple extends Fruit {
    void taste() {
        super.taste();
        System.out.println("Apple is Sweet");
    }
}

public class Test {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.taste();
    }
}
