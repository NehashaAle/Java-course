
import java.util.Collection;
// import java.util.HashSet;
// import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String arg[]) {

        // Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(12);
        nums.add(81);
        nums.add(10);
        nums.add(97);
        nums.add(81);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // for (int n : nums) {
        // System.out.println(n);
        // }
    }
}
