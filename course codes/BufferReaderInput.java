import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {
    public static void main(String arg[]) throws IOException {

        System.out.println("Enter a number");
        // int num = System.in.read();

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(in);

        int num = Integer.parseInt(obj.readLine());

        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        System.out.println(num);
    }
}
