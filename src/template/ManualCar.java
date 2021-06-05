package template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("ManualCar drive");
    }

    @Override
    public void stop() {
        System.out.println("ManualCar stop");
    }
}
