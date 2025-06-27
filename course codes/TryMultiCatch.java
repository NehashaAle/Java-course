public class TryMultiCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 20;

        String arr[] = new String[5];

        String word = null;

        try {
            j = j / i;

            System.out.println(word.length());

            System.out.println(arr[1]);

            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index should be within the bound.");
        } catch (Exception e) {
            System.out.println("Something went wrong!!!");
        }

        System.out.println(j);

        System.out.println("The End");
    }
}
