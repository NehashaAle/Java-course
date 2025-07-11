import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File objRead = new File("filename.txt");
            Scanner obj = new Scanner(objRead);
            while (obj.hasNextLine()) {
                String data = obj.nextLine();
                System.out.println(data);
            }
            obj.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
