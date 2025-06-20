class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class This {
    public static void main(String a[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setLength(5);
        r1.setBreadth(10);

        r2.setLength(2);
        r2.setBreadth(4);

        int area1 = r1.getLength() * r1.getBreadth();
        int area2 = r2.getLength() * r2.getBreadth();

        System.out.println("Area of Rectangle = " + area1);
        System.out.println("Area of Rectangle = " + area2);
    }
}
