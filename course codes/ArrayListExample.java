import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(8);
        nums.add(10);
        // nums.add("5");

        // System.out.println(nums);
        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(3));

        for (int n : nums) {
            int num = (Integer) n;
            System.out.println(num);
        }
    }
}
