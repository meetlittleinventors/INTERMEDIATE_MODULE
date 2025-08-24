class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double areaCircle() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double areaRectangle() {
        return length * width;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.areaCircle());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + r.areaRectangle());
    }
}
