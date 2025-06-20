import java.util.Scanner;

public class Input {
    public static void main(String arg[]) {

        // Reading byte input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        byte age = scan.nextByte();
        System.out.println("Your age is " + age);

        // Reading integer input
        Scanner num = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int roll = num.nextInt();
        System.out.println("Your roll no. is " + roll);

        scan.close();
        num.close();
    }
}
