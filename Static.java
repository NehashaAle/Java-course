class Student {
    String name;
    int rollno;
    static String address; // static variable

    public void display() {
        System.out.println(name + " " + rollno + " " + address);
    }

    // public static void show() { // static method
    // System.out.println("In static");
    // }

    static { // static block
        address = "Manigram";
        System.out.println("In static");
    }

    public Student() {
        name = "";
        rollno = 10;
        System.out.println("In constructor");
    }
}

public class Static {
    public static void main(String arg[]) {
        // Static Variable use
        Student std1 = new Student();

        std1.name = "Hari";
        std1.rollno = 4;
        Student.address = "Butwal"; // Class name is preferred while using statc variable

        Student std2 = new Student();

        std2.name = "Gita";
        std2.rollno = 8;
        Student.address = "Tilottama";

        // std1.address = "Manigram"; // use of static variable

        std1.display();
        std2.display();

        // Student.show(); // use of static method
    }
}
