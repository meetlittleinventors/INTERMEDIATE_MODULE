import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("source.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("destination.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }

            br.close();
            pw.close();
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
