public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;       // ArithmeticException
            int arr[] = {1, 2};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
    }
}
