abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

class Wagon extends Car {
    public void drive() {
        System.out.println("Driving....");
    }

    public void fly() {
        System.out.println("Flying...");
    }
}

public class Abstract {
    public static void main(String arg[]) {
        Wagon obj = new Wagon();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
