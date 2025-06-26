//Normal Interface
interface InA {
    int age = 21; // final and static
    String name = "Himal";

    void show();

    void display();
}

// Functional / SAM interface
interface InB {
    void config();
}

// Marker Interface
interface InC extends InA, InB { // Multiple Inhertance

}

class B implements InC {
    public void show() {
        System.out.println("in show");
    }

    public void display() {
        System.out.println("in display");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Interface {
    public static void main(String[] args) {
        InC obj = new B();
        obj.show();
        obj.display();
        obj.config();

        System.out.println(InA.age + InA.name);
    }
}
