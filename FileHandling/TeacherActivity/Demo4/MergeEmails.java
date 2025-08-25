import java.io.*;
import java.util.*;

public class MergeEmails {
    public static void main(String[] args) throws Exception {
        Set<String> emails = new TreeSet<>(); // TreeSet = sorted & no duplicates

        BufferedReader br1 = new BufferedReader(new FileReader("emails1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("emails2.txt"));

        String line;
        while ((line = br1.readLine()) != null) {
            if (!line.trim().isEmpty()) emails.add(line.trim());
        }
        while ((line = br2.readLine()) != null) {
            if (!line.trim().isEmpty()) emails.add(line.trim());
        }

        br1.close();
        br2.close();

        PrintWriter pw = new PrintWriter(new FileWriter("final_emails.txt"));
        for (String email : emails) {
            pw.println(email);
        }
        pw.close();
    }
}
