import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String arg[]) {
        Scanner calculator = new Scanner(System.in); // object created to read input from user

        System.out.print("Principal: ");
        long Principal = calculator.nextLong(); // Reads Principal value

        System.out.print("Annual Interest Rate: ");
        float Rate = calculator.nextFloat(); // Reads Interest Rate

        Rate = (Rate / 100) / 12; // Divide by 100 to convert to whole no. then divided by 12 for monthly rate

        System.out.print("Period (Years): ");
        int Time = calculator.nextInt(); // Reads Yearly Time

        Time = Time * 12; // Multiplied by 12 to convert from yearly to monthly time

        // Mortgage Calculation
        double Mortgage = Principal * ((Rate * Math.pow((1 + Rate), Time)) / ((Math.pow(1 + Rate, Time)) - 1));

        // Converting from number to currency
        NumberFormat mort = NumberFormat.getCurrencyInstance();
        String M = mort.format(Mortgage);

        System.out.println("Mortgage: " + M);

        calculator.close(); // Scanner object should be closed to prevent memory leakage
    }
}
