class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {
        int i = 2;
        int j = 16;

        try {
            j = j / i;
            // throw new ArithmeticException("Cannot divide by zero"); // use of throw
            // keyword

            throw new MyException("This is custom exception");

        } catch (ArithmeticException e) {
            System.out.println("Something went wrong " + e);
        } catch (MyException e) {
            System.out.println("This is custom exception Error " + e);
        } catch (Exception e) {
            System.out.println("That's the default output " + e);
        }

        System.out.println(j);
    }
}
