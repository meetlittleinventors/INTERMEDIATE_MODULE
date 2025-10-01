// Hierarchical Inheritance Example
class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void circleArea() {
        System.out.println("Area of Circle = πr²");
    }
}

class Rectangle extends Shape {
    void rectangleArea() {
        System.out.println("Area of Rectangle = l × b");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.circleArea();

        Rectangle r = new Rectangle();
        r.area();
        r.rectangleArea();
    }
}
