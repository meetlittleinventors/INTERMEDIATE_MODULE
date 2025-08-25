public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;                 // ArithmeticException
            int arr[] = {1, 2};
            System.out.println(arr[5]);     // ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
