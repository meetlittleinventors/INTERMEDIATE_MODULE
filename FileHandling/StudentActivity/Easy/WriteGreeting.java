import java.io.*;

public class WriteGreeting {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("greeting.txt");
            fw.write("Hello Students, welcome to File Handling!");
            fw.close();
            System.out.println("File created & message written.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
