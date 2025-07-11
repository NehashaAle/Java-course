import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

        File obj = new File("filename.txt");
        if (obj.exists()) {
            System.out.println("Filename: " + obj.getName());
            System.out.println("File location: " + obj.getAbsolutePath());
            System.out.println("Writeable: " + obj.canWrite());
            System.out.println("Readable: " + obj.canRead());
            System.out.println("File size in byte: " + obj.length());
        } else {
            System.out.println("File doesn't exists");
        }
    }
}
