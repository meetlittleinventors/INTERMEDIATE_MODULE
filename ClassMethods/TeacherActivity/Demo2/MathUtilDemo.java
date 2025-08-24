class MathUtil {
    int square(int n) {
        return n * n;
    }

    int cube(int n) {
        return n * n * n;
    }
}

public class MathUtilDemo {
    public static void main(String[] args) {
        MathUtil mu = new MathUtil();
        System.out.println("Square of 5: " + mu.square(5));
        System.out.println("Cube of 3: " + mu.cube(3));
    }
}
