import java.text.NumberFormat;
import java.util.Scanner;

public class ImprovedMortgage {
    public static void main(String[] args) {

        final int PERCENT = 100;
        final int MONTHS_IN_YEAR = 12;

        long Principal = 0;
        float monthlyInterest = 0;
        int Time = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            Principal = input.nextLong();
            if (Principal >= 1000 && Principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.\n");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            monthlyInterest = input.nextFloat();
            if (monthlyInterest >= 1 && monthlyInterest <= 30) {
                monthlyInterest = monthlyInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }

            System.out.println("Enter a value greater than 0 and less than or equals to 30.\n");

        }
        while (true) {
            System.out.print("Period (Years): ");
            Time = input.nextInt();
            if (Time >= 1 && Time <= 30) {
                Time *= MONTHS_IN_YEAR;
                break;
            }

            System.out.println("Enter a value between 1 and 30\n");
        }

        double mortgage = Principal
                * ((monthlyInterest * Math.pow((1 + monthlyInterest), Time))
                        / ((Math.pow(1 + monthlyInterest, Time)) - 1));

        String m = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + m);

        input.close();
    }
}
