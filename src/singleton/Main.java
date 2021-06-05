package singleton;

public class Main {
    public static void main(String[] args) {
        TestAClass a = new TestAClass();
        TestBClass b = new TestBClass();

        Singleton sa = a.getSingleton();
        Singleton sb = b.getSingleton();

        System.out.println(sa.equals(sb)); // true
    }
}
