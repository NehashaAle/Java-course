public class WrapperClass {
    public static void main(String[] args) {
        int num = 5;
        Integer num1 = num; // autoboxing
        System.out.println(num1);

        int num2 = num1.intValue(); // unboxing
        System.out.println(num2);

        int num3 = num1; // autounboxing
        System.out.println(num3);

        String str = "12";
        int num4 = Integer.parseInt(str); // string to Integer
        System.out.println(num4 * 2);
    }
}
