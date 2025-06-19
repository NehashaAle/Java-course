public class Operator {
    public static void main(String[] args) {

        // Arithmetic Operators
        int num1 = 5;
        int num2 = 6;

        int result = num1 + num2;
        System.out.println(result);

        int result1 = num1 - num2;
        System.out.println(result1);

        int result2 = num1 * num2;
        System.out.println(result2);

        int result3 = num1 / num2;
        System.out.println(result3);

        int result4 = num1 % num2;
        System.out.println(result4);

        // Assignment Operators
        int x = 1;

        x += 5;
        System.out.println(x);

        x -= 2;
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 2;
        System.out.println(x);

        x %= 3;
        System.out.println(x);

        x &= 3;
        System.out.println(x);

        x |= 4;
        System.out.println(x);

        x ^= 5;
        System.out.println(x);

        x >>= 3;
        System.out.println(x);

        x <<= 2;
        System.out.println(x);

        // Comparison Operators
        int y = 5;

        System.out.println(y > 2);

        System.out.println(y < 1);

        System.out.println(y == 0);

        System.out.println(y >= 6);

        System.out.println(y <= 5);

        System.out.println(y != 3);

        // Logical Operators
        int z = 9;

        System.out.println(z > 5 && z < 16);

        System.out.println(z > 5 || z < 2);

        System.out.println(!(z > 5 && z < 10));
    }
}
