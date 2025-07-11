import java.util.Collections;
import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Banana");
        // list.add("Watermelon");
        // list.add("Apple");
        // list.add("Lemon");
        // list.add("Pineapple");
        // // Collections.sort(list);
        // Collections.sort(list, Collections.reverseOrder());
        // for (String item : list) {
        // System.out.println(item);
        // }

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(45);
        list1.add(10);
        list1.add(11);
        list1.add(7);
        list1.add(100);
        // Collections.sort(list1);
        Collections.sort(list1, Collections.reverseOrder());
        for (Integer n : list1) {
            System.out.println(n);
        }
    }
}
