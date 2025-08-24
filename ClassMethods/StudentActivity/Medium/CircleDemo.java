class Circle {
    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area with r=5: " + c.area(5));
        System.out.println("Area with r=7: " + c.area(7));
    }
}
