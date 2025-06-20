public class Array {
    public static void main(String arg[]) {

        // One Dimentional Array
        int num[] = new int[4];

        for (int i = 0; i < 4; i++) {
            num[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(num[i] + " ");
        }

        // Two Dimentional Array
        int sum[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array
        int mult[][] = new int[3][]; // jagged

        mult[0] = new int[4];
        mult[1] = new int[3];
        mult[2] = new int[2];

        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                mult[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
