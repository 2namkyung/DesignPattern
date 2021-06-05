package decorator;

public class Main {

    public static void main(String[] args) {
        CarInterface audi = new Audi(1000);
        audi.showPrice();

        // a3
        CarInterface a3 = new A3(audi, "A3");
        a3.showPrice();

        // a4
        CarInterface a4 = new A4(audi, "A4");
        a4.showPrice();

        // a5
        CarInterface a5 = new A5(audi, "A5");
        a5.showPrice();

    }
}
