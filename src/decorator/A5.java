package decorator;

// A5 Model
public class A5 extends AudiDecorator{
    public A5(CarInterface audi, String modelName) {
        super(audi, modelName, 3000);
    }
}
