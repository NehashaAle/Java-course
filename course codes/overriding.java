
public class overriding {
    public static void main(String arg[]) {
        class A {
            void show() {
                System.out.println("in A");
            }
        }
        class B extends A {
            void show() {
                System.out.println("in B");
            }
        }

        B obj = new B();
        obj.show();
    }
}
