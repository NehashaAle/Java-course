import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Kiran", 45);
        students.put("Andy", 60);
        students.put("Sandy", 90);
        students.put("Kiran", 47);

        System.out.println(students);

        System.out.println(students.keySet());

        for (String name : students.keySet()) {
            System.out.println(name + ":" + students.get(name));
        }
    }
}