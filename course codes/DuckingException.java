class Display {
    void show() throws ClassNotFoundException {

        Class.forName("Wednesday");

    }
}

public class DuckingException {

    public static void main(String[] args) {
        Display obj = new Display();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }
}
