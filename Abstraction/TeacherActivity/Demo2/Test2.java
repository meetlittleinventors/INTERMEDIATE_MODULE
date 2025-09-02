abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    int side = 5;
    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

public class Test2 {
    public static void main(String[] args) {
        Shape s = new Square();
        s.area();
    }
}
