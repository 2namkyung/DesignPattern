package adapter;

public class Main {
    // 110V
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer(); // 110V 헤어 드라이기
        connect(hairDryer);

        /*
        Cleaner cleaner = new Cleaner();
        connect(cleaner); // 220V 청소기는 110V 콘센트를 사용할 수 없다
        */

        // Adapter 사용
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SockectAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SockectAdapter(airConditioner);
        connect(airAdapter);
    }
}
