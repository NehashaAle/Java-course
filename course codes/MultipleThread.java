public class MultipleThread {
    public static void main(String[] args) {
        class first extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");
                }
            }
        }

        class second extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                }
            }
        }

        first obj1 = new first();
        second obj2 = new second();

        // Sequence
        // obj1.display();
        // obj2.display();

        // (Multiple Threads) Parallel
        obj1.start();
        obj2.start();
    }
}
