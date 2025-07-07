import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Students implements Comparable {
class Students {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age= " + age + ",name: " + name + "]";
    }

    // public int compareTo(Students that) {
    // if (this.age > that.age)
    // return 1;
    // else
    // return -1;
    // }
}

public class ComparableComparator {

    public static void main(String arg[]) {
        // List<Integer> nums = new ArrayList<>();
        // nums.add(55);
        // nums.add(76);
        // nums.add(10);
        // nums.add(91);
        // nums.add(18);

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(27, "Nirjala"));
        studs.add(new Students(81, "Ambika"));
        studs.add(new Students(50, "Jhon"));
        studs.add(new Students(11, "Liona"));
        studs.add(new Students(94, "Hari"));

        // Comparator<Students> com = new Comparator<Students>() {

        // public int compare(Students i, Students j) {
        // if (i.age > j.age)
        // return 1;
        // else
        // return -1;
        // }
        // };

        Comparator<Students> com = (i, j) -> i.age > j.age ? 1 : -1;

        Collections.sort(studs, com);

        for (Students s : studs) {
            System.out.println(s);
        }

        // Comparator<Integer> com = new Comparator<Integer>() {

        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10)
        // return 1;
        // else
        // return -1;
        // }

        // };

        // Collections.sort(nums, com);

        // for (int n : nums) {
        // System.out.println(n);
        // }
    }
}
