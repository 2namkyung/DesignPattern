package template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("AI Car drive");
    }

    @Override
    public void stop() {
        System.out.println("AI Car stop");
    }
}
