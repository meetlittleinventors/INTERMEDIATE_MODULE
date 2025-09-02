public class EasyQ1 {
    public static void main(String[] args) {
        try {
            String str = "abc";   // not a number
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
    }
}
