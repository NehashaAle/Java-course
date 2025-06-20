class Vehicle {
    public Vehicle() {
        super();
        System.out.println("in Vehicle");
    }

    public Vehicle(String brand) {
        super();
        System.out.println("in para Vehicle");
    }
}

class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("in car");

    }

    public Car(String model) {
        // super();

        // super("Ford");

        this();
        System.out.println("in para Car");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        // Car obj = new Car();
        // Car obj1 = new Car("Mustang");
    }
}
