class Calculator {

    int number = 5;

    public void Calc(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public String getmePen(int cost) {
        if (cost > 10) {
            return "Pen";
        } else {
            return "Nothing";
        }
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;

        Calculator obj = new Calculator();
        Calculator pen = new Calculator();

        obj.Calc(num1, num2);

        int rs = 20;
        String result = pen.getmePen(rs);

        System.out.println(result);
    }
}
