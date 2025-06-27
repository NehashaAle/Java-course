public class TryCatch {
    public static void main(String[] args) {
        int i = 7;
        int j = 0;
        // int div = i/j; //Generates runtime error

        try {
            j = i / j;
        } catch (Exception e) {
            System.out.println("Something went wrong!!!");
        }

        System.out.println(j);
    }
}
