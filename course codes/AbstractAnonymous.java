abstract class AbsAno { // abstract class
    public abstract void show();
}

public class AbstractAnonymous {
    public static void main(String[] args) {
        AbsAno obj = new AbsAno() { // object of Anonymous inner class
            public void show() { // Anonymous inner Class
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
