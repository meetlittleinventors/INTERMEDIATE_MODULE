public class EasyQ2 {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // out of range
            int res = 10 / 0;           // not executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array Index Exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception");
        }
    }
}
