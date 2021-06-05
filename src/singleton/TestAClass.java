package singleton;

public class TestAClass {

    private Singleton singleton;

    public TestAClass(){
        this.singleton = Singleton.getInstance();
    }

    public Singleton getSingleton(){
        return this.singleton;
    }
}
