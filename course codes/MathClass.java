import java.text.NumberFormat;

public class MathClass {
    public static void main(String arg[]) {

        int r1 = Math.min(9, 6);

        int r2 = Math.max(10000, 888);

        double r3 = Math.floor(44.68);
        double r4 = Math.ceil(44.68);
        double r5 = Math.random() * 100;
        double r6 = Math.round(r5);
        double r7 = Math.sqrt(15);
        int r8 = Math.abs(-87);
        double r9 = Math.pow(9, 3);

        System.out.println(
                r1 + "\t" + r2 + "\t" + r3 + "\t" + r4 + "\t" + r5 + "\t" + r6 + "\t" + r7 +
                        "\t" + r8 + "\t" + r9);

        // Formatting numbers

        // Currency Formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String result = currency.format(189764872.5671);

        System.out.println(result);

        // Percentage Formatting

        String per = NumberFormat.getPercentInstance().format(0.75);

        System.out.println(per);
    }
}
