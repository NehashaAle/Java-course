class Bio {

    // Data
    private String name;
    private int id;

    // Method
    public void setName(String n) { // setter
        name = n;
    }

    public String getName() { // getter
        return name;
    }

    public void setId(int i) { // setter
        id = i;
    }

    public int getId() { // getter
        return id;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bio g1 = new Bio();

        g1.setName("Linda");

        g1.setId(5);
        System.out.println(g1.getName() + g1.getId());
    }
}
