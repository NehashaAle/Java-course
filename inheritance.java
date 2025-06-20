public class inheritance {
    public static void main(String[] args) {

        // Single inheritance
        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(4, 2);
        int r2 = obj.sub(5, 3);
        int r3 = obj.mul(10, 6);
        int r4 = obj.div(50, 2);

        System.out.println(r1 + "\n" + r2 + "\n" + r3 + "\n" + r4);

        // Multi-level Inheritance
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int z1 = obj1.add(4, 2);
        int z2 = obj1.sub(5, 3);
        int z3 = obj1.mul(10, 6);
        int z4 = obj1.div(50, 2);
        double z5 = obj1.pow(4, 2);

        System.out.println(z1 + "\n" + z2 + "\n" + z3 + "\n" + z4 + "\n" + z5);
    }
}
