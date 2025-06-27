public class Errors {
    public static void main(String[] args) {

        // Syntax Error or Compile Time Error
        // System.out.println("Hello") //Uncomment this line to see the error effect

        // Logical Error
        class Subtraction {
            public int sub(int a, int b) {
                return a + b; // It should be a-b for subtraction
            }
        }

        Subtraction number = new Subtraction();
        System.out.println(number.sub(7, 2));
    }
}
