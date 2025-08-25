import java.io.*;
import java.util.*;

public class MiniLogger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("log.txt", true));

        System.out.print("Enter your note: ");
        String note = sc.nextLine();

        Date now = new Date();
        pw.println("[" + now + "] " + note);

        pw.close();
        sc.close();
        System.out.println("Note saved!");
    }
}
