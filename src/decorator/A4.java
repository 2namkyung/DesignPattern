package decorator;

// A4 Model
public class A4 extends AudiDecorator{
    public A4(CarInterface audi, String modelName) {
        super(audi, modelName, 2000);
    }
}

