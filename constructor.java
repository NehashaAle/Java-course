class Human {
    private String name;
    private int roll;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public Human() {
       
        // System.out.println("in default constructor");
    }

    public Human(int roll, String name) {
        this.name = name;
        this.roll = roll;
        // System.out.println("in parameratized constructor");
    }
}

public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(20, "Indigo");

        // obj.setName("Resma");
        // obj.setRoll(18);

        // obj1.setName("linda");
        // obj1.setRoll(15);

        System.out.println(obj.getName() + " " + obj.getRoll());
        System.out.println(obj1.getName() + " " + obj1.getRoll());
    }
}
