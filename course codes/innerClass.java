class A {

    public void show() {
        System.out.println("in show");
    }

    static class B { // static inner class
        public void display() {
            System.out.println("in display");
        }
    }
}

public class innerClass {
    public static void main(String arg[]) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B(); // inner class
        obj1.display();
    }
}
