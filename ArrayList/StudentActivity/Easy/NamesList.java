import java.util.ArrayList;

public class NamesList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Neha");
        names.add("Rahul");
        names.add("Priya");
        names.add("Karan");

        System.out.println("Student Names:");
        for(String name : names) {
            System.out.println(name);
        }
    }
}
