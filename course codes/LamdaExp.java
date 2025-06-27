@FunctionalInterface // Annotation
interface Job {
    void show();
}

interface Country {
    void Display(int i);
}

interface Addition {
    int add(int i, int j);
}

public class LamdaExp {
    public static void main(String[] args) {

        // here, arrow(->) is lamda expression
        Job obj = () -> System.out.println("in Job Show");
        obj.show();

        // Parameterized method
        Country obj1 = i -> System.out.println("in Country Display " + i);
        obj1.Display(1);

        // Lamda Expression with return
        Addition obj2 = (i, j) -> i + j;

        int result = obj2.add(5, 3);
        System.out.println(result);
    }
}
