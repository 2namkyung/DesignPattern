package template;

public abstract class Car {

    // 반드시 재정의 필요
    public abstract void drive();
    public abstract void stop();

    public void startCart(){
        System.out.println("시동을 켭니다");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다");
    }

    // 하위 클래스에서 필요에 의해 재정의 가능
    public void washCar(){

    }

    // 하위 클래스에 재정의 불가 , Template Method ( Scenario )
    final public void run(){
        startCart();
        drive();
        stop();
        turnOff();
    }
}
