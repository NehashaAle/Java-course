public class PriorityThread {
    public static void main(String[] args) {
        class Prior extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        class Britty extends Thread {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        Prior obj1 = new Prior();
        Britty obj2 = new Britty();

        // Range of priority goes from 1 - 10 and its 5 by default
        // System.out.println(obj1.getPriority());

        // Settingt the priority for threads
        obj2.setPriority(Thread.MAX_PRIORITY);

        // To display "Hi" "Hello" sequentially using sleep()
        // The value can be changed accoring to the device's processing speed
        obj1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
    }
}
