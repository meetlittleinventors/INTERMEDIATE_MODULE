class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area = " + c.area());
    }
}
