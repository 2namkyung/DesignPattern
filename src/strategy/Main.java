package strategy;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        // base64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        String msg = "Hello Strategy";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMsg(msg);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMsg(msg);
        System.out.println(normalResult);

    }
}
