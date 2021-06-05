package decorator;

// A3 Model
public class A3 extends AudiDecorator{
    public A3(CarInterface audi, String modelName) {
        super(audi, modelName, 1000);
    }
}
