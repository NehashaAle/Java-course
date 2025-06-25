class A {
    public void show() {
        System.out.println("in A class");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in new class");
            }
        };
        obj.show();
    }
}
