import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
            if (obj.createNewFile()) {
                System.out.println("New file created: " + obj.getName());

            } else {
                System.out.println("Filename already exists");
            }
        } catch (IOException e) {
            {
                System.out.println("An error occured");
                e.printStackTrace();
            }

        }
    }
}
