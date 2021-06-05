package singleton;

public class TestBClass {

    private Singleton singleton;

    public TestBClass(){
        this.singleton = Singleton.getInstance();
    }

    public Singleton getSingleton(){
        return this.singleton;
    }
}
