abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l; width = w;
    }
    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        System.out.println("Circle area: " + s1.area());

        Shape s2 = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + s2.area());
    }
}
