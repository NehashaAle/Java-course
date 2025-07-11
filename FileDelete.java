import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File obj = new File("random.txt");
        if (obj.delete()) {
            System.out.println("File Deleted: " + obj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
