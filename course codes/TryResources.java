import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i = 0;
        // int j = 0;

        BufferedReader bf = null;

        // try with finally block
        try {
            // j = 18 / i;
            System.out.print("Enter a number: ");

            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } finally {
            // System.out.println("The End");

            bf.close();
        }

        // Try with TryResources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter a number: ");
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
        }
    }
}
