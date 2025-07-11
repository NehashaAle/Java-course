import java.io.File;

public class FolderDelete {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\JavaCourse\\ranFolder");
        if (obj.delete()) {
            System.out.println("Folder deleted: " + obj.getName());
        } else {
            System.out.println("Failed to delete the Folder");
        }
    }
}
