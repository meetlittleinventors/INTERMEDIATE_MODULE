abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;
    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Square extends Shape {
    int side = 4;
    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle();  // runtime polymorphism
        Shape s2 = new Square();

        s1.area();
        s2.area();
    }
}
