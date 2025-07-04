public class polymorphism {
    public static void main(String[] args) {
        class A {
            public void show() {
                System.out.println("in A show");
            }
        }
        class B extends A {
            public void show() {
                System.out.println("in C show");
            }
        }
        class C extends A {
            public void show() {
                System.out.println("in B show");
            }
        }

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
