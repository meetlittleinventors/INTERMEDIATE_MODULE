class Shape {
    void area() {
        System.out.println("Area depends on shape");
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = l × b");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}
