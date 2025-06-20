//Final class

// final class Calc {
class Calculator {

    // Final method
    // final public void show() {
    public void show() {
        System.out.println("By min");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class AdvCalculator extends Calculator {
    public void show() {
        System.out.println("By jin");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

public class Final {
    public static void main(String[] args) {
        // Final variable
        final double pi = 3.16;

        // pi = 4.2; Final variable can't be changed once declared(becomes constant)

        Calculator obj = new Calculator();
        obj.show();
        obj.add(4, 6);

        System.out.println(pi);
    }
}
