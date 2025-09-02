abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 3;
    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Triangle extends Shape {
    int base = 4, height = 5;
    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class Test7 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        s1.area();
        s2.area();
    }
}
