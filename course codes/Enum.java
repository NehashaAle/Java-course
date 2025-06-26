enum Status {
    Running,
    Failed,
    Pending,
    Success,
}

public class Enum {
    public static void main(String[] args) {

        // Status s = Status.Running;
        // System.out.println(s.ordinal()); //displays it's position

        Status[] s = Status.values();
        // System.out.println(s[2]); //displays constant in position 2 (i)

        // Displays all constants with their respective values
        for (Status ss : s) {
            System.out.println(ss + ":" + ss.ordinal());
        }

        // Enum If else and switch
        // If else
        Status x = Status.Failed;
        if (x == Status.Running)
            System.out.println("All Good");
        else if (x == Status.Failed)
            System.out.println("Try Again");
        else if (x == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

        // switch
        Status c = Status.Pending;
        switch (c) {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        // Enum as class
        enum Laptop {
            Macbook(2000), XPS(2500), Surface(1500), ThinkPad(1000);

            private int price;

            private Laptop(int price) {
                this.price = price;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + ":" + lap.getPrice());

        for (Laptop lap1 : Laptop.values()) {
            System.out.println(lap1 + ":" + lap1.getPrice());
        }
    }
}
