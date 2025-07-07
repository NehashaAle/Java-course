import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class forEachExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 6, 7, 2, 9, 1, 3);

        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum += n;
        // }
        // }
        // System.out.println(sum);

        // For Loop Method
        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        // Foreach Method
        // for (int n : nums) {
        // System.out.println(n);
        // }

        // ForEach Method of Stream API
        // nums.forEach(n -> System.out.println(n));

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };

        // nums.forEach(con);

        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
    }
}
