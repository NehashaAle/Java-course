interface InA {
    int age = 21; // final and static
    String name = "Himal";

    void show();

    void display();
}

class B implements InA {
    public void show() {
        System.out.println("in show");
    }

    public void display() {
        System.out.println("in display");
    }
}

public class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();

        System.out.println(InA.age + InA.name);
    }
}
