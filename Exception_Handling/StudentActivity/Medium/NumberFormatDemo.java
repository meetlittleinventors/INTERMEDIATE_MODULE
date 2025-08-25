public class NumberFormatDemo {
    public static void main(String[] args) {
        String input = "abc";  // wrong input

        try {
            int num = Integer.parseInt(input);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
