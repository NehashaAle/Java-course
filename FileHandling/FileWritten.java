import java.io.FileWriter;
import java.io.IOException;

public class FileWritten {
    public static void main(String[] args) {
        try {
            FileWriter objWrite = new FileWriter("filename.txt");
            objWrite.write("This file contains java course.");
            System.out.println("Data written to the file.");
            objWrite.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
